package vd2;

/* loaded from: classes3.dex */
public final class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.v5 f435915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435916b;

    public s5(vd2.v5 v5Var, java.lang.String str) {
        this.f435915a = v5Var;
        this.f435916b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("LiveNoticeClickLogicBlo", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new vd2.r5(this.f435915a, m70Var, this.f435916b));
        }
        return jz5.f0.f302826a;
    }
}
