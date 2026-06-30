package zh5;

/* loaded from: classes12.dex */
public final class d extends tf3.b {

    /* renamed from: g, reason: collision with root package name */
    public final zh5.k f473014g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f473015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473014g = new zh5.k();
        this.f473015h = jz5.h.b(zh5.b.f472998d);
    }

    @Override // sf3.f
    public void I2(mf3.k mediaInfo, java.lang.String path, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(listener, "listener");
        zh5.w wVar = mediaInfo instanceof zh5.w ? (zh5.w) mediaInfo : null;
        if (wVar == null) {
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
            W6(wVar, sf3.k.f407399g, a17);
        } else {
            W6(wVar, sf3.k.f407398f, a17);
        }
    }

    @Override // tf3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f473015h).getValue()) {
            this.f473014g.a(str);
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // tf3.b, sf3.f
    public void W4(mf3.k mediaInfo, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.W4(mediaInfo, listener);
        zh5.a aVar = mediaInfo instanceof zh5.a ? (zh5.a) mediaInfo : null;
        com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "updateState mediaId: " + mediaInfo.getId());
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "unknown param: " + mediaInfo.getId());
            return;
        }
        zh5.a aVar2 = (zh5.a) mediaInfo;
        sf3.g e17 = aVar2.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "updateStateInternal failed, param null");
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
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "image already exists. mediaId: " + aVar2.getId() + " path: " + a17.c());
            W6(aVar2, sf3.k.f407397e, a17);
            return;
        }
        W6(aVar2, sf3.k.f407396d, a17);
        java.lang.String id6 = aVar2.getId();
        dn.m d17 = aVar2.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.CDNImageStateManager", "download failed, no cdnInfo param. mediaId: " + id6);
            return;
        }
        zh5.l lVar = new zh5.l(id6, aVar2.g(), d17);
        java.lang.String g17 = aVar2.g();
        java.lang.String str2 = aVar2.f472991a;
        com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "tryStartDownload image mediaId: " + aVar2.getId() + " imageKey:" + str2 + " path: " + g17);
        if (((java.util.HashSet) ((jz5.n) this.f473015h).getValue()).add(str2) && (!r26.n0.N(g17))) {
            v65.i.b(this.f418948f, null, new zh5.c(this, lVar, id6, g17, str2, aVar2, e17, null), 1, null);
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "image already downloading, mediaId: ".concat(id6));
        }
    }
}
