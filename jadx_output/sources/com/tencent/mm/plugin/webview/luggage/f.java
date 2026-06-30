package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView f182206d;

    public f(com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView) {
        this.f182206d = downloadProgressImageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/DownloadProgressImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 3);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(this.f182206d.getContext(), intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/DownloadProgressImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
