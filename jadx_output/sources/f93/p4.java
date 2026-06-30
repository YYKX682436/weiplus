package f93;

/* loaded from: classes11.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.s4 f260425d;

    public p4(f93.s4 s4Var) {
        this.f260425d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        f93.r4 r4Var = this.f260425d.C;
        if (r4Var == null) {
            kotlin.jvm.internal.o.o("onAddItemClickListener");
            throw null;
        }
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = ((f93.w) r4Var).f260492a;
        com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "cpan[dealAddContact]");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, 1024));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", contactEditLabel.getString(com.tencent.mm.R.string.g8s));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        intent.putExtra("without_openim", true);
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(contactEditLabel.f143201q, ","));
        j45.l.v(contactEditLabel, ".ui.contact.SelectContactUI", intent, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/HeaderAddDataItem$HeaderAddViewItem$setHolderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
