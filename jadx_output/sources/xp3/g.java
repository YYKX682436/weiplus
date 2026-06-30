package xp3;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.elf.MainProcessChecker f455925d;

    public g(com.tencent.mm.plugin.performance.elf.MainProcessChecker mainProcessChecker) {
        this.f455925d = mainProcessChecker;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.performance.elf.MainProcessChecker mainProcessChecker = this.f455925d;
        if (mainProcessChecker.f152965i || mainProcessChecker.h()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainProcessChecker", "escaped killing");
            return;
        }
        mainProcessChecker.A |= 256;
        mainProcessChecker.r(true);
        mainProcessChecker.i();
    }
}
