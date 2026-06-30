package dk2;

/* loaded from: classes3.dex */
public final class q2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f233936c;

    public q2(dk2.r4 r4Var, yz5.p pVar, long j17) {
        this.f233934a = r4Var;
        this.f233935b = pVar;
        this.f233936c = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        long j17 = this.f233936c;
        yz5.p pVar = this.f233935b;
        dk2.r4 r4Var = this.f233934a;
        if (i17 != 0 || fVar.f70616b != 0 || fVar.f70618d == null) {
            f0Var = f0Var2;
            com.tencent.mars.xlog.Log.i(r4Var.f234009d, "[WeCoin] getWeCoinBalance rsp error, errType: " + fVar.f70615a + " errCode: " + fVar.f70616b);
            if (pVar != null) {
                pVar.invoke(-1L, java.lang.Long.valueOf(j17));
                return f0Var;
            }
            return null;
        }
        mm2.v5 v5Var = (mm2.v5) r4Var.m(mm2.v5.class);
        float f17 = (float) ((r45.rr1) fVar.f70618d).getLong(4);
        v5Var.f329485h = f17;
        long c17 = c01.id.c() - v5Var.f329489o;
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", "checkUpdateHistoryConsumeBalanceCNY historyBalanceCNY: " + f17 + " curHistoryConsumeBalanceCNY: " + v5Var.f329485h + " offestTime: " + c17);
        if (c17 > 30000) {
            v5Var.f329485h = f17;
        }
        mm2.v5 v5Var2 = (mm2.v5) r4Var.m(mm2.v5.class);
        float f18 = (float) ((r45.rr1) fVar.f70618d).getLong(2);
        f0Var = f0Var2;
        long c18 = c01.id.c() - v5Var2.f329489o;
        com.tencent.mars.xlog.Log.i("LiveRestrictConsumeSlice", "checkUpdateCurConsumeBalanceCNY newConsumeBalanceCNY: " + f18 + " curConsumeBalanceCNY: " + v5Var2.f329484g + " offestTime: " + c18);
        if (c18 > 30000) {
            v5Var2.f329484g = f18;
        }
        mm2.v5 v5Var3 = (mm2.v5) r4Var.m(mm2.v5.class);
        km2.j jVar = new km2.j(((r45.rr1) fVar.f70618d).getLong(1));
        com.tencent.mars.xlog.Log.i(r4Var.f234009d, "[WeCoin] getWeCoinBalance rsp success data = " + jVar + " curConsumeBalanceCNY: " + ((mm2.v5) r4Var.m(mm2.v5.class)).f329484g + " curHistoryConsumeBalanceCNY: " + ((mm2.v5) r4Var.m(mm2.v5.class)).f329485h);
        v5Var3.f329487m = jVar;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(((r45.rr1) fVar.f70618d).getLong(1)), java.lang.Long.valueOf(j17));
            return f0Var;
        }
        return null;
    }
}
