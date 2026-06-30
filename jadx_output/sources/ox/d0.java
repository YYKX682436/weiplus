package ox;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f349459e;

    public d0(java.lang.String str, android.content.Context context) {
        this.f349458d = str;
        this.f349459e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/brandservice/publish/BizSnsPublishHelper$initBizPostLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click url ");
        java.lang.String str = this.f349458d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f349459e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/feature/brandservice/publish/BizSnsPublishHelper$initBizPostLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
