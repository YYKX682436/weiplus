package rv4;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rv4.f0 f400464d = new rv4.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONArray optJSONArray = su4.o2.d("globalEducationHistory").optJSONArray("scenes");
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachWebConfig", "get globalEducationHistory scenes " + optJSONArray);
        if (optJSONArray == null) {
            return new int[0];
        }
        int length = optJSONArray.length();
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = optJSONArray.optInt(i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = iArr[i18];
            if (i19 != 0) {
                arrayList.add(java.lang.Integer.valueOf(i19));
            }
        }
        return kz5.n0.R0(arrayList);
    }
}
