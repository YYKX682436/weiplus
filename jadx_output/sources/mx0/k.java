package mx0;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17) {
        super(1);
        this.f332089d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.setEnabled(this.f332089d);
        return jz5.f0.f302826a;
    }
}
