package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.m f410475d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.m f410476e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ so2.m[] f410477f;

    static {
        so2.m mVar = new so2.m("NORMAL", 0);
        f410475d = mVar;
        so2.m mVar2 = new so2.m("AT_CONTACT", 1);
        f410476e = mVar2;
        so2.m[] mVarArr = {mVar, mVar2};
        f410477f = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static so2.m valueOf(java.lang.String str) {
        return (so2.m) java.lang.Enum.valueOf(so2.m.class, str);
    }

    public static so2.m[] values() {
        return (so2.m[]) f410477f.clone();
    }
}
