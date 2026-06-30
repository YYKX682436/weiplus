package ix3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ix3.m4[] f295497d;

    static {
        ix3.m4[] m4VarArr = {new ix3.m4("expired_create_time", 0), new ix3.m4("delete_thumb_video", 1), new ix3.m4("delete_original_video", 2), new ix3.m4("expired_thumb_video", 3), new ix3.m4("expired_original_video", 4), new ix3.m4("error_download_thumb_video", 5), new ix3.m4("error_download_original_video", 6), new ix3.m4("check_compress_need", 7)};
        f295497d = m4VarArr;
        rz5.b.a(m4VarArr);
    }

    public m4(java.lang.String str, int i17) {
    }

    public static ix3.m4 valueOf(java.lang.String str) {
        return (ix3.m4) java.lang.Enum.valueOf(ix3.m4.class, str);
    }

    public static ix3.m4[] values() {
        return (ix3.m4[]) f295497d.clone();
    }
}
