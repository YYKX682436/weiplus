package hr3;

/* loaded from: classes4.dex */
public class o6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er3.e f283851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283852e;

    public o6(hr3.t6 t6Var, er3.e eVar) {
        this.f283852e = t6Var;
        this.f283851d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f283851d);
        c01.d9.e().q(td1.t.CTRL_INDEX, this.f283852e);
    }
}
