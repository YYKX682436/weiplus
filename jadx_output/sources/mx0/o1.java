package mx0;

/* loaded from: classes5.dex */
public final class o1 implements android.view.View.OnClickListener, yt3.r2, t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f332182d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f332183e;

    /* renamed from: f, reason: collision with root package name */
    public mx0.z f332184f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Bundle f332185g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f332186h;

    /* renamed from: i, reason: collision with root package name */
    public int f332187i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f332188m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f332189n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f332190o;

    public o1(android.view.View materialImportBtn, android.widget.ImageView materialImageView, mx0.z zVar) {
        kotlin.jvm.internal.o.g(materialImportBtn, "materialImportBtn");
        kotlin.jvm.internal.o.g(materialImageView, "materialImageView");
        this.f332182d = materialImportBtn;
        this.f332183e = materialImageView;
        this.f332184f = zVar;
        this.f332185g = new android.os.Bundle();
        this.f332186h = materialImageView.getContext();
        this.f332187i = 3;
        materialImportBtn.setOnClickListener(this);
    }

    public final void a() {
        android.view.View view = this.f332182d;
        view.setEnabled(false);
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(0.7f).setDuration(300L).start();
    }

    public final void b() {
        android.view.View view = this.f332182d;
        view.setEnabled(true);
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().cancel();
        view.animate().alpha(1.0f).setDuration(300L).start();
    }

    public final void c(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        mediaItem.o();
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
        android.widget.ImageView imageView = this.f332183e;
        imageView.setScaleType(scaleType);
        imageView.setForeground(j65.q.a(imageView.getContext()).getDrawable(com.tencent.mm.R.drawable.bbj, null));
        e33.m6.d(this.f332183e, mediaItem.getType(), mediaItem.o(), mediaItem.f138430e, mediaItem.f138434i, new mx0.n1(), mediaItem.f138435m);
        this.f332190o = mediaItem;
        yz5.l lVar = this.f332189n;
        if (lVar != null) {
            lVar.invoke(mediaItem);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        mx0.z zVar;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a();
        if (view != null) {
            by0.c cVar = by0.c.f36323a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (cVar.a(context) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportPlugin", "openAlbum: ");
                mx0.z zVar2 = this.f332184f;
                boolean z18 = false;
                if (zVar2 != null) {
                    com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar2;
                    if (shootComposingPluginLayout.p0(shootComposingPluginLayout.getCurrentTemplateInfo())) {
                        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Ri(java.lang.System.currentTimeMillis() - shootComposingPluginLayout.f69557v.D1);
                        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                        m7Var.Bj(1);
                        m7Var.sj(true);
                        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.p5(m7Var, null), 3, null);
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        java.util.Map Ai = m7Var.Ai();
                        Ai.put("view_id", "sc_asset_generate_enter_album");
                        ((cy1.a) rVar).yj("sc_asset_generate_enter_album", null, Ai, 6, false);
                        shootComposingPluginLayout.f69557v.D1 = 0L;
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        z18 = true;
                    }
                }
                if (z18 && (zVar = this.f332184f) != null) {
                    ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).O0(ma1.n.CTRL_INDEX);
                }
                b();
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportPlugin", "openAlbum: activity is null ");
        b();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MaterialImportUIPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        t23.p0.k().f(this);
        t23.n1 n1Var = t23.p0.k().f415296e;
        if (n1Var != null) {
            ((t23.f) n1Var).f415144g = true;
        }
        this.f332184f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVisibility(int r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.o1.setVisibility(int):void");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(this.f332186h, "android.permission.READ_EXTERNAL_STORAGE")) {
            t23.p0.k().g(3);
            t23.p0.k().f415297f = 39;
            t23.p0.k().b(this);
            t23.p0.k().e(null, 3, java.lang.System.currentTimeMillis());
        }
        byte[] byteArray = configProvider.M.getByteArray("KEY_POST_ASYNC_ASSET_INFO");
        if (byteArray != null) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArray.length);
            allocateDirect.put(byteArray);
            allocateDirect.flip();
            vt3.l lVar = vt3.l.f440005a;
            com.tencent.mars.xlog.Log.i("AssetInfoStatistics", "loadBinaryBuffer");
            lVar.c(new vt3.e(allocateDirect));
        }
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        if (linkedList != null) {
            linkedList.size();
        }
        if (linkedList == null || (galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.a0(linkedList, 0)) == null) {
            return;
        }
        t23.p0.k().f(this);
        t23.p0.n().c(new mx0.m1(this, galleryItem$MediaItem));
    }
}
