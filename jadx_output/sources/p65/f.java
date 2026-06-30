package p65;

/* loaded from: classes12.dex */
public class f implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f352444a;

    public f(p65.a aVar, android.content.res.Configuration configuration) {
        this.f352444a = configuration;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((hm0.q) nVar).onConfigurationChanged(this.f352444a);
        return false;
    }
}
