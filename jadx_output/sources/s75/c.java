package s75;

/* loaded from: classes5.dex */
public class c implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f404632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f404634f;

    public c(s75.d dVar, boolean z17, java.lang.String str, java.lang.Runnable runnable) {
        this.f404632d = z17;
        this.f404633e = str;
        this.f404634f = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f404632d;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f404633e;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404634f.run();
    }
}
