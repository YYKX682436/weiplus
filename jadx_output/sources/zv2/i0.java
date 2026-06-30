package zv2;

/* loaded from: classes8.dex */
public final class i0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.l0 f476407a;

    public i0(zv2.l0 l0Var) {
        this.f476407a = l0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "videoDidSelect")) {
            zv2.l0 l0Var = this.f476407a;
            l0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.mars.xlog.Log.i("FinderTencentVideoWidget", "[videoDidSelect] data:" + obj);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setBusiness_type(((org.json.JSONObject) obj).optInt("businessType"));
                    finderJumpInfo.setWording(((org.json.JSONObject) obj).optString("wording"));
                    finderJumpInfo.setIcon_url(((org.json.JSONObject) obj).optString("iconUrl"));
                    finderJumpInfo.setJumpinfo_type(((org.json.JSONObject) obj).optInt("jumpType", 0));
                    org.json.JSONObject optJSONObject = ((org.json.JSONObject) obj).optJSONObject("html5Info");
                    java.lang.String optString = optJSONObject != null ? optJSONObject.optString("url") : null;
                    com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
                    html5Info.setUrl(optString);
                    finderJumpInfo.setHtml5_info(html5Info);
                    finderJumpInfo.getStyle().add(l0Var.m(5, 2, (org.json.JSONObject) obj));
                    finderJumpInfo.getStyle().add(l0Var.m(6, 2, (org.json.JSONObject) obj));
                    l0Var.f476397f = finderJumpInfo;
                    l0Var.i(finderJumpInfo);
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
            }
        }
        return false;
    }
}
