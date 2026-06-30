package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class fl extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f203978b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f203979c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView f203980d;

    public fl(java.util.HashMap selectors) {
        kotlin.jvm.internal.o.g(selectors, "selectors");
        this.f203978b = new java.util.HashMap();
        java.util.Set<java.util.Map.Entry> entrySet = selectors.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.util.HashMap hashMap = this.f203978b;
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            hashMap.put(key, ((xe5.g0) ((xe5.i0) entry.getValue())).f454028b);
        }
    }

    public final xe5.h0 a(java.lang.String tmplId) {
        kotlin.jvm.internal.o.g(tmplId, "tmplId");
        java.util.HashMap hashMap = this.f203978b;
        xe5.h0 h0Var = (xe5.h0) hashMap.get(tmplId);
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (true ^ kotlin.jvm.internal.o.b(((java.util.Map.Entry) obj).getKey(), tmplId)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xe5.i) ((xe5.h0) ((java.util.Map.Entry) it.next()).getValue())).a(false);
        }
        if (h0Var != null) {
            ((xe5.i) h0Var).a(true);
        }
        return h0Var;
    }
}
