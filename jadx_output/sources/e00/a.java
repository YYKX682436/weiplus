package e00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e00.a[] f245736d;

    static {
        e00.a[] aVarArr = {new e00.a("UN_KNOW", 0, 0), new e00.a("SHOP_CARD_TYPE", 1, 1), new e00.a("PRODUCT_CARD_TYPE", 2, 2), new e00.a("SHOP_WINDOW_TYPE", 3, 3), new e00.a("BULK_BUY_CARD_TYPE", 4, 4)};
        f245736d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static e00.a valueOf(java.lang.String str) {
        return (e00.a) java.lang.Enum.valueOf(e00.a.class, str);
    }

    public static e00.a[] values() {
        return (e00.a[]) f245736d.clone();
    }
}
