package hq5;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.a0 f283284d;

    public z(hq5.a0 a0Var) {
        this.f283284d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cq5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.a0 a0Var = this.f283284d;
        com.tencent.mars.xlog.Log.i(a0Var.f283214d, "click preview area, state: " + a0Var.f283217g);
        if (a0Var.f283217g == 10) {
            boolean T6 = hq5.a0.T6(a0Var);
            jq5.o oVar = jq5.o.f301283a;
            if (T6) {
                oVar.b(a0Var.getActivity());
            } else {
                oVar.c(a0Var.getActivity());
            }
        }
        int i17 = a0Var.f283217g;
        if (i17 != 15) {
            switch (i17) {
                case 7:
                    break;
                case 8:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f221494i;
                        break;
                    } else {
                        aVar = cq5.a.f221495m;
                        break;
                    }
                case 9:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f221492g;
                        break;
                    } else {
                        aVar = cq5.a.f221493h;
                        break;
                    }
                case 10:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f221496n;
                        break;
                    } else {
                        aVar = cq5.a.f221497o;
                        break;
                    }
                default:
                    yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
            }
            cq5.i.f221543a.d(aVar);
            yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        aVar = hq5.a0.T6(a0Var) ? cq5.a.f221491f : cq5.a.f221490e;
        cq5.i.f221543a.d(aVar);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
