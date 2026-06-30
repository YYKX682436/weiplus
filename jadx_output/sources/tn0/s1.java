package tn0;

/* loaded from: classes3.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.AssertionError f420747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.AssertionError assertionError) {
        super(0);
        this.f420747d = assertionError;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "failed. because " + this.f420747d.getMessage();
    }
}
