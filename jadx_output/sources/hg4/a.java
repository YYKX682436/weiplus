package hg4;

/* loaded from: classes11.dex */
public class a implements c01.r8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog f281390a;

    public a(com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog) {
        this.f281390a = remindDialog;
    }

    @Override // c01.r8
    public void a(java.lang.String str, long j17) {
        com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog = this.f281390a;
        ((java.util.ArrayList) remindDialog.f172441e).add(str);
        remindDialog.f172442f.post(new hg4.e(remindDialog));
    }
}
