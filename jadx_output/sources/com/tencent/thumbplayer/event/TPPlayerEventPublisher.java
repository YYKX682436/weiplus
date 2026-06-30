package com.tencent.thumbplayer.event;

/* loaded from: classes15.dex */
public class TPPlayerEventPublisher {
    private static final java.lang.String TAG = "TPPlayerEventPublisher";
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> mReceiverList = new java.util.concurrent.CopyOnWriteArrayList<>();

    private void doRemoveReceiver(com.tencent.thumbplayer.event.ITPEventReceiver iTPEventReceiver) {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> it = this.mReceiverList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().get() == iTPEventReceiver) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17) {
            this.mReceiverList.remove(i17);
        }
    }

    public void addEventReceiver(com.tencent.thumbplayer.event.ITPEventReceiver iTPEventReceiver) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> copyOnWriteArrayList;
        if (iTPEventReceiver == null || (copyOnWriteArrayList = this.mReceiverList) == null || copyOnWriteArrayList.contains(iTPEventReceiver)) {
            return;
        }
        this.mReceiverList.add(new java.lang.ref.WeakReference<>(iTPEventReceiver));
    }

    public int getReceiverSize() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList == null) {
            return 0;
        }
        return copyOnWriteArrayList.size();
    }

    public void publishEvent(com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.tencent.thumbplayer.event.ITPEventReceiver iTPEventReceiver = it.next().get();
                if (iTPEventReceiver != null) {
                    iTPEventReceiver.onEvent(baseEventInfo);
                }
            }
        }
    }

    public void release() {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.tencent.thumbplayer.event.ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    public void removeEventReceiver(com.tencent.thumbplayer.event.ITPEventReceiver iTPEventReceiver) {
        if (iTPEventReceiver == null || this.mReceiverList == null) {
            return;
        }
        doRemoveReceiver(iTPEventReceiver);
    }
}
