package w71;

/* loaded from: classes8.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443416e;

    public k1(int i17, yz5.l lVar) {
        this.f443415d = i17;
        this.f443416e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] d17 = w71.l1.d(this.f443415d);
        yz5.l lVar = this.f443416e;
        if (lVar != null) {
            lVar.invoke(d17);
        }
    }
}
