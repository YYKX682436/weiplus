package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/NextLiveCardView;", "Lcom/tencent/mm/plugin/finder/live/view/EasySimpleLivingCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NextLiveCardView extends com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextLiveCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void b(com.tencent.mm.plugin.finder.storage.FinderItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "report nextLive clicked");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f410659n.getLong(0)));
        jSONObject.put("exposeType", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f328207n;
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=7, extra=".concat(jSONObject2));
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long refObjectId = item.getRefObjectId();
        r45.nw1 liveInfo = item.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : -1L;
        java.lang.String userName = item.getUserName();
        long integer = item.getLiveInfo() != null ? r4.getInteger(1) : -1L;
        ml2.q1 q1Var = ml2.q1.f327812e;
        j0Var.pj(refObjectId, j17, null, userName, -1L, integer, x1Var, "temp_30", jSONObject2, 1, item.getFeedObject());
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void c(com.tencent.mm.plugin.finder.storage.FinderItem item, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "report nextLive exposed");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f410659n.getLong(0)));
        jSONObject.put("exposeType", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f328202f;
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=2, extra=".concat(jSONObject2));
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String userName = item.getUserName();
        java.lang.String valueOf = java.lang.String.valueOf(item.getRefObjectId());
        long refObjectId = item.getRefObjectId();
        r45.nw1 liveInfo = item.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        ml2.q1 q1Var = ml2.q1.f327812e;
        r45.nw1 liveInfo2 = item.getLiveInfo();
        int integer = liveInfo2 != null ? liveInfo2.getInteger(1) : -1;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = item.getFeedObject();
        if (feedObject == null || (str = feedObject.getNickname()) == null) {
            str = "";
        }
        ((b92.d1) zbVar).wi(new ml2.f0(null, userName, i17, valueOf, refObjectId, j17, x1Var, "temp_30", integer, str, ml2.e0.f327371f, false, false, 0, null, null, jSONObject2, null, 1L, null, 0, 0L, 0, null, null, null, 66777088, null));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView
    public void d(com.tencent.mm.plugin.finder.storage.FinderItem item, java.lang.String contextId) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String u17 = pm0.v.u(((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e.f410659n.getLong(0));
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.q1 q1Var = ml2.q1.f327812e;
        jSONObject.put("enter_immerse_type", "temp_30");
        jSONObject.put("liveid", u17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        intent.putExtra("key_chnl_extra", r26.i0.t(jSONObject2, ",", ";", false));
        intent.putExtra("KEY_FEED_END_PAGE_EXPOSE_TYPE", 1);
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(item.getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, contextId);
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, item.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context2, intent, arrayList, 0, wk0Var, null);
    }
}
