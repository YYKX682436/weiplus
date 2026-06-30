package q55;

/* loaded from: classes.dex */
public abstract class e extends q55.h {
    public java.lang.String h() {
        return "Int";
    }

    public java.lang.Object i() {
        if (kotlin.jvm.internal.o.b(h(), "Int")) {
            return 0;
        }
        if (kotlin.jvm.internal.o.b(h(), "Float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (!kotlin.jvm.internal.o.b(h(), "String")) {
            if (kotlin.jvm.internal.o.b(h(), "Long")) {
                return 0L;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        return "";
    }

    public java.lang.String j() {
        return "";
    }

    public java.lang.String k() {
        return "";
    }

    public java.lang.String l() {
        return b() + '_' + h();
    }

    public int m() {
        return 0;
    }
}
