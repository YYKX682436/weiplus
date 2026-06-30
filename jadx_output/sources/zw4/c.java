package zw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zw4.c[] f476894d;

    static {
        zw4.c[] cVarArr = {new zw4.c("None", 0, 0), new zw4.c("ClosePrefetchKeepA8key", 1, 1), new zw4.c("ClosePrefetchAndA8key", 2, 2)};
        f476894d = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
    }

    public static zw4.c valueOf(java.lang.String str) {
        return (zw4.c) java.lang.Enum.valueOf(zw4.c.class, str);
    }

    public static zw4.c[] values() {
        return (zw4.c[]) f476894d.clone();
    }
}
