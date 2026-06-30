package xp3;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {
    public l(xp3.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "send check broadcast!");
        com.tencent.mm.plugin.performance.elf.ElfCheckRequest elfCheckRequest = new com.tencent.mm.plugin.performance.elf.ElfCheckRequest();
        elfCheckRequest.f152967d = xp3.o.f455930b;
        android.content.Intent intent = new android.content.Intent("ACTION_ELF_CHECK");
        intent.putExtra("MicroMsg.ElfCheckRequest", elfCheckRequest);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        xp3.o.f455932d.postDelayed(this, xp3.o.f455930b);
    }
}
