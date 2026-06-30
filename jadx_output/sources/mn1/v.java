package mn1;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f329889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f329890e;

    public v(mn1.w wVar, java.util.Set set, int i17) {
        this.f329889d = set;
        this.f329890e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f329889d.iterator();
        while (it.hasNext()) {
            ((kn1.e) it.next()).a(this.f329890e);
        }
    }
}
