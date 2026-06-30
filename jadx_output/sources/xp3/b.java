package xp3;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f455917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.elf.AbstractProcessChecker f455918e;

    public b(com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker, android.content.Intent intent) {
        this.f455918e = abstractProcessChecker;
        this.f455917d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f455917d;
        if ("ACTION_ELF_CHECK".equals(intent.getAction())) {
            com.tencent.mm.plugin.performance.elf.ElfCheckRequest elfCheckRequest = (com.tencent.mm.plugin.performance.elf.ElfCheckRequest) intent.getParcelableExtra("MicroMsg.ElfCheckRequest");
            if (elfCheckRequest == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AbstractProcessChecker", "pass this check,because request is null! ????");
                return;
            }
            long myPid = android.os.Process.myPid();
            long j17 = elfCheckRequest.f152967d;
            com.tencent.mm.plugin.performance.elf.AbstractProcessChecker abstractProcessChecker = this.f455918e;
            boolean l17 = abstractProcessChecker.l(myPid, j17);
            abstractProcessChecker.getClass();
            java.lang.String a17 = bm5.f1.a();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(l17);
            abstractProcessChecker.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractProcessChecker", "[onReceive] begin to check process[%s] isCanKill:%s isNeedReCall:%s", a17, valueOf, java.lang.Boolean.valueOf(!(abstractProcessChecker instanceof com.tencent.mm.plugin.performance.elf.ToolProcessChecker)));
            if (l17) {
                abstractProcessChecker.i();
            } else {
                abstractProcessChecker.o(false);
            }
        }
    }
}
