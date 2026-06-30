package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d5 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.d5[] f327367d;

    static {
        ml2.d5[] d5VarArr = {new ml2.d5("RED_PACKET_OVER_INTERCEPT_UI", 0, 0), new ml2.d5("RED_PACKET_ONLY_PART_USER_INTERCEPT_UI", 1, 1), new ml2.d5("RED_PACKET_EXPIRED_NOTIFY", 2, 2), new ml2.d5("RED_PACKET_ONLY_WX_ROLE", 3, 3)};
        f327367d = d5VarArr;
        rz5.b.a(d5VarArr);
    }

    public d5(java.lang.String str, int i17, int i18) {
    }

    public static ml2.d5 valueOf(java.lang.String str) {
        return (ml2.d5) java.lang.Enum.valueOf(ml2.d5.class, str);
    }

    public static ml2.d5[] values() {
        return (ml2.d5[]) f327367d.clone();
    }
}
