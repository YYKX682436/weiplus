package yf2;

/* loaded from: classes3.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.z f461792f;

    public u(mm2.n0 n0Var, java.lang.String str, yf2.z zVar) {
        this.f461790d = n0Var;
        this.f461791e = str;
        this.f461792f = zVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.f50 f50Var = (r45.f50) obj;
        boolean Q6 = this.f461790d.Q6(this.f461791e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeCoLiveInviteeState: invitee=");
        sb6.append(Q6);
        sb6.append(", invitationId=");
        sb6.append(f50Var != null ? new java.lang.Long(f50Var.f374013d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? new java.lang.Integer(f50Var.f374014e) : null);
        com.tencent.mars.xlog.Log.i("FinderStartLivePostButtonController", sb6.toString());
        this.f461792f.Z6(Q6);
        return jz5.f0.f302826a;
    }
}
