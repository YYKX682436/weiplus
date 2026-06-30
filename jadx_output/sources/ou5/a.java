package ou5;

/* loaded from: classes12.dex */
public class a implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou5.d f349041d;

    public a(ou5.d dVar) {
        this.f349041d = dVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "Experience#persistCache";
    }

    @Override // java.lang.Runnable
    public void run() {
        ou5.d dVar = this.f349041d;
        dVar.k(dVar.i());
    }
}
