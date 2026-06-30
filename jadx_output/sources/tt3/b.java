package tt3;

/* loaded from: classes10.dex */
public final class b extends st3.u {

    /* renamed from: b, reason: collision with root package name */
    public static final tt3.b f422037b = new tt3.b();

    @Override // es0.c
    public java.lang.Object d() {
        return new tt3.a(0, false, 0, 0, 15, null);
    }

    @Override // es0.c
    public void e() {
        ((tt3.a) b()).f422029b = c("StoryEditVideoBgmSwitch", 1) == 1;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1) * 100;
        ((tt3.a) b()).f422030c = b17;
        ((tt3.a) b()).f422031d = b17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_favorite_enable, 0);
        ((tt3.a) b()).f422032e = true;
        ((tt3.a) b()).f422034g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_image_2_video_enable, 1) == 1;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_edit_tip_enable, 1);
        c("StoryFeaturedExpiredTime", 15552000);
        ((tt3.a) b()).f422036i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_album_duration, 10);
        ((tt3.a) b()).f422033f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_edit_lyrics_enable, 1) == 1;
        ((tt3.a) b()).f422035h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_add_music_enable, 1) == 1;
    }
}
