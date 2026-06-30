package zv2;

/* loaded from: classes2.dex */
public final class m0 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.p0 f476421a;

    public m0(zv2.p0 p0Var) {
        this.f476421a = p0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "FinderPostWeComJumpInfo")) {
            zv2.p0 p0Var = this.f476421a;
            p0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.tencent.mars.xlog.Log.i("FinderWeComWidget", "[weComDidSelect] data:" + obj);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setIcon_url(((org.json.JSONObject) obj).optString("icon_url"));
                    finderJumpInfo.setWording(((org.json.JSONObject) obj).optString("wording"));
                    finderJumpInfo.setPosition(((org.json.JSONObject) obj).optInt("position"));
                    finderJumpInfo.setBusiness_type(((org.json.JSONObject) obj).optInt("business_type"));
                    finderJumpInfo.setJumpinfo_type(((org.json.JSONObject) obj).optInt("jump_type"));
                    java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                    r45.wf6 wf6Var = new r45.wf6();
                    wf6Var.set(1, java.lang.Integer.valueOf(finderJumpInfo.getPosition()));
                    wf6Var.set(0, java.lang.Integer.valueOf(((org.json.JSONObject) obj).optInt("screen_type")));
                    style.add(wf6Var);
                    finderJumpInfo.setExt_info(((org.json.JSONObject) obj).optString("ext_info"));
                    com.tencent.mm.protocal.protobuf.NativeInfo nativeInfo = new com.tencent.mm.protocal.protobuf.NativeInfo();
                    nativeInfo.setNative_type(((org.json.JSONObject) obj).optInt("native_type"));
                    nativeInfo.setNecessary_params(((org.json.JSONObject) obj).optString("native_necessaryParams"));
                    finderJumpInfo.setNative_info(nativeInfo);
                    p0Var.f476397f = finderJumpInfo;
                    p0Var.i(finderJumpInfo);
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
