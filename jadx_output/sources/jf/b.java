package jf;

/* loaded from: classes7.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f299324d;

    public b(boolean[] zArr) {
        this.f299324d = zArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean[] zArr = this.f299324d;
        boolean z17 = zArr[0];
        f06.v[] vVarArr = gf.m0.f271125b;
        f06.v vVar = vVarArr[1];
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        nf.r rVar = gf.m0.f271127d;
        gf.m0 m0Var = gf.m0.f271124a;
        rVar.c(m0Var, vVar, valueOf);
        boolean z18 = zArr[1];
        gf.m0.f271128e.c(m0Var, vVarArr[2], java.lang.Boolean.valueOf(z18));
    }
}
