package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static int f206959a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f206960b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.List f206961c;

    public static void a(java.util.List list) {
        java.util.List list2;
        if (f206960b != null && (list2 = f206961c) != null && list2.size() > 0 && list != null && list.size() > 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!((java.util.LinkedList) f206960b).contains(str)) {
                    if (f206961c.contains(str)) {
                        linkedList.add(str);
                    } else {
                        linkedList2.add(str);
                    }
                }
            }
            for (int i17 = 0; i17 < f206961c.size(); i17++) {
                if (linkedList.contains(f206961c.get(i17))) {
                    linkedList3.add("" + i17);
                }
            }
            if (linkedList.size() > 0 || linkedList2.size() > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18637, java.lang.Integer.valueOf(f206959a), android.text.TextUtils.join(";", f206960b), android.text.TextUtils.join(";", f206961c), android.text.TextUtils.join(";", linkedList), android.text.TextUtils.join(";", linkedList2), android.text.TextUtils.join(";", linkedList3));
            }
        }
        f206960b = null;
        f206961c = null;
    }
}
