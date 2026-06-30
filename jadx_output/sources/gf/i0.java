package gf;

/* loaded from: classes7.dex */
public final class i0 implements com.tencent.skyline.jni.ISkylineLibraryLoader {
    @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
    public boolean afterLoad() {
        return false;
    }

    @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
    public boolean beforeLoad() {
        return false;
    }

    @Override // com.tencent.skyline.jni.ISkylineLibraryLoader
    public boolean load(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.SkylineBoot", "load libName:" + str);
        if (str == null) {
            return false;
        }
        try {
            fp.d0.n(str);
            return true;
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.e("Luggage.SkylineBoot", "load fail: " + str + ", e: " + e17);
            return true;
        }
    }
}
