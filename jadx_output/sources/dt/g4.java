package dt;

/* loaded from: classes15.dex */
public class g4 extends com.tencent.mm.sdk.event.n {
    public g4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.pluginsdk.model.app.m k17;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = (com.tencent.mm.autogen.events.Launch3RdAppEvent) iEvent;
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.ki kiVar = launch3RdAppEvent.f54461g;
        android.content.Context context = kiVar.f7152d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        boolean z17 = kiVar.f7156h;
        am.li liVar = launch3RdAppEvent.f54462h;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "callbackOfLaunch3RdAppEvent disableOpenId is true!");
            java.lang.String str = kiVar.f7155g;
            if (str == null || str.isEmpty()) {
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str2 = kiVar.f7150b;
                    ((kt.c) i0Var).getClass();
                    k17 = com.tencent.mm.pluginsdk.model.app.w.i(str2, Integer.MAX_VALUE);
                } else {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str3 = kiVar.f7150b;
                    ((kt.c) i0Var2).getClass();
                    k17 = com.tencent.mm.pluginsdk.model.app.w.k(str3, false);
                }
                if (k17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "get appinfo is null, appid is : [%s]", kiVar.f7150b);
                }
                if (k17 != null && k17.field_status == 3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "requestAppShow fail, app is in blacklist, packageName = " + k17.field_packageName);
                }
                if (k17 != null && k17.field_status != 3) {
                    kiVar.f7155g = k17.field_packageName;
                    com.tencent.mars.xlog.Log.e("MicroMsg.WorkerProfile", "requestAppShow success, packageName = " + k17.field_packageName);
                }
            }
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = kiVar.f7155g;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = kiVar.f7149a;
            java.lang.String str5 = kiVar.f7150b;
            int i17 = kiVar.f7151c;
            com.tencent.mm.pluginsdk.model.app.a5 a5Var = kiVar.f7153e;
            android.os.Bundle bundle = kiVar.f7154f;
            ((kt.c) i0Var3).getClass();
            liVar.f7248a = com.tencent.mm.pluginsdk.model.app.w.w(context2, str4, wXMediaMessage, str5, "", i17, a5Var, bundle);
        } else {
            liVar.f7248a = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context2, kiVar.f7150b, kiVar.f7149a, kiVar.f7151c, kiVar.f7153e, kiVar.f7154f);
        }
        return false;
    }
}
