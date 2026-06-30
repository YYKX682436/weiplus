package xn4;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.n1 f455643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.modelcdntran.n1 n1Var, java.lang.String str) {
        super(1);
        this.f455643d = n1Var;
        this.f455644e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xn4.q callback = (xn4.q) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.c(this.f455643d.f71104b, this.f455644e);
        return jz5.f0.f302826a;
    }
}
