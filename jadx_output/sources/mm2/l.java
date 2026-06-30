package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.l f329203d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.l f329204e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mm2.l[] f329205f;

    static {
        mm2.l lVar = new mm2.l("IDLE", 0, 1);
        f329203d = lVar;
        mm2.l lVar2 = new mm2.l("PLAYING", 1, 2);
        f329204e = lVar2;
        mm2.l[] lVarArr = {lVar, lVar2, new mm2.l("COMPLETE", 2, 3)};
        f329205f = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
    }

    public static mm2.l valueOf(java.lang.String str) {
        return (mm2.l) java.lang.Enum.valueOf(mm2.l.class, str);
    }

    public static mm2.l[] values() {
        return (mm2.l[]) f329205f.clone();
    }
}
