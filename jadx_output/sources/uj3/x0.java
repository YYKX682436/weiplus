package uj3;

/* loaded from: classes14.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.y0 f428382d;

    public x0(uj3.y0 y0Var) {
        this.f428382d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uj3.y0 y0Var = this.f428382d;
        if (y0Var.f428391h == y0Var.f428392i - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markClickIconFlipPage");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 13L, 1L);
        y0Var.f428391h++;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y0Var.f428391h + 1);
        sb6.append('/');
        sb6.append(y0Var.f428392i);
        y0Var.e(sb6.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("thumb_flip_target_position", y0Var.f428391h);
        y0Var.f428384a.f(uj3.a.f428200n, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectThumbIndexUI$applyTouchEvent$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
