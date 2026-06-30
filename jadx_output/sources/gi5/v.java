package gi5;

/* loaded from: classes12.dex */
public final class v extends jg3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f272337f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f272338g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f272339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f272337f = new java.util.LinkedHashMap();
        this.f272338g = jz5.h.b(gi5.s.f272325d);
        this.f272339h = jz5.h.b(gi5.r.f272324d);
    }

    @Override // jg3.b
    public void V6() {
        for (java.lang.String str : (java.util.HashSet) ((jz5.n) this.f272338g).getValue()) {
            ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", "cancel download, id: ".concat(str));
        }
    }

    @Override // jg3.b, gg3.b
    public void a5(mf3.k mediaInfo, gg3.f listener) {
        gg3.c a17;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        super.a5(mediaInfo, listener);
        ai5.c cVar = mediaInfo instanceof ai5.c ? (ai5.c) mediaInfo : null;
        if (cVar == null || (a17 = mediaInfo.a()) == null) {
            return;
        }
        mediaInfo.getId();
        tt.h i17 = cVar.i();
        if (i17 == null) {
            com.tencent.mars.xlog.Log.e("MediaGallery.RecordVideoStateManager", "updateState failed, downloadParam null. mediaId: " + mediaInfo.getId());
            return;
        }
        java.lang.String id6 = mediaInfo.getId();
        gi5.u uVar = new gi5.u(mediaInfo, this, a17);
        this.f272337f.put(id6, uVar);
        i17.f421772i = new java.lang.ref.WeakReference(uVar);
        java.lang.String str = i17.f421767d;
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", "video already exists. mediaId: " + mediaInfo.getId() + " path: " + str);
            jg3.b.X6(this, mediaInfo, gg3.d.f271733e, a17, null, 4, null);
            return;
        }
        long createTime = pt0.f0.f358209b1.n(cVar.f5209c, cVar.f5208b).getCreateTime();
        if (createTime > 0 && c01.id.a() - createTime > ((java.lang.Number) ((jz5.n) this.f272339h).getValue()).longValue()) {
            jg3.b.X6(this, mediaInfo, gg3.d.f271734f, a17, null, 4, null);
            return;
        }
        jg3.b.X6(this, mediaInfo, gg3.d.f271732d, a17, null, 4, null);
        java.lang.String id7 = cVar.getId();
        java.lang.String str3 = i17.f421764a;
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", "tryStartDownload video mediaId: " + cVar.getId() + " videoKey:" + str3 + " path: " + str);
        if (((java.util.HashSet) ((jz5.n) this.f272338g).getValue()).add(str3) && (!r26.n0.N(str))) {
            v65.i.b(this.f299654e, null, new gi5.t(i17, id7, str, this, str3, cVar, a17, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", "already downloading, mediaId: " + id7);
    }

    @Override // jg3.b, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
    }
}
