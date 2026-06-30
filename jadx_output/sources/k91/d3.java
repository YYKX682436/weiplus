package k91;

/* loaded from: classes7.dex */
public abstract class d3 {
    public static final java.lang.String a(android.content.Context context, java.lang.String str) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (str == null) {
            str = "";
        }
        java.lang.String a17 = ik1.l0.a(context, str, (ik1.k0) nd.f.a(ik1.k0.class));
        kotlin.jvm.internal.o.d(a17);
        if (!r26.n0.B(a17, "MiniProgramEnv/android", false)) {
            a17 = a17.concat(" MiniProgramEnv/android");
        }
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }
}
