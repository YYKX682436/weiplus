package vx3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final vx3.d f441273d;

    /* renamed from: e, reason: collision with root package name */
    public static final vx3.d f441274e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vx3.d[] f441275f;

    static {
        vx3.d dVar = new vx3.d("START_SOUND", 0);
        f441273d = dVar;
        vx3.d dVar2 = new vx3.d("ENDING_SOUND", 1);
        vx3.d dVar3 = new vx3.d("BAD_NET_SOUND", 2);
        vx3.d dVar4 = new vx3.d("CLOSE_SOUND", 3);
        f441274e = dVar4;
        vx3.d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f441275f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static vx3.d valueOf(java.lang.String str) {
        return (vx3.d) java.lang.Enum.valueOf(vx3.d.class, str);
    }

    public static vx3.d[] values() {
        return (vx3.d[]) f441275f.clone();
    }
}
