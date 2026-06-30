package com.tencent.thumbplayer.core.drm.reuse;

/* loaded from: classes14.dex */
public class TPDoubleQueueCachedPool<T> {
    private static final int DEFAULT_CORE_POOL_SIZE = 2;
    private static final java.lang.String TAG = "[PlayerCore][TPDoubleQueueCachedPool]";
    private final int mCorePoolSize;
    private com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr<T> mObjectLifecycleMgr;
    private final java.util.List<T> mIdleCacheList = new java.util.ArrayList();
    private final java.util.List<T> mBusyCacheList = new java.util.ArrayList();

    /* loaded from: classes14.dex */
    public interface ITPObjectLifecycleMgr<T> {
        T create(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool);

        void release(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t17);

        boolean reset(com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t17);
    }

    public TPDoubleQueueCachedPool(int i17, int i18, com.tencent.thumbplayer.core.drm.reuse.TPDoubleQueueCachedPool.ITPObjectLifecycleMgr<T> iTPObjectLifecycleMgr) {
        this.mCorePoolSize = i18 <= 0 ? 2 : i18;
        i17 = i17 <= 0 ? 2 : i17;
        this.mObjectLifecycleMgr = iTPObjectLifecycleMgr;
        for (int i19 = 0; i19 < i17; i19++) {
            T create = iTPObjectLifecycleMgr.create(this);
            if (create == null) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "TPDoubleQueueCachedPool, createObject failed.");
            } else {
                this.mIdleCacheList.add(create);
            }
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPDoubleQueueCachedPool init size:" + this.mIdleCacheList.size());
    }

    public synchronized T allocObject() {
        T remove;
        if (this.mIdleCacheList.isEmpty()) {
            remove = this.mObjectLifecycleMgr.create(this);
            if (remove == null) {
                return null;
            }
        } else {
            remove = this.mIdleCacheList.remove(0);
        }
        this.mBusyCacheList.add(remove);
        return remove;
    }

    public synchronized void freeObject(T t17) {
        this.mBusyCacheList.remove(t17);
        this.mObjectLifecycleMgr.release(this, t17);
    }

    public synchronized void recycleObject(T t17) {
        if (this.mBusyCacheList.remove(t17) && this.mIdleCacheList.size() < this.mCorePoolSize && this.mObjectLifecycleMgr.reset(this, t17)) {
            this.mIdleCacheList.add(t17);
        } else {
            this.mObjectLifecycleMgr.release(this, t17);
        }
    }

    public synchronized void release() {
        java.util.ListIterator<T> listIterator = this.mBusyCacheList.listIterator();
        while (listIterator.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator.next());
            listIterator.remove();
        }
        java.util.ListIterator<T> listIterator2 = this.mIdleCacheList.listIterator();
        while (listIterator2.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator2.next());
            listIterator2.remove();
        }
        this.mObjectLifecycleMgr = null;
    }
}
