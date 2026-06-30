package es2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final es2.h f256364d;

    /* renamed from: e, reason: collision with root package name */
    public static final es2.h f256365e;

    /* renamed from: f, reason: collision with root package name */
    public static final es2.h f256366f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ es2.h[] f256367g;

    static {
        es2.h hVar = new es2.h("RESULT_REJECT", 0);
        f256364d = hVar;
        es2.h hVar2 = new es2.h("RESULT_AGREE", 1);
        f256365e = hVar2;
        es2.h hVar3 = new es2.h("RESULT_SUCCESS", 2);
        f256366f = hVar3;
        es2.h[] hVarArr = {hVar, hVar2, hVar3};
        f256367g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static es2.h valueOf(java.lang.String str) {
        return (es2.h) java.lang.Enum.valueOf(es2.h.class, str);
    }

    public static es2.h[] values() {
        return (es2.h[]) f256367g.clone();
    }
}
