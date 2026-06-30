package t00;

/* loaded from: classes9.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f414296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qe0 f414297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t00.l2 f414298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f414299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414300h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414301i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f414302m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.ui.widget.dialog.u3 u3Var, bw5.qe0 qe0Var, t00.l2 l2Var, org.json.JSONObject jSONObject, android.content.Context context, c00.n3 n3Var, org.json.JSONObject jSONObject2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f414296d = u3Var;
        this.f414297e = qe0Var;
        this.f414298f = l2Var;
        this.f414299g = jSONObject;
        this.f414300h = context;
        this.f414301i = n3Var;
        this.f414302m = jSONObject2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t00.j2(this.f414296d, this.f414297e, this.f414298f, this.f414299g, this.f414300h, this.f414301i, this.f414302m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        t00.j2 j2Var = (t00.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String encodeToString;
        bw5.q5 c17;
        bw5.x7 b17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f414296d.dismiss();
        bw5.qe0 qe0Var = this.f414297e;
        byte[] initialProtobufBytes = (qe0Var == null || (c17 = qe0Var.c()) == null || (b17 = c17.b()) == null) ? null : b17.initialProtobufBytes();
        org.json.JSONObject jSONObject = this.f414299g;
        if (initialProtobufBytes != null) {
            encodeToString = android.util.Base64.encodeToString(initialProtobufBytes, 2);
        } else {
            this.f414298f.getClass();
            bw5.x7 x7Var = new bw5.x7();
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(jSONObject.optString("jumpAppId"));
            u7Var.f(jSONObject.optString("jumpPath"));
            u7Var.g(1358);
            u7Var.f33760m = false;
            u7Var.f33768u[7] = true;
            x7Var.k(u7Var);
            x7Var.f34977h.add("wxa");
            encodeToString = android.util.Base64.encodeToString(x7Var.toByteArray(), 2);
            kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        }
        java.lang.String optString = jSONObject.optString("entranceGMsgID");
        int optInt = jSONObject.optInt("type", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareTimelineEcsActionHandler", "EcsActionHandler_shareTimeline from env shareType:" + optInt + " entranceGMsgID:" + optString);
        r45.lh0 lh0Var = new r45.lh0();
        lh0Var.f379474e = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        lh0Var.f379475f = jSONObject.optString("productId");
        lh0Var.f379473d = jSONObject.optInt("type", -1);
        lh0Var.f379477h = optString;
        lh0Var.f379476g = encodeToString;
        lh0Var.f379478i = jSONObject.optString("reportData");
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject jSONObject2 = this.f414302m;
        if (optInt == 2) {
            java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString("videoLocalPath") : null;
            java.lang.String optString3 = jSONObject2 != null ? jSONObject2.optString("videoThumbLocalPath") : null;
            intent.putExtra("Ksnsupload_type", 14);
            intent.putExtra("KSightPath", optString2);
            intent.putExtra("KSightThumbPath", optString3);
            intent.putExtra("KBlockAdd", true);
        } else {
            org.json.JSONArray optJSONArray = jSONObject2 != null ? jSONObject2.optJSONArray("imgLocalPathList") : null;
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                intent.putExtra("sns_kemdia_path", jSONObject2 != null ? jSONObject2.optString("imgLocalPath") : null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    arrayList.add(optJSONArray.optString(i17));
                }
                intent.putExtra("sns_kemdia_path_list", arrayList);
            }
        }
        intent.putExtra("need_result", true);
        intent.putExtra("sns_ecs_share_info", lh0Var.toByteArray());
        intent.putExtra("sns_upload_is_show_dialog", true);
        c00.n3 callback = this.f414301i;
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context context = this.f414300h;
        if (context instanceof android.app.Activity) {
            nf.g.a(context).f(new b30.q(8229, callback));
            j45.l.v(context, ".plugin.sns.ui.SnsUploadUI", intent, 8229);
        } else {
            j45.l.u(context, ".plugin.sns.ui.SnsUploadUI", intent, null);
            callback.b(null);
        }
        return jz5.f0.f302826a;
    }
}
