package sc2;

/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.view.View view) {
        super(1);
        this.f406228d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.drawable.Drawable background = this.f406228d.getBackground();
        kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background).setColor(intValue);
        return jz5.f0.f302826a;
    }
}
