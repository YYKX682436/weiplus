package ll2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ll2.b[] f319128d;

    static {
        ll2.b[] bVarArr = {new ll2.b("LIVE_SQUARE", 0, 13), new ll2.b("LIVE_PERSONAL_CENTER", 1, 14)};
        f319128d = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
    }

    public static ll2.b valueOf(java.lang.String str) {
        return (ll2.b) java.lang.Enum.valueOf(ll2.b.class, str);
    }

    public static ll2.b[] values() {
        return (ll2.b[]) f319128d.clone();
    }
}
