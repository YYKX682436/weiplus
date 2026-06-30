package hw;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.c0 f285355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i17, hw.c0 c0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f285354d = i17;
        this.f285355e = c0Var;
        this.f285356f = str;
        this.f285357g = str2;
        this.f285358h = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene magicSclBrandReporter$PreloadScene = this.f285354d == 3 ? com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.Expose : com.tencent.mm.storage.c2.f193805c ? com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.InBox : com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.OutBox;
        hw.c0 c0Var = this.f285355e;
        hq0.e0 e0Var = (hq0.e0) c0Var.A.get("frames");
        if (e0Var != null) {
            java.lang.String str = this.f285356f;
            java.lang.String str2 = this.f285358h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout from native ");
            sb6.append(e0Var);
            sb6.append(".id frameSet:");
            sb6.append(str);
            sb6.append(" data:");
            java.lang.String str3 = this.f285357g;
            sb6.append(str3.length());
            sb6.append(" ext:");
            sb6.append(str2);
            sb6.append(" reportScene:");
            sb6.append(magicSclBrandReporter$PreloadScene);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsTLBaseBiz", sb6.toString());
            c0Var.f285362x.l(e0Var.f282984e, str, str3, magicSclBrandReporter$PreloadScene, str2, hw.z.f285451d);
        }
        return jz5.f0.f302826a;
    }
}
