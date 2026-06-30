package fl5;

/* loaded from: classes15.dex */
public class k extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cedit.api.MMCustomEditText f263954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.widget.cedit.api.MMCustomEditText mMCustomEditText, android.view.inputmethod.InputConnection inputConnection, boolean z17) {
        super(inputConnection, z17);
        this.f263954a = mMCustomEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        fl5.f fVar = this.f263954a.L2;
        if (fVar != null) {
            fVar.a(charSequence);
        }
        return super.commitText(charSequence, i17);
    }
}
