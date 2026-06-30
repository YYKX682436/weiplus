package pk1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pk1.d0[] f355438d;

    static {
        pk1.d0[] d0VarArr = {new pk1.d0("SUCCESS", 0, 0), new pk1.d0("CACHED_COMPLETE", 1, 1), new pk1.d0("CANCEL_BY_PLAYING", 2, 2), new pk1.d0("MEDIA_IS_DOWNLOADING", 3, -21006)};
        f355438d = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, int i18) {
    }

    public static pk1.d0 valueOf(java.lang.String str) {
        return (pk1.d0) java.lang.Enum.valueOf(pk1.d0.class, str);
    }

    public static pk1.d0[] values() {
        return (pk1.d0[]) f355438d.clone();
    }
}
