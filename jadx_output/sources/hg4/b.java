package hg4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog f281391d;

    public b(com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog) {
        this.f281391d = remindDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        zf4.l wi6 = zf4.l.wi();
        com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog = this.f281391d;
        if (wi6 != null) {
            wi6.Ni(remindDialog.f172440d);
        }
        if (com.tencent.mm.storage.z3.I4(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b)) {
            remindDialog.finish();
        } else {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(new android.content.Intent().putExtra("Chat_User", remindDialog.f172440d), remindDialog);
            remindDialog.finish();
        }
    }
}
