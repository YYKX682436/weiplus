package z50;

/* loaded from: classes12.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final float a() {
        return ((java.lang.Number) ((jz5.n) z50.i.f470167b).getValue()).floatValue();
    }

    public final float b() {
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            float a17 = a();
            if (1.2f > a17) {
                return a17;
            }
            return 1.2f;
        }
        float a18 = a();
        if (1.0f > a18) {
            return a18;
        }
        return 1.0f;
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) z50.i.f470168c).getValue()).booleanValue();
    }
}
