package fu3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fu3.e f266880a = new fu3.e();

    public final boolean a() {
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_PhotoImproveEdit_Int, 0);
        if (g17 != 0) {
            return g17 == 1;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_photo_edit_improve_enable, true);
    }

    public final void b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        boolean a17 = a();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoConfig", "getPhotoEditProvider >> " + a17);
        provider.M.putBoolean("key_edit_enable_emoji_search", true);
        if (a17) {
            provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
        }
    }
}
