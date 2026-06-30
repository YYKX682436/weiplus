package tn0;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f420742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.Exception exc) {
        super(0);
        this.f420742d = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "failed. because " + this.f420742d.getMessage();
    }
}
