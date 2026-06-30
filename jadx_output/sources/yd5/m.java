package yd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final yd5.m f461118e;

    /* renamed from: f, reason: collision with root package name */
    public static final yd5.m f461119f;

    /* renamed from: g, reason: collision with root package name */
    public static final yd5.m f461120g;

    /* renamed from: h, reason: collision with root package name */
    public static final yd5.m f461121h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ yd5.m[] f461122i;

    /* renamed from: d, reason: collision with root package name */
    public final int f461123d;

    static {
        yd5.m mVar = new yd5.m("REPLY", 0, 1);
        f461118e = mVar;
        yd5.m mVar2 = new yd5.m("CLOSE", 1, 2);
        f461119f = mVar2;
        yd5.m mVar3 = new yd5.m("MARK_UNREAD", 2, 3);
        f461120g = mVar3;
        yd5.m mVar4 = new yd5.m("ENTER_CHAT", 3, 4);
        f461121h = mVar4;
        yd5.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, new yd5.m("OTHER", 4, 0)};
        f461122i = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f461123d = i18;
    }

    public static yd5.m valueOf(java.lang.String str) {
        return (yd5.m) java.lang.Enum.valueOf(yd5.m.class, str);
    }

    public static yd5.m[] values() {
        return (yd5.m[]) f461122i.clone();
    }
}
