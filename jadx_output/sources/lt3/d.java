package lt3;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321207e;

    public d(int i17, java.lang.String str) {
        this.f321206d = i17;
        this.f321207e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f321209a;
        java.util.Set set = (java.util.Set) lt3.e.f321210b.get(this.f321206d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).c(this.f321207e);
            }
        }
    }
}
