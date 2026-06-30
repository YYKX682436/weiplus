package q01;

/* loaded from: classes12.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f359326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q01.s0 s0Var) {
        super(0);
        this.f359326d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.network.v0 reqResp = this.f359326d.f359329a.getReqResp();
        if (reqResp != null) {
            return reqResp.getUri();
        }
        return null;
    }
}
