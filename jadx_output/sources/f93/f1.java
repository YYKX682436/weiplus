package f93;

/* loaded from: classes3.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelEditUI f260334d;

    public f1(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI) {
        this.f260334d = contactLabelEditUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = this.f260334d;
        contactLabelEditUI.setResult(0);
        contactLabelEditUI.finish();
    }
}
