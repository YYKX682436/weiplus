package k3;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k3.o f303773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Typeface f303774e;

    public a(k3.c cVar, k3.o oVar, android.graphics.Typeface typeface) {
        this.f303773d = oVar;
        this.f303774e = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        d3.p pVar = ((e3.g) this.f303773d).f247050a;
        if (pVar != null) {
            pVar.d(this.f303774e);
        }
    }
}
