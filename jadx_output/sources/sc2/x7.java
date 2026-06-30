package sc2;

/* loaded from: classes2.dex */
public final class x7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(java.lang.String str) {
        super(1);
        this.f406369d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        android.view.View view = observer.f3143d;
        if (p0Var != null && view != null) {
            java.lang.String activityName = this.f406369d;
            kotlin.jvm.internal.o.g(activityName, "activityName");
            xc2.z2 z2Var = observer.f3151o;
            if (z2Var != null) {
                z2Var.c(activityName, p0Var, view);
            }
        }
        return jz5.f0.f302826a;
    }
}
