package q10;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.l lVar) {
        super(1);
        this.f359506d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String token = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBProfileUtil", "startProfile: evaluate done, token=".concat(token));
        this.f359506d.invoke(token);
        return jz5.f0.f302826a;
    }
}
