package w35;

/* loaded from: classes8.dex */
public final class g extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.pluginsdk.model.g2 params, w35.a aVar) {
        super(params, aVar);
        kotlin.jvm.internal.o.g(params, "params");
        this.f442736e = "MicroMsg.OpenWayControllerCustom";
    }

    @Override // w35.b
    public void a() {
    }

    @Override // w35.b
    public void b(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w info) {
        com.tencent.mm.pluginsdk.model.n0 n0Var;
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.pluginsdk.model.o0 o0Var = info.f191017g;
        jz5.f0 f0Var = null;
        if (o0Var != null && (n0Var = o0Var.f189394f) != null) {
            int h17 = info.h();
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (h17 == 7) {
                n0Var.a(context);
                w35.a aVar = this.f442724b;
                if (aVar != null) {
                    ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
                    f0Var = f0Var2;
                }
            } else {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
                com.tencent.mm.pluginsdk.model.o0 o0Var2 = info.f191017g;
                if (o0Var2 == null || (str = o0Var2.f189390b) == null) {
                    str = "";
                }
                u1Var.g(context.getString(com.tencent.mm.R.string.g_7, str));
                u1Var.a(true);
                u1Var.m(com.tencent.mm.R.string.f490002i4);
                u1Var.l(new w35.e(n0Var, context, this, info));
                u1Var.i(new w35.f(this, info));
                u1Var.q(false);
                com.tencent.mm.pluginsdk.model.p3 p3Var = this.f442723a.f189319l;
                if (p3Var != null && (k0Var = p3Var.f189406c) != null) {
                    ((kb0.f) k0Var).b(info);
                    f0Var = f0Var2;
                }
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f442736e, "customInfo.oncLick is null");
        }
    }
}
