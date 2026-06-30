package yw;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.a1 f466497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f466498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f466499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.wechat.mm.biz.a1 a1Var, yw.y yVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466497d = a1Var;
        this.f466498e = yVar;
        this.f466499f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw.x(this.f466497d, this.f466498e, this.f466499f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.mm.biz.z0 c17;
        com.tencent.wechat.mm.biz.z0 c18;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean p17 = yw.h1.f466332a.p();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!p17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "on digest finder live info changed, switch is off");
            ((ku5.t0) ku5.t0.f312615d).q(new yw.u(this.f466498e, this.f466499f));
            return f0Var;
        }
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        com.tencent.wechat.mm.biz.a1 a1Var = com.tencent.mm.pluginsdk.model.b0.f189202f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update finder live dot, current mode: ");
        sb6.append((a1Var == null || (c18 = a1Var.c()) == null) ? null : c18.name());
        sb6.append(", current exportId: ");
        sb6.append(a1Var != null ? a1Var.b() : null);
        sb6.append(", current nickname: ");
        sb6.append(a1Var != null ? a1Var.getNickname() : null);
        sb6.append(", update mode: ");
        com.tencent.wechat.mm.biz.a1 a1Var2 = this.f466497d;
        sb6.append((a1Var2 == null || (c17 = a1Var2.c()) == null) ? null : c17.name());
        sb6.append(", update exportId: ");
        com.tencent.wechat.mm.biz.a1 a1Var3 = this.f466497d;
        sb6.append(a1Var3 != null ? a1Var3.b() : null);
        sb6.append(", update nickname: ");
        com.tencent.wechat.mm.biz.a1 a1Var4 = this.f466497d;
        sb6.append(a1Var4 != null ? a1Var4.getNickname() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", sb6.toString());
        com.tencent.wechat.mm.biz.a1 a1Var5 = this.f466497d;
        if (a1Var5 == null) {
            a1Var5 = com.tencent.wechat.mm.biz.a1.f217852h;
        }
        kotlin.jvm.internal.o.d(a1Var5);
        boolean l17 = b0Var.l(a1Var5);
        com.tencent.mm.pluginsdk.model.b0.f189202f = this.f466497d;
        if (l17) {
            ((ku5.t0) ku5.t0.f312615d).h(yw.v.f466480d, "BizFlutterDigestHelper");
        }
        ((ku5.t0) ku5.t0.f312615d).q(new yw.w(this.f466498e, this.f466499f));
        return f0Var;
    }
}
