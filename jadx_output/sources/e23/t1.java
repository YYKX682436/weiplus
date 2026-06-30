package e23;

/* loaded from: classes11.dex */
public class t1 extends e23.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.u1 f246967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(e23.u1 u1Var) {
        super(u1Var);
        this.f246967c = u1Var;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.u1 u1Var = (e23.u1) gVar;
        if (com.tencent.mm.storage.z3.j4(u1Var.f246841s) && !com.tencent.mm.sdk.platformtools.f9.HomeNotifyMessage.k(view.getContext(), null)) {
            return true;
        }
        if ((com.tencent.mm.storage.z3.m4(u1Var.f246841s) || com.tencent.mm.storage.z3.q4(u1Var.f246841s)) && !com.tencent.mm.sdk.platformtools.f9.GlobalWeCom.k(view.getContext(), null)) {
            return true;
        }
        a(this.f246967c.i(), u1Var.f246839q);
        if (com.tencent.mm.storage.z3.z3(u1Var.f246841s)) {
            java.lang.String wi6 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).wi(u1Var.f246841s);
            ((com.tencent.mm.plugin.appbrand.app.t2) ((com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class))).Ai(context, u1Var.f246841s, null, wi6, 5, "", null);
        } else {
            android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", u1Var.f246841s).putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 5);
            j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(u1Var.f246841s, 2);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(25, u1Var.f246841s);
        }
        return true;
    }
}
