package ef;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.widget.input.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef.m f252117d;

    public g(ef.m mVar) {
        this.f252117d = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        ef.m mVar = this.f252117d;
        ef.e a17 = mVar.a(null);
        if (a17 != null) {
            android.widget.EditText editText = mVar.f252127d;
            if (editText != null) {
                if (z17) {
                    a17.h(editText);
                } else {
                    a17.e(editText);
                }
            }
            a17.d(z17 ? mVar.f252130g : 0);
        }
        mVar.e(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        int i18;
        ef.m mVar = this.f252117d;
        boolean z17 = (i17 == 0 || (i18 = mVar.f252130g) == 0 || i17 == i18) ? false : true;
        mVar.f252130g = i17;
        if (z17) {
            mVar.e(null);
        }
        ef.e a17 = mVar.a(null);
        if (a17 != null) {
            a17.d(i17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public int getHeight() {
        return this.f252117d.f252130g;
    }
}
