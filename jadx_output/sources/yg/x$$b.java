package yg;

/* loaded from: classes7.dex */
public final /* synthetic */ class x$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f462143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f462144e;

    public /* synthetic */ x$$b(yz5.a aVar, com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f462143d = aVar;
        this.f462144e = magicBrush;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a fn6 = this.f462143d;
        com.tencent.magicbrush.MagicBrush this$0 = this.f462144e;
        int i17 = com.tencent.magicbrush.MagicBrush.f48586q;
        kotlin.jvm.internal.o.g(fn6, "$fn");
        kotlin.jvm.internal.o.g(this$0, "this$0");
        yg.g0 g0Var = (yg.g0) fn6.invoke();
        this$0.nativeBindTo(this$0.f48577a, g0Var.f462061a, g0Var.f462062b, g0Var.f462063c);
    }
}
