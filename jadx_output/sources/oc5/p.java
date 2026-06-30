package oc5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ oc5.p[] f344470d;

    static {
        oc5.p[] pVarArr = {new oc5.p("CODE_ITEM_SHOW", 0, 1), new oc5.p("BOTTOM_SHEET_SHOW", 1, 2)};
        f344470d = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, int i18) {
    }

    public static oc5.p valueOf(java.lang.String str) {
        return (oc5.p) java.lang.Enum.valueOf(oc5.p.class, str);
    }

    public static oc5.p[] values() {
        return (oc5.p[]) f344470d.clone();
    }
}
