package ix3;

/* loaded from: classes3.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.y2 f295553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f295554f;

    public s2(com.tencent.mm.storage.f9 f9Var, ix3.y2 y2Var, long j17) {
        this.f295552d = f9Var;
        this.f295553e = y2Var;
        this.f295554f = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(this.f295552d);
        if (S1 != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f295552d, bm5.f0.f22564i, S1.f322639g, "", ""));
            ix3.y2 y2Var = this.f295553e;
            android.content.Intent intent = new android.content.Intent(y2Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f295554f + "-Thumb");
            intent.putExtra("dirPath", r6Var.r());
            intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
            androidx.appcompat.app.AppCompatActivity activity = y2Var.getActivity();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
