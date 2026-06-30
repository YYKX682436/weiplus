package ms;

/* loaded from: classes4.dex */
public final class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms.n f330930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330932f;

    public l(ms.n nVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        this.f330930d = nVar;
        this.f330931e = str;
        this.f330932f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = (java.lang.String) this.f330932f.f310123d;
        ms.n nVar = this.f330930d;
        ms.n.O6(nVar, this.f330931e, str, nVar.f330938f);
    }
}
