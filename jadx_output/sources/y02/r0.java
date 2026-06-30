package y02;

/* loaded from: classes9.dex */
public class r0 extends com.tencent.unit_rc.BaseProxyObject implements y02.p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final y02.q0 f458626d = new y02.q0(null);

    public bw5.e6[] a(java.lang.String[] keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        byte[][] UR_C423 = urgen.ur_E2DE.UR_9715.UR_C423(getCppPointer(), keys);
        int length = UR_C423.length;
        bw5.e6[] e6VarArr = new bw5.e6[length];
        for (int i17 = 0; i17 < length; i17++) {
            e6VarArr[i17] = new bw5.e6();
        }
        for (int i18 = 0; i18 < length; i18++) {
            y02.k.b(UR_C423[i18], e6VarArr[i18]);
        }
        return e6VarArr;
    }

    public void d(bw5.m7 cgiPreloadInfo) {
        kotlin.jvm.internal.o.g(cgiPreloadInfo, "cgiPreloadInfo");
        byte[] byteArray = cgiPreloadInfo.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_E2DE.UR_9715.UR_B23A(cppPointer, byteArray);
    }

    public void e(bw5.m7 cgiPreloadInfo, bw5.d6 config) {
        kotlin.jvm.internal.o.g(cgiPreloadInfo, "cgiPreloadInfo");
        kotlin.jvm.internal.o.g(config, "config");
        byte[] byteArray = cgiPreloadInfo.toByteArray();
        byte[] byteArray2 = config.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        kotlin.jvm.internal.o.d(byteArray2);
        urgen.ur_E2DE.UR_9715.UR_F4B6(cppPointer, byteArray, byteArray2);
    }
}
