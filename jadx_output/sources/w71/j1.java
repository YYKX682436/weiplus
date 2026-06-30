package w71;

/* loaded from: classes8.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443412e;

    public j1(int i17, yz5.l lVar) {
        this.f443411d = i17;
        this.f443412e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] c17 = w71.l1.c(this.f443411d);
        yz5.l lVar = this.f443412e;
        if (lVar != null) {
            lVar.invoke(c17);
        }
    }
}
