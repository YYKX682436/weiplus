package fw4;

@j95.b
/* loaded from: classes8.dex */
public final class l extends i95.w implements gw4.g {
    public void wi(gw4.f fVar, gw4.e eVar) {
        if (fVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeDownloadAppManager", "downloadApp downloadAppId: " + fVar.f276157b);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = fVar.f276156a;
        intent.setClassName(context, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
        intent.putExtra("download_app_id", fVar.f276157b);
        intent.putExtra("from_scene", 5);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            mMActivity.mmSetOnActivityResultCallback(new fw4.i(eVar));
            mMActivity.startActivityForResult(intent, 1000);
            return;
        }
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) context;
            mMFragmentActivity.setMMOnFragmentActivityResult(new fw4.j(eVar));
            mMFragmentActivity.startActivityForResult(intent, 1000);
            return;
        }
        if (context instanceof android.app.Activity) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NativeDownloadAppManager", "downloadApp without callback, just startActivity");
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/webview/download/NativeDownloadAppManager", "downloadApp", "(Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppRequest;Lcom/tencent/mm/plugin/webview/download/api/NativeDownloadAppListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
