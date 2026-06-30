package vt3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final vt3.m f440011e;

    /* renamed from: f, reason: collision with root package name */
    public static final vt3.m f440012f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vt3.m[] f440013g;

    /* renamed from: d, reason: collision with root package name */
    public final int f440014d;

    static {
        vt3.m mVar = new vt3.m("NONE", 0, 1);
        f440011e = mVar;
        vt3.m mVar2 = new vt3.m("NORMAL", 1, 2);
        f440012f = mVar2;
        vt3.m[] mVarArr = {mVar, mVar2};
        f440013g = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f440014d = i18;
    }

    public static vt3.m valueOf(java.lang.String str) {
        return (vt3.m) java.lang.Enum.valueOf(vt3.m.class, str);
    }

    public static vt3.m[] values() {
        return (vt3.m[]) f440013g.clone();
    }
}
