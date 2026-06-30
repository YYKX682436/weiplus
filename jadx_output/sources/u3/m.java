package u3;

/* loaded from: classes13.dex */
public final class m extends u3.r {
    public m(java.lang.String str) {
        super(str, null);
    }

    @Override // u3.t
    public float a(java.lang.Object obj) {
        return ((android.view.View) obj).getRotationX();
    }

    @Override // u3.t
    public void b(java.lang.Object obj, float f17) {
        ((android.view.View) obj).setRotationX(f17);
    }
}
