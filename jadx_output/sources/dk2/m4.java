package dk2;

/* loaded from: classes.dex */
public final class m4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f233752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f233753b;

    public m4(androidx.fragment.app.FragmentActivity fragmentActivity, yz5.l lVar) {
        this.f233752a = fragmentActivity;
        this.f233753b = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        this.f233753b.invoke(java.lang.Boolean.FALSE);
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        js4.h e17 = ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).e(this.f233752a, true);
        yz5.l lVar = this.f233753b;
        if (e17 != null) {
            ((ns4.p1) e17).f339618c = new dk2.l4(lVar);
        } else {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
