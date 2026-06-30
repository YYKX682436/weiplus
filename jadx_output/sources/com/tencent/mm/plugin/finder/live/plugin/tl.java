package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.lj f114421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114424g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(com.tencent.mm.plugin.finder.live.plugin.lj ljVar, com.tencent.mm.plugin.finder.live.plugin.hm hmVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f114421d = ljVar;
        this.f114422e = hmVar;
        this.f114423f = str;
        this.f114424g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114422e;
        com.tencent.mm.plugin.finder.live.plugin.lj ljVar = this.f114421d;
        if (ljVar != null) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(ljVar.f113401a, ((mm2.c1) hmVar.P0(mm2.c1.class)).f328852o)) {
                ya2.b2 B1 = hmVar.B1();
                java.lang.String w07 = B1 != null ? B1.w0() : null;
                ya2.b2 B12 = hmVar.B1();
                com.tencent.mm.plugin.finder.live.plugin.hm.w1(hmVar, new com.tencent.mm.plugin.finder.live.plugin.lj("", w07, B12 != null ? B12.getAvatarUrl() : null));
            } else {
                com.tencent.mm.plugin.finder.live.plugin.hm.w1(hmVar, ljVar);
            }
        }
        hmVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshSingSongName: songName = ");
        java.lang.String str = this.f114423f;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = hmVar.f112831r;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        hmVar.R = str;
        java.lang.String str3 = this.f114424g;
        hmVar.S = str3;
        com.tencent.mars.xlog.Log.i(str2, "showGiftListContent: " + str3);
        hmVar.K0(0);
        hmVar.f112837x.setVisibility(8);
        android.view.View view = hmVar.f112843z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$showGiftListContent$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hmVar.f112836w.f();
        com.tencent.mm.plugin.finder.live.plugin.hm.v1(hmVar);
        p52.h.f352030o = true;
        return jz5.f0.f302826a;
    }
}
