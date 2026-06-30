package ft3;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft3.g f266548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ft3.g gVar) {
        super(0);
        this.f266548d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.mutate();
        int[] iArr = {android.R.attr.state_pressed};
        ft3.g gVar = this.f266548d;
        stateListDrawable.addState(iArr, (android.graphics.drawable.GradientDrawable) ((jz5.n) gVar.f266552d).getValue());
        stateListDrawable.addState(new int[]{-16842919}, (android.graphics.drawable.GradientDrawable) ((jz5.n) gVar.f266551c).getValue());
        return stateListDrawable;
    }
}
