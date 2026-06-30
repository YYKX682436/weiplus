package cw1;

/* loaded from: classes12.dex */
public final class z3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f223534d;

    public z3(cw1.q4 q4Var) {
        this.f223534d = q4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailNewAdapter.ItemViewHolder");
        cw1.q4.x(this.f223534d, (cw1.b4) tag);
        yj0.a.i(true, this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
