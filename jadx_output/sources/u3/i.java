package u3;

/* loaded from: classes13.dex */
public final class i extends u3.r {
    public i(java.lang.String str) {
        super(str, null);
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        return ((android.view.View) obj).getTranslationY();
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        ((android.view.View) obj).setTranslationY(f17);
    }
}
