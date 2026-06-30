package com.tencent.tavkit.ciimage;

/* loaded from: classes14.dex */
public class ThreadLocalTextureCache {
    private static final java.lang.ThreadLocal<com.tencent.tavkit.ciimage.ThreadLocalTextureCache> TEXTURE_CACHE = new java.lang.ThreadLocal<com.tencent.tavkit.ciimage.ThreadLocalTextureCache>() { // from class: com.tencent.tavkit.ciimage.ThreadLocalTextureCache.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public com.tencent.tavkit.ciimage.ThreadLocalTextureCache initialValue() {
            return new com.tencent.tavkit.ciimage.ThreadLocalTextureCache();
        }
    };
    private final java.lang.String TAG;
    private final java.util.HashMap<java.lang.String, com.tencent.tav.coremedia.TextureInfo> textureCache;

    public static com.tencent.tavkit.ciimage.ThreadLocalTextureCache getInstance() {
        return TEXTURE_CACHE.get();
    }

    public synchronized com.tencent.tav.coremedia.TextureInfo getTextureInfo(java.lang.String str) {
        return this.textureCache.get(str);
    }

    public synchronized void putTextureInfo(java.lang.String str, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "putTextureInfo() called with: key = [" + str + "], textureInfo = [" + textureInfo + "]");
        this.textureCache.put(str, textureInfo);
    }

    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release() called, textureCache = " + this.textureCache);
        java.util.Iterator<com.tencent.tav.coremedia.TextureInfo> it = this.textureCache.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.textureCache.clear();
    }

    public synchronized void remove(java.lang.String str) {
        this.textureCache.remove(str);
    }

    private ThreadLocalTextureCache() {
        java.lang.String str = "ThreadLocalTextureCache@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        com.tencent.tav.decoder.logger.Logger.d(str, "ThreadLocalTextureCache() called, thread = " + java.lang.Thread.currentThread().getName());
        this.textureCache = new java.util.HashMap<>();
    }
}
