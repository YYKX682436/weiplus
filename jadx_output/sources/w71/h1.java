package w71;

/* loaded from: classes8.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443403e;

    public h1(int i17, yz5.l lVar) {
        this.f443402d = i17;
        this.f443403e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] a17 = w71.l1.a(this.f443402d);
        yz5.l lVar = this.f443403e;
        if (lVar != null) {
            lVar.invoke(a17);
        }
    }
}
