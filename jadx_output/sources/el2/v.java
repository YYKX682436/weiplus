package el2;

/* loaded from: classes3.dex */
public final class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f253927e;

    public v(el2.i0 i0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f253926d = i0Var;
        this.f253927e = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().q(vb1.e.CTRL_INDEX, this.f253926d);
        gm0.j1.d().d(this.f253927e);
    }
}
