package ju3;

/* loaded from: classes8.dex */
public final class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout f301935d;

    public e1(com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout mediaTabCameraKitPluginLayout) {
        this.f301935d = mediaTabCameraKitPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabCameraKitPluginLayout", "onRequestPermissionsResult: click cancel");
        dialogInterface.dismiss();
        android.content.Context context = this.f301935d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        xg5.a aVar = ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).f208685e;
        if (aVar != null) {
            b33.f fVar = (b33.f) aVar;
            androidx.appcompat.app.AppCompatActivity activity = fVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            java.util.ArrayList arrayList = ((b33.o) pf5.z.f353948a.a(activity).a(b33.o.class)).f17677f;
            int size = arrayList.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    i18 = -1;
                    break;
                }
                java.lang.Object obj = arrayList.get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                if (((java.lang.Number) ((jz5.l) obj).f302833d).intValue() == 1) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 != -1) {
                fVar.U6().setCurrentItem(i18, true);
            }
        }
    }
}
