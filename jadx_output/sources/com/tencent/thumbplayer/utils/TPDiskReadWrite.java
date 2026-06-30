package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPDiskReadWrite {
    public static final java.lang.String TAG = "TPDiskReadWrite";
    private java.util.ArrayList<java.lang.String> mKey;
    private com.tencent.thumbplayer.utils.LocalCache mKeyCache;
    private java.lang.String mKeyCacheName;
    private com.tencent.thumbplayer.utils.LocalCache mMessageCache;

    public TPDiskReadWrite(android.content.Context context, java.lang.String str) {
        this.mMessageCache = null;
        this.mKeyCache = null;
        this.mKey = null;
        this.mKeyCacheName = null;
        this.mMessageCache = com.tencent.thumbplayer.utils.LocalCache.get(context, str);
        java.lang.String str2 = str + "_key";
        this.mKeyCacheName = str2;
        com.tencent.thumbplayer.utils.LocalCache localCache = com.tencent.thumbplayer.utils.LocalCache.get(context, str2);
        this.mKeyCache = localCache;
        java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) localCache.getAsObject(this.mKeyCacheName);
        this.mKey = arrayList;
        if (arrayList == null) {
            this.mKey = new java.util.ArrayList<>();
        }
    }

    public synchronized void clearAllFile() {
        this.mMessageCache.clear();
        this.mKeyCache.clear();
        this.mKey.clear();
    }

    public synchronized java.util.ArrayList<java.lang.String> getKeylist() {
        return (java.util.ArrayList) this.mKey.clone();
    }

    public synchronized java.lang.Object readAllFile() {
        java.lang.Object asObject;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.mKeyCache.getAsObject(this.mKeyCacheName);
        java.util.ArrayList arrayList2 = null;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str = (java.lang.String) arrayList.get(i17);
                if (!android.text.TextUtils.isEmpty(str) && (asObject = this.mMessageCache.getAsObject(str)) != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(asObject);
                }
            }
            this.mMessageCache.clear();
            this.mKeyCache.clear();
            this.mKey.clear();
            return arrayList2;
        }
        return null;
    }

    public synchronized java.lang.Object readFile(java.lang.String str) {
        return this.mMessageCache.getAsObject(str);
    }

    public synchronized void rmFile(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.mMessageCache.remove(str);
        this.mKey.remove(str);
        this.mKeyCache.remove(this.mKeyCacheName);
        if (!this.mKey.isEmpty()) {
            this.mKeyCache.put(this.mKeyCacheName, this.mKey);
        }
    }

    public synchronized void writeFile(java.lang.String str, java.io.Serializable serializable) {
        if (serializable != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                this.mMessageCache.remove(str);
                this.mMessageCache.put(str, serializable);
                this.mKey.remove(str);
                this.mKey.add(str);
                this.mKeyCache.remove(this.mKeyCacheName);
                this.mKeyCache.put(this.mKeyCacheName, this.mKey);
            }
        }
    }
}
