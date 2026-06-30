package gs3;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView f275079d;

    public c(com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView mMKeyBoardView) {
        this.f275079d = mMKeyBoardView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f275079d.requestLayout();
    }
}
