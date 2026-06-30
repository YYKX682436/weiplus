package ju3;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f302028e;

    public v1(android.content.Context context, com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout) {
        this.f302027d = context;
        this.f302028e = recordPluginLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f302027d;
        y9.i iVar = new y9.i(context, 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView vendorEffectSettingView = new com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView(context, null);
        vendorEffectSettingView.setCameraView(this.f302028e.getPreviewPlugin());
        iVar.setContentView(vendorEffectSettingView);
        iVar.show();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
