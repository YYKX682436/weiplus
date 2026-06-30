package l02;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.i0 f314814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.q f314815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314816f;

    public g(l02.k kVar, androidx.appcompat.app.i0 i0Var, m02.q qVar, java.lang.String str) {
        this.f314814d = i0Var;
        this.f314815e = qVar;
        this.f314816f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f314814d.dismiss();
        m02.q qVar = this.f314815e;
        if (qVar != null) {
            qVar.a();
        }
        o02.a.b(15, 1502, 1, 3, this.f314816f, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
