package hr3;

/* loaded from: classes9.dex */
public class j6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f283671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283672e;

    public j6(hr3.t6 t6Var, qk.o oVar) {
        this.f283672e = t6Var;
        this.f283671d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f283671d;
        oVar.field_hadAlert = 1;
        oVar.field_brandFlag |= 4;
        this.f283672e.d(oVar, true);
    }
}
