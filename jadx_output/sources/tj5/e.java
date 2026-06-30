package tj5;

/* loaded from: classes8.dex */
public class e implements fl5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419840a;

    public e(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419840a = fTSEditTextView;
    }

    @Override // fl5.d
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        if (i17 != i19) {
            int i28 = com.tencent.mm.ui.search.FTSEditTextView.I;
            this.f419840a.c();
        }
    }
}
