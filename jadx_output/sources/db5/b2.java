package db5;

/* loaded from: classes5.dex */
public class b2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormInputView f228291d;

    public b2(com.tencent.mm.ui.base.MMFormInputView mMFormInputView) {
        this.f228291d = mMFormInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f228291d.f197361h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
