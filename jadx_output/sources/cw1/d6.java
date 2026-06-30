package cw1;

/* loaded from: classes12.dex */
public final class d6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f222875d;

    public d6(cw1.l6 l6Var) {
        this.f222875d = l6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.l6 l6Var = this.f222875d;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = l6Var.f223122q;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        l6Var.f223112g.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = l6Var.f223113h;
        weImageView.setVisibility(0);
        weImageView.s(com.tencent.mm.R.raw.xmark_circle_filled, com.tencent.mm.R.color.f478520a84);
        android.content.Context context = l6Var.f223106a;
        l6Var.f223114i.setText(context.getString(com.tencent.mm.R.string.b8k));
        l6Var.f223115j.setText(context.getString(com.tencent.mm.R.string.f490917d74, fp.n0.a(l6Var.f223121p)));
        android.view.View view2 = l6Var.f223116k;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = l6Var.f223117l;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onCanceled", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
