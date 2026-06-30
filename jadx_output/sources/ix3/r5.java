package ix3;

/* loaded from: classes.dex */
public final class r5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.t5 f295548f;

    public r5(java.lang.String str, long j17, ix3.t5 t5Var) {
        this.f295546d = str;
        this.f295547e = j17;
        this.f295548f = t5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str = this.f295546d;
        long j17 = this.f295547e;
        com.tencent.mm.storage.f9 k17 = e0Var.k(str, j17);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).yj(k17, k17 != null ? k17.z0() : null, false)));
        ix3.t5 t5Var = this.f295548f;
        android.content.Intent intent = new android.content.Intent(t5Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, j17 + "-Path");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
        androidx.appcompat.app.AppCompatActivity activity = t5Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVoiceMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
