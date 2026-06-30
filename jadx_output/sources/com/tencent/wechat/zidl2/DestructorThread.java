package com.tencent.wechat.zidl2;

/* loaded from: classes16.dex */
public class DestructorThread {
    private static final java.lang.Thread sThread;
    private static final com.tencent.wechat.zidl2.DestructorThread.DestructorStack sDestructorStack = new com.tencent.wechat.zidl2.DestructorThread.DestructorStack();
    private static final java.lang.ref.ReferenceQueue sReferenceQueue = new java.lang.ref.ReferenceQueue();
    private static final com.tencent.wechat.zidl2.DestructorThread.DestructorList sDestructorList = new com.tencent.wechat.zidl2.DestructorThread.DestructorList();

    /* loaded from: classes16.dex */
    public static abstract class Destructor extends java.lang.ref.PhantomReference<java.lang.Object> {
        private com.tencent.wechat.zidl2.DestructorThread.Destructor next;
        private com.tencent.wechat.zidl2.DestructorThread.Destructor previous;

        public abstract void destruct();

        public Destructor(java.lang.Object obj) {
            super(obj, com.tencent.wechat.zidl2.DestructorThread.sReferenceQueue);
            com.tencent.wechat.zidl2.DestructorThread.sDestructorStack.push(this);
        }

        private Destructor() {
            super(null, com.tencent.wechat.zidl2.DestructorThread.sReferenceQueue);
        }
    }

    /* loaded from: classes16.dex */
    public static class DestructorList {
        private final com.tencent.wechat.zidl2.DestructorThread.Destructor mHead;

        public DestructorList() {
            com.tencent.wechat.zidl2.DestructorThread.Terminus terminus = new com.tencent.wechat.zidl2.DestructorThread.Terminus();
            this.mHead = terminus;
            ((com.tencent.wechat.zidl2.DestructorThread.Destructor) terminus).next = new com.tencent.wechat.zidl2.DestructorThread.Terminus();
            ((com.tencent.wechat.zidl2.DestructorThread.Destructor) terminus).next.previous = terminus;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void drop(com.tencent.wechat.zidl2.DestructorThread.Destructor destructor) {
            destructor.next.previous = destructor.previous;
            destructor.previous.next = destructor.next;
        }

        public void enqueue(com.tencent.wechat.zidl2.DestructorThread.Destructor destructor) {
            destructor.next = this.mHead.next;
            this.mHead.next = destructor;
            destructor.next.previous = destructor;
            destructor.previous = this.mHead;
        }
    }

    /* loaded from: classes16.dex */
    public static class DestructorStack {
        private final java.util.concurrent.atomic.AtomicReference<com.tencent.wechat.zidl2.DestructorThread.Destructor> mHead;

        private DestructorStack() {
            this.mHead = new java.util.concurrent.atomic.AtomicReference<>();
        }

        public void push(com.tencent.wechat.zidl2.DestructorThread.Destructor destructor) {
            boolean z17;
            do {
                com.tencent.wechat.zidl2.DestructorThread.Destructor destructor2 = this.mHead.get();
                destructor.next = destructor2;
                java.util.concurrent.atomic.AtomicReference<com.tencent.wechat.zidl2.DestructorThread.Destructor> atomicReference = this.mHead;
                while (true) {
                    if (atomicReference.compareAndSet(destructor2, destructor)) {
                        z17 = true;
                        break;
                    } else if (atomicReference.get() != destructor2) {
                        z17 = false;
                        break;
                    }
                }
            } while (!z17);
        }

        public void transferAllToList() {
            com.tencent.wechat.zidl2.DestructorThread.Destructor andSet = this.mHead.getAndSet(null);
            while (andSet != null) {
                com.tencent.wechat.zidl2.DestructorThread.Destructor destructor = andSet.next;
                com.tencent.wechat.zidl2.DestructorThread.sDestructorList.enqueue(andSet);
                andSet = destructor;
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class Terminus extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private Terminus() {
            super();
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            throw new java.lang.IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        java.lang.Thread thread = new java.lang.Thread("Zidl Java DestructorThread") { // from class: com.tencent.wechat.zidl2.DestructorThread.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.tencent.wechat.zidl2.DestructorThread.Destructor destructor = (com.tencent.wechat.zidl2.DestructorThread.Destructor) com.tencent.wechat.zidl2.DestructorThread.sReferenceQueue.remove();
                        destructor.destruct();
                        if (destructor.previous == null) {
                            com.tencent.wechat.zidl2.DestructorThread.sDestructorStack.transferAllToList();
                        }
                        com.tencent.wechat.zidl2.DestructorThread.DestructorList.drop(destructor);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        };
        sThread = thread;
        thread.start();
    }
}
