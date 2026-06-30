package hg4;

/* loaded from: classes11.dex */
public class d implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog f281393d;

    public d(com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog) {
        this.f281393d = remindDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f281393d.finish();
    }
}
