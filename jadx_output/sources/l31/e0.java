package l31;

/* loaded from: classes9.dex */
public final class e0 implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.f0 f315340d;

    public e0(l31.f0 f0Var) {
        this.f315340d = f0Var;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.lang.Object[] objArr = new java.lang.Object[5];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = errMsg;
        objArr[3] = java.lang.Integer.valueOf(this.f315340d.hashCode());
        objArr[4] = (subscribeMsgRequestResult == null || (arrayList2 = subscribeMsgRequestResult.f71785h) == null) ? null : java.lang.Integer.valueOf(arrayList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateSubscribeMsgListTask", "updateSubscribeMsgList end errType: %d, errCode: %d, errMsg: %s, hashCode: %s, tmpSize: %s", objArr);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.String str = this.f315340d.f315313a.length() > 0 ? this.f315340d.f315313a : this.f315340d.f315345i;
        if (i17 == 0 && i18 == 0) {
            if (!this.f315340d.f315347k) {
                if (!r1.f315344h.isEmpty()) {
                    if (subscribeMsgRequestResult != null && (arrayList = subscribeMsgRequestResult.f71785h) != null && (!arrayList.isEmpty())) {
                        z17 = true;
                    }
                    if (z17) {
                        c0Var.f310112d = true;
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new l31.c0(c0Var, this.f315340d, str, subscribeMsgRequestResult));
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l31.d0(i17, i18, subscribeMsgRequestResult, this.f315340d, str, errMsg));
    }
}
