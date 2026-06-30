package zi4;

/* loaded from: classes4.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.c1 f473192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lb f473193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(zi4.c1 c1Var, bw5.lb lbVar) {
        super(0);
        this.f473192d = c1Var;
        this.f473193e = lbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zi4.c1 c1Var = this.f473192d;
        java.lang.ref.WeakReference weakReference = c1Var.f473181e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        bw5.lb lbVar = this.f473193e;
        java.lang.String str = lbVar.f29712i[1] ? lbVar.f29707d : "";
        kotlin.jvm.internal.o.f(str, "getPoiId(...)");
        double d17 = lbVar.f29708e;
        double d18 = lbVar.f29709f;
        java.lang.String str2 = lbVar.f29712i[4] ? lbVar.f29710g : "";
        kotlin.jvm.internal.o.f(str2, "getPoiName(...)");
        if (context == null) {
            com.tencent.mars.xlog.Log.e(c1Var.f473197g, "jumpPoiPage: failed");
        } else {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            r45.f96 f96Var = new r45.f96();
            f96Var.set(5, str);
            f96Var.set(0, java.lang.Float.valueOf((float) d17));
            f96Var.set(1, java.lang.Float.valueOf((float) d18));
            f96Var.set(3, str2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.service.p3.f126174a.b(context, f96Var, zy2.o9.f477516d, 14, "", new we0.i1(f96Var, intent, context));
        }
        return jz5.f0.f302826a;
    }
}
