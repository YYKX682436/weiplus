package mm2;

/* loaded from: classes3.dex */
public final class y4 extends java.util.concurrent.ConcurrentLinkedQueue {
    public final void d(int i17) {
        int size = super.size();
        if (i17 > size) {
            i17 = size;
        }
        int i18 = 1;
        if (1 > i17) {
            return;
        }
        while (true) {
            poll();
            if (i18 == i17) {
                return;
            } else {
                i18++;
            }
        }
    }

    public final jz5.l e(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        int size = super.size();
        if (i17 > size) {
            i17 = size;
        }
        int i18 = 1;
        if (1 <= i17) {
            while (true) {
                java.lang.Object poll = poll();
                if (poll != null) {
                    if (poll instanceof r45.t12) {
                        linkedList.add(poll);
                    } else if (poll instanceof r45.ch1) {
                        linkedList2.add(poll);
                    }
                }
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        return new jz5.l(linkedList, linkedList2);
    }
}
