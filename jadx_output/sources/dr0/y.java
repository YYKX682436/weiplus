package dr0;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.y f242576d = new dr0.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        dr0.u0 reportStage = (dr0.u0) obj;
        kotlin.jvm.internal.o.g(reportStage, "$this$reportStage");
        dr0.a3 a17 = dr0.a3.f242403d.a();
        if (!a17.m()) {
            str = "0";
            if (a17.k()) {
                dr0.p1 a18 = dr0.p1.f242489d.a();
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                a18.getClass();
                if (!com.tencent.mm.booter.o.f(context)) {
                    str2 = "supported NO: ignoreBattOpt=false";
                } else if (a17.g()) {
                    str2 = "supported YES: hasDebugger";
                } else if (android.os.Build.VERSION.SDK_INT >= 30 && !a17.j()) {
                    str2 = "supported NO: forced splash logo";
                } else if (!a17.l()) {
                    str2 = "supported NO: ban model";
                }
            } else {
                str2 = "supported NO: disabled";
            }
            reportStage.f242558a = kz5.c0.i(str, str2);
            return jz5.f0.f302826a;
        }
        str = "1";
        str2 = "";
        reportStage.f242558a = kz5.c0.i(str, str2);
        return jz5.f0.f302826a;
    }
}
