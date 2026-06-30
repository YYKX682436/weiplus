package gi5;

/* loaded from: classes12.dex */
public final class l extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f272319g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f272320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272319g = jz5.h.b(gi5.i.f272309d);
        this.f272320h = jz5.h.b(gi5.j.f272310d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null) {
            return;
        }
        java.lang.String mediaId = mediaInfo.getId();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f407405g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            W6(cVar, sf3.k.f407399g, a17);
        } else {
            W6(cVar, sf3.k.f407398f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f272320h).getValue()) {
            ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "updateState mediaId: " + mediaInfo.getId());
        if (cVar == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "unknown param: " + mediaInfo.getId());
            return;
        }
        ai5.c cVar2 = (ai5.c) mediaInfo;
        sf3.g e17 = cVar2.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "updateStateInternal failed, param null");
            return;
        }
        sf3.g a17 = e17.a(sf3.m.f407404f);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "image already exists. mediaId: " + cVar2.getId() + " path: " + a17.c());
            W6(cVar2, sf3.k.f407397e, a17);
            return;
        }
        long createTime = pt0.f0.f358209b1.n(cVar2.f5209c, cVar2.f5208b).getCreateTime();
        if (createTime > 0 && c01.id.a() - createTime > ((java.lang.Number) ((jz5.n) this.f272319g).getValue()).longValue()) {
            W6(cVar2, sf3.k.f407398f, a17);
            return;
        }
        W6(cVar2, sf3.k.f407396d, a17);
        java.lang.String id6 = cVar2.getId();
        tt.h d17 = cVar2.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.RecordImageStateManager", "download failed, no download param. mediaId: " + id6);
            return;
        }
        java.lang.String str2 = d17.f421764a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryStartDownload image mediaId: ");
        sb6.append(cVar2.getId());
        sb6.append(" imageKey:");
        sb6.append(str2);
        sb6.append(" path: ");
        java.lang.String str3 = d17.f421767d;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", sb6.toString());
        if (((java.util.HashSet) ((jz5.n) this.f272320h).getValue()).add(str2) && (!r26.n0.N(str3))) {
            v65.i.b(this.f418948f, null, new gi5.k(d17, id6, str3, this, str2, cVar2, e17, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "image already downloading, mediaId: " + id6);
    }
}
