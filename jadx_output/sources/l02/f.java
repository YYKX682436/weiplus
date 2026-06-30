package l02;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.i0 f314810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m02.q f314811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314812f;

    public f(l02.k kVar, androidx.appcompat.app.i0 i0Var, m02.q qVar, java.lang.String str) {
        this.f314810d = i0Var;
        this.f314811e = qVar;
        this.f314812f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f314810d.dismiss();
        m02.q qVar = this.f314811e;
        if (qVar != null) {
            qVar.a();
        }
        o02.a.b(15, 1502, 1, 23, this.f314812f, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/DownloadAppAlertDelegateImpl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
