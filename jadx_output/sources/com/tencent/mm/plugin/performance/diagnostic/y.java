package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class y implements tp3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.diagnostic.y f152954e = new com.tencent.mm.plugin.performance.diagnostic.y();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f152955d = new java.util.HashMap();

    public void a(java.lang.String str, com.tencent.mm.plugin.performance.diagnostic.x xVar) {
        if (android.text.TextUtils.isEmpty(str) || xVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportLogic", "tag or reporter should not be null");
        } else {
            ((java.util.HashMap) this.f152955d).put(str, xVar);
        }
    }

    @Override // tp3.c
    public java.lang.String b() {
        return ".cmd.diagnostic.report";
    }

    @Override // tp3.c
    public void c(java.util.Map map) {
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f152955d).entrySet()) {
            if (map.containsKey(".cmd.diagnostic.report." + ((java.lang.String) entry.getKey()))) {
                com.tencent.mm.plugin.performance.diagnostic.d dVar = (com.tencent.mm.plugin.performance.diagnostic.d) ((com.tencent.mm.plugin.performance.diagnostic.x) entry.getValue());
                if (dVar.h().e()) {
                    com.tencent.mm.plugin.performance.diagnostic.i iVar = dVar.f152915d;
                    iVar.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    iVar.f152935c.j();
                    android.content.Intent intent = new android.content.Intent(iVar.f152933a);
                    intent.putExtra("PARAM_KEY_TOKEN", currentTimeMillis);
                    intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                    com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.WXApp.WXAPP_BROADCAST_PERMISSION);
                }
            }
        }
    }

    @Override // tp3.c
    public void d() {
    }
}
