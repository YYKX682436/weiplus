package xc2;

/* loaded from: classes2.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f453265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f453266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f453267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f453268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.o0 f453269h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, boolean z17, int i17, android.view.View view, xc2.o0 o0Var) {
        super(0);
        this.f453265d = weImageView;
        this.f453266e = z17;
        this.f453267f = i17;
        this.f453268g = view;
        this.f453269h = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f453265d;
        weImageView.clearColorFilter();
        weImageView.setLayerPaint(null);
        weImageView.setIconColor(0);
        if (this.f453266e) {
            int i17 = this.f453267f;
            if (i17 != 0) {
                weImageView.setIconColor(i17);
            }
            android.view.View view = this.f453268g;
            if (view != null) {
                view.setBackground(null);
            }
        } else {
            xc2.y2.f453343a.s0(weImageView, this.f453269h);
        }
        return jz5.f0.f302826a;
    }
}
