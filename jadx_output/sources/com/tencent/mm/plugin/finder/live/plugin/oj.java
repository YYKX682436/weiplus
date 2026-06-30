package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f113759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(1);
        this.f113759d = arrayList;
        this.f113760e = hmVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        ce2.i it = (ce2.i) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = !this.f113759d.contains(it.field_rewardProductId);
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113760e;
        java.util.Iterator it6 = ((java.util.ArrayList) ((je2.t) hmVar.P0(je2.t.class)).P6()).iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (kotlin.jvm.internal.o.b(((r45.oq1) obj2).f382442e, it.field_rewardProductId)) {
                break;
            }
        }
        boolean z18 = obj2 != null;
        if (z17) {
            com.tencent.mars.xlog.Log.i(hmVar.f112831r, "getCacheGiftList remove:" + it.field_rewardProductId + ", notExistInTab");
        }
        return java.lang.Boolean.valueOf(z17 && !z18);
    }
}
