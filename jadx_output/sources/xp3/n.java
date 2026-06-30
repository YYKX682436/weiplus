package xp3;

/* loaded from: classes5.dex */
public final class n extends android.content.BroadcastReceiver {
    public n(xp3.k kVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (!"ACTION_ELF_CHECK_RESPONSE".equals(intent.getAction())) {
            if ("com.tencent.mm.MMUIModeManager".equals(intent.getAction())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "restart mm for uimode change!");
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new xp3.m(this, context), 500L);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.performance.elf.ElfCheckResponse elfCheckResponse = (com.tencent.mm.plugin.performance.elf.ElfCheckResponse) intent.getParcelableExtra("MicroMsg.ElfCheckResponse");
        if (elfCheckResponse == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[onReceive] response is null!");
            return;
        }
        if (!elfCheckResponse.f152969e) {
            xp3.o.f455932d.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = xp3.o.f455932d;
        boolean z18 = elfCheckResponse.f152969e;
        if (z18 && elfCheckResponse.f152968d && elfCheckResponse.f152971g) {
            n3Var.postDelayed(new xp3.e(elfCheckResponse, context), elfCheckResponse.f152975n);
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ElfCheckResponse", "can't call process[%s]", elfCheckResponse.f152973i);
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[onReceive] %s, isEnable:%s, CHECK_TIME:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(xp3.o.f455930b));
    }
}
