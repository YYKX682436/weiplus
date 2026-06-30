package kc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kc2.l[] f306452d;

    static {
        kc2.l[] lVarArr = {new kc2.l("SWITCH_ON", 0, 1), new kc2.l("SWITCH_OFF", 1, -1)};
        f306452d = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
    }

    public static kc2.l valueOf(java.lang.String str) {
        return (kc2.l) java.lang.Enum.valueOf(kc2.l.class, str);
    }

    public static kc2.l[] values() {
        return (kc2.l[]) f306452d.clone();
    }
}
