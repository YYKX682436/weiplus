package gx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gx0.if, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cif {

    /* renamed from: d, reason: collision with root package name */
    public static final gx0.Cif f276549d;

    /* renamed from: e, reason: collision with root package name */
    public static final gx0.Cif f276550e;

    /* renamed from: f, reason: collision with root package name */
    public static final gx0.Cif f276551f;

    /* renamed from: g, reason: collision with root package name */
    public static final gx0.Cif f276552g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ gx0.Cif[] f276553h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f276554i;

    static {
        gx0.Cif cif = new gx0.Cif("OCR", 0);
        f276549d = cif;
        gx0.Cif cif2 = new gx0.Cif("RETRIEVER", 1);
        f276550e = cif2;
        gx0.Cif cif3 = new gx0.Cif("LOCAL_ASR", 2);
        f276551f = cif3;
        gx0.Cif cif4 = new gx0.Cif("REMOTE_ASR", 3);
        f276552g = cif4;
        gx0.Cif[] cifArr = {cif, cif2, cif3, cif4};
        f276553h = cifArr;
        f276554i = rz5.b.a(cifArr);
    }

    public Cif(java.lang.String str, int i17) {
    }

    public static gx0.Cif valueOf(java.lang.String str) {
        return (gx0.Cif) java.lang.Enum.valueOf(gx0.Cif.class, str);
    }

    public static gx0.Cif[] values() {
        return (gx0.Cif[]) f276553h.clone();
    }
}
