package k3;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final k3.o f303777a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f303778b;

    public c(k3.o oVar, android.os.Handler handler) {
        this.f303777a = oVar;
        this.f303778b = handler;
    }

    public void a(k3.k kVar) {
        int i17 = kVar.f303796b;
        boolean z17 = i17 == 0;
        android.os.Handler handler = this.f303778b;
        k3.o oVar = this.f303777a;
        if (z17) {
            handler.post(new k3.a(this, oVar, kVar.f303795a));
        } else {
            handler.post(new k3.b(this, oVar, i17));
        }
    }
}
