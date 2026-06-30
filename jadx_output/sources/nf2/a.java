package nf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final nf2.a f336648e;

    /* renamed from: f, reason: collision with root package name */
    public static final nf2.a f336649f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nf2.a[] f336650g;

    /* renamed from: d, reason: collision with root package name */
    public final int f336651d;

    static {
        nf2.a aVar = new nf2.a("HORIZONTAL", 0, com.tencent.mm.R.string.os9, com.tencent.mm.R.raw.finder_live_lyrics_layout_horizontal);
        f336648e = aVar;
        nf2.a aVar2 = new nf2.a("VERTICAL", 1, com.tencent.mm.R.string.osa, com.tencent.mm.R.raw.finder_live_lyrics_layout_horizontal);
        f336649f = aVar2;
        nf2.a[] aVarArr = {aVar, aVar2};
        f336650g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18, int i19) {
        this.f336651d = i18;
    }

    public static nf2.a valueOf(java.lang.String str) {
        return (nf2.a) java.lang.Enum.valueOf(nf2.a.class, str);
    }

    public static nf2.a[] values() {
        return (nf2.a[]) f336650g.clone();
    }
}
