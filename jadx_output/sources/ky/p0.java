package ky;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f313419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f313420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f313421g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, boolean z17, java.lang.Integer num, float f17) {
        super(1);
        this.f313418d = i17;
        this.f313419e = z17;
        this.f313420f = num;
        this.f313421g = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.imageview.WeImageView view = (com.tencent.mm.ui.widget.imageview.WeImageView) obj;
        kotlin.jvm.internal.o.g(view, "view");
        view.setImageResource(this.f313418d);
        view.setEnableColorFilter(this.f313419e);
        java.lang.Integer num = this.f313420f;
        if (num != null) {
            num.intValue();
            view.r(num.intValue(), this.f313421g);
        }
        return jz5.f0.f302826a;
    }
}
