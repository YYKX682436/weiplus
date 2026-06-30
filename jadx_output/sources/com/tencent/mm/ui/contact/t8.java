package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public abstract class t8 {
    public static final boolean a(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.ui.contact.v8) it.next()).f207221e == 0) {
                return true;
            }
        }
        return false;
    }
}
