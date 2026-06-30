package com.tencent.mm.plugin.performance.elf;

/* loaded from: classes.dex */
public class ElfCallUpReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static int f152966a = -1;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ElfCallUpReceiver", "[onReceive] call up! ");
        if (getClass().getName().equals(intent.getAction())) {
            f152966a = intent.getIntExtra("processId", 0);
        }
    }
}
