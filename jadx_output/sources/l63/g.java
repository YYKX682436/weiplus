package l63;

/* loaded from: classes9.dex */
public class g implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m63.f f316773d;

    public g(l63.h hVar, m63.f fVar) {
        this.f316773d = fVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.g73 g73Var;
        if (i17 != 0 || i18 != 0 || (g73Var = (r45.g73) oVar.f70711b.f70700a) == null) {
            return 0;
        }
        java.lang.String str2 = g73Var.f374942d;
        com.tencent.mm.ui.chatting.viewitems.i9 i9Var = (com.tencent.mm.ui.chatting.viewitems.i9) this.f316773d;
        i9Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGameShare", "readtext callback read is nullornil");
            return 0;
        }
        com.tencent.mm.storage.f9 f9Var = i9Var.f204172a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGameShare", "null == content");
            return 0;
        }
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = (com.tencent.mm.pluginsdk.ui.tools.g0) v17.y(com.tencent.mm.pluginsdk.ui.tools.g0.class);
        g0Var.f191638j = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        v17.f(g0Var);
        g0Var.c(sb6, v17, null, null, 0, 0);
        com.tencent.mm.ui.chatting.viewitems.o9.a(sb6, Li);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), Li, true);
        return 0;
    }
}
