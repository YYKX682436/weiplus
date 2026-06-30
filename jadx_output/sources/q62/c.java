package q62;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtStepCountEvent extStepCountEvent = (com.tencent.mm.autogen.events.ExtStepCountEvent) iEvent;
        if (extStepCountEvent.f54211g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtStepCount", "StepCount revent.data is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" action = ");
        am.t8 t8Var = extStepCountEvent.f54211g;
        sb6.append(t8Var.f7989a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtStepCount", sb6.toString());
        if (t8Var.f7989a != 1) {
            return false;
        }
        java.lang.String str = (java.lang.String) n62.k.Ai().m(com.tencent.mm.storage.u3.USERINFO_EXT_SPORT_PKGNAME_STRING, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreExt", "sendSportBroadcast pkgNames = " + str);
        if (str != null) {
            for (java.lang.String str2 : str.split(";")) {
                android.content.Intent intent = new android.content.Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
                intent.setPackage(str2);
                if (fp.h.c(12)) {
                    intent.setFlags(32);
                }
                intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "SPORT_MESSAGE");
                com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
            }
        }
        return true;
    }
}
