from queue import Queue


class Latihan2:
    def queueExample(self):
        queue = Queue()
        queue.put("Java")
        queue.put("Dotnet")
        queue.put("PHP")
        queue.put("HTML")

        print("remove : " + queue.get())
        print("element : " + queue.queue[0])
        print("poll : " + queue.get())
        print("peek : " + queue.queue[0])
        print("poll : " + queue.get())
        print("peek : " + queue.queue[0])

    def main(self):
        self.queueExample()


Latihan2().main()
