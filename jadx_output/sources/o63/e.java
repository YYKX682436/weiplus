package o63;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o63.e[] f343196d;

    static {
        o63.e[] eVarArr = {new o63.e("ON_DEFAULT", 0, 0), new o63.e("ON_RESUME_UNKNOWN", 1, 1), new o63.e("ON_RESUME_FROM_START_ACTIVITY", 2, 2), new o63.e("ON_RESUME_FROM_NEW_INTENT", 3, 3), new o63.e("ON_RESUME_FROM_MULTITASK", 4, 4), new o63.e("ON_RESUME_FROM_APP_IN_MULTITASK", 5, 5), new o63.e("ON_RESUME_FROM_APP_IN_SCREEN_OFF", 6, 6), new o63.e("ON_RESUME_FROM_FLOATBALL", 7, 7), new o63.e("ON_RESUME_FROM_SHORTCUT", 8, 8)};
        f343196d = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
    }

    public static o63.e valueOf(java.lang.String str) {
        return (o63.e) java.lang.Enum.valueOf(o63.e.class, str);
    }

    public static o63.e[] values() {
        return (o63.e[]) f343196d.clone();
    }
}
