package qj4;

/* loaded from: classes11.dex */
public final class o implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f363939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363940c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363941d;

    public o(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.String str3) {
        this.f363938a = str;
        this.f363939b = l17;
        this.f363940c = str2;
        this.f363941d = str3;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.tencent.mm.protobuf.f fVar) {
        jz5.f0 f0Var;
        pj4.h2 h2Var = (pj4.h2) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.tsReport", "postReport onActionDone " + i17 + ' ' + z17 + ' ' + this.f363938a);
        if (h2Var != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new qj4.q(h2Var, this.f363939b, this.f363940c, this.f363941d));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.tsReport", "postReport: postData is null, " + this.f363938a + ", " + this.f363939b);
        }
    }
}
