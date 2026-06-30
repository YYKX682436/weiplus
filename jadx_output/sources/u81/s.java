package u81;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u81.u f425458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f425459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f425460f;

    public s(u81.f0 f0Var, u81.u uVar, java.lang.Object obj) {
        this.f425460f = f0Var;
        this.f425458d = uVar;
        this.f425459e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425460f.s(this.f425458d, this.f425459e);
    }
}
