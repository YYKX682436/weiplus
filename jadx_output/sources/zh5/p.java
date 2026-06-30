package zh5;

/* loaded from: classes12.dex */
public final class p extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final zh5.k f473057f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f473058g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f473059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473057f = new zh5.k();
        this.f473058g = new java.util.LinkedHashMap();
        this.f473059h = jz5.h.b(zh5.m.f473042d);
    }

    @Override // jg3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f473059h).getValue()) {
            this.f473057f.a(str);
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        gg3.c a17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        zh5.x xVar = mediaInfo instanceof zh5.x ? (zh5.x) mediaInfo : null;
        if (xVar == null || (a17 = mediaInfo.a()) == null) {
            return;
        }
        mediaInfo.getId();
        dn.m d17 = xVar.d();
        java.lang.String str = xVar.f472995e;
        java.lang.String str2 = xVar.f472991a;
        zh5.l lVar = new zh5.l(str2, str, d17);
        java.lang.String id6 = mediaInfo.getId();
        zh5.o oVar = new zh5.o(mediaInfo, this, a17);
        this.f473058g.put(id6, oVar);
        lVar.f473041d = new java.lang.ref.WeakReference(oVar);
        java.lang.String str3 = lVar.f473039b;
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", "video already exists. mediaId: " + mediaInfo.getId() + " path: " + str3);
            jg3.b.X6(this, mediaInfo, gg3.d.f271733e, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f271732d, a17, null, 4, null);
        java.lang.String str5 = xVar.f472991a;
        java.lang.String str6 = lVar.f473038a;
        com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", "tryStartDownload video mediaId: " + str2 + " videoKey:" + str6 + " path: " + str3);
        if (((java.util.HashSet) ((jz5.n) this.f473059h).getValue()).add(str6) && (!r26.n0.N(str3))) {
            v65.i.b(this.f299654e, null, new zh5.n(this, lVar, str5, str3, str6, xVar, a17, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", "already downloading, mediaId: " + str5);
    }

    @Override // jg3.b, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
    }
}
