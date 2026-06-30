package io1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final io1.b f293458d;

    /* renamed from: e, reason: collision with root package name */
    public static final io1.b f293459e;

    /* renamed from: f, reason: collision with root package name */
    public static final io1.b f293460f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ io1.b[] f293461g;

    static {
        io1.b bVar = new io1.b("PACKAGE", 0);
        f293458d = bVar;
        io1.b bVar2 = new io1.b("DATA_ALL", 1);
        f293459e = bVar2;
        io1.b bVar3 = new io1.b("DATA_PART", 2);
        f293460f = bVar3;
        io1.b[] bVarArr = {bVar, bVar2, bVar3};
        f293461g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static io1.b valueOf(java.lang.String str) {
        return (io1.b) java.lang.Enum.valueOf(io1.b.class, str);
    }

    public static io1.b[] values() {
        return (io1.b[]) f293461g.clone();
    }
}
