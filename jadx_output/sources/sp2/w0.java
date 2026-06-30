package sp2;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f411251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(vp2.h0 h0Var, sp2.o2 o2Var, int i17) {
        super(1);
        this.f411251d = h0Var;
        this.f411252e = o2Var;
        this.f411253f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.hc it = (dk2.hc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onDismissedWithoutResponse");
        sp2.o2 o2Var = this.f411252e;
        this.f411251d.a(o2Var.f411121a, this.f411253f);
        com.tencent.mm.ui.MMActivity context = o2Var.f411121a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        ((rq2.w) zVar.a(context).a(rq2.w.class)).Q6(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getString(1), "square_nps_quest_unlike_half_screen_close", null);
        return jz5.f0.f302826a;
    }
}
