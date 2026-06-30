package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class xg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.zg f212554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f212555e;

    public xg(com.tencent.mm.ui.zg zgVar, android.content.Context context) {
        this.f212554d = zgVar;
        this.f212555e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.zg zgVar = this.f212554d;
        int i17 = zgVar.f212624d;
        android.content.Context context = this.f212555e;
        if (i17 == 3) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1.removeObserver(zgVar.f212633m);
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j0Var.observe((com.tencent.mm.ui.MMActivity) context, zgVar.f212633m);
        } else if (i17 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, zgVar.f212622b);
            intent.putExtra("fileExt", zgVar.f212623c);
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setResult(-1, intent);
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
