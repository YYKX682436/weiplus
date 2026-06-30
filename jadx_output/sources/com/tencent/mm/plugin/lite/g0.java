package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f143467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f143469f;

    public g0(com.tencent.mm.plugin.lite.w wVar, java.lang.String[] strArr, java.lang.String str, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f143467d = strArr;
        this.f143468e = str;
        this.f143469f = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject;
        com.tencent.mm.plugin.lite.logic.g1.s().getClass();
        com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData mMLiteAppScheduleData = (com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData) com.tencent.mm.sdk.platformtools.o4.M("liteapp_schedule_data").r(this.f143468e, com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData.class);
        if (mMLiteAppScheduleData == null) {
            jSONObject = "{}";
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("interval", mMLiteAppScheduleData.f143881d);
                jSONObject3.put("repeat", mMLiteAppScheduleData.f143882e);
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, mMLiteAppScheduleData.f143883f);
                jSONObject4.put("payload", mMLiteAppScheduleData.f143884g);
                jSONObject3.put("action", jSONObject4);
                jSONObject3.put("forceDispatch", mMLiteAppScheduleData.f143885h);
                jSONObject3.put("aliveDurationSeconds", mMLiteAppScheduleData.f143886i);
                jSONObject2.put("scheduleOption", jSONObject3);
                jSONObject2.put("lastTriggerTime", mMLiteAppScheduleData.f143887m);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("LiteApp.MMLiteAppScheduleData", "toJasonString JSONException" + e17.toString());
            }
            jSONObject = jSONObject2.toString();
        }
        this.f143467d[0] = jSONObject;
        this.f143469f.countDown();
    }
}
