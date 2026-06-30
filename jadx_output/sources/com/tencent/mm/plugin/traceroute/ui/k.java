package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI f175328d;

    public k(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI) {
        this.f175328d = networkDiagnoseIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI = this.f175328d;
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, networkDiagnoseIntroUI.getString(com.tencent.mm.R.string.hlr));
        intent.putExtra("rawUrl", networkDiagnoseIntroUI.getString(com.tencent.mm.R.string.k4f, com.tencent.mm.sdk.platformtools.m2.d(), com.tencent.mm.sdk.platformtools.m2.e()));
        intent.putExtra("showShare", false);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, networkDiagnoseIntroUI.getContext());
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
