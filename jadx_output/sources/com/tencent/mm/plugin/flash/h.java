package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class h implements tz2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.i f137220a;

    public h(com.tencent.mm.plugin.flash.i iVar) {
        this.f137220a = iVar;
    }

    @Override // tz2.h
    public void a(e72.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "number verify start record voice");
        com.tencent.mm.plugin.flash.i iVar = this.f137220a;
        if (iVar.f137221d.f137033u.f423284a) {
            eVar.a(h72.s.e().f());
            iVar.f137221d.f137033u.e();
        }
    }
}
