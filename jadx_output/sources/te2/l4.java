package te2;

/* loaded from: classes.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418204e;

    public l4(java.lang.String str, te2.p8 p8Var) {
        this.f418203d = str;
        this.f418204e = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$bindColumnInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f418203d);
        j45.l.j(this.f418204e.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$bindColumnInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
