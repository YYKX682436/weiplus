package qi3;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363742e = str;
        this.f363743f = i17;
        this.f363744g = i18;
        this.f363745h = str2;
        this.f363746i = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi3.l(this.f363742e, this.f363743f, this.f363744g, this.f363745h, this.f363746i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363741d;
        int i18 = this.f363743f;
        java.lang.String str3 = this.f363742e;
        ?? r102 = "MicroMsg.BypSendHelper";
        java.lang.String str4 = this.f363746i;
        java.lang.String str5 = this.f363745h;
        int i19 = this.f363744g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                java.lang.String r17 = c01.z1.r();
                kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
                java.lang.String str6 = this.f363742e;
                str2 = "MicroMsg.BypSendHelper";
                try {
                    com.tencent.mm.modelbase.i b18 = qi3.m.f363747a.a(new qi3.n(r17, str6, str6, this.f363743f, null, valueOf, null, 64, null), 51, new qi3.g(i19, str5, str4)).b();
                    r102 = 1;
                    this.f363741d = 1;
                    b17 = rm0.h.b(b18, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                } catch (java.lang.Exception e17) {
                    e = e17;
                    str = str2;
                    com.tencent.mars.xlog.Log.e(str, "send byp status notify to claw failed - toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18, e);
                    return jz5.f0.f302826a;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                b17 = obj;
                str2 = "MicroMsg.BypSendHelper";
                r102 = r102;
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
            str = str2;
            try {
                com.tencent.mars.xlog.Log.i(str, "byp status notify. toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18 + ". rsp errCode:" + fVar.f70616b + ", errType: " + fVar.f70615a + ", errMsg: " + fVar.f70617c);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e(str, "send byp status notify to claw failed - toUserName: " + str3 + ", action: " + i19 + ", funcName: " + str5 + ", arg: " + str4 + ", bizType: " + i18, e);
                return jz5.f0.f302826a;
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = r102;
        }
        return jz5.f0.f302826a;
    }
}
