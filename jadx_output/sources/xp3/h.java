package xp3;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.elf.MainProcessChecker f455926d;

    public h(com.tencent.mm.plugin.performance.elf.MainProcessChecker mainProcessChecker) {
        this.f455926d = mainProcessChecker;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.performance.elf.MainProcessChecker mainProcessChecker = this.f455926d;
        if (!mainProcessChecker.f152958b.f455920e) {
            com.tencent.mars.xlog.Log.w(mainProcessChecker.e(), "[onCallUp] you can't see me, perry!");
        } else {
            com.tencent.mars.xlog.Log.w(mainProcessChecker.e(), "[onCallUp] My God, you saw me!");
            jx3.f.INSTANCE.idkeyStat(959L, 7L, 1L, true);
        }
    }
}
