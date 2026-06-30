package oj1;

/* loaded from: classes7.dex */
public abstract class e {
    public static final void a(java.lang.String uuid, oj1.d type, cl0.g args) {
        kotlin.jvm.internal.o.g(uuid, "uuid");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(args, "args");
        if (oj1.a.f345749a[type.ordinal()] == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + uuid + ") started feedback");
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
            java.lang.String optString = args.optString("appId");
            if (optString == null) {
                return;
            }
            java.lang.String optString2 = args.optString("pageId");
            int optInt = args.optInt("appVersion", 0);
            int optInt2 = args.optInt("versionType", 0);
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = optString;
            z5Var.f305873k = optString2;
            z5Var.f305869g = optInt;
            z5Var.f305870h = optInt2;
            z5Var.f305872j = 16;
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.d.a(null, new oj1.c(uuid, z5Var.a()));
        }
    }
}
