package e04;

/* loaded from: classes15.dex */
public class y implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f246154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f246155e;

    public y(e04.p pVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f246155e = pVar;
        this.f246154d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f246154d);
        rz3.e eVar = this.f246155e.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
