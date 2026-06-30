package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes5.dex */
public final class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vlog.model.c f175571d = new com.tencent.mm.plugin.vlog.model.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.vlog.model.a aVar = (com.tencent.mm.plugin.vlog.model.a) obj;
        com.tencent.mm.plugin.vlog.model.a aVar2 = (com.tencent.mm.plugin.vlog.model.a) obj2;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        kotlin.jvm.internal.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ABAResult");
        int i17 = aVar.f175540d;
        int i18 = aVar2.f175540d;
        if (i18 < i17) {
            return -1;
        }
        return i17 < i18 ? 1 : 0;
    }
}
