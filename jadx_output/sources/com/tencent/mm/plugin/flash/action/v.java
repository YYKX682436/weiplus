package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class v implements tz2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.w f137185a;

    public v(com.tencent.mm.plugin.flash.action.w wVar) {
        this.f137185a = wVar;
    }

    @Override // tz2.h
    public void a(e72.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "number verify start record voice");
        com.tencent.mm.plugin.flash.action.w wVar = this.f137185a;
        if (wVar.f137188d.f137190a.f137082w.f423284a) {
            eVar.a(h72.s.e().f());
            wVar.f137188d.f137190a.f137082w.e();
        }
    }
}
