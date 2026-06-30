package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public class p0 extends com.tencent.mm.pluginsdk.ui.otherway.o0 {
    @Override // com.tencent.mm.pluginsdk.ui.otherway.o0, in5.r
    public int e() {
        return com.tencent.mm.R.layout.e5e;
    }

    @Override // com.tencent.mm.pluginsdk.ui.otherway.o0, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.tencent.mm.pluginsdk.ui.otherway.w data, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        super.h(holder, data, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.tab);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.d0v);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = data.f191024q;
        if (z18 && data.f191025r) {
            p17.setBackgroundResource(com.tencent.mm.R.drawable.cxh);
            return;
        }
        if (z18) {
            p17.setBackgroundResource(com.tencent.mm.R.drawable.cxk);
            return;
        }
        if (!data.f191025r) {
            p17.setBackgroundColor(holder.f293121e.getResources().getColor(com.tencent.mm.R.color.f478491c));
            return;
        }
        p17.setBackgroundResource(com.tencent.mm.R.drawable.cxi);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/pluginsdk/ui/otherway/OpenWayLineItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayOpenWayInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
