package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gq extends com.tencent.mm.ui.chatting.viewitems.a0 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488572xn, (android.view.ViewGroup) null);
        com.tencent.mm.ui.chatting.viewitems.lq lqVar = new com.tencent.mm.ui.chatting.viewitems.lq();
        lqVar.a(inflate, false);
        inflate.setTag(lqVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        g0Var.timeTV.setVisibility(0);
        android.widget.TextView textView = g0Var.timeTV;
        dVar.g();
        long createTime = f9Var.getCreateTime();
        java.util.List list = k35.m1.f303913a;
        textView.setText(((java.lang.String) k35.m1.A.b()) + ((java.lang.Object) android.text.format.DateFormat.format((java.lang.CharSequence) k35.m1.B.b(), createTime)));
    }
}
