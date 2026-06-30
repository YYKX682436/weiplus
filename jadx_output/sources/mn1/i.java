package mn1;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f329867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f329868e;

    public i(mn1.e eVar, java.util.Set set, int i17) {
        this.f329867d = set;
        this.f329868e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f329867d.iterator();
        while (it.hasNext()) {
            ((kn1.e) it.next()).a(this.f329868e);
        }
    }
}
