package w35;

/* loaded from: classes8.dex */
public final class l extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.pluginsdk.model.g2 params, w35.a aVar) {
        super(params, aVar);
        kotlin.jvm.internal.o.g(params, "params");
        this.f442740e = "MicroMsg.OpenWayControllerDevice";
    }

    @Override // w35.b
    public void a() {
        com.tencent.mm.pluginsdk.model.g2 g2Var = this.f442723a;
        if (g2Var.f189312e > 0) {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("msgId", g2Var.f189312e);
                bundle.putString("msgTalker", g2Var.f189313f);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, w35.h.class, new w35.k(this));
                return;
            }
            java.util.ArrayList<com.tencent.mm.feature.exdevice.NetworkDeviceInfo> wi6 = ((gb0.i) ((j30.m) i95.n0.c(j30.m.class))).wi(g2Var.f189312e, g2Var.f189313f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo : wi6) {
                com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
                wVar.f191016f = networkDeviceInfo;
                arrayList.add(wVar);
            }
            com.tencent.mars.xlog.Log.i(this.f442740e, "get device open way count: " + arrayList.size());
            w35.a aVar = this.f442724b;
            if (aVar != null) {
                aVar.a(arrayList);
            }
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(info, "info");
        w35.a aVar = this.f442724b;
        if (aVar != null) {
            ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
        }
        com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a.a(info.b(), this.f442725c);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.pluginsdk.model.g2 g2Var = this.f442723a;
        if (n17) {
            ((gb0.i) ((j30.m) i95.n0.c(j30.m.class))).Bi(context, g2Var.f189312e, g2Var.f189313f, info.f191016f);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", g2Var.f189312e);
            bundle.putString("msgTalker", g2Var.f189313f);
            bundle.putParcelable("deviceInfo", info.f191016f);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, w35.i.class, null);
        }
    }
}
