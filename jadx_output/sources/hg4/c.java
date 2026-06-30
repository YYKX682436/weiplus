package hg4;

/* loaded from: classes11.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog f281392d;

    public c(com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog) {
        this.f281392d = remindDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        zf4.l wi6 = zf4.l.wi();
        com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog = this.f281392d;
        if (wi6 != null) {
            wi6.Ni(remindDialog.f172440d);
        }
        remindDialog.finish();
    }
}
