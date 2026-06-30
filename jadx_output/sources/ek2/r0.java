package ek2;

/* loaded from: classes3.dex */
public final class r0 extends ek2.g0 {

    /* renamed from: y, reason: collision with root package name */
    public static final ek2.q0 f253519y = new ek2.q0(null);

    /* renamed from: u, reason: collision with root package name */
    public final r45.t12 f253520u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253521v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f253522w;

    /* renamed from: x, reason: collision with root package name */
    public final r45.vp2 f253523x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, byte[] bArr, long j18, java.lang.String nonceId, java.lang.String str, java.lang.String finderUsername, r45.qt2 contextObj, r45.t12 finderLiveMsg, java.lang.String clientMsgId, java.lang.String str2, r45.o72 o72Var) {
        super(contextObj);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderLiveMsg, "finderLiveMsg");
        kotlin.jvm.internal.o.g(clientMsgId, "clientMsgId");
        this.f253520u = finderLiveMsg;
        this.f253521v = "Finder.CgiFinderLiveCommentPostNew";
        this.f253522w = new org.json.JSONObject();
        r45.vp2 vp2Var = new r45.vp2();
        this.f253523x = vp2Var;
        db2.t4 t4Var = db2.t4.f228171a;
        vp2Var.set(1, t4Var.b(3896, contextObj));
        vp2Var.set(4, java.lang.Long.valueOf(j17));
        vp2Var.set(6, java.lang.Long.valueOf(j18));
        vp2Var.set(5, clientMsgId);
        vp2Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        vp2Var.set(3, finderLiveMsg);
        vp2Var.set(7, nonceId);
        vp2Var.set(8, finderUsername);
        r45.up2 up2Var = new r45.up2();
        up2Var.set(0, str2);
        vp2Var.set(9, up2Var);
        vp2Var.set(10, o72Var);
        t4Var.h((r45.kv0) vp2Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(contextObj.getInteger(7)), java.lang.Long.valueOf(j18), str)));
        w04.l.INSTANCE.Ch(540999694, 6);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = vp2Var;
        r45.wp2 wp2Var = new r45.wp2();
        wp2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) wp2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = wp2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpostlivemsg";
        lVar.f70667d = 3896;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveCommentPost init ");
        sb6.append(vp2Var.getLong(4));
        sb6.append(",msgId:");
        sb6.append(vp2Var.getString(5));
        sb6.append(',');
        r45.t12 t12Var = (r45.t12) vp2Var.getCustom(3);
        sb6.append(t12Var != null ? t12Var.getString(2) : null);
        sb6.append(",type:");
        r45.t12 t12Var2 = (r45.t12) vp2Var.getCustom(3);
        sb6.append(t12Var2 != null ? java.lang.Integer.valueOf(t12Var2.getInteger(3)) : null);
        sb6.append(",float_type:");
        r45.t12 t12Var3 = (r45.t12) vp2Var.getCustom(3);
        sb6.append(t12Var3 != null ? java.lang.Integer.valueOf(t12Var3.getInteger(13)) : null);
        sb6.append("(is float:");
        r45.t12 t12Var4 = (r45.t12) vp2Var.getCustom(3);
        sb6.append(t12Var4 != null ? java.lang.Integer.valueOf(t12Var4.getInteger(12)) : null);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveCommentPostNew", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.wp2 resp = (r45.wp2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", toastInfo:");
        r45.zm6 zm6Var = (r45.zm6) resp.getCustom(3);
        sb6.append(zm6Var != null ? java.lang.Boolean.valueOf(zm6Var.getBoolean(1)) : null);
        com.tencent.mars.xlog.Log.i(this.f253521v, sb6.toString());
        if (i18 == -200024) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        org.json.JSONObject jSONObject = this.f253522w;
        jSONObject.put("liveId", this.f253523x.getLong(4));
        jSONObject.put("msg", this.f253520u.getString(2));
    }

    @Override // az2.j
    public java.util.List s() {
        r45.t12 t12Var = (r45.t12) this.f253523x.getCustom(3);
        return kz5.b0.c(new jz5.l("type", java.lang.String.valueOf(t12Var != null ? t12Var.getInteger(3) : 0)));
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f253522w;
    }
}
