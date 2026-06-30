package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class x0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final r45.vd0 f143822g = new r45.vd0();

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            this.f143822g.f388136f = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f143822g.f388134d = jSONObject.optString("setKey");
            this.f143822g.f388135e = jSONObject.optString("iconUrl");
            this.f143822g.f388137g = jSONObject.optString("desc");
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            if (o6Var != null) {
                android.content.Context c17 = c();
                kotlin.jvm.internal.o.f(c17, "getContext(...)");
                r45.vd0 ipSet = this.f143822g;
                kotlin.jvm.internal.o.g(ipSet, "ipSet");
                com.tencent.mars.xlog.Log.i(((com.tencent.mm.feature.emoji.c4) o6Var).f66207d, "showEmojiIPPageShareBottomSheet");
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.emoji.w3(c17, 1001, 1000, ipSet));
            }
            this.f143443f.d(false);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("emoticonIPPageShare", "missing arguments. no json object provided");
            this.f143443f.a("missing arguments.");
        }
    }
}
