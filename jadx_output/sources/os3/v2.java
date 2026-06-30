package os3;

/* loaded from: classes8.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f348233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f348235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout f348236i;

    public v2(com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout mailAttachListLinearLayout, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, boolean z17) {
        this.f348236i = mailAttachListLinearLayout;
        this.f348231d = str;
        this.f348232e = str2;
        this.f348233f = i17;
        this.f348234g = str3;
        this.f348235h = z17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout mailAttachListLinearLayout = this.f348236i;
        android.content.Intent intent = new android.content.Intent(mailAttachListLinearLayout.f154891d, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.class);
        intent.putExtra("attach_name", this.f348231d);
        intent.putExtra("mail_id", mailAttachListLinearLayout.f154893f);
        intent.putExtra("attach_id", this.f348232e);
        intent.putExtra("total_size", this.f348233f);
        java.lang.String str = this.f348234g;
        intent.putExtra("attach_url", str);
        mailAttachListLinearLayout.getClass();
        intent.putExtra("is_compress", str != null && str.contains("/cgi-bin/viewcompress"));
        intent.putExtra("is_preview", 0);
        intent.putExtra("qqmail_cookie", com.tencent.xweb.d.g().a(ks3.k0.c()));
        intent.putExtra("is_big_attach", this.f348235h);
        android.content.Context context = mailAttachListLinearLayout.f154891d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/MailAttachListLinearLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
