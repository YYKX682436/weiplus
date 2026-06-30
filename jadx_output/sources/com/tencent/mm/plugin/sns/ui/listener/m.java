package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169837d;

    public m(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169837d = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String str = (java.lang.String) view.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return true;
        }
        if (str.equals(com.tencent.mm.plugin.sns.model.l4.sj())) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return true;
        }
        java.lang.Object obj = ((com.tencent.mm.ui.tools.MaskImageButton) view).f210088i;
        java.lang.String str2 = (obj == null || !(obj instanceof java.lang.String)) ? "" : (java.lang.String) obj;
        new android.content.Intent();
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str2);
        if (k17 != null && k17.isAd()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
            return false;
        }
        int[] iArr = new int[2];
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
        }
        new rl5.r(com.tencent.mm.plugin.sns.ui.listener.i.e(this.f169837d)).h(view, new com.tencent.mm.plugin.sns.ui.listener.j(this, k17), new com.tencent.mm.plugin.sns.ui.listener.l(this, k17, str, str2), iArr[0], iArr[1]);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10");
        return false;
    }
}
