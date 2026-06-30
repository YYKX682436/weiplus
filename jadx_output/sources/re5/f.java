package re5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ re5.f[] f394573d;

    static {
        re5.f[] fVarArr = {new re5.f("MENU_ID_SEND_TO_FRIEND", 0), new re5.f("MENU_ID_SAVE_TO_FAV", 1), new re5.f("MENU_ID_SAVE_VIDEO_TO_LOCAL", 2)};
        f394573d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static re5.f valueOf(java.lang.String str) {
        return (re5.f) java.lang.Enum.valueOf(re5.f.class, str);
    }

    public static re5.f[] values() {
        return (re5.f[]) f394573d.clone();
    }
}
