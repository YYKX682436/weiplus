package fr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fr4.o[] f265850d;

    static {
        fr4.o[] oVarArr = {new fr4.o("OpenIdentityChange", 0, 6), new fr4.o("OpenSecurity", 1, 7), new fr4.o("OpenProfile", 2, 8)};
        f265850d = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17, int i18) {
    }

    public static fr4.o valueOf(java.lang.String str) {
        return (fr4.o) java.lang.Enum.valueOf(fr4.o.class, str);
    }

    public static fr4.o[] values() {
        return (fr4.o[]) f265850d.clone();
    }
}
