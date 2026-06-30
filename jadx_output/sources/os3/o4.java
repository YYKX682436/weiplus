package os3;

/* loaded from: classes8.dex */
public class o4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348166d;

    public o4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348166d = readMailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ReadMailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = com.tencent.mm.plugin.qqmail.ui.ReadMailUI.N;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348166d;
        readMailUI.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("mail_id", readMailUI.f154927f.f311626a);
        bundle.putInt("mail_status", 2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, js3.l.class, new os3.s3(readMailUI));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 19);
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
