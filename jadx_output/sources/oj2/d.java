package oj2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.f f345760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oj2.f fVar) {
        super(1);
        this.f345760d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        oj2.f fVar = this.f345760d;
        fVar.f345765p0 = layerDrawable;
        android.view.ViewGroup micTagLayout = fVar.getMicTagLayout();
        if (micTagLayout != null) {
            micTagLayout.setBackgroundDrawable(fVar.getTagLayoutBackgroundDrawable());
        }
        return jz5.f0.f302826a;
    }
}
