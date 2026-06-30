package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_pjvjmq0eK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_DX(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList<r45.d6> mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.d6.f372138g, bArr);
        vw.i iVar = (vw.i) ((com.tencent.wechat.iam.biz.l1) obj);
        yz5.l lVar = iVar.f440659b;
        vw.k kVar = iVar.f440658a;
        if (mmpbListUnSerializeFromBasic == null) {
            kVar.getClass();
            com.tencent.mars.xlog.Log.w("BizProfileDraftDataUtil", "getBizProfileDraftAppMsgIdTask msg null");
            lVar.invoke("");
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (r45.d6 d6Var : mmpbListUnSerializeFromBasic) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appMsgId", d6Var.f372139d);
            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, d6Var.f372140e);
            kVar.getClass();
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("appMsgIds", jSONArray);
        kVar.getClass();
        jSONObject2.toString();
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        lVar.invoke(jSONObject3);
    }

    private void ZIDL_FX(java.lang.Object obj, byte[][] bArr) {
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.e6.f373037f, bArr);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.tab.j(((com.tencent.mm.plugin.profile.ui.tab.k) ((com.tencent.wechat.iam.biz.k1) obj)).f154375a, mmpbListUnSerializeFromBasic));
    }

    private void ZIDL_GX(java.lang.Object obj, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.e6.f373037f, bArr);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.iam.biz.i1) obj).complete(z17);
    }

    private void ZIDL_IX(java.lang.Object obj, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.profile.ui.tab.l(((com.tencent.mm.plugin.profile.ui.tab.m) ((com.tencent.wechat.iam.biz.m1) obj)).f154450a, str));
    }

    private void ZIDL_JX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static native void ZIDL_pjvjmq0eD(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_B(long j17, int i17);

    public native void ZIDL_C(long j17, byte[][] bArr);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_E(long j17, int i17);

    public native void ZIDL_FV(long j17, java.lang.Object obj);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native void ZIDL_HV(long j17, java.lang.Object obj, int i17, int i18);

    public native void ZIDL_IV(long j17, java.lang.Object obj, int i17, int i18);

    public native void ZIDL_JV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_K(long j17);

    public native void ZIDL_L(long j17);

    public native void ZIDL_M(long j17, byte[][] bArr);

    public native void ZIDL_O(long j17, byte[][] bArr);

    public native void ZIDL_pjvjmq0eC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.Object obj3);
}
