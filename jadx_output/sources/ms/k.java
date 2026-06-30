package ms;

/* loaded from: classes4.dex */
public final class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f330926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ms.n f330927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330929g;

    public k(com.tencent.mm.modelbase.f fVar, ms.n nVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f330926d = fVar;
        this.f330927e = nVar;
        this.f330928f = str;
        this.f330929g = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f330926d.f70616b;
        java.lang.String reportSessionId = this.f330928f;
        ms.n nVar = this.f330927e;
        if (i18 == -3402) {
            androidx.appcompat.app.AppCompatActivity activity = nVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ms.i iVar = (ms.i) pf5.z.f353948a.a(activity).a(ms.i.class);
            iVar.getClass();
            kotlin.jvm.internal.o.g(reportSessionId, "reportSessionId");
            androidx.appcompat.app.AppCompatActivity activity2 = iVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            iVar.f330924d = ((ms.j) pf5.z.f353948a.a(activity2).a(ms.j.class)).T6();
            new r45.gh3().b().l().K(new ms.h(iVar, reportSessionId));
        }
        ms.n.O6(nVar, reportSessionId, (java.lang.String) this.f330929g.f310123d, nVar.f330937e);
    }
}
