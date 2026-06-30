package rv0;

/* loaded from: classes5.dex */
public final class a0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j f399916d;

    public a0(rv0.j jVar) {
        this.f399916d = jVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((com.tencent.maas.model.time.MJTime) obj) == null) {
            return;
        }
        rv0.j jVar = this.f399916d;
        jVar.I();
        jVar.H();
        jVar.D();
    }
}
