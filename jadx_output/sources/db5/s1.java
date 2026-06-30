package db5;

/* loaded from: classes5.dex */
public class s1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMClearEditText f228502d;

    public s1(com.tencent.mm.ui.base.MMClearEditText mMClearEditText) {
        this.f228502d = mMClearEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f228502d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = mMClearEditText.f197328g;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        mMClearEditText.b();
    }
}
