package o25;

/* loaded from: classes8.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o25.g2 f342527a = new o25.g2();

    public static final boolean a(android.content.Context context, o25.b2 referer, java.lang.String businessType, java.lang.String str, o25.c2 c2Var) {
        kotlin.jvm.internal.o.g(referer, "referer");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        java.lang.String a17 = referer.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(businessType);
        sb6.append('#');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handle for sessionId:");
        sb8.append(sb7);
        sb8.append(", context:");
        sb8.append(context);
        sb8.append(", appId:");
        sb8.append(a17);
        sb8.append(", businessType:");
        sb8.append(businessType);
        sb8.append(", query:");
        sb8.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", sb8.toString());
        android.app.Activity a18 = q75.a.a(context);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = a18 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) a18 : null;
        kotlinx.coroutines.y0 b17 = appCompatActivity != null ? v65.m.b(appCompatActivity) : v65.m.f433580a;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new o25.f2(sb7, context, a17, businessType, str, c2Var, null), 2, null);
        return true;
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "sendRespToApp for appId:" + str + " sessionId:" + str3 + ", app info not found");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp(bundle);
        resp.errCode = i17;
        resp.errStr = str4;
        resp.extMsg = str5;
        resp.openId = h17.field_openId;
        resp.businessType = str2;
        resp.transaction = com.tencent.mm.pluginsdk.ui.tools.n5.f191793a;
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = h17.field_packageName;
        args.bundle = bundle;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        args.flags = 268435456;
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }
}
