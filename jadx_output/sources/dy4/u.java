package dy4;

/* loaded from: classes8.dex */
public final class u implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244707d;

    public u(dy4.w wVar) {
        this.f244707d = wVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        dy4.w wVar = this.f244707d;
        dy4.f1 f1Var = wVar.f244717c;
        if (f1Var == null) {
            return true;
        }
        ye1.e eVar = f1Var.f244627n;
        int currentPosition = eVar != null ? eVar.getCurrentPosition() : 0;
        double d17 = 1000;
        int i17 = (int) (wVar.f244718d * d17);
        try {
            if (java.lang.Math.abs(currentPosition - wVar.f244719e) < 250) {
                return true;
            }
            wVar.f244719e = currentPosition;
            double d18 = (i17 * 1.0d) / d17;
            double doubleValue = new java.math.BigDecimal((currentPosition * 1.0d) / d17).setScale(3, 4).doubleValue();
            org.json.JSONObject c17 = wVar.c();
            c17.put("position", doubleValue);
            c17.put("duration", d18);
            wVar.a("onVideoTimeUpdate", c17);
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(wVar.f244715a, "OnXWebVideoTimeUpdate fail", e17);
            return true;
        }
    }
}
