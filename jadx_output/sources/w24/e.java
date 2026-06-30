package w24;

/* loaded from: classes.dex */
public final class e extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.clj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        w24.d item = (w24.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        item.f442615f = itemView;
        com.tencent.mars.xlog.Log.i("MicroMsg.GroupListControl", item + " onBindView");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.gu_);
        linearLayout.removeAllViews();
        java.util.List list2 = item.f442616g;
        if (!(list2 instanceof java.util.Collection) || !((java.util.ArrayList) list2).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            while (it.hasNext()) {
                if (!((w24.l) it.next()).f442630d) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        if (z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(itemView, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            itemView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (kotlin.jvm.internal.o.b(itemView.getLayoutParams(), item.f442619m)) {
                return;
            }
            item.f442619m = new android.view.ViewGroup.LayoutParams(0, 0);
            item.f442618i = itemView.getLayoutParams();
            itemView.setLayoutParams(item.f442619m);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = item.f442618i;
        if (layoutParams != null) {
            itemView.setLayoutParams(layoutParams);
            item.f442618i = null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        itemView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/setting/ui/widget/GroupItem", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        int i19 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            w24.l lVar = (w24.l) next;
            if (!lVar.f442630d) {
                if (i19 != 0) {
                    android.content.Context context = itemView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cli, (android.view.ViewGroup) null, false);
                    kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                    linearLayout.addView(inflate);
                }
                android.content.Context context2 = itemView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                android.view.View a17 = lVar.a(context2);
                android.view.ViewParent parent = a17.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a17);
                }
                android.content.Context context3 = itemView.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                linearLayout.addView(lVar.a(context3));
            }
            i19 = i27;
        }
    }
}
