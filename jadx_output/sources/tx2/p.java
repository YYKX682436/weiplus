package tx2;

/* loaded from: classes2.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx2.s f422631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422632b;

    public p(tx2.s sVar, java.lang.String str) {
        this.f422631a = sVar;
        this.f422632b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("LiveNoticeClickLogicBlo", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new tx2.o(this.f422631a, m70Var, this.f422632b));
        }
        return jz5.f0.f302826a;
    }
}
