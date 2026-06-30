package df2;

/* loaded from: classes3.dex */
public final class cz implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f229923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f229924e;

    public cz(df2.lz lzVar, int i17) {
        this.f229923d = lzVar;
        this.f229924e = i17;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.lz lzVar = this.f229923d;
        android.widget.TextView c76 = lzVar.c7();
        if (c76 != null) {
            c76.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) lzVar.findViewById(com.tencent.mm.R.id.f485447hp5);
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = (android.widget.TextView) lzVar.findViewById(com.tencent.mm.R.id.f485447hp5);
        if (textView2 == null) {
            return;
        }
        textView2.setText("+" + this.f229924e);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        df2.lz lzVar = this.f229923d;
        android.widget.TextView c76 = lzVar.c7();
        if (c76 != null) {
            c76.setVisibility(0);
        }
        android.widget.TextView textView = (android.widget.TextView) lzVar.findViewById(com.tencent.mm.R.id.f485447hp5);
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView a76 = lzVar.a7();
        if (a76 != null) {
            a76.i(this);
        }
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
