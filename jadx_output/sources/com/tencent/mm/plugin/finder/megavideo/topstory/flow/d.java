package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class d extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f120915a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f120916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List respList) {
        super(0, 0, null, 7, null);
        kotlin.jvm.internal.o.g(respList, "respList");
        this.f120915a = respList;
    }

    public java.lang.String toString() {
        java.util.List<com.tencent.mm.plugin.finder.megavideo.topstory.flow.c> list = this.f120915a;
        if (list.isEmpty()) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar : list) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(cVar);
            sb7.append('\n');
            sb6.append(sb7.toString());
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.d(sb8);
        return sb8;
    }
}
