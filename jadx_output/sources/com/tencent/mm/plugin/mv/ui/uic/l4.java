package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qr4 f151270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ um3.b f151272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f151273g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(r45.qr4 qr4Var, com.tencent.mm.plugin.mv.ui.uic.v4 v4Var, um3.b bVar, com.tencent.mm.plugin.mv.ui.uic.c3 c3Var) {
        super(1);
        this.f151270d = qr4Var;
        this.f151271e = v4Var;
        this.f151272f = bVar;
        this.f151273g = c3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qr4 qr4Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it6 = it.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            qr4Var = this.f151270d;
            if (!hasNext) {
                break;
            }
            gm3.c cVar = (gm3.c) it6.next();
            hashMap.put(cVar.f273543d, cVar);
            r45.jj2 jj2Var = new r45.jj2();
            jj2Var.set(2, cVar.f273543d);
            int i17 = 0;
            int i18 = cVar.f273544e;
            if (i18 != 1) {
                if (i18 == 2) {
                    jj2Var.set(0, 2);
                    gm3.b bVar = cVar.f273548i;
                    if (bVar != null && (finderObject = bVar.f273542b) != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                        i17 = finderMedia.getVideoDuration();
                    }
                    jj2Var.set(1, java.lang.Integer.valueOf(i17 * 1000));
                    qr4Var.getList(1).add(jj2Var);
                } else if (i18 != 3) {
                }
            }
            gm3.a aVar = cVar.f273547h;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = aVar != null ? aVar.f273538d : null;
            if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                jj2Var.set(0, 2);
                jj2Var.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x));
            } else {
                jj2Var.set(0, 1);
            }
            qr4Var.getList(1).add(jj2Var);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4297;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetbeatarrangement";
        lVar.f70664a = qr4Var;
        lVar.f70665b = new r45.rr4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151271e;
        kotlinx.coroutines.r2 r2Var = v4Var.f151498r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.flow.j a18 = o01.d.f341891a.a(a17);
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = this.f151272f.O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        v4Var.f151498r = kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.mv.ui.uic.k4(a18, this.f151271e, this.f151273g, hashMap, null), 2, null);
        return jz5.f0.f302826a;
    }
}
