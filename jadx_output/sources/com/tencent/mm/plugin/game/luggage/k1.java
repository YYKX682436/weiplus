package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f139800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k60.e f139802f;

    public k1(java.lang.Class cls, java.lang.String str, k60.e eVar) {
        this.f139800d = cls;
        this.f139801e = str;
        this.f139802f = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.o0 o0Var = new sd.o0(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f139800d);
        java.util.HashMap hashMap = com.tencent.mm.plugin.game.luggage.p1.f139865a;
        java.lang.String str = this.f139801e;
        hashMap.put(str, o0Var);
        com.tencent.mm.plugin.game.luggage.p1.f139866b.remove(str);
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadGameWebCoreHelp", "loadUrl: %s", str);
            o0Var.j(str);
        }
        k60.e eVar = this.f139802f;
        if (eVar != null) {
            eVar.a();
        }
    }
}
