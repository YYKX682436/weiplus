package dy4;

/* loaded from: classes8.dex */
public final class s implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244702a;

    public s(dy4.w wVar) {
        this.f244702a = wVar;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        int i18 = aVar2 == null ? -1 : dy4.r.f244698a[aVar2.ordinal()];
        if (i18 == 1) {
            i17 = 90;
        } else if (i18 == 2) {
            i17 = -90;
        } else if (i18 == 3) {
            i17 = 0;
        } else if (i18 != 4) {
            return;
        } else {
            i17 = 180;
        }
        dy4.w wVar = this.f244702a;
        wVar.f244724j = i17;
        int i19 = wVar.f244724j;
        if (i19 == wVar.f244725k) {
            return;
        }
        wVar.f244725k = i19;
        com.tencent.mars.xlog.Log.i(wVar.f244715a, "onOrientationsChange currentOrientation=" + wVar.f244724j);
        try {
            org.json.JSONObject c17 = wVar.c();
            c17.put("newOrientation", wVar.f244724j);
            wVar.getClass();
            int i27 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
            com.tencent.mars.xlog.Log.i(wVar.f244715a, "accRotation=" + i27);
            c17.put("sysLock", i27 == 0 ? 1 : 0);
            wVar.a("onOrientationsChange", c17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoError fail", e17);
        }
    }
}
