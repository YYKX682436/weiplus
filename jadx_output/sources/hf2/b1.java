package hf2;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f281005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context, hf2.e1 e1Var) {
        super(0);
        this.f281004d = context;
        this.f281005e = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        in0.q liveCore;
        android.content.Context context = this.f281004d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getResources().getString(com.tencent.mm.R.string.efs));
        u1Var.n(context.getResources().getString(com.tencent.mm.R.string.f491447d41));
        u1Var.l(hf2.a1.f280998a);
        u1Var.q(false);
        hf2.e1 e1Var = this.f281005e;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = e1Var.f281051a.f291099e;
        com.tencent.mm.plugin.finder.live.view.v1 v1Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) ubVar : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (v1Var == null || (liveCore = v1Var.getLiveCore()) == null) {
            f0Var = null;
        } else {
            in0.q.d1(liveCore, null, false, 2, null);
            f0Var = f0Var2;
        }
        hf2.x xVar = e1Var.f281051a;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(e1Var.f281052b, "uploadSticker reset blend but pluginLayout:" + xVar.f291099e + " get liveCore fail!");
        }
        xVar.t7("uploadSticker_fail", null);
        hf2.b2 h76 = xVar.h7();
        com.tencent.mars.xlog.Log.i(h76.f281007b, "resetTextBitmap");
        h76.f281012g = null;
        h76.f281013h = 1.0f;
        xVar.h7().e("uploadSticker_fail");
        ((je2.g) xVar.business(je2.g.class)).V6("uploadSticker_fail", null, false);
        return f0Var2;
    }
}
