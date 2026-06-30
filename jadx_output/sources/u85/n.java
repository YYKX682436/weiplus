package u85;

/* loaded from: classes10.dex */
public final class n extends u85.o {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f425718h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.sticker.loader.StickerLoadInfo info) {
        super(info);
        kotlin.jvm.internal.o.g(info, "info");
        this.f425718h = "MicroMsg.StickerProcessTask";
    }

    @Override // fp0.d
    public void a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("load_info", this.f425719f);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, u85.l.class, new u85.m(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f425719f.a();
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f425718h, "onResult: " + d() + ' ' + z17);
        super.e(z17);
    }
}
