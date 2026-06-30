package p02;

/* loaded from: classes8.dex */
public class i implements vz.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView f350399a;

    public i(com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView downloadSearchListView) {
        this.f350399a = downloadSearchListView;
    }

    @Override // vz.i1
    public void Z(int i17, long j17) {
        h02.a c17;
        if (i17 != 9 || (c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17)) == null) {
            return;
        }
        p02.h hVar = this.f350399a.f97341g2;
        java.lang.String str = c17.field_appId;
        java.util.ArrayList arrayList = hVar.f350398f;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p02.l lVar = (p02.l) it.next();
            java.lang.String str2 = lVar.f350406d;
            if (str2 != null && str2.equals(str)) {
                lVar.f350405c = 2;
            }
        }
        hVar.notifyDataSetChanged();
    }
}
