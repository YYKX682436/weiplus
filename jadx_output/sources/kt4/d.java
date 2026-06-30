package kt4;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.e f312030d;

    public d(kt4.e eVar) {
        this.f312030d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kt4.e eVar = this.f312030d;
        eVar.f312031c.f(eVar.f338833a, null);
        eVar.f338833a.finish();
    }
}
