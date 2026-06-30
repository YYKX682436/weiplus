package ix3;

/* loaded from: classes.dex */
public final class l5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.p5 f295492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f295493f;

    public l5(com.tencent.mm.storage.f9 f9Var, ix3.p5 p5Var, long j17) {
        this.f295491d = f9Var;
        this.f295492e = p5Var;
        this.f295493f = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ri(bm5.f0.f22571s, this.f295491d, null, false));
        ix3.p5 p5Var = this.f295492e;
        android.content.Intent intent = new android.content.Intent(p5Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f295493f + "-Compress");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
        androidx.appcompat.app.AppCompatActivity activity = p5Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
