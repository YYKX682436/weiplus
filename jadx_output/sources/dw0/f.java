package dw0;

/* loaded from: classes5.dex */
public abstract class f {
    public static final java.lang.String a(com.tencent.maas.material.MJMaterialInfo mJMaterialInfo) {
        kotlin.jvm.internal.o.g(mJMaterialInfo, "<this>");
        boolean b17 = b(mJMaterialInfo);
        java.lang.String str = mJMaterialInfo.f48224b;
        if (b17) {
            kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
            dw0.a aVar = dw0.a.f244078e;
            return r26.n0.u0(r26.i0.t(str, "publisher_tts_", "", false)).toString();
        }
        kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
        dw0.a aVar2 = dw0.a.f244078e;
        if (!r26.i0.y(str, "publisher_speech_enhance_", false)) {
            return "";
        }
        kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
        return r26.n0.u0(r26.i0.t(str, "publisher_speech_enhance_", "", false)).toString();
    }

    public static final boolean b(com.tencent.maas.material.MJMaterialInfo mJMaterialInfo) {
        kotlin.jvm.internal.o.g(mJMaterialInfo, "<this>");
        java.lang.String str = mJMaterialInfo.f48224b;
        kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
        dw0.a aVar = dw0.a.f244078e;
        return r26.i0.y(str, "publisher_tts_", false);
    }
}
