package com.tencent.thumbplayer.tmediacodec.pools;

/* loaded from: classes14.dex */
public final class CodecWrapperPool implements com.tencent.thumbplayer.tmediacodec.pools.Pool<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper> {
    public static final java.lang.String TAG = "CodecWrapperPool";
    private com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback mActionCallback;
    private final int mCapacity;
    private final java.lang.String mName;
    private final java.util.concurrent.CopyOnWriteArraySet<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> storeSet = new java.util.concurrent.CopyOnWriteArraySet<>();

    public CodecWrapperPool(int i17, java.lang.String str) {
        this.mCapacity = i17;
        this.mName = str;
    }

    private com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper getFirstCodecWrapper() {
        java.util.Iterator<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> it = this.storeSet.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper getRemoveItem(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper replaceSameTypeCodec;
        return (com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().getReusePolicy().eraseType != com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy.EraseType.SAME || (replaceSameTypeCodec = replaceSameTypeCodec(reuseCodecWrapper, this.storeSet.iterator())) == null) ? getFirstCodecWrapper() : replaceSameTypeCodec;
    }

    private final com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper pickSuitableCodecWrapper(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        java.util.Iterator<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> it = this.storeSet.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper next = it.next();
            if (!next.mIsRecycled && next.canReuse(formatWrapper) != com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO) {
                return next;
            }
            next.trackCantReuse();
            if (next.needToErase()) {
                remove(next);
            }
        }
        return null;
    }

    private com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper replaceSameTypeCodec(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper, java.util.Iterator it) {
        while (it.hasNext()) {
            com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper2 = (com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper) it.next();
            if (android.text.TextUtils.equals(reuseCodecWrapper.getCodecName(), reuseCodecWrapper2.getCodecName())) {
                return reuseCodecWrapper2;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public void clear() {
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(TAG, "CodecWrapperPool clear:" + this.storeSet);
        java.util.Iterator<com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> it = this.storeSet.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper next = it.next();
            com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback poolActionCallback = this.mActionCallback;
            if (poolActionCallback != null) {
                poolActionCallback.onErase(next);
            }
        }
        this.storeSet.clear();
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public boolean isEmpty() {
        return this.storeSet.isEmpty();
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public boolean isFull() {
        return this.storeSet.size() == this.mCapacity;
    }

    public final void setActionCallback(com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback poolActionCallback) {
        this.mActionCallback = poolActionCallback;
    }

    public java.lang.String toString() {
        return "size:" + this.storeSet.size() + " elements:" + this.storeSet;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper obtain(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper pickSuitableCodecWrapper = pickSuitableCodecWrapper(formatWrapper);
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "obtain codecWrapper:" + pickSuitableCodecWrapper);
        }
        if (pickSuitableCodecWrapper == null) {
            return null;
        }
        this.storeSet.remove(pickSuitableCodecWrapper);
        return pickSuitableCodecWrapper;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public void put(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        if (isFull()) {
            remove(getRemoveItem(reuseCodecWrapper));
        }
        this.storeSet.add(reuseCodecWrapper);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.pools.Pool
    public void remove(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper) {
        if (this.storeSet.remove(reuseCodecWrapper)) {
            com.tencent.thumbplayer.tmediacodec.pools.PoolActionCallback poolActionCallback = this.mActionCallback;
            if (poolActionCallback != null) {
                poolActionCallback.onErase(reuseCodecWrapper);
                return;
            }
            return;
        }
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(TAG, "pool:" + this.mName + " remove " + reuseCodecWrapper + " not found");
    }
}
