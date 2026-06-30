package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b0 implements rl5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203447b;

    public b0(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, java.lang.String str) {
        this.f203446a = dVar;
        this.f203447b = str;
    }

    @Override // rl5.n
    public android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 137 && itemId != 4) {
            return null;
        }
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c_4, null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc)).setText(this.f203446a.s().getString(com.tencent.mm.R.string.f490873b44));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h1v);
        java.lang.String Ni = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ni(this.f203447b);
        if (android.text.TextUtils.isEmpty(Ni)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(Ni);
        }
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = (com.tencent.mm.plugin.gif.MMAnimateView) inflate.findViewById(com.tencent.mm.R.id.h5n);
        mMAnimateView.u(com.tencent.mm.vfs.w6.N(com.tencent.mm.ui.bk.C() ? "assets:///fireWork_dark.gif" : "assets:///fireWork_light.gif", 0, -1), "");
        com.tencent.mm.plugin.gif.k kVar = (com.tencent.mm.plugin.gif.k) mMAnimateView.getDrawable();
        if (kVar != null) {
            kVar.D = 2;
        }
        return inflate;
    }
}
