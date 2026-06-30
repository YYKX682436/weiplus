package dk2;

/* loaded from: classes.dex */
public final class u3 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f234152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234153c;

    public u3(dk2.r4 r4Var, androidx.fragment.app.FragmentActivity fragmentActivity, yz5.l lVar) {
        this.f234151a = r4Var;
        this.f234152b = fragmentActivity;
        this.f234153c = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        this.f234153c.invoke(java.lang.Boolean.FALSE);
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        this.f234151a.getClass();
        androidx.fragment.app.FragmentActivity context = this.f234152b;
        kotlin.jvm.internal.o.g(context, "context");
        js4.h e17 = ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).e(context, true);
        yz5.l lVar = this.f234153c;
        if (e17 != null) {
            ((ns4.p1) e17).f339618c = new dk2.t3(lVar);
        } else {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
