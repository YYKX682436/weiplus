package p02;

/* loaded from: classes8.dex */
public class k implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI f350402e;

    public k(com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI downloadSearchUI, java.lang.String str) {
        this.f350402e = downloadSearchUI;
        this.f350401d = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        c02.k kVar;
        d02.c cVar;
        d02.c cVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchUI", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI downloadSearchUI = this.f350402e;
        if (!downloadSearchUI.f97350i && !downloadSearchUI.isFinishing()) {
            downloadSearchUI.f97346e.setVisibility(8);
            if (i17 == 0 && i18 == 0) {
                c02.s sVar = (c02.s) oVar.f70711b.f70700a;
                java.lang.String str2 = this.f350401d;
                if (sVar == null || (kVar = sVar.f37625e) == null || com.tencent.mm.sdk.platformtools.t8.L0(kVar.f37604d)) {
                    downloadSearchUI.f97345d.setVisibility(8);
                    downloadSearchUI.f97347f.setVisibility(0);
                    downloadSearchUI.f97347f.setText(downloadSearchUI.getString(com.tencent.mm.R.string.bsl, str2));
                    o02.a.b(13, 1304, 0, 1, "", "", "");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = sVar.f37625e.f37604d.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        c02.j jVar = (c02.j) it.next();
                        p02.l lVar = null;
                        if (jVar != null) {
                            p02.l lVar2 = new p02.l();
                            lVar2.f350403a = 3;
                            c02.e eVar = jVar.f37602d;
                            if (eVar != null) {
                                d02.k kVar2 = eVar.f37592d;
                                c02.d dVar = eVar.f37594f;
                                if (dVar != null) {
                                    lVar2.f350411i = dVar.f37591d;
                                }
                                if (kVar2 != null) {
                                    d02.d dVar2 = kVar2.f225328d;
                                    d02.e eVar2 = kVar2.f225329e;
                                    d02.g gVar = kVar2.f225330f;
                                    if (dVar2 != null && dVar2.f225301i == 0) {
                                        lVar2.f350406d = dVar2.f225296d;
                                        lVar2.f350407e = jVar.f37603e;
                                        lVar2.f350408f = dVar2.f225298f;
                                        lVar2.f350419q = dVar2.f225300h;
                                        if (eVar2 != null) {
                                            java.util.LinkedList linkedList = eVar2.f225305e;
                                            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                                                lVar2.f350409g = linkedList;
                                            }
                                        }
                                        if (gVar != null && (cVar2 = gVar.f225313d) != null) {
                                            lVar2.f350420r = cVar2.f225277e;
                                            lVar2.f350410h = cVar2.f225278f;
                                        }
                                        lVar2.f350404b = str2;
                                        lVar2.f350405c = 1;
                                        if (gVar != null && (cVar = gVar.f225313d) != null) {
                                            android.content.pm.PackageInfo a17 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, cVar.f225277e);
                                            h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(lVar2.f350406d);
                                            if (a17 == null) {
                                                if (d17 != null && d17.field_status == 3 && com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
                                                    lVar2.f350405c = 4;
                                                }
                                            } else if (a17.versionCode < gVar.f225313d.f225281i) {
                                                lVar2.f350405c = 3;
                                            } else {
                                                lVar2.f350405c = 2;
                                            }
                                            d02.c cVar3 = gVar.f225313d;
                                            lVar2.f350413k = cVar3.f225291v;
                                            lVar2.f350414l = cVar3.f225294y;
                                            lVar2.f350415m = cVar3.f225288s;
                                            lVar2.f350416n = cVar3.f225292w;
                                            lVar2.f350417o = cVar3.f225293x;
                                            lVar2.f350418p = cVar3.A;
                                        }
                                        lVar = lVar2;
                                    }
                                }
                            }
                        }
                        if (lVar != null) {
                            i19++;
                            lVar.f350412j = i19;
                            arrayList.add(lVar);
                        }
                    }
                    downloadSearchUI.f97347f.setVisibility(8);
                    downloadSearchUI.f97345d.q1(arrayList);
                    o02.a.b(13, 1303, 0, 1, "", "", "");
                }
            }
        }
        return 0;
    }
}
