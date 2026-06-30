package g63;

/* loaded from: classes8.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f269177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g63.f0 f0Var) {
        super(2);
        this.f269177d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g63.t0 t0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List result = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        g63.f0 f0Var = this.f269177d;
        if (booleanValue) {
            g63.j jVar = f0Var.f269107b;
            jVar.getClass();
            pm0.v.X(new g63.g(jVar, result));
            g63.t0 t0Var2 = f0Var.f269106a;
            if (t0Var2 != null) {
                pm0.v.X(new g63.g0((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var2));
            }
            if (result.size() < 15 && (t0Var = f0Var.f269106a) != null) {
                com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI = (com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var;
                gameLifeConversationUI.f141992h = false;
                gameLifeConversationUI.T6().f1753e.setEnableLoadMore(false);
            }
            pm0.v.X(new g63.t(f0Var));
            f0Var.a();
            int x17 = f0Var.f269107b.x();
            long j17 = e63.a.f249817a;
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
            gameLifeSessionStruct.f58340d = 2L;
            gameLifeSessionStruct.f58341e = 202L;
            gameLifeSessionStruct.f58342f = 0L;
            gameLifeSessionStruct.f58343g = 1L;
            gameLifeSessionStruct.f58344h = j17;
            gameLifeSessionStruct.f58351o = x17;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("list_state", x17 == 0 ? 2 : 1);
            gameLifeSessionStruct.p(java.net.URLEncoder.encode(jSONObject.toString()));
            gameLifeSessionStruct.k();
        } else {
            g63.t0 t0Var3 = f0Var.f269106a;
            if (t0Var3 != null) {
                pm0.v.X(new g63.i0((com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI) t0Var3));
            }
        }
        return jz5.f0.f302826a;
    }
}
