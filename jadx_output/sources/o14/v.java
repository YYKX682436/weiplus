package o14;

/* loaded from: classes12.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI f342322d;

    public v(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI) {
        this.f342322d = fixToolsUplogUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(873L, 16L, 1L, false);
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI = this.f342322d;
        android.content.Intent intent = new android.content.Intent(fixToolsUplogUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE, com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s);
        intent.putExtra("begin_hour", com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160077t);
        intent.putExtra("end_hour", com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160078u);
        fixToolsUplogUI.startActivityForResult(intent);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
