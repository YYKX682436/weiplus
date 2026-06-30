package ix3;

/* loaded from: classes.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.p5 f295477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f295478g;

    public k5(com.tencent.mm.storage.f9 f9Var, java.lang.String str, ix3.p5 p5Var, long j17) {
        this.f295475d = f9Var;
        this.f295476e = str;
        this.f295477f = p5Var;
        this.f295478g = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(tg3.u0.e8((tg3.u0) c17, this.f295475d, bm5.f0.f22572t, this.f295476e, false, 8, null));
        ix3.p5 p5Var = this.f295477f;
        android.content.Intent intent = new android.content.Intent(p5Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f295478g + "-Thumb");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
        androidx.appcompat.app.AppCompatActivity activity = p5Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerVideoPathDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
