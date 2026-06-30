package r35;

/* loaded from: classes8.dex */
public class i4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.j4 f369140d;

    public i4(r35.j4 j4Var) {
        this.f369140d = j4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        r35.j4 j4Var = this.f369140d;
        e17.d((com.tencent.mm.modelbase.m1) j4Var.f369149d.f369172f);
        j4Var.f369149d.f369173g = null;
    }
}
