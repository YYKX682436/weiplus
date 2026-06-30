package ze5;

/* loaded from: classes9.dex */
public class u4 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472224s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1f);
        ze5.t4 t4Var = new ze5.t4();
        t4Var.a(xgVar);
        xgVar.setTag(t4Var);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (f9Var == null) {
            return false;
        }
        return ze5.f5.b(item, ui6, f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        yb5.d dVar = this.f472224s;
        if (dVar == null) {
            return true;
        }
        ze5.f5.a(menu, v17, dVar, f9Var);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return true;
    }

    @Override // we5.b
    public rd5.d b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.s4(params);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        this.f472224s = ui6;
        ze5.c5.a(ze5.d5.f471879a, this, ui6, msgData, str, uiBlock, true);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((ze5.t4) tag)));
    }
}
