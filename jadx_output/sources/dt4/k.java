package dt4;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt4.p f243244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f243245e;

    public k(dt4.p pVar, int i17) {
        this.f243244d = pVar;
        this.f243245e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt4.p pVar = this.f243244d;
        int i17 = this.f243245e;
        pVar.f243269b = i17;
        dt4.i iVar = pVar.f243272e;
        if (iVar != null) {
            iVar.a(i17);
        }
    }
}
