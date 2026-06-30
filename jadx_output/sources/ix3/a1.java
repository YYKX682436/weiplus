package ix3;

/* loaded from: classes.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.c1 f295359f;

    public a1(java.lang.String str, long j17, ix3.c1 c1Var) {
        this.f295357d = str;
        this.f295358e = j17;
        this.f295359f = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String str = this.f295357d;
        long j17 = this.f295358e;
        com.tencent.mm.storage.f9 k17 = e0Var.k(str, j17);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        java.lang.String z07 = k17 != null ? k17.z0() : null;
        ((k90.b) u0Var).getClass();
        com.tencent.mm.feature.emoji.api.z5 z5Var = (com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class);
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).getClass();
        h12.b0.a();
        java.lang.String z08 = k17 != null ? k17.z0() : null;
        if (z08 != null) {
            z07 = z08;
        } else if (z07 == null) {
            z07 = "";
        }
        ((com.tencent.mm.feature.emoji.q0) z5Var).getClass();
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", z07);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(p17 != null ? p17 : ""));
        ix3.c1 c1Var = this.f295359f;
        android.content.Intent intent = new android.content.Intent(c1Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, j17 + "-Path");
        intent.putExtra("dirPath", r6Var.r());
        intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerEmojiMsgDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
