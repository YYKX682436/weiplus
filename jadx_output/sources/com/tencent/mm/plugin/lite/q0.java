package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class q0 implements com.tencent.mm.app.s5 {
    @Override // com.tencent.mm.app.s5
    public void Jb(java.lang.String str) {
        if (com.tencent.mm.plugin.lite.w.f144512o[0]) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onProcessForeground");
            com.tencent.mm.plugin.lite.LiteAppCenter.onForeground("", 0L);
        }
    }

    @Override // com.tencent.mm.app.s5
    public void k2(java.lang.String str) {
        if (com.tencent.mm.plugin.lite.w.f144512o[0]) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "onProcessBackground");
            com.tencent.mm.plugin.lite.LiteAppCenter.onBackground("", 0L);
            ia3.e c17 = ia3.e.c();
            c17.f290018e++;
            z21.e eVar = c17.f290014a;
            if (eVar != null) {
                eVar.cancel(true);
                c17.f290014a.stop(true);
                c17.f290014a = null;
            }
            ia3.d dVar = c17.f290015b;
            if (dVar != null) {
                dVar.c();
                c17.f290015b.b();
                c17.f290015b = null;
            }
            c17.f290017d = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onProcessBackground done, session cleared");
        }
    }
}
