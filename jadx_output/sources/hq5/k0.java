package hq5;

/* loaded from: classes5.dex */
public final class k0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283239d;

    /* renamed from: e, reason: collision with root package name */
    public int f283240e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f283241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283239d = "MicroMsg.WeDrop.WeDropProgressUIC";
        this.f283241f = jz5.h.b(new hq5.b0(this));
    }

    public final void T6() {
        java.lang.String string;
        java.lang.String string2;
        if (kz5.c0.i(13, 14, 16, 9, 10, 3, 4, 11, 12, 17).contains(java.lang.Integer.valueOf(this.f283240e))) {
            getActivity().finish();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        int i17 = this.f283240e;
        if (i17 == 7) {
            string = getContext().getString(com.tencent.mm.R.string.nsi);
            kotlin.jvm.internal.o.d(string);
        } else if (i17 != 8) {
            string = getContext().getString(com.tencent.mm.R.string.nrn);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = getContext().getString(com.tencent.mm.R.string.nrs);
            kotlin.jvm.internal.o.d(string);
        }
        u1Var.u(string);
        u1Var.n(getContext().getString(com.tencent.mm.R.string.nys));
        int i18 = this.f283240e;
        if (i18 != 5 && i18 != 6) {
            if (i18 == 7) {
                string2 = getContext().getString(com.tencent.mm.R.string.nsh);
                kotlin.jvm.internal.o.d(string2);
            } else if (i18 == 8) {
                string2 = getContext().getString(com.tencent.mm.R.string.nrr);
                kotlin.jvm.internal.o.d(string2);
            } else if (i18 != 15) {
                string2 = getContext().getString(com.tencent.mm.R.string.nr9);
                kotlin.jvm.internal.o.d(string2);
            }
            u1Var.j(string2);
            u1Var.k(getContext().getColor(com.tencent.mm.R.color.Red_100));
            u1Var.b(new hq5.c0(this));
            u1Var.q(false);
        }
        string2 = getContext().getString(com.tencent.mm.R.string.nrq);
        kotlin.jvm.internal.o.d(string2);
        u1Var.j(string2);
        u1Var.k(getContext().getColor(com.tencent.mm.R.color.Red_100));
        u1Var.b(new hq5.c0(this));
        u1Var.q(false);
    }

    public final em.i4 U6() {
        return (em.i4) ((jz5.n) this.f283241f).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.d0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        android.widget.TextView c17;
        super.onCreateAfter(bundle);
        em.i4 U6 = U6();
        if (U6 == null || (c17 = U6.c()) == null) {
            return;
        }
        c17.setOnClickListener(new hq5.e0(this));
    }
}
