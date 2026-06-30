package ix3;

/* loaded from: classes3.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.y2 f295586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f295587f;

    public v2(com.tencent.mm.storage.f9 f9Var, ix3.y2 y2Var, long j17) {
        this.f295585d = f9Var;
        this.f295586e = y2Var;
        this.f295587f = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(this.f295585d);
        if (S1 != null) {
            com.tencent.mm.storage.f9 f9Var = this.f295585d;
            boolean j17 = S1.j();
            ix3.y2 y2Var = this.f295586e;
            if (j17) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, m11.b1.Di().C1(java.lang.Long.valueOf(S1.f322649q)).f322637e, "", ""));
                android.content.Intent intent = new android.content.Intent(y2Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f295587f + "-Big");
                intent.putExtra("dirPath", r6Var.r());
                intent.putExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, r6Var.getName());
                androidx.appcompat.app.AppCompatActivity activity = y2Var.getActivity();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                androidx.appcompat.app.AppCompatActivity activity2 = y2Var.getActivity();
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity2);
                e4Var.f211776c = "这条消息没有原图";
                e4Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerImgMsgDebugUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
