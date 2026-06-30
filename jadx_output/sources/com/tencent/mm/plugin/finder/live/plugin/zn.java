package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zn implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.zn f115363d = new com.tencent.mm.plugin.finder.live.plugin.zn();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
        boolean z17 = false;
        boolean z18 = ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114445l.isEmpty() || ((num2 = (java.lang.Integer) ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114445l.getLast()) != null && num2.intValue() == 1);
        if (((com.tencent.mm.plugin.finder.live.plugin.tn) entry2.getValue()).f114445l.isEmpty() || ((num = (java.lang.Integer) ((com.tencent.mm.plugin.finder.live.plugin.tn) entry2.getValue()).f114445l.getLast()) != null && num.intValue() == 1)) {
            z17 = true;
        }
        return z18 == z17 ? (int) (((com.tencent.mm.plugin.finder.live.plugin.tn) entry2.getValue()).f114451r - ((com.tencent.mm.plugin.finder.live.plugin.tn) entry.getValue()).f114451r) : z18 ? 1 : -1;
    }
}
