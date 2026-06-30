package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class m implements fp.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214851d;

    public m(java.lang.String str) {
        this.f214851d = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0053 -> B:25:0x006d). Please report as a decompilation issue!!! */
    @Override // fp.c
    public void onChange(int i17) {
        com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper onChange %d", java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.xwebutil.q.b(this.f214851d)) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, sCurrentParams invalid");
            return;
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = com.tencent.mm.xwebutil.q.f214868a.f214877h;
        if (iTPPlayer == null) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, tpPlayer invalid");
            return;
        }
        try {
            if (i17 == -2 || i17 == -3 || i17 == -1) {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper focus loss, try pause");
                if (iTPPlayer.getCurrentState() == 5) {
                    iTPPlayer.pause();
                }
            } else if (i17 != 1 && i17 != 2 && i17 != 3) {
            } else {
                com.tencent.mars.xlog.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper focus gain");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper pause error: " + th6.getMessage());
            com.tencent.mm.xwebutil.q.d("audioFocusHelper pause error ", th6);
        }
    }
}
