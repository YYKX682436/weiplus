package lj2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(lj2.c0 c0Var) {
        super(0);
        this.f318817d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.u4 K;
        lj2.c0 c0Var = this.f318817d;
        lj2.t0 a07 = c0Var.f318831b.a0();
        if (a07 != null && (K = a07.K()) != null) {
            c0Var.b().a(0);
            c0Var.c().b(8);
            if (K.f234158e == 5) {
                lj2.s b17 = c0Var.b();
                b17.f318941e.setVisibility(0);
                b17.f318942f.setVisibility(8);
                b17.f318939c.setVisibility(4);
                b17.f318938b.setVisibility(4);
            } else {
                lj2.s b18 = c0Var.b();
                b18.f318941e.setVisibility(8);
                b18.f318942f.setVisibility(0);
                b18.f318939c.setVisibility(0);
                b18.f318938b.setVisibility(0);
            }
            lj2.s b19 = c0Var.b();
            int i17 = K.f234160g;
            int i18 = K.f234161h;
            int i19 = K.f234166m;
            b19.f318945i = i17;
            b19.f318946j = i19;
            android.widget.TextView textView = b19.f318943g;
            android.view.View view = b19.f318937a;
            if (i17 == 2 && i19 == 0) {
                java.lang.String string = view.getContext().getResources().getString(com.tencent.mm.R.string.dzo);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                textView.setText(string);
            } else {
                java.lang.String string2 = view.getContext().getResources().getString(com.tencent.mm.R.string.d6r);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView.setText(string2);
            }
            android.widget.TextView textView2 = b19.f318940d;
            android.widget.TextView textView3 = b19.f318938b;
            if (i18 == 1) {
                b19.b();
                textView3.setText(view.getContext().getString(com.tencent.mm.R.string.f491479d72));
                textView2.setText(view.getContext().getString(com.tencent.mm.R.string.lje));
            } else {
                b19.b();
                textView3.setText(view.getContext().getString(com.tencent.mm.R.string.f491479d72));
                textView2.setText(view.getContext().getString(com.tencent.mm.R.string.ljg));
            }
            android.view.View view2 = b19.f318944h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "onBindBattleMode", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "onBindBattleMode", "(III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(0);
        }
        c0Var.b().f318937a.animate().translationX(0.0f).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(null).start();
        return jz5.f0.f302826a;
    }
}
