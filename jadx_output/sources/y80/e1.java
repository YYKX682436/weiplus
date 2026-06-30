package y80;

@j95.b
/* loaded from: classes3.dex */
public final class e1 extends i95.w implements z80.m0 {
    public void wi(android.content.Context context, z80.q0 actionInfo) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(actionInfo, "actionInfo");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bso, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(inflate, "poi_info_from_qqmap_guide");
        aVar.gk(inflate, null);
        aVar.ik(inflate, 0 | 32, 27051);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.c9x);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.bys);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.h5n);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        findViewById2.setOnClickListener(new y80.c1(y1Var));
        textView.setOnClickListener(new y80.d1(y1Var, this, context, actionInfo));
        float q17 = i65.a.q(context);
        if (!(q17 == 1.0f) && (layoutParams = findViewById3.getLayoutParams()) != null) {
            int dimension = (int) (context.getResources().getDimension(com.tencent.mm.R.dimen.f479723df) * q17);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            findViewById3.setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        y1Var.k(inflate);
        y1Var.s();
    }
}
