package v22;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432809a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f432810b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.a f432811c;

    /* renamed from: d, reason: collision with root package name */
    public long f432812d;

    public f(java.lang.String outputPath, int i17, int i18, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        this.f432809a = "MicroMsg.EmojiMixGifEncoder";
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("EmojiMixer_gifEncode");
        this.f432810b = n3Var;
        this.f432811c = z17 ? new com.tencent.mm.plugin.gif.p(outputPath, i17, i18, j17) : new com.tencent.mm.plugin.gif.w(outputPath, i17, i18, j17, 20);
        n3Var.post(new v22.c(this, z17));
    }
}
