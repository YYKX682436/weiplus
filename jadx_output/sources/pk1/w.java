package pk1;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.w f355527d = new pk1.w();

    public w() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.D(), "ThumbVideoCache/CdnDownload/Cache");
        com.tencent.mm.vfs.w6.u(r6Var.o());
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, com.tencent.mm.plugin.appbrand.video.player.thumb.m.a());
        com.tencent.mm.vfs.w6.u(r6Var2.o());
        return r6Var2;
    }
}
