package kc2;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f306496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kc2.c0 c0Var) {
        super(0);
        this.f306496d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
        return new kc2.a2(synchronizedList, this.f306496d.b());
    }
}
