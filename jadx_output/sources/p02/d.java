package p02;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p02.l f350372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p02.g f350373e;

    public d(p02.g gVar, p02.l lVar) {
        this.f350373e = gVar;
        this.f350372d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("rawUrl", this.f350372d.f350416n);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(this.f350373e.f350395x.f350396d, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
