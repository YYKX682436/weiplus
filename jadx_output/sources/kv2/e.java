package kv2;

/* loaded from: classes.dex */
public final class e implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f312659d;

    public e(yz5.q qVar) {
        this.f312659d = qVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            this.f312659d.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingFinderMentionRouter", "onTingFinderMentionReply error!, errType = " + i17 + ", errCode = " + i18);
        return 0;
    }
}
