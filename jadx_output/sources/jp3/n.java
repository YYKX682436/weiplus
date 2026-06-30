package jp3;

/* loaded from: classes.dex */
public final class n extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static final jp3.l f301018d = new jp3.l(null);

    public n() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a() || event.f54053g.f7759a != 182) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintResUpdateListener", "[callback] file update, type: " + event.f54053g.f7759a + ", subType:" + event.f54053g.f7760b + ", version：" + event.f54053g.f7762d + ", fileUpdated: " + event.f54053g.f7763e + ", filePath: " + event.f54053g.f7761c + ", fileMd5: " + event.f54053g.f7764f);
        if (event.f54053g.f7760b != 11) {
            return false;
        }
        if (!gm0.j1.j()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintResUpdateListener", "[callback] kernel extension was not invoked, skip this time");
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new jp3.m(event), "wallet_palm_print_thread_id");
        return false;
    }
}
