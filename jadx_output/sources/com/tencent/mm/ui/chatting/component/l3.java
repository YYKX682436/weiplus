package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f199393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f199394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f199395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u3 f199396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.ui.chatting.component.u3 u3Var) {
        super(0);
        this.f199393d = g0Var;
        this.f199394e = h0Var;
        this.f199395f = h0Var2;
        this.f199396g = u3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String jSONObject;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrameRendStart: liveId=");
        kotlin.jvm.internal.g0 g0Var = this.f199393d;
        sb6.append(g0Var.f310121d);
        sb6.append(", feedId=");
        kotlin.jvm.internal.h0 h0Var = this.f199394e;
        sb6.append(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) h0Var.f310123d).getId()));
        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", sb6.toString());
        ((android.view.View) this.f199395f.f310123d).setTag(com.tencent.mm.R.id.rus, java.lang.Boolean.TRUE);
        i95.m c17 = i95.n0.c(zy2.pa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.pa paVar = (zy2.pa) c17;
        long id6 = ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var.f310123d).getId();
        long j17 = g0Var.f310121d;
        java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var.f310123d).getUsername();
        java.lang.String nickname = ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var.f310123d).getNickname();
        java.lang.String str = nickname == null ? "" : nickname;
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f327812e;
        org.json.JSONObject jSONObject2 = this.f199396g.f200053m;
        zy2.pa.Gc(paVar, id6, j17, username, str, 14L, "temp_7", 0, (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false), null, 256, null);
        return jz5.f0.f302826a;
    }
}
