package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f202652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.u0 f202655g;

    public s0(com.tencent.mm.ui.chatting.u0 u0Var, ot0.q qVar, java.lang.String str, int i17) {
        this.f202655g = u0Var;
        this.f202652d = qVar;
        this.f202653e = str;
        this.f202654f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ot0.q qVar = this.f202652d;
        com.tencent.mm.pluginsdk.model.app.v3 v3Var = new com.tencent.mm.pluginsdk.model.app.v3(2, new com.tencent.mm.pluginsdk.model.app.f4(qVar.f348646d, 0, "0"));
        com.tencent.mm.ui.chatting.u0 u0Var = this.f202655g;
        com.tencent.mm.ui.chatting.u0.b(u0Var, v3Var);
        m33.b1 a17 = m33.a1.a();
        if (a17 != null) {
            ((com.tencent.mm.plugin.game.h0) a17).Ui(u0Var.f202728e.g(), this.f202653e, qVar.f348646d, qVar.f348666i, this.f202654f, qVar.X, 2);
        }
    }
}
