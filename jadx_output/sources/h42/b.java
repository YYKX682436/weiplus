package h42;

/* loaded from: classes14.dex */
public abstract class b {
    public static h42.c a(int i17) {
        if (i17 == 1) {
            return new i42.b();
        }
        if (i17 == 2) {
            return new i42.a();
        }
        com.tencent.mars.xlog.Log.e("EdgeComputingDataCacheFactory", "[EdgeComputingDataCacheFactory] create error type : " + i17);
        return null;
    }
}
