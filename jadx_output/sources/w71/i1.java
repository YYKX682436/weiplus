package w71;

/* loaded from: classes8.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443407e;

    public i1(int i17, yz5.l lVar) {
        this.f443406d = i17;
        this.f443407e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b17 = w71.l1.b(this.f443406d);
        yz5.l lVar = this.f443407e;
        if (lVar != null) {
            lVar.invoke(b17);
        }
    }
}
