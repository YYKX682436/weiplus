package sc2;

/* loaded from: classes2.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.gc f405768a = new sc2.x8(this);

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f405769b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Dialog f405770c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f405771d;

    public final void a(db5.g4 menu, android.content.Context context, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(context, "context");
        if (z17) {
            menu.g(i17, context.getString(com.tencent.mm.R.string.cn6), com.tencent.mm.R.raw.icons_outlined_top_off);
        } else {
            menu.g(i18, context.getString(com.tencent.mm.R.string.f49), com.tencent.mm.R.raw.icons_outlined_top);
        }
    }

    public final void b(android.content.Context context, long j17, boolean z17, java.lang.String nonceId, yz5.p succCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(succCallback, "succCallback");
        this.f405769b = succCallback;
        this.f405771d = true;
        pm0.v.V(500L, new sc2.z8(this, context));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        int i17 = !z17 ? 1 : 0;
        zy2.gc gcVar = this.f405768a;
        hb2.s sVar = hb2.s.f280088e;
        sVar.getClass();
        r45.mi2 mi2Var = new r45.mi2();
        mi2Var.set(0, java.lang.Long.valueOf(j17));
        mi2Var.set(1, java.lang.Integer.valueOf(i17));
        mi2Var.set(2, nonceId);
        hb2.w0.m(sVar, mi2Var, gcVar, false, false, null, null, 60, null);
    }
}
