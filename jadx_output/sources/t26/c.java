package t26;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t26.a f415352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f415353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t26.a aVar, java.lang.Runnable runnable) {
        super(1);
        this.f415352d = aVar;
        this.f415353e = runnable;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f415352d.f415344e.removeCallbacks(this.f415353e);
        return jz5.f0.f302826a;
    }
}
