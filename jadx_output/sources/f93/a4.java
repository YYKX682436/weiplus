package f93;

/* loaded from: classes11.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260290d;

    public a4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260290d = contactLabelUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260290d;
        contactLabelUI.f143302m.f();
        contactLabelUI.hideVKB();
    }
}
