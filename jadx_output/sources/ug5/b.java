package ug5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ug5.b f427581d;

    /* renamed from: e, reason: collision with root package name */
    public static final ug5.b f427582e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ug5.b[] f427583f;

    static {
        ug5.b bVar = new ug5.b("ENTER", 0);
        f427581d = bVar;
        ug5.b bVar2 = new ug5.b("EXIT", 1);
        f427582e = bVar2;
        ug5.b[] bVarArr = {bVar, bVar2};
        f427583f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ug5.b valueOf(java.lang.String str) {
        return (ug5.b) java.lang.Enum.valueOf(ug5.b.class, str);
    }

    public static ug5.b[] values() {
        return (ug5.b[]) f427583f.clone();
    }
}
