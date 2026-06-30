package lt3;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321203f;

    public c(int i17, java.lang.String str, int i18) {
        this.f321201d = i17;
        this.f321202e = str;
        this.f321203f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f321209a;
        java.util.Set set = (java.util.Set) lt3.e.f321210b.get(this.f321201d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).d(this.f321202e, this.f321203f);
            }
        }
    }
}
