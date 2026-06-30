package hr3;

/* loaded from: classes9.dex */
public class l6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f283745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283746e;

    public l6(hr3.t6 t6Var, qk.o oVar) {
        this.f283746e = t6Var;
        this.f283745d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f283745d;
        oVar.field_hadAlert = 1;
        this.f283746e.d(oVar, false);
    }
}
