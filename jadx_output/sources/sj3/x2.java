package sj3;

/* loaded from: classes14.dex */
public final class x2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408804d;

    public x2(sj3.g3 g3Var) {
        this.f408804d = g3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        sj3.g3 g3Var;
        java.lang.Object obj2;
        java.util.List list = (java.util.List) obj;
        kotlin.jvm.internal.o.d(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            g3Var = this.f408804d;
            if (!hasNext) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.multitalk.ui.t) obj2).f150297b, g3Var.i().getCurrentUsername())) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.multitalk.ui.t tVar = (com.tencent.mm.plugin.multitalk.ui.t) obj2;
        if (tVar != null) {
            int i17 = tVar.f150303h;
            if (i17 == 102) {
                g3Var.i().e(true);
                return;
            }
            if (i17 != 104 && i17 != 100) {
                com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView i18 = g3Var.i();
                int i19 = i18.f150357e;
                if (i19 == 2 || i19 == 3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "dismissPauseOrStop");
                    i18.d();
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView i27 = g3Var.i();
            i27.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "showStop");
            android.view.View view = i27.f150360h;
            if (view != null) {
                i27.removeView(view);
                i27.f150360h = null;
            }
            android.widget.TextView textView = new android.widget.TextView(i27.getContext());
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView.setText(com.tencent.mm.R.string.h2t);
            textView.setTextSize(0, i65.a.b(textView.getContext(), 17));
            pm0.v.X(new sj3.n5(i27, textView));
        }
    }
}
