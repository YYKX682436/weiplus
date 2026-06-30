package yo0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final yo0.h f464091d;

    /* renamed from: e, reason: collision with root package name */
    public static final yo0.h f464092e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yo0.h[] f464093f;

    static {
        yo0.h hVar = new yo0.h("NETWORK", 0);
        f464091d = hVar;
        yo0.h hVar2 = new yo0.h("FILE", 1);
        f464092e = hVar2;
        yo0.h[] hVarArr = {hVar, hVar2};
        f464093f = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static yo0.h valueOf(java.lang.String str) {
        return (yo0.h) java.lang.Enum.valueOf(yo0.h.class, str);
    }

    public static yo0.h[] values() {
        return (yo0.h[]) f464093f.clone();
    }
}
