package kw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final kw0.b f312791e;

    /* renamed from: f, reason: collision with root package name */
    public static final kw0.b f312792f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kw0.b[] f312793g;

    /* renamed from: d, reason: collision with root package name */
    public final int f312794d;

    static {
        kw0.b bVar = new kw0.b("FancyText", 0, 2);
        f312791e = bVar;
        kw0.b bVar2 = new kw0.b("WhenWhere", 1, 3);
        f312792f = bVar2;
        kw0.b[] bVarArr = {bVar, bVar2, new kw0.b("Emotion", 2, com.tencent.maas.material.g.values().length + 1)};
        f312793g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f312794d = i18;
    }

    public static kw0.b valueOf(java.lang.String str) {
        return (kw0.b) java.lang.Enum.valueOf(kw0.b.class, str);
    }

    public static kw0.b[] values() {
        return (kw0.b[]) f312793g.clone();
    }
}
