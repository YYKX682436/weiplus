package jb5;

/* loaded from: classes13.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.blur.mask.AbstractBlurMaskView f298863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.blur.mask.AbstractBlurMaskView abstractBlurMaskView) {
        super(1);
        this.f298863d = abstractBlurMaskView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Canvas c17 = (android.graphics.Canvas) obj;
        kotlin.jvm.internal.o.g(c17, "c");
        super/*android.view.View*/.draw(c17);
        return jz5.f0.f302826a;
    }
}
