package dl4;

/* loaded from: classes3.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f235370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f235371f;

    public b1(java.lang.String str, boolean z17, long j17, java.lang.Object[] objArr) {
        this.f235369d = str;
        this.f235370e = z17;
        this.f235371f = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.d1.f235384b.remove(this.f235369d);
        if (arrayList != null) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p11.d) it.next()).a(this.f235370e, this.f235371f);
            }
        }
    }
}
