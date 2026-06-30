package qr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final qr.y f366052d;

    /* renamed from: e, reason: collision with root package name */
    public static final qr.y f366053e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ qr.y[] f366054f;

    static {
        qr.y yVar = new qr.y("Normal", 0);
        f366052d = yVar;
        qr.y yVar2 = new qr.y("AddUserData", 1);
        f366053e = yVar2;
        qr.y[] yVarArr = {yVar, yVar2};
        f366054f = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static qr.y valueOf(java.lang.String str) {
        return (qr.y) java.lang.Enum.valueOf(qr.y.class, str);
    }

    public static qr.y[] values() {
        return (qr.y[]) f366054f.clone();
    }
}
