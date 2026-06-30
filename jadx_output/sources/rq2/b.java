package rq2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final rq2.b f398811e;

    /* renamed from: f, reason: collision with root package name */
    public static final rq2.b f398812f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rq2.b[] f398813g;

    /* renamed from: d, reason: collision with root package name */
    public final int f398814d;

    static {
        rq2.b bVar = new rq2.b("USER_VERSION", 0, 8);
        rq2.b bVar2 = new rq2.b("STATE_REPORT_VERSION", 1, 5);
        rq2.b bVar3 = new rq2.b("RED_PRELOAD_TICK", 2, 6);
        f398811e = bVar3;
        rq2.b bVar4 = new rq2.b("RED_PRELOAD_CONSUME_TICK", 3, 7);
        f398812f = bVar4;
        rq2.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f398813g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f398814d = i18;
    }

    public static rq2.b valueOf(java.lang.String str) {
        return (rq2.b) java.lang.Enum.valueOf(rq2.b.class, str);
    }

    public static rq2.b[] values() {
        return (rq2.b[]) f398813g.clone();
    }
}
