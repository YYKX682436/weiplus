package sx3;

/* loaded from: classes2.dex */
public final class h implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413557a;

    public h(sx3.m mVar) {
        this.f413557a = mVar;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        androidx.appcompat.app.AppCompatActivity activity = this.f413557a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        sx3.b bVar = (sx3.b) zVar.a(activity).a(sx3.b.class);
        androidx.appcompat.app.AppCompatActivity activity2 = bVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        sx3.q qVar = (sx3.q) zVar.a(activity2).a(sx3.q.class);
        kotlinx.coroutines.l.d(qVar.getLifecycleScope(), null, null, new sx3.p(bVar.f413548f, qVar, null), 3, null);
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        androidx.appcompat.app.AppCompatActivity activity = this.f413557a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        sx3.q qVar = (sx3.q) zVar.a(activity).a(sx3.q.class);
        androidx.appcompat.app.AppCompatActivity activity2 = qVar.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        kotlinx.coroutines.l.d(qVar.getLifecycleScope(), null, null, new sx3.p(((sx3.b) zVar.a(activity2).a(sx3.b.class)).f413548f, qVar, null), 3, null);
        return true;
    }
}
