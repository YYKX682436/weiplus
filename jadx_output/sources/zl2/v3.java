package zl2;

/* loaded from: classes3.dex */
public final class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f474003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f474004e;

    public v3(android.view.ViewGroup viewGroup, boolean z17) {
        this.f474003d = viewGroup;
        this.f474004e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(this.f474003d, new zl2.u3(this.f474004e));
    }
}
