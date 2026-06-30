package p02;

/* loaded from: classes8.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p02.g f350371d;

    public c(p02.g gVar, p02.h hVar) {
        this.f350371d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p02.l lVar = (p02.l) view.getTag();
        p02.g gVar = this.f350371d;
        gVar.f350395x.f350397e.l1(lVar.f350404b);
        if (gVar.f350395x.f350396d.getResources().getString(com.tencent.mm.R.string.gax).equals(gVar.f350385n.getText().toString())) {
            k02.l.c(gVar.f350395x.f350396d, lVar.f350419q, lVar.f350406d, lVar.f350420r);
            o02.a.b(13, 1303, lVar.f350412j, 22, lVar.f350406d, "", "");
        } else if (gVar.f350395x.f350396d.getResources().getString(com.tencent.mm.R.string.g1c).equals(gVar.f350385n.getText().toString())) {
            h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(lVar.f350406d);
            if (d17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
                k02.l.a(d17.field_downloadId, false, null);
                o02.a.b(13, 1303, lVar.f350412j, 44, lVar.f350406d, "", "");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("appId", lVar.f350406d);
            intent.addFlags(67108864);
            ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(gVar.f350395x.f350396d, intent, null);
            o02.a.b(13, 1303, lVar.f350412j, 23, lVar.f350406d, "", "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
