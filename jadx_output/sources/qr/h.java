package qr;

/* loaded from: classes12.dex */
public final class h extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f366014f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f366015g;

    /* renamed from: h, reason: collision with root package name */
    public final long f366016h;

    /* renamed from: i, reason: collision with root package name */
    public long f366017i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f366018m;

    public h(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f366014f = emojiInfo;
        this.f366015g = "MicroMsg.EmojiCaptureUploadTask";
        this.f366016h = emojiInfo.field_captureEnterTime;
        this.f366018m = !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_wxamMd5);
    }

    @Override // fp0.d
    public void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        new gr.y(this.f366014f, new qr.f(this, java.lang.System.currentTimeMillis()));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f366016h);
    }
}
