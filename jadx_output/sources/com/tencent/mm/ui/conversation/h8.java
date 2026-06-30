package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public final class h8 extends com.tencent.mm.ui.conversation.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f207722J;
    public final java.util.HashSet K;

    public h8(java.lang.String str, android.content.Context context, com.tencent.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.f207722J = str;
        this.K = new java.util.HashSet();
        ((l75.a1) c01.d9.b().r()).a(this);
    }

    @Override // com.tencent.mm.ui.conversation.o2, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        java.lang.Object tag = view2.getTag();
        com.tencent.mm.ui.conversation.n2 n2Var = tag instanceof com.tencent.mm.ui.conversation.n2 ? (com.tencent.mm.ui.conversation.n2) tag : null;
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) getItem(i17);
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        java.lang.String y07 = l4Var != null ? l4Var.y0() : null;
        if (y07 == null) {
            y07 = "";
        }
        java.lang.String str = y07;
        if (h17 != null) {
            if ((n2Var != null ? n2Var.f207884a : null) != null) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.conversation.g8(l4Var, h17, str, n2Var, i17));
            }
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(6, null, this.f207722J, -1));
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.database.Cursor j17 = j();
        objArr[0] = j17 != null ? java.lang.Integer.valueOf(j17.getCount()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuConversationAdapter", "resetCursor count: %s", objArr);
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void v(java.lang.String str, com.tencent.mm.ui.conversation.n2 n2Var) {
        android.widget.LinearLayout linearLayout = n2Var != null ? n2Var.f207884a : null;
        if (linearLayout != null) {
            linearLayout.setDescendantFocusability(393216);
        }
        android.widget.ImageView imageView = n2Var != null ? n2Var.f207885b : null;
        if (imageView != null) {
            imageView.setClickable(false);
        }
        android.widget.ImageView imageView2 = n2Var != null ? n2Var.f207885b : null;
        if (imageView2 != null) {
            imageView2.setLongClickable(false);
        }
        java.util.HashSet hashSet = this.K;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void w() {
        ((l75.a1) c01.d9.b().r()).e(this);
    }
}
