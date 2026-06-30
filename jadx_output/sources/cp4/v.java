package cp4;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.x f221084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f221086f;

    public v(cp4.x xVar, int i17, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f221084d = xVar;
        this.f221085e = i17;
        this.f221086f = mMEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        cp4.x xVar = this.f221084d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f221086f;
        if (!z17) {
            mMEditText.removeTextChangedListener(xVar.f221091f);
            return;
        }
        cp4.u uVar = xVar.f221091f;
        uVar.f221081d = this.f221085e;
        mMEditText.addTextChangedListener(uVar);
    }
}
