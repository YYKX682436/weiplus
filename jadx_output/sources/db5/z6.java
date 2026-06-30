package db5;

/* loaded from: classes11.dex */
public class z6 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public int f228595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228596e;

    public z6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228596e = mMTagPanel;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int f17 = com.tencent.mm.ui.tools.v4.f(spanned.toString()) + com.tencent.mm.ui.tools.v4.f(charSequence.toString());
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228596e;
        if (i27 > i19) {
            int i28 = f17 - (i27 - i19);
            if (i28 > 36) {
                mMTagPanel.f197580i = true;
                this.f228595d = i28 - 36;
            } else {
                mMTagPanel.f197580i = false;
            }
        } else if (f17 > 36) {
            mMTagPanel.f197580i = true;
            this.f228595d = f17 - 36;
        } else {
            mMTagPanel.f197580i = false;
        }
        if (mMTagPanel.H && 1 == this.f228595d && charSequence.equals("\n")) {
            this.f228595d = 0;
        }
        if (mMTagPanel.C != null) {
            mMTagPanel.post(new db5.y6(this));
        }
        return f17 > 256 ? "" : charSequence;
    }
}
