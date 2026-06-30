package k23;

/* loaded from: classes12.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f303677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f303679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f303680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f303681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i17, int i18, int i19, long j17, k23.v0 v0Var) {
        super(0);
        this.f303677d = i17;
        this.f303678e = i18;
        this.f303679f = i19;
        this.f303680g = j17;
        this.f303681h = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("voiceAddr.onError(localCode=");
        int i17 = this.f303677d;
        sb6.append(i17);
        sb6.append(", errType=");
        sb6.append(this.f303678e);
        sb6.append(", errCode=");
        int i18 = this.f303679f;
        sb6.append(i18);
        sb6.append(", voiceid=");
        sb6.append(this.f303680g);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", sb6.toString());
        k23.v0 v0Var = this.f303681h;
        v0Var.f303718m = false;
        k23.v0.x(this.f303681h, 7, "{\"errorCode\":" + i18 + ";\"errMsg\":\"error\";\"voiceId\":\"" + v0Var.f303710e + "\"}", null, 4, null);
        com.tencent.mm.ui.MMActivity mMActivity = v0Var.f303706a;
        if (i17 == 12) {
            v0Var.D(mMActivity.getString(com.tencent.mm.R.string.fh9));
        } else {
            v0Var.D(mMActivity.getString(com.tencent.mm.R.string.fh_));
        }
        v0Var.s();
        return jz5.f0.f302826a;
    }
}
