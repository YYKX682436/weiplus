package ww5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final ww5.c f450396d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ww5.c[] f450397e;

    static {
        ww5.c cVar = new ww5.c("Surface", 0);
        ww5.c cVar2 = new ww5.c("Texture", 1);
        f450396d = cVar2;
        ww5.c[] cVarArr = {cVar, cVar2};
        f450397e = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static ww5.c valueOf(java.lang.String str) {
        return (ww5.c) java.lang.Enum.valueOf(ww5.c.class, str);
    }

    public static ww5.c[] values() {
        return (ww5.c[]) f450397e.clone();
    }
}
