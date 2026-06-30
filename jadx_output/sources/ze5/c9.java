package ze5;

/* loaded from: classes9.dex */
public abstract class c9 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b, com.tencent.mm.ui.chatting.l6 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (layoutInflater == null) {
            return null;
        }
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.e1m);
        android.content.Context context = layoutInflater.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView d07 = d0(context);
        ze5.z8 z8Var = new ze5.z8();
        z8Var.a(xgVar, d07);
        xgVar.setTag(z8Var);
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
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    public abstract com.tencent.mm.mvvm.MvvmView d0(android.content.Context context);

    @Override // we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        uiBlock.d(new ze5.a9(this, msgData, ui6, e0(ui6, f9Var, str)));
        uiBlock.d(new ze5.b9(this, ui6, f9Var, str));
    }

    public abstract q31.p e0(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str);

    @Override // we5.b
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public ze5.la b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.la(params, getClass());
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        e(ui6, msgData, str, new we5.y0(new we5.u0((ze5.z8) holder)));
    }
}
