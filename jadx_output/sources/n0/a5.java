package n0;

/* loaded from: classes14.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.w f333435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(u26.w wVar) {
        super(2);
        this.f333435d = wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Set changed = (java.util.Set) obj;
        kotlin.jvm.internal.o.g(changed, "changed");
        kotlin.jvm.internal.o.g((x0.m) obj2, "<anonymous parameter 1>");
        this.f333435d.e(changed);
        return jz5.f0.f302826a;
    }
}
