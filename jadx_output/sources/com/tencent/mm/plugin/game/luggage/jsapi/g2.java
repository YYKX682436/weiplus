package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class g2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f139646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f139647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.h2 f139648f;

    public g2(com.tencent.mm.plugin.game.luggage.jsapi.h2 h2Var, sd.b bVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f139648f = h2Var;
        this.f139646d = bVar;
        this.f139647e = mMActivity;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f139648f.hashCode() & 65535)) {
            sd.b bVar = this.f139646d;
            if (i18 == -1) {
                if (intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("gameRegionName");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("gameRegionName", stringExtra);
                    bVar.d(hashMap);
                } else {
                    bVar.c("fail", null);
                }
            } else if (i18 == 1) {
                bVar.c("fail", null);
            } else {
                bVar.c("cancel", null);
            }
            this.f139647e.mmSetOnActivityResultCallback(null);
        }
    }
}
