package xc2;

/* loaded from: classes4.dex */
public final class x1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f453333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f453337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453338f;

    public x1(kotlin.jvm.internal.c0 c0Var, android.content.Context context, xc2.p0 p0Var, in5.s0 s0Var, boolean z17, java.lang.String str) {
        this.f453333a = c0Var;
        this.f453334b = context;
        this.f453335c = p0Var;
        this.f453336d = s0Var;
        this.f453337e = z17;
        this.f453338f = str;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "jumpLiteApp fail");
        pm0.v.X(new xc2.w1(this.f453333a, this.f453334b, this.f453335c, this.f453336d, this.f453337e, this.f453338f));
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "jumpLiteApp success");
    }
}
