package pa5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pa5.q[] f353109d;

    static {
        pa5.q[] qVarArr = {new pa5.q("TRANSLATION_X", 0, u3.s.f424217l), new pa5.q("TRANSLATION_Y", 1, u3.s.f424218m), new pa5.q("SCALE_X", 2, u3.s.f424219n), new pa5.q("SCALE_Y", 3, u3.s.f424220o), new pa5.q("ROTATION", 4, u3.s.f424221p), new pa5.q("ROTATION_X", 5, u3.s.f424222q), new pa5.q("ROTATION_Y", 6, u3.s.f424223r), new pa5.q("ALPHA", 7, u3.s.f424224s)};
        f353109d = qVarArr;
        rz5.b.a(qVarArr);
    }

    public q(java.lang.String str, int i17, u3.r rVar) {
    }

    public static pa5.q valueOf(java.lang.String str) {
        return (pa5.q) java.lang.Enum.valueOf(pa5.q.class, str);
    }

    public static pa5.q[] values() {
        return (pa5.q[]) f353109d.clone();
    }
}
