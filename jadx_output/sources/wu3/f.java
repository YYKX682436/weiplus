package wu3;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.h f449733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f449734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wu3.h hVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f449733d = hVar;
        this.f449734e = motionEvent;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zu3.f fVar;
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        wu3.h hVar = this.f449733d;
        hVar.f449756u.set(m17);
        hVar.k();
        if (booleanValue && (fVar = hVar.f449753r) != null) {
            fVar.a(hVar, this.f449734e);
        }
        return jz5.f0.f302826a;
    }
}
