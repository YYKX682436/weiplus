package hg4;

/* loaded from: classes11.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog f281394d;

    public e(com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog) {
        this.f281394d = remindDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog remindDialog = this.f281394d;
        java.util.Iterator it = ((java.util.ArrayList) remindDialog.f172441e).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                stringBuffer.append("\n\n");
            } else {
                stringBuffer.append(str + "\n\n");
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = remindDialog.f172443g;
        if (j0Var != null) {
            j0Var.t(stringBuffer);
        }
    }
}
