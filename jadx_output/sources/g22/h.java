package g22;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oo3 f267819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g22.i f267820e;

    public h(r45.oo3 oo3Var, g22.i iVar) {
        this.f267819d = oo3Var;
        this.f267820e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z85.z zVar;
        r45.oo3 oo3Var = this.f267819d;
        if (oo3Var != null) {
            g22.i iVar = this.f267820e;
            int i17 = iVar.f267822d;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                zVar = f17.f195169g;
            }
            zVar.y0(iVar.f267822d, oo3Var);
        }
    }
}
