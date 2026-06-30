package x62;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI f452228d;

    public a(com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI redirectToChattingByPhoneStubUI) {
        this.f452228d = redirectToChattingByPhoneStubUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        com.tencent.mm.plugin.ext.ui.RedirectToChattingByPhoneStubUI redirectToChattingByPhoneStubUI = this.f452228d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) redirectToChattingByPhoneStubUI.getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = redirectToChattingByPhoneStubUI.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        try {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", e17);
        }
    }
}
