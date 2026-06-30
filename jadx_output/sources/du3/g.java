package du3;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout f243584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout improveBaseEditPhotoLayout) {
        super(1);
        this.f243584d = improveBaseEditPhotoLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        du3.b0 b0Var = this.f243584d.f155757p;
        b0Var.getClass();
        if (!android.text.TextUtils.isEmpty(b0Var.f243541z)) {
            str = b0Var.f243541z;
            kotlin.jvm.internal.o.d(str);
        } else if (com.tencent.mm.vfs.w6.j(it)) {
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem Ai = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(it);
            b0Var.f243541z = Ai.f182736e;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "convertToImageItem path:" + it + " to id:" + Ai.f182736e);
            str = Ai.f182736e;
        } else {
            str = null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoAiPlugin", "web local id is null");
        } else {
            try {
                b0Var.C = it;
                b0Var.A = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                boolean a17 = pc4.e.f353426a.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enablePublishLivePhoto", "com.tencent.mm.feature.sns.SnsFeatureService");
                java.lang.String str3 = b0Var.f243532q;
                java.lang.Object[] objArr = new java.lang.Object[5];
                du3.b bVar = b0Var.f243533r;
                objArr[0] = bVar != null ? bVar.f243523d : null;
                objArr[1] = java.net.URLEncoder.encode(b0Var.A, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                du3.b bVar2 = b0Var.f243533r;
                if (bVar2 == null || (str2 = bVar2.f243521b) == null) {
                    str2 = "";
                }
                objArr[2] = java.net.URLEncoder.encode(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                objArr[3] = java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                objArr[4] = java.net.URLEncoder.encode(java.lang.String.valueOf(a17 ? 1 : 0), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                java.lang.String format = java.lang.String.format(str3, java.util.Arrays.copyOf(objArr, 5));
                kotlin.jvm.internal.o.f(format, "format(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "open ai page:" + b0Var.f243533r + " url:" + format);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", format);
                intent.putExtra("disable_swipe_back", true);
                intent.putExtra("key_select_pic_from_mm_gallery_without_clear_top", true);
                j45.l.n(b0Var.f243524f.getContext(), "webview", ".ui.tools.WebViewUI", intent, b0Var.f243525g);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImproveEditPhotoAiPlugin", e17, "open page error", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f302826a;
    }
}
