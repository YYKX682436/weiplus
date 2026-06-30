package ms4;

/* loaded from: classes8.dex */
public class w implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f331128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ js4.n f331129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ms4.z f331130c;

    public w(ms4.z zVar, androidx.fragment.app.FragmentActivity fragmentActivity, js4.n nVar) {
        this.f331130c = zVar;
        this.f331128a = fragmentActivity;
        this.f331129b = nVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        js4.o oVar = this.f331129b.f301546d;
        if (oVar != null) {
            oVar.a(i17, i18, str);
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        this.f331130c.a(this.f331128a, this.f331129b);
    }
}
