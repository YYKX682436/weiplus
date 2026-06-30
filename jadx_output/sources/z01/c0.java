package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final z01.c0 f468972e;

    /* renamed from: f, reason: collision with root package name */
    public static final z01.c0 f468973f;

    /* renamed from: g, reason: collision with root package name */
    public static final z01.c0 f468974g;

    /* renamed from: h, reason: collision with root package name */
    public static final z01.c0 f468975h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z01.c0[] f468976i;

    /* renamed from: d, reason: collision with root package name */
    public final int f468977d;

    static {
        z01.c0 c0Var = new z01.c0("kScheduleMsgSourceType_None", 0, com.tencent.mm.R.string.p76);
        f468972e = c0Var;
        z01.c0 c0Var2 = new z01.c0("kScheduleMsgSourceType_Chat", 1, com.tencent.mm.R.string.f493818p72);
        f468973f = c0Var2;
        z01.c0 c0Var3 = new z01.c0("kScheduleMsgSourceType_Chatroom", 2, com.tencent.mm.R.string.f493819p73);
        f468974g = c0Var3;
        z01.c0 c0Var4 = new z01.c0("kScheduleMsgSourceType_SPUser", 3, com.tencent.mm.R.string.f493820p74);
        f468975h = c0Var4;
        z01.c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, new z01.c0("kScheduleMsgSourceType_Link", 4, com.tencent.mm.R.string.f493821p75), new z01.c0("kScheduleMsgSourceType_ReaderAppArticle", 5, com.tencent.mm.R.string.p77), new z01.c0("kScheduleMsgSourceType_Appbrand", 6, com.tencent.mm.R.string.f493817p71)};
        f468976i = c0VarArr;
        rz5.b.a(c0VarArr);
    }

    public c0(java.lang.String str, int i17, int i18) {
        this.f468977d = i18;
    }

    public static z01.c0 valueOf(java.lang.String str) {
        return (z01.c0) java.lang.Enum.valueOf(z01.c0.class, str);
    }

    public static z01.c0[] values() {
        return (z01.c0[]) f468976i.clone();
    }
}
