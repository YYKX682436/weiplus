package e04;

/* loaded from: classes15.dex */
public class b0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f245869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f245870e;

    public b0(e04.p pVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f245870e = pVar;
        this.f245869d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f245869d);
        rz3.e eVar = this.f245870e.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
