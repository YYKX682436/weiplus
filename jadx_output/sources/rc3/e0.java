package rc3;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rc3.w0 w0Var) {
        super(2);
        this.f393973d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String content = (java.lang.String) obj;
        java.lang.String extra = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extra, "extra");
        rc3.w0 w0Var = this.f393973d;
        com.tencent.mars.xlog.Log.e(w0Var.f394105z, "server lost: " + content + ' ' + extra);
        je3.i.t8(je3.k.f299298e, w0Var.f394102w, "remoteException-IMBServer", content, extra, 0.0f, 16, null);
        w0Var.T(new rc3.c(w0Var));
        return jz5.f0.f302826a;
    }
}
