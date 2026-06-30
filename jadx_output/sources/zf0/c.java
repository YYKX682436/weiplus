package zf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ zf0.c[] f472389d;

    static {
        zf0.c[] cVarArr = {new zf0.c("SendStart", 0, 1L), new zf0.c("SendSuc", 1, 2L), new zf0.c("SendFail", 2, 3L), new zf0.c("SendResume", 3, 4L), new zf0.c("SendPause", 4, 5L)};
        f472389d = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, long j17) {
    }

    public static zf0.c valueOf(java.lang.String str) {
        return (zf0.c) java.lang.Enum.valueOf(zf0.c.class, str);
    }

    public static zf0.c[] values() {
        return (zf0.c[]) f472389d.clone();
    }
}
