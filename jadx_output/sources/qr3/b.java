package qr3;

/* loaded from: classes3.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f366074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr3.o f366075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f366076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366077d;

    public b(kotlin.jvm.internal.c0 c0Var, qr3.o oVar, com.tencent.mm.ui.base.preference.Preference preference, boolean z17) {
        this.f366074a = c0Var;
        this.f366075b = oVar;
        this.f366076c = preference;
        this.f366077d = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f366074a.f310112d = true;
        qr3.o oVar = this.f366075b;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f366108i;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f366108i = null;
        }
        if (oVar.getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "activity.isFinishing");
        } else {
            com.tencent.mars.xlog.Log.i("NewBizInfoSettingJsApiUIC", "mode: cgi result: " + fVar.f70615a + ", " + fVar.f70616b);
            if (fVar.f70616b != 0 || fVar.f70615a != 0) {
                db5.t7.g(oVar.getContext(), oVar.getContext().getResources().getString(com.tencent.mm.R.string.bc_));
                ((com.tencent.mm.ui.base.preference.CheckBoxPreference) this.f366076c).S(!this.f366077d);
            }
        }
        return jz5.f0.f302826a;
    }
}
