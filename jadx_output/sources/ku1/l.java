package ku1;

/* loaded from: classes15.dex */
public abstract class l implements ku1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ku1.i f312130a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f312131b;

    public l(ku1.i iVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f312130a = iVar;
        this.f312131b = mMActivity;
    }

    @Override // ku1.l0
    public void a(android.view.ViewGroup viewGroup, tt1.j jVar) {
        if (f()) {
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0u);
            ku1.i iVar = this.f312130a;
            java.lang.String str = iVar.f312100i;
            if (jVar.N() || (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.length() <= 40)) {
                textView.setText(lu1.g0.a(4, str, true));
                if (jVar.m()) {
                    textView.setVisibility(0);
                    textView.setOnLongClickListener(new ku1.j(this, jVar));
                    iVar.l(lu1.e.CARDCODEREFRESHACTION_ENTERCHANGE);
                } else {
                    textView.setVisibility(8);
                }
            } else {
                textView.setVisibility(8);
            }
        }
        if (g()) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.c0h);
            if (jVar == null || jVar.s0() == null || jVar.s0().Z == null || com.tencent.mm.sdk.platformtools.t8.K0(jVar.s0().Z.f388878d)) {
                linearLayout.setVisibility(8);
                return;
            }
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c09);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController", "updateJumpLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController", "updateJumpLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            r45.w50 w50Var = jVar.s0().Z;
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0j);
            textView2.setText(w50Var.f388878d);
            java.lang.String str2 = jVar.s0().f388555p;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView2.setTextColor(lu1.a0.d(str2));
            }
            android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0i);
            java.lang.String str3 = w50Var.f388880f;
            if (android.text.TextUtils.isEmpty(str3)) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else if (textView3 != null) {
                textView3.setText(str3);
                textView3.setVisibility(0);
            }
            linearLayout.setOnClickListener(new ku1.k(this, jVar));
        }
    }

    @Override // ku1.l0
    public void c(android.view.ViewGroup viewGroup, tt1.j jVar) {
    }

    @Override // ku1.l0
    public boolean d(tt1.j jVar) {
        return true;
    }

    public abstract boolean f();

    public abstract boolean g();
}
