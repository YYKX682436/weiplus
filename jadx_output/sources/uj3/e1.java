package uj3;

/* loaded from: classes14.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.f1 f428260d;

    public e1(uj3.f1 f1Var) {
        this.f428260d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.res.Resources resources;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.f1 f1Var = this.f428260d;
        java.lang.Integer num = null;
        if (f1Var.f428264b.getCurrentStatus()) {
            android.content.Context context = f1Var.f428263a;
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            android.content.res.Resources resources2 = f1Var.f428263a.getResources();
            aVar.f211729s = resources2 != null ? resources2.getString(com.tencent.mm.R.string.ibt) : null;
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.ibs);
            aVar.E = new uj3.c1(f1Var);
            android.content.Context context2 = f1Var.f428263a;
            if (context2 != null && (resources = context2.getResources()) != null) {
                num = java.lang.Integer.valueOf(resources.getColor(com.tencent.mm.R.color.f478532ac));
            }
            kotlin.jvm.internal.o.d(num);
            aVar.W = num.intValue();
            aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
            aVar.F = uj3.d1.f428257d;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        } else {
            f1Var.getClass();
            android.view.View view2 = f1Var.f428266d;
            if (view2 != null) {
                view2.setBackground(com.tencent.mm.ui.uk.e(f1Var.f428263a, com.tencent.mm.R.drawable.aft, android.graphics.Color.parseColor("#FA5151")));
            }
            android.widget.TextView textView = f1Var.f428267e;
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.ibl);
            }
            uj3.b.a(f1Var.f428264b, uj3.a.f428193d, null, 2, null);
            f1Var.getClass();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectTopUI$applyClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
