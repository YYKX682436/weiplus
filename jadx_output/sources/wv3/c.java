package wv3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final wv3.c f450050e;

    /* renamed from: f, reason: collision with root package name */
    public static final wv3.c f450051f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wv3.c[] f450052g;

    /* renamed from: d, reason: collision with root package name */
    public final int f450053d;

    static {
        wv3.c cVar = new wv3.c("RECOMMEND", 0, 1);
        f450050e = cVar;
        wv3.c cVar2 = new wv3.c("SEARCH", 1, 2);
        f450051f = cVar2;
        wv3.c[] cVarArr = {cVar, cVar2};
        f450052g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f450053d = i18;
    }

    public static wv3.c valueOf(java.lang.String str) {
        return (wv3.c) java.lang.Enum.valueOf(wv3.c.class, str);
    }

    public static wv3.c[] values() {
        return (wv3.c[]) f450052g.clone();
    }
}
