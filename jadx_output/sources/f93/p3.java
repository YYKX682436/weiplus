package f93;

/* loaded from: classes11.dex */
public class p3 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f260424a;

    public p3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI, java.lang.Runnable runnable) {
        this.f260424a = runnable;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "showTextToast, has shown tip");
        java.lang.Runnable runnable = this.f260424a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
