package dk5;

/* loaded from: classes2.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f234497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f234498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk5.b6 f234499f;

    public a6(dk5.b6 b6Var, boolean z17, boolean z18) {
        this.f234499f = b6Var;
        this.f234497d = z17;
        this.f234498e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        tg3.y0 y0Var = this.f234499f.f234531e;
        boolean z17 = this.f234497d && this.f234498e;
        com.tencent.mm.plugin.finder.assist.n4 n4Var = (com.tencent.mm.plugin.finder.assist.n4) y0Var;
        com.tencent.mm.plugin.finder.assist.i4 i4Var = n4Var.f102400a;
        i4Var.f102262l = !z17;
        n4Var.f102401b.invoke(i4Var);
    }
}
