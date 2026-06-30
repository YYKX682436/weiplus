package cx;

/* loaded from: classes7.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f224459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f224460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, cx.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f224459d = i17;
        this.f224460e = w0Var;
        this.f224461f = str;
        this.f224462g = str2;
        this.f224463h = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene magicSclBrandReporter$PreloadScene = this.f224459d == 3 ? com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.Expose : com.tencent.mm.storage.c2.f193805c ? com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.InBox : com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.OutBox;
        cx.w0 w0Var = this.f224460e;
        hq0.e0 e0Var = (hq0.e0) w0Var.A.get("frames");
        if (e0Var != null) {
            java.lang.String str = this.f224461f;
            java.lang.String str2 = this.f224463h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout from native ");
            sb6.append(e0Var);
            sb6.append(".id frameSet:");
            sb6.append(str);
            sb6.append(" data:");
            java.lang.String str3 = this.f224462g;
            sb6.append(str3.length());
            sb6.append(" ext:");
            sb6.append(str2);
            sb6.append(" reportScene:");
            sb6.append(magicSclBrandReporter$PreloadScene);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", sb6.toString());
            w0Var.f224479x.l(e0Var.f282984e, str, str3, magicSclBrandReporter$PreloadScene, str2, cx.r0.f224457d);
        }
        return jz5.f0.f302826a;
    }
}
