package gl5;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.edit.CustomTextView f272915d;

    public c(com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView) {
        this.f272915d = customTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272915d;
        boolean R = customTextView.R();
        com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt isNeedReuseMenuItems:" + R);
        if (R) {
            boolean isAttachedToWindow = customTextView.isAttachedToWindow();
            com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt isWindowAttached:" + isAttachedToWindow);
            if (isAttachedToWindow) {
                com.tencent.mars.xlog.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt mIsInitAdapt:" + customTextView.f211595k2);
                if (customTextView.f211595k2) {
                    return;
                }
                customTextView.f211595k2 = true;
                try {
                    com.tencent.mm.ui.widget.cedit.edit.AdaptEditText adaptEditText = new com.tencent.mm.ui.widget.cedit.edit.AdaptEditText(customTextView.getContext());
                    if (customTextView.getParent() instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) customTextView.getParent()).addView(adaptEditText);
                        adaptEditText.setVisibility(8);
                        customTextView.setAdaptText(adaptEditText);
                    }
                } catch (java.lang.Throwable th6) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("cmEdit.CMTextView", "initAdapt err:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
                    fl5.b.a(7);
                }
            }
        }
    }
}
