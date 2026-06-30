package ix3;

/* loaded from: classes.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.x3 f295577f;

    public u3(java.lang.String str, long j17, ix3.x3 x3Var) {
        this.f295575d = str;
        this.f295576e = j17;
        this.f295577f = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
        java.lang.String str = this.f295575d;
        long j17 = this.f295576e;
        java.lang.String o17 = bt3.g2.l(str, j17).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        ix3.x3 x3Var = this.f295577f;
        android.content.Intent intent = new android.content.Intent(x3Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, j17 + "-Folder");
        intent.putExtra("dirPath", o17);
        androidx.appcompat.app.AppCompatActivity activity = x3Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
