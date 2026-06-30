package qs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ qs5.p[] f366459d;

    static {
        qs5.p[] pVarArr = {new qs5.p("NONE", 0, 0), new qs5.p("WXFLV", 1, 1), new qs5.p("SDKFLV", 2, 2), new qs5.p("SDKLEB", 3, 3)};
        f366459d = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
    }

    public static qs5.p valueOf(java.lang.String str) {
        return (qs5.p) java.lang.Enum.valueOf(qs5.p.class, str);
    }

    public static qs5.p[] values() {
        return (qs5.p[]) f366459d.clone();
    }
}
