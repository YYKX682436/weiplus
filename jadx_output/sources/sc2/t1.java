package sc2;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.view.View view, android.view.View view2) {
        super(1);
        this.f406257d = view;
        this.f406258e = view2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.drawable.Drawable background = this.f406257d.getBackground();
        kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background).setColor(intValue);
        android.graphics.drawable.Drawable background2 = this.f406258e.getBackground();
        kotlin.jvm.internal.o.e(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background2).setColor(intValue);
        return jz5.f0.f302826a;
    }
}
