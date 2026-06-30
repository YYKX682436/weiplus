package rh5;

/* loaded from: classes3.dex */
public final class b extends lf3.n implements xf3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public void V6(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        java.lang.String g17 = mediaInfo.g();
        com.tencent.mars.xlog.Log.i("MediaGallery.BaseImageEditComponent", "edit image path:" + g17 + " mediaId:" + mediaInfo.getId());
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(g17, "");
        b17.F = 0;
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f155677o = uICustomParam;
        ut3.m.f431182a.f(getActivity(), 4369, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 2);
    }
}
