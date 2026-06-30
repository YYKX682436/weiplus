package p61;

/* loaded from: classes5.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352279d;

    public h1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352279d = bindMContactIntroUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352279d;
        int measuredWidth = bindMContactIntroUI.f72966i.getMeasuredWidth();
        if (bindMContactIntroUI.f72967m.getMeasuredWidth() < measuredWidth) {
            bindMContactIntroUI.f72967m.setWidth(measuredWidth);
        }
    }
}
