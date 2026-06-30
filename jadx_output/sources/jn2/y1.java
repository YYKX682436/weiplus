package jn2;

/* loaded from: classes8.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300759e;

    public y1(jn2.z1 z1Var, int i17) {
        this.f300758d = z1Var;
        this.f300759e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f300758d.f300772n;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.f300759e));
        }
    }
}
