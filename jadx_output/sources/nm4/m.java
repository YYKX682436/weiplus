package nm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final nm4.m f338500d;

    /* renamed from: e, reason: collision with root package name */
    public static final nm4.m f338501e;

    /* renamed from: f, reason: collision with root package name */
    public static final nm4.m f338502f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nm4.m[] f338503g;

    static {
        nm4.m mVar = new nm4.m("NONE", 0);
        f338500d = mVar;
        nm4.m mVar2 = new nm4.m("CLOSED", 1);
        f338501e = mVar2;
        nm4.m mVar3 = new nm4.m("LIVE", 2);
        f338502f = mVar3;
        nm4.m[] mVarArr = {mVar, mVar2, mVar3};
        f338503g = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static nm4.m valueOf(java.lang.String str) {
        return (nm4.m) java.lang.Enum.valueOf(nm4.m.class, str);
    }

    public static nm4.m[] values() {
        return (nm4.m[]) f338503g.clone();
    }
}
