package f93;

/* loaded from: classes8.dex */
public class f2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f260335a;

    public f2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI, java.lang.Runnable runnable) {
        this.f260335a = runnable;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "showTextToast, has shown tip");
        java.lang.Runnable runnable = this.f260335a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
