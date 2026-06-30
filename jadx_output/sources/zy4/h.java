package zy4;

/* loaded from: classes.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabMainUI f477681d;

    public h(com.tencent.mm.plugin.welab.ui.WelabMainUI welabMainUI) {
        this.f477681d = welabMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, view.getResources().getString(com.tencent.mm.R.string.l_d));
        intent.putExtra("rawUrl", this.f477681d.getContext().getString(com.tencent.mm.R.string.l_9, com.tencent.mm.sdk.platformtools.m2.d(), java.lang.Integer.valueOf(o45.wf.f343029g)));
        intent.putExtra("showShare", false);
        j45.l.j(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
