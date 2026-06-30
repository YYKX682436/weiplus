package yl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final yl2.h f463014d;

    /* renamed from: e, reason: collision with root package name */
    public static final yl2.h f463015e;

    /* renamed from: f, reason: collision with root package name */
    public static final yl2.h f463016f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yl2.h[] f463017g;

    static {
        yl2.h hVar = new yl2.h("SUCCESS", 0);
        f463014d = hVar;
        yl2.h hVar2 = new yl2.h("FAILED", 1);
        f463015e = hVar2;
        yl2.h hVar3 = new yl2.h("NEED_REFRESH", 2);
        f463016f = hVar3;
        yl2.h[] hVarArr = {hVar, hVar2, hVar3};
        f463017g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static yl2.h valueOf(java.lang.String str) {
        return (yl2.h) java.lang.Enum.valueOf(yl2.h.class, str);
    }

    public static yl2.h[] values() {
        return (yl2.h[]) f463017g.clone();
    }
}
