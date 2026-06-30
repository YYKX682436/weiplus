package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public final class g implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i f143581a;

    public g(com.tencent.mm.plugin.lite.jsapi.comms.i iVar) {
        this.f143581a = iVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        cl0.g gVar = new cl0.g();
        gVar.h(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
        com.tencent.mm.plugin.lite.jsapi.comms.i.a(this.f143581a, "emoji", gVar);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.plugin.lite.jsapi.comms.i iVar = this.f143581a;
        iVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.h("type", "backspace");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(iVar.f143607b, iVar.f143608c, "emoticon.buttonClick", gVar);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.lite.jsapi.comms.i iVar = this.f143581a;
        iVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.h("type", "send");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(iVar.f143607b, iVar.f143608c, "emoticon.buttonClick", gVar);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(iVar.f143607b, "__LiteAppEmoticonContextTag", null);
        iVar.d();
    }
}
