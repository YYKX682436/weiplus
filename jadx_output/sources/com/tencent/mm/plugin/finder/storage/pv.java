package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pv f127392d = new com.tencent.mm.plugin.finder.storage.pv();

    public pv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "60s以上的长视频 支持快进快退 N", null, null, 12, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < 11; i17++) {
            arrayList.add(java.lang.Integer.valueOf((i17 * 1000) + 3000));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < 11; i18++) {
            arrayList2.add(java.lang.String.valueOf((i18 * 1000) + 3000));
        }
        aVar.a("FINDER_SUPPORT_FAST_FORWARD_REWIND_N", arrayList, arrayList2);
        return aVar;
    }
}
