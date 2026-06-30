package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class m0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.n0 f209085d;

    public m0(com.tencent.mm.ui.n0 n0Var, com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
        this.f209085d = n0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f209085d.f209395i.getContext());
        int[] iArr = new int[2];
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
        }
        rVar.h(view, new com.tencent.mm.ui.k0(this), new com.tencent.mm.ui.l0(this, view), iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
