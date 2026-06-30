package jn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d1 {

    /* renamed from: f, reason: collision with root package name */
    public static final jn2.d1 f300580f;

    /* renamed from: g, reason: collision with root package name */
    public static final jn2.d1 f300581g;

    /* renamed from: h, reason: collision with root package name */
    public static final jn2.d1 f300582h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ jn2.d1[] f300583i;

    /* renamed from: d, reason: collision with root package name */
    public final int f300584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f300585e;

    static {
        jn2.d1 d1Var = new jn2.d1("SINGLE", 0, com.tencent.mm.R.raw.finder_live_outlined_music_loop_single, com.tencent.mm.R.string.otn);
        f300580f = d1Var;
        jn2.d1 d1Var2 = new jn2.d1("LIST", 1, com.tencent.mm.R.raw.finder_live_outlined_music_loop_list, com.tencent.mm.R.string.otl);
        f300581g = d1Var2;
        jn2.d1 d1Var3 = new jn2.d1("SHUFFLE", 2, com.tencent.mm.R.raw.finder_live_outlined_music_loop_shuffle, com.tencent.mm.R.string.otm);
        f300582h = d1Var3;
        jn2.d1[] d1VarArr = {d1Var, d1Var2, d1Var3};
        f300583i = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17, int i18, int i19) {
        this.f300584d = i18;
        this.f300585e = i19;
    }

    public static jn2.d1 valueOf(java.lang.String str) {
        return (jn2.d1) java.lang.Enum.valueOf(jn2.d1.class, str);
    }

    public static jn2.d1[] values() {
        return (jn2.d1[]) f300583i.clone();
    }
}
