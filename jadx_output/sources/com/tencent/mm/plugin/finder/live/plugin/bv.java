package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f112074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f112077g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, int i17, int i18, r45.x71 x71Var) {
        super(0);
        this.f112074d = ivVar;
        this.f112075e = i17;
        this.f112076f = i18;
        this.f112077g = x71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f112074d;
        if (ivVar.w0() == 0) {
            if (this.f112075e == 0 && this.f112076f == 0) {
                ivVar.B1(this.f112077g, false);
            } else {
                ivVar.I.setVisibility(0);
                ivVar.P.setVisibility(8);
                ivVar.Y.setVisibility(8);
                ivVar.M.setVisibility(8);
                android.view.View view = ivVar.L;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveKTVMemberListPlugin", "onGetLiveOnlineMemberFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mars.xlog.Log.i(ivVar.f113016r, "onGetLiveOnlineByRoomFail");
            }
        }
        return jz5.f0.f302826a;
    }
}
