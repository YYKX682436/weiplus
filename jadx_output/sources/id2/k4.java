package id2;

/* loaded from: classes8.dex */
public final class k4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290648e;

    public k4(int i17, yz5.l lVar) {
        this.f290647d = i17;
        this.f290648e = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        bw5.br req = (bw5.br) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int i17 = req.f25797d;
        int i18 = this.f290647d;
        yz5.l lVar = this.f290648e;
        if (i17 == i18) {
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
