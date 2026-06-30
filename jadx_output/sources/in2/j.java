package in2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f292848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(in2.s sVar, boolean z17, android.view.View view) {
        super(0);
        this.f292847d = sVar;
        this.f292848e = z17;
        this.f292849f = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in2.s sVar = this.f292847d;
        androidx.lifecycle.j0 j0Var = ((mm2.m6) sVar.H.a(mm2.m6.class)).f329245m;
        boolean z17 = !this.f292848e;
        j0Var.postValue(java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.P;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(z17);
        }
        sVar.I.q7(z17);
        android.view.View view = this.f292849f;
        db5.t7.g(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.ef9));
        return jz5.f0.f302826a;
    }
}
