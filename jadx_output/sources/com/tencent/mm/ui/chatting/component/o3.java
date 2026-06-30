package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u3 f199619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.ui.chatting.component.u3 u3Var) {
        super(3);
        this.f199619d = u3Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String string;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View playView = (android.view.View) obj3;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(playView, "playView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAutoPlay: liveId=");
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(finderObject.getId()));
        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", sb6.toString());
        i95.m c17 = i95.n0.c(zy2.pa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long id6 = finderObject.getId();
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        long j17 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
        java.lang.String username = finderObject.getUsername();
        java.lang.String nickname = finderObject.getNickname();
        java.lang.String str = "";
        java.lang.String str2 = nickname == null ? "" : nickname;
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f327812e;
        com.tencent.mm.ui.chatting.component.u3 u3Var = this.f199619d;
        org.json.JSONObject jSONObject = u3Var.f200053m;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("auto_time", intValue);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        zy2.pa.Gc(paVar, id6, j17, username, str2, 15L, "temp_7", 0, r26.i0.t(jSONObject2, ",", ";", false), null, 256, null);
        java.lang.Object parent = playView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            view.setTag(com.tencent.mm.R.id.rus, bool);
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.rut);
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            int intValue2 = (num != null ? num.intValue() : 0) + intValue;
            if (kotlin.jvm.internal.o.b(view.getTag(com.tencent.mm.R.id.rur), bool)) {
                view.setTag(com.tencent.mm.R.id.rut, 0);
                r45.jn0 jn0Var = new r45.jn0();
                jn0Var.set(0, java.lang.Long.valueOf(finderObject.getId()));
                jn0Var.set(1, finderObject.getUsername());
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("feedActionType", 37);
                jSONObject3.put("strValue", u3Var.f200054n);
                jSONObject3.put("AutoPlayDuration", intValue2);
                jn0Var.set(3, jSONObject3.toString());
                org.json.JSONObject jSONObject4 = u3Var.f200053m;
                if (jSONObject4 != null && (string = jSONObject4.getString("reportcontent")) != null) {
                    str = string;
                }
                jn0Var.set(10, str);
                ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
            } else {
                view.setTag(com.tencent.mm.R.id.rut, java.lang.Integer.valueOf(intValue2));
            }
        }
        return jz5.f0.f302826a;
    }
}
