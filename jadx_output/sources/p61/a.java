package p61;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView f352207d;

    public a(com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView autoBottomScrollView) {
        this.f352207d = autoBottomScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.account.bind.ui.AutoBottomScrollView autoBottomScrollView = this.f352207d;
        autoBottomScrollView.smoothScrollTo(0, autoBottomScrollView.getBottom());
    }
}
