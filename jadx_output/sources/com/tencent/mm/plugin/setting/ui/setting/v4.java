package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.v4 f161630d = new com.tencent.mm.plugin.setting.ui.setting.v4();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = true;
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(96, 1);
        boolean j17 = com.tencent.mm.vfs.w6.j(Bi);
        if (j17) {
            mo3.g.Ai(Bi);
        } else {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingMessageRingtoneUI", "handle cachefile, cacheExist:" + j17 + ", result:" + z17);
    }
}
