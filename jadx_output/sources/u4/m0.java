package u4;

/* loaded from: classes13.dex */
public final class m0 extends u4.s0 {
    public m0() {
        super(null);
    }

    @Override // u4.r0
    public float b(android.view.ViewGroup viewGroup, android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
    }
}
