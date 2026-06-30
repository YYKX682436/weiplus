package com.tencent.mm.wallet_core.ui;

/* loaded from: classes8.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f214196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214197f;

    public j1(java.lang.String str, android.widget.TextView textView, java.lang.String str2) {
        this.f214195d = str;
        this.f214196e = textView;
        this.f214197f = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletBaseUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "hy: on click banner");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f214195d);
        intent.putExtra("showShare", true);
        j45.l.j(this.f214196e.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        o45.eg.a(com.tencent.mm.wallet_core.ui.r1.e(this.f214197f), 1);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletBaseUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
