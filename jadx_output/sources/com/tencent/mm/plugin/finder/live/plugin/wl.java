package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wl extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f114957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, java.lang.String str, androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        super(3);
        this.f114955d = hmVar;
        this.f114956e = str;
        this.f114957f = recyclerView;
        this.f114958g = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114955d;
        java.util.Set set = hmVar.F1;
        java.lang.String str = this.f114956e;
        set.remove(str);
        java.lang.String str2 = hmVar.f112831r;
        com.tencent.mars.xlog.Log.i(str2, "[doLoadMoreGiftByGroup] callback success:" + booleanValue + ", errCode:" + intValue + ", hasMore:" + booleanValue2 + ", tabName:" + str);
        java.util.Map map = hmVar.H1;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f114957f;
        if (booleanValue) {
            map.remove(str);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ul(hmVar, recyclerView, this.f114958g, str));
        } else {
            kotlin.jvm.internal.o.f(map, "access$getLoadMoreCooldownUntilMap$p(...)");
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = hmVar.J1;
            map.put(str, java.lang.Long.valueOf(uptimeMillis + j17));
            com.tencent.mars.xlog.Log.w(str2, "[doLoadMoreGiftByGroup] fail, enter cooldown for " + j17 + "ms, tabName:" + str);
            com.tencent.mm.plugin.finder.live.plugin.hm.Q1(this.f114955d, this.f114956e, false, intValue, 0, 0L, false, 32, null);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.vl(recyclerView));
        }
        return jz5.f0.f302826a;
    }
}
