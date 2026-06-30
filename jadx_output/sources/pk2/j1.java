package pk2;

/* loaded from: classes3.dex */
public final class j1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355859h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355860i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355859h = helper.I;
        this.f355860i = "anchorlive.more.extendtrylivetime";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        com.tencent.mm.plugin.finder.live.widget.e9 e9Var;
        int i17;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e9 e9Var2 = d9Var.f355665h;
            if (e9Var2 == null) {
                e9Var2 = new com.tencent.mm.plugin.finder.live.widget.e9(o9Var.f356078d, o9Var.f356074b);
            }
            d9Var.f355665h = e9Var2;
        }
        if (d9Var != null && (e9Var = d9Var.f355665h) != null) {
            android.content.Context context = e9Var.f118237a;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 2);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "";
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.d9a);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            gk2.e eVar = e9Var.f118238b;
            r45.td2 td2Var = ((mm2.g0) eVar.a(mm2.g0.class)).f329066m;
            if ((td2Var != null ? td2Var.getInteger(3) : 0) > 0) {
                string = context.getResources().getString(com.tencent.mm.R.string.d9c);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.d_7);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                h0Var.f310123d = string2;
                i17 = 2;
            } else {
                java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.d_6);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                h0Var.f310123d = string3;
                i17 = 1;
            }
            z2Var.q(string);
            z2Var.m(context.getResources().getString(com.tencent.mm.R.string.f490347sg), context.getResources().getString(com.tencent.mm.R.string.f490507x1));
            z2Var.v(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            com.tencent.mm.plugin.finder.live.widget.x8 x8Var = new com.tencent.mm.plugin.finder.live.widget.x8(z2Var);
            com.tencent.mm.plugin.finder.live.widget.a9 a9Var = new com.tencent.mm.plugin.finder.live.widget.a9(e9Var, z2Var);
            z2Var.D = x8Var;
            z2Var.E = a9Var;
            mm2.g0 g0Var = (mm2.g0) eVar.a(mm2.g0.class);
            r45.td2 td2Var2 = g0Var.f329066m;
            int N6 = g0Var.N6((td2Var2 != null ? td2Var2.getInteger(3) : 0) > 0 ? 2 : 1);
            z2Var.i(com.tencent.mm.R.layout.f488874ap5);
            android.view.View view = z2Var.f212058g;
            view.findViewById(com.tencent.mm.R.id.i7l).setBackgroundResource(com.tencent.mm.R.drawable.a4l);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i7k);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.i7n);
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.c9(e9Var, N6, h0Var, textView2, view, i17));
            if (i17 == 2) {
                textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.d9d));
                ne2.c cVar = ne2.c.f336527a;
                android.content.Context context2 = view.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                textView2.setText(cVar.a(context2, N6, 2));
            } else {
                textView.setText(view.getContext().getResources().getString(com.tencent.mm.R.string.d9b));
                ne2.c cVar2 = ne2.c.f336527a;
                android.content.Context context3 = view.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                textView2.setText(cVar2.a(context3, N6, 1));
            }
            z2Var.C();
            e9Var.a().set(0, java.lang.Integer.valueOf(i17));
        }
        pk2.f8.a(pk2.f8.f355747a, 2, 2, null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355860i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        return mm2.g0.Q6((mm2.g0) o9Var.c(mm2.g0.class), null, 1, null) && !((mm2.e1) o9Var.c(mm2.e1.class)).b7();
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        r(menu, this.f355859h, com.tencent.mm.R.string.d9a, com.tencent.mm.R.raw.icons_outlined_time);
        pk2.f8.a(pk2.f8.f355747a, 2, 1, null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f355859h;
    }
}
