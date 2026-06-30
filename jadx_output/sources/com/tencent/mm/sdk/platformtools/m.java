package com.tencent.mm.sdk.platformtools;

/* loaded from: classes4.dex */
public abstract class m {
    public static void a(android.widget.ListView listView) {
        if (listView == null) {
            return;
        }
        if (listView.getFirstVisiblePosition() > 10) {
            listView.setSelection(10);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(listView, "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
