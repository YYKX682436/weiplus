package ub4;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.plugin.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f426182c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f426183d;

    /* renamed from: g, reason: collision with root package name */
    public final ub4.j f426186g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f426184e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f426185f = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f426187h = new java.util.LinkedHashMap();

    public k(ub4.j jVar, java.lang.String str, boolean z17) {
        this.f426182c = "";
        this.f426183d = false;
        this.f426186g = null;
        this.f426186g = jVar;
        this.f426182c = str;
        this.f426183d = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (r5.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r10 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r10.convertFrom(r5);
        r6.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        if (r5.moveToNext() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        r5.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    @Override // com.tencent.mm.plugin.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub4.k.b():java.util.List");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        ub4.j jVar = this.f426186g;
        if (jVar != null) {
            ub4.a aVar = (ub4.a) jVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(list == null ? 0 : list.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAlbumAdapter", "onLoadingFinish list.size=%s", objArr);
            ub4.i iVar = aVar.f426151a;
            ((java.util.ArrayList) ub4.i.x(iVar)).clear();
            ub4.c cVar = new ub4.c();
            cVar.f426153b = "my_timeline";
            ((java.util.ArrayList) ub4.i.x(iVar)).add(cVar);
            ((java.util.ArrayList) ub4.i.x(iVar)).addAll(list);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            java.util.Iterator it = ((java.util.ArrayList) iVar.f426167d).iterator();
            while (it.hasNext()) {
                ((ub4.c) it.next()).f426152a.size();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (!list.isEmpty()) {
                ub4.c cVar2 = new ub4.c();
                cVar2.f426153b = "loading";
                ((java.util.ArrayList) ub4.i.x(iVar)).add(cVar2);
            }
            iVar.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            ub4.b bVar = iVar.f426181u;
            if (bVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = (com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI) bVar;
                snsAlbumUI.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                if (list.isEmpty()) {
                    snsAlbumUI.f167761d.setVisibility(8);
                    snsAlbumUI.f167762e.setVisibility(0);
                } else {
                    snsAlbumUI.f167761d.setVisibility(0);
                    snsAlbumUI.f167762e.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
    }
}
