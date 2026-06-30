package r2;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f368728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r2.o oVar) {
        super(1);
        this.f368728d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final yz5.a command = (yz5.a) obj;
        kotlin.jvm.internal.o.g(command, "command");
        r2.o oVar = this.f368728d;
        if (oVar.getHandler().getLooper() == android.os.Looper.myLooper()) {
            command.invoke();
        } else {
            oVar.getHandler().post(new java.lang.Runnable() { // from class: r2.m$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yz5.a tmp0 = yz5.a.this;
                    kotlin.jvm.internal.o.g(tmp0, "$tmp0");
                    tmp0.invoke();
                }
            });
        }
        return jz5.f0.f302826a;
    }
}
