package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lx implements android.view.View.OnClickListener {
    public lx(com.tencent.mm.plugin.sns.ui.kw kwVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.y5)) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = ((com.tencent.mm.plugin.sns.ui.y5) view.getTag()).f171609a;
            java.lang.ref.WeakReference weakReference = ((com.tencent.mm.plugin.sns.ui.y5) view.getTag()).f171610b;
            if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && a90Var.f369846q != null && weakReference != null && weakReference.get() != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                android.graphics.Rect rect = new android.graphics.Rect();
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                rect.set(i17, iArr[1], view2.getMeasuredWidth() + i17, iArr[1] + view2.getMeasuredHeight());
                m21.q.b(view.getContext(), timeLineObject.ContentObj.f369846q, rect);
            }
            java.lang.String str = ((com.tencent.mm.plugin.sns.ui.y5) view.getTag()).f171611c;
            java.lang.String str2 = timeLineObject.UserName;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.tencent.mm.plugin.sns.ui.kw.J(str2, str, -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
    }
}
