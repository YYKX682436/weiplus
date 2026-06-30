package zv2;

/* loaded from: classes2.dex */
public final class x implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.a0 f476426a;

    public x(zv2.a0 a0Var) {
        this.f476426a = a0Var;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (kotlin.jvm.internal.o.b(str, "FinderPostCollectionJumpInfo")) {
            zv2.a0 a0Var = this.f476426a;
            a0Var.getClass();
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.tencent.mars.xlog.Log.i("FinderPostCollectionWidget", "[postChooseCollectionAction] data:" + obj);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    finderJumpInfo.setBusiness_type(((org.json.JSONObject) obj).optInt("business_type"));
                    finderJumpInfo.setJumpinfo_type(((org.json.JSONObject) obj).optInt("jumpinfo_type"));
                    finderJumpInfo.setIcon_url(((org.json.JSONObject) obj).optString("icon_url"));
                    finderJumpInfo.setWording(((org.json.JSONObject) obj).optString("wording"));
                    finderJumpInfo.setPosition(((org.json.JSONObject) obj).optInt("show_position"));
                    java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                    r45.wf6 wf6Var = new r45.wf6();
                    wf6Var.set(1, java.lang.Integer.valueOf(finderJumpInfo.getPosition()));
                    wf6Var.set(0, java.lang.Integer.valueOf(((org.json.JSONObject) obj).optInt("show_screen")));
                    style.add(wf6Var);
                    com.tencent.mm.protocal.protobuf.NativeInfo nativeInfo = new com.tencent.mm.protocal.protobuf.NativeInfo();
                    nativeInfo.setNative_type(((org.json.JSONObject) obj).optInt("native_type"));
                    nativeInfo.setNecessary_params(((org.json.JSONObject) obj).optString("native_necessary_params"));
                    finderJumpInfo.setNative_info(nativeInfo);
                    a0Var.f476397f = finderJumpInfo;
                    a0Var.i(finderJumpInfo);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FinderPostCollectionWidget", "postChooseCollectionAction error: " + e17.getMessage());
                }
            }
        }
        return false;
    }
}
