package hn1;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hn1.g f282451d = new hn1.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.io.InputStream open = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png", 3);
        kotlin.jvm.internal.o.f(open, "open(...)");
        return com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.j.c(open, i65.a.g(null)), true, r0.getWidth() * 0.5f);
    }
}
