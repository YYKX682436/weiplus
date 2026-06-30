package id2;

/* loaded from: classes3.dex */
public final class b4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.j4 f290496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f290497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f290498f;

    public b4(id2.j4 j4Var, kotlinx.coroutines.q qVar, kotlin.jvm.internal.c0 c0Var) {
        this.f290496d = j4Var;
        this.f290497e = qVar;
        this.f290498f = c0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        id2.j4 j4Var = this.f290496d;
        j4Var.O6().f290903f = false;
        j4Var.f290635h = this.f290497e;
        this.f290498f.f310112d = true;
        id2.v3 v3Var = j4Var.O6().f290904g;
        if (v3Var != null) {
            v3Var.b();
        }
        id2.v3 v3Var2 = j4Var.O6().f290904g;
        if (v3Var2 != null) {
            v3Var2.d();
        }
    }
}
