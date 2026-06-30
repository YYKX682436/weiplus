package zl2;

/* loaded from: classes3.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f473987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(boolean z17) {
        super(1);
        this.f473987d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        zl2.r4 r4Var = zl2.r4.f473950a;
        it.post(new zl2.f4("FinderLiveUtil", it, this.f473987d));
        return jz5.f0.f302826a;
    }
}
