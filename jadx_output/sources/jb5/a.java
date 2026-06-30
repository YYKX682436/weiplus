package jb5;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView f298861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView abstractBlurMaskBackgroundView) {
        super(1);
        this.f298861d = abstractBlurMaskBackgroundView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Canvas c17 = (android.graphics.Canvas) obj;
        kotlin.jvm.internal.o.g(c17, "c");
        super/*android.view.View*/.dispatchDraw(c17);
        return jz5.f0.f302826a;
    }
}
