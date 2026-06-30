package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f204825a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f204826b = new java.util.HashMap();

    public final void a(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.HashMap hashMap = this.f204825a;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f204826b;
        hashMap2.clear();
        int i17 = 0;
        for (java.lang.Object obj : items) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k kVar = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.k) obj;
            java.lang.String v17 = kVar.v();
            hashMap.put(v17, java.lang.Integer.valueOf(i17));
            hashMap2.put(v17, kVar.f204817d);
            i17 = i18;
        }
    }
}
