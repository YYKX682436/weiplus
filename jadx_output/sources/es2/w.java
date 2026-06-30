package es2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(es2.h0 h0Var, java.lang.String str) {
        super(0);
        this.f256414d = h0Var;
        this.f256415e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pm0.v.d0(this.f256414d.f256372e, new es2.v(this.f256415e, linkedList));
        return linkedList;
    }
}
