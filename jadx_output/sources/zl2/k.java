package zl2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.k f473851a = new zl2.k();

    /* renamed from: b, reason: collision with root package name */
    public static final zl2.h f473852b = new zl2.h();

    public final void a(android.app.Activity activity, java.lang.String originalPath, int i17, java.lang.String str, boolean z17, r45.bo1 hdScene, boolean z18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(originalPath, "originalPath");
        kotlin.jvm.internal.o.g(hdScene, "hdScene");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(originalPath, com.tencent.mm.plugin.finder.assist.x1.f102664h.a());
        b17.f155688z = false;
        b17.F = 20;
        try {
            fu3.e.class.getDeclaredMethod("updatePhotoEditProvider", com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.class).invoke(null, b17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveCoverEditHelper", e17, "ImproveEditPhotoConfig.updatePhotoEditProvider failed", new java.lang.Object[0]);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_edit_enable_crop_rotate", false);
        bundle.putString("original_image_path", originalPath);
        if (!(str == null || str.length() == 0)) {
            bundle.putString("original_cdn_url", str);
        }
        bundle.putBoolean("enable_cover_enhance", z17);
        bundle.putInt("hd_scene", hdScene.f370915d);
        bundle.putBoolean("show_hd_red_dot", z18);
        b17.M = bundle;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f155677o = uICustomParam;
        ((s40.w0) i95.n0.c(s40.w0.class)).getClass();
        b17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.finder_cover.FinderLiveAvatarEditPluginLayout");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoGeneratedCallback: setting callback=");
        zl2.h hVar = f473852b;
        sb6.append(hVar.hashCode());
        com.tencent.mars.xlog.Log.i("FinderLiveCoverEditHelper", sb6.toString());
        ut3.f.f431176c.f431177a = hVar;
        ut3.m.f431182a.f(activity, i17, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 1);
        com.tencent.mars.xlog.Log.i("FinderLiveCoverEditHelper", "jumpToNewCoverEditor: originalPath=" + originalPath + ", requestCode=" + i17);
    }
}
