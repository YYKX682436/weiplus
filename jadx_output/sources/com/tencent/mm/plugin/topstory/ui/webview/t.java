package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes5.dex */
public class t implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f175248a;

    public t(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.ref.WeakReference weakReference) {
        this.f175248a = weakReference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        android.content.Context context = (android.content.Context) this.f175248a.get();
        if (context == null || android.text.TextUtils.isEmpty(str2) || !com.tencent.mm.vfs.w6.j(str2)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_kemdia_path", str2);
        intent.putExtra("KFilterId", -1);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("KBlockAdd", true);
        j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
    }
}
