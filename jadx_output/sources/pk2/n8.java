package pk2;

/* loaded from: classes3.dex */
public final class n8 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f356043f;

    public n8(pk2.d9 d9Var, pk2.o9 o9Var, android.app.Activity activity) {
        this.f356041d = d9Var;
        this.f356042e = o9Var;
        this.f356043f = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        o25.y1 y1Var;
        this.f356041d.f355660c = null;
        pk2.o9 o9Var = this.f356042e;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        android.app.Activity activity = this.f356043f;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(activity, 14, r45.pk5.class);
        if (pk5Var != null) {
            pk5Var.f383132d = 1;
            pk5Var.f383140o = (int) (c01.id.c() - pk5Var.f383143r);
            pk5Var.f383137i = 8;
            pk2.d9 d9Var = o9Var.f356082f;
            pk5Var.f383136h = (d9Var == null || (y1Var = d9Var.f355666i) == null) ? 0 : ((com.tencent.mm.pluginsdk.forward.m) y1Var).f188722e;
        }
        l35.a.f315443a.a(activity);
        qk2.f fVar = o9Var.f356086h;
        if (fVar != null) {
            fVar.d();
        }
        ((mm2.c1) o9Var.c(mm2.c1.class)).f328797e4.postValue(java.lang.Boolean.TRUE);
    }
}
