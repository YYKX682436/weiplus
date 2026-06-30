package fk2;

/* loaded from: classes3.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.f3 f263531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(fk2.f3 f3Var) {
        super(0);
        this.f263531d = f3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.arrow_right_regular);
        com.tencent.mm.ui.uk.f(drawable, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an));
        fk2.f3 f3Var = this.f263531d;
        drawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) f3Var.f263385m).getValue()).intValue(), ((java.lang.Number) ((jz5.n) f3Var.f263386n).getValue()).intValue());
        return drawable;
    }
}
