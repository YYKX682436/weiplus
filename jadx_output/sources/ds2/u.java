package ds2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ds2.b0 b0Var, java.lang.String str) {
        super(0);
        this.f242900d = b0Var;
        this.f242901e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pm0.v.d0(this.f242900d.f242856d, new ds2.t(this.f242901e, linkedList));
        return linkedList;
    }
}
