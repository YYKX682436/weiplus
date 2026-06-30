package lu3;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f321415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f321416f;

    public l(lu3.m mVar, long j17, kotlin.coroutines.Continuation continuation) {
        this.f321414d = mVar;
        this.f321415e = j17;
        this.f321416f = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("media recorder stop file exist:");
        lu3.m mVar = this.f321414d;
        ht0.s sVar = mVar.f321419o;
        sb6.append(com.tencent.mm.vfs.w6.j(sVar != null ? sVar.f284755c : null));
        sb6.append(" cost:");
        sb6.append(java.lang.System.currentTimeMillis() - this.f321415e);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", sb6.toString());
        ht0.s sVar2 = mVar.f321419o;
        boolean j17 = com.tencent.mm.vfs.w6.j(sVar2 != null ? sVar2.f284755c : null);
        kotlin.coroutines.Continuation continuation = this.f321416f;
        if (!j17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(-2, null)));
            return;
        }
        ht0.s sVar3 = mVar.f321419o;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(sVar3 != null ? sVar3.f284755c : null, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "media result info:" + d17);
        if (d17 == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(-3, null)));
            return;
        }
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        bVar.f222206c = true;
        ht0.s sVar4 = mVar.f321419o;
        kotlin.jvm.internal.o.d(sVar4);
        java.lang.String str = sVar4.f284755c;
        kotlin.jvm.internal.o.f(str, "getFilePath(...)");
        bVar.f222204a = str;
        ht0.s sVar5 = mVar.f321419o;
        java.lang.String str2 = sVar5 != null ? sVar5.f284772t : null;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f222205b = str2;
        bVar.f222207d = 0;
        bVar.f222208e = d17.f162382a;
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(0, bVar)));
    }
}
