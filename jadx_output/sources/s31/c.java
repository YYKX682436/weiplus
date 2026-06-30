package s31;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s31.e f402432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s31.e eVar) {
        super(0);
        this.f402432d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.mutate();
        int[] iArr = {android.R.attr.state_pressed};
        s31.e eVar = this.f402432d;
        stateListDrawable.addState(iArr, (android.graphics.drawable.GradientDrawable) ((jz5.n) eVar.f402437c).getValue());
        stateListDrawable.addState(new int[]{-16842919}, (android.graphics.drawable.GradientDrawable) ((jz5.n) eVar.f402436b).getValue());
        return stateListDrawable;
    }
}
