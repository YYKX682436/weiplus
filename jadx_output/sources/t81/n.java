package t81;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t81.s f416370e;

    public n(java.util.List list, t81.s sVar) {
        this.f416369d = list;
        this.f416370e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f416369d) {
            if (!(str == null || str.length() == 0)) {
                this.f416370e.d(str);
            }
        }
    }
}
