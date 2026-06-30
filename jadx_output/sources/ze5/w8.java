package ze5;

/* loaded from: classes9.dex */
public abstract class w8 extends com.tencent.mm.ui.chatting.viewitems.a0 implements we5.b, com.tencent.mm.ui.chatting.l6 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (layoutInflater == null) {
            return null;
        }
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, M() ? com.tencent.mm.R.layout.e1x : com.tencent.mm.R.layout.e1i);
        android.content.Context context = layoutInflater.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView d07 = d0(context);
        ze5.n8 n8Var = new ze5.n8();
        n8Var.a(xgVar, d07);
        xgVar.setTag(n8Var);
        return xgVar;
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

    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        uiBlock.d(new ze5.o8(msgData, ui6, this, i0(ui6, msgData, str)));
        if (M()) {
            uiBlock.d(new ze5.p8(this, f9Var, msgData, ui6));
        }
        uiBlock.d(new ze5.q8(this, ui6, f9Var, str));
        uiBlock.d(new ze5.r8(this));
        uiBlock.d(new ze5.s8(this, ui6, msgData));
        uiBlock.d(new ze5.t8(this, ui6, msgData));
        uiBlock.d(new ze5.u8(this, ui6, msgData));
    }

    public java.util.List e0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.p0.f313996d;
    }

    public java.util.List f0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.p0.f313996d;
    }

    public java.util.List g0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.p0.f313996d;
    }

    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    public abstract q31.p i0(yb5.d dVar, rd5.d dVar2, java.lang.String str);

    @Override // we5.b
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public ze5.la b(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new ze5.la(params, getClass());
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(userName, "userName");
        e(ui6, msgData, userName, new we5.y0(new we5.u0((ze5.n8) holder)));
    }
}
