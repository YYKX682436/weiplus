package zk3;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f473441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f473443f;

    /* renamed from: g, reason: collision with root package name */
    public int f473444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f473445h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC f473446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, com.tencent.mm.plugin.multitask.ui.uic.MultiTaskChatbotUIC multiTaskChatbotUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473445h = j17;
        this.f473446i = multiTaskChatbotUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zk3.f(this.f473445h, this.f473446i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(4:5|6|7|8)(2:10|11))(1:12))(4:24|(2:26|(1:28)(1:29))|7|8)|13|14|(1:16)|18|(1:20)(4:21|6|7|8)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskFlutterChatbotUIC", "addPlugins snsPlugins failed, skip: " + r0.getMessage());
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zk3.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
