package zy3;

/* loaded from: classes.dex */
public final class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a() || event.f54053g.f7759a != 193) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportResUpdateListener", "[callback] file update, type: " + event.f54053g.f7759a + ", subType:" + event.f54053g.f7760b + ", version：" + event.f54053g.f7762d + ", filePath: " + event.f54053g.f7761c);
        if (!gm0.j1.j()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanPassportResUpdateListener", "[callback] kernel extension was not invoked, skip this time");
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new zy3.n(event), "MicroMsg.ScanPassportResUpdateListener");
        return false;
    }
}
