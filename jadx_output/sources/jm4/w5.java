package jm4;

/* loaded from: classes3.dex */
public class w5 extends com.tencent.unit_rc.BaseProxyObject implements jm4.u5 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f300437d = 0;

    static {
        new jm4.v5(null);
    }

    public void a(byte[] imageData, bw5.tq0 imageInfo, yz5.l lVar) {
        jm4.x1 x1Var;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        byte[] byteArray = imageInfo.toByteArray();
        if (lVar == null) {
            x1Var = null;
        } else {
            jm4.x1 x1Var2 = new jm4.x1();
            x1Var2.f300450p = lVar;
            x1Var = x1Var2;
        }
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_87ED.UR_726D(cppPointer, imageData, byteArray, x1Var);
    }
}
