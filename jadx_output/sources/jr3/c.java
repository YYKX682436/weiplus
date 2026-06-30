package jr3;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public er3.d f301396d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f301397e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f301398f = new com.tencent.mm.sdk.platformtools.b4(new jr3.b(this), false);

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f301399g;

    public c(android.app.Activity activity) {
        this.f301399g = activity;
    }

    public final void a(java.lang.String str) {
        this.f301398f.d();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f301397e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        android.app.Activity activity = this.f301399g;
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, activity.getString(com.tencent.mm.R.string.bjg));
        intent.putExtra(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, true);
        intent.putExtra("vertical_scroll", false);
        j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(205, this);
        er3.d dVar = (er3.d) m1Var;
        if (i17 == 0 && i18 == 0) {
            a(((r45.ls3) dVar.f256026e.f70711b.f70700a).f379799d);
            return;
        }
        if (i17 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ViewTWeibo", "view weibo failed: " + i17 + ", " + i18);
        }
        a("http://t.qq.com/" + dVar.f256027f);
    }
}
