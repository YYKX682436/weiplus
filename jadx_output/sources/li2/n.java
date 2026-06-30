package li2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.o f318770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(li2.o oVar) {
        super(1);
        this.f318770d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        li2.o oVar = this.f318770d;
        oVar.f318771p0 = layerDrawable;
        android.view.ViewGroup micTagLayout = oVar.getMicTagLayout();
        if (micTagLayout != null) {
            micTagLayout.setBackgroundDrawable(oVar.getTagLayoutBackgroundDrawable());
        }
        return jz5.f0.f302826a;
    }
}
