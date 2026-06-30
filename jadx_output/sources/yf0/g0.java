package yf0;

/* loaded from: classes12.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461558d;

    /* renamed from: e, reason: collision with root package name */
    public int f461559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461561g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(zf0.v0 v0Var, yf0.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461560f = v0Var;
        this.f461561g = k0Var;
    }

    public static final void a(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, zf0.v0 v0Var) {
        yf0.k0.f461576o.b().remove(msgIdTalker.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoSendFSC", v0Var.id() + " cleanupTask from runningTaskMap");
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.g0(this.f461560f, this.f461561g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
