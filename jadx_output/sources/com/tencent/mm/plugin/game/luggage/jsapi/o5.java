package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class o5 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.l f139726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sd.b f139727f;

    public o5(com.tencent.mm.plugin.game.luggage.jsapi.q5 q5Var, java.lang.String str, com.tencent.mm.plugin.game.luggage.page.l lVar, sd.b bVar) {
        this.f139725d = str;
        this.f139726e = lVar;
        this.f139727f = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str = this.f139725d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f139726e.d0(str);
        }
        this.f139727f.a();
    }
}
