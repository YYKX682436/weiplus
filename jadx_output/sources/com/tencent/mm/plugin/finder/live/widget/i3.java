package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f118629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f118630e;

    public i3(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f118629d = finderObject;
        this.f118630e = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.gw0 gw0Var;
        r45.gw0 gw0Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNewLiveV1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f118629d;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        if (pm0.v.z(liveInfo != null ? liveInfo.getInteger(37) : 0, 64)) {
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            if (liveInfo2 == null || (gw0Var2 = (r45.gw0) liveInfo2.getCustom(40)) == null || (str = gw0Var2.getString(1)) == null) {
                str = "";
            }
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            if (liveInfo3 == null || (gw0Var = (r45.gw0) liveInfo3.getCustom(40)) == null || (str2 = gw0Var.getString(0)) == null) {
                str2 = "";
            }
            intent.putExtra("key_enter_live_param_bind_type", 4);
            intent.putExtra("key_enter_live_param_by_biz_username", str);
            intent.putExtra("key_enter_live_param_by_biz_nickname", str2);
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        ((m30.m) rVar).Bi(b52.b.b());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(finderObject);
        r45.wk0 wk0Var = new r45.wk0();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        wk0Var.set(0, b52.b.b());
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, 0);
        y74Var.set(5, finderObject);
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = this.f118630e.f117820a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, arrayList2, 0, wk0Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNewLiveV1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
