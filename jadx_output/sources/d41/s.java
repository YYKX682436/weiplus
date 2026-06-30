package d41;

@j95.b(dependencies = {wx.c1.class})
/* loaded from: classes11.dex */
public final class s extends i95.w implements e41.e {

    /* renamed from: d, reason: collision with root package name */
    public final d41.j f226394d = new d41.j();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        iw5.o.f295275a = new d41.k();
        com.tencent.wechat.aff.ovc.n.f217480b = d41.l.f226387a;
        com.tencent.wechat.aff.ovc.o.f217482a = d41.m.f226388a;
        com.tencent.wechat.aff.ovc.o.f217483b = d41.n.f226389a;
        com.tencent.wechat.aff.ovc.o.f217484c = d41.o.f226390a;
        com.tencent.wechat.aff.ovc.o.f217485d = d41.p.f226391a;
        com.tencent.wechat.aff.ovc.n.f217479a = d41.q.f226392a;
        com.tencent.wechat.aff.ovc.n.f217481c = d41.r.f226393a;
        boolean z17 = jw5.i.f302355c;
        if (!jw5.i.f302355c) {
            boolean z18 = true;
            jw5.i.f302355c = true;
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AidlZChannelServerFactory", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            }
            jw5.f fVar = new jw5.f();
            boolean z19 = iw5.d.f295268a;
            if (!z19 && !z19) {
                if (iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExtChannelManager", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                }
                iw5.d.f295268a = true;
                com.tencent.wechat.zrpc.i.f220039a = iw5.b.f295266a;
                com.tencent.wechat.zrpc.i.f220040b = iw5.c.f295267a;
            }
            java.util.Map map = iw5.f.f295269c;
            if (!map.containsKey("AIDL")) {
                if (iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExtChannelServerFactory", "register: type AIDL");
                }
                if (map.containsKey("AIDL") && iw5.o.f295275a != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ExtChannelServerFactory", "register: type already exists, cover it");
                }
                map.put("AIDL", fVar);
            } else {
                z18 = false;
            }
            if (!z18 && iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AidlZChannelServerFactory", "init: register server failed");
            }
        }
        com.tencent.wechat.aff.ovc.g.f217477b.a(q.i.f359215a);
        com.tencent.mm.app.w.INSTANCE.a(this.f226394d);
    }
}
