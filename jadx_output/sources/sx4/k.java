package sx4;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f413621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.n f413622e;

    public k(sx4.n nVar, android.os.Bundle bundle) {
        this.f413622e = nVar;
        this.f413621d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f413621d.putInt("height", this.f413622e.f413632e.f413638b.Y8());
    }
}
