package r2;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f368718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r2.o oVar) {
        super(1);
        this.f368718d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r2.o it = (r2.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r2.o oVar = this.f368718d;
        android.os.Handler handler = oVar.getHandler();
        final yz5.a aVar = oVar.f368743s;
        handler.post(new java.lang.Runnable() { // from class: r2.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                yz5.a tmp0 = yz5.a.this;
                kotlin.jvm.internal.o.g(tmp0, "$tmp0");
                tmp0.invoke();
            }
        });
        return jz5.f0.f302826a;
    }
}
