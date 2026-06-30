package xh4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final xh4.m f454616d;

    /* renamed from: e, reason: collision with root package name */
    public static final xh4.m f454617e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xh4.m[] f454618f;

    static {
        xh4.m mVar = new xh4.m("Success", 0);
        f454616d = mVar;
        xh4.m mVar2 = new xh4.m("Cancel", 1);
        f454617e = mVar2;
        xh4.m[] mVarArr = {mVar, mVar2};
        f454618f = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17) {
    }

    public static xh4.m valueOf(java.lang.String str) {
        return (xh4.m) java.lang.Enum.valueOf(xh4.m.class, str);
    }

    public static xh4.m[] values() {
        return (xh4.m[]) f454618f.clone();
    }
}
