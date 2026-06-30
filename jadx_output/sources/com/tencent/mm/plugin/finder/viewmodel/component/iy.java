package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class iy {
    public iy(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.plugin.finder.viewmodel.component.iy r17, android.content.Context r18, android.content.Intent r19, long r20, java.lang.String r22, int r23, int r24, boolean r25, int r26, java.lang.String r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.iy, android.content.Context, android.content.Intent, long, java.lang.String, int, int, boolean, int, java.lang.String, int, java.lang.Object):void");
    }

    public final java.lang.String a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('-');
        sb6.append(c01.id.c());
        java.lang.String sb7 = sb6.toString();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_all_clicktabid_blacklist, "100", true);
        com.tencent.mars.xlog.Log.i("Finder.FinderReporterUIC", "genClickTabContextId [%s] uiTabIndex[%s] blacklist[%s]", sb7, i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "2" : "0" : "3" : "1", Zi);
        try {
            kotlin.jvm.internal.o.d(Zi);
            java.util.Iterator it = r26.n0.e0(Zi, new char[]{';'}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), java.lang.String.valueOf(i17))) {
                    return sb7;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, sb7);
        return sb7;
    }

    public final java.lang.String b(android.content.Intent fromIntent, java.lang.String fromFloatFrameId) {
        kotlin.jvm.internal.o.g(fromIntent, "fromIntent");
        kotlin.jvm.internal.o.g(fromFloatFrameId, "fromFloatFrameId");
        java.lang.String stringExtra = fromIntent.getStringExtra("key_extra_info");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(fromFloatFrameId)) {
            return stringExtra;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("from_float_frame_id", fromFloatFrameId);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(stringExtra);
            jSONObject3.put("from_float_frame_id", fromFloatFrameId);
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderReporterUIC", "", th6);
            return stringExtra;
        }
    }

    public final void c(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        d(this, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.ny e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
    }
}
