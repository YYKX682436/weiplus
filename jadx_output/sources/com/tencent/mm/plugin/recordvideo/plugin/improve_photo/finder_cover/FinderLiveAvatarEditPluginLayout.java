package com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/finder_cover/FinderLiveAvatarEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveBaseEditPhotoLayout;", "", "Ldu3/e;", "getFuncButtonOrder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveAvatarEditPluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f155768w = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveAvatarEditPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout
    public java.util.List<du3.e> getFuncButtonOrder() {
        return kz5.c0.i(du3.e.f243565g, du3.e.f243562d, du3.e.f243563e, du3.e.f243564f, du3.e.f243566h, du3.e.f243567i);
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout, com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout
    public void r(ct0.b bVar) {
        float f17;
        android.os.Bundle bundle;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = getConfigProvider();
        float f18 = 0.75f;
        if (configProvider != null && (bundle = configProvider.M) != null) {
            f18 = bundle.getFloat("crop_fix_ratio", 0.75f);
        }
        float f19 = f18;
        setCropRectRatio(f19);
        qc0.y0 y0Var = (qc0.y0) i95.n0.c(qc0.y0.class);
        if (y0Var != null) {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider2 = getConfigProvider();
            kotlin.jvm.internal.o.d(configProvider2);
            f17 = f19;
            qc0.a aVar = new qc0.a(this, this, configProvider2, new gu3.a(this), com.tencent.mm.R.id.pxc, com.tencent.mm.R.id.pvk, com.tencent.mm.R.id.pv7, com.tencent.mm.R.id.px_, com.tencent.mm.R.id.px8, com.tencent.mm.R.id.px7, new gu3.b(this), false, 2048, null);
            eg2.a0 a0Var = (eg2.a0) y0Var;
            android.view.ViewGroup viewGroup = a0Var.f252530d;
            android.view.ViewGroup viewGroup2 = aVar.f361347b;
            if (kotlin.jvm.internal.o.b(viewGroup, viewGroup2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveCoverEditDelegateImpl", "setupCoverEditPlugins already called for this page, skip");
            } else {
                a0Var.f252530d = viewGroup2;
                ju3.d0 d0Var = aVar.f361346a;
                new eg2.x(d0Var, viewGroup2, aVar);
                eg2.n nVar = new eg2.n(d0Var, viewGroup2, aVar);
                new eg2.p(d0Var, viewGroup2, aVar).f252611o = new eg2.y(nVar);
                nVar.f252598s = new eg2.z(aVar);
            }
        } else {
            f17 = f19;
        }
        super.r(bVar);
        post(new gu3.c(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveAvatarEditPluginLayout", "loadCurrentPage: cropRatio=" + f17);
    }
}
