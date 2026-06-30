package f93;

/* loaded from: classes11.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260421d;

    public p0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260421d = contactEditLabel;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260421d;
        contactEditLabel.setResult(0);
        contactEditLabel.finish();
    }
}
