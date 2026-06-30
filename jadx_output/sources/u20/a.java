package u20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u20.a[] f423855d;

    static {
        u20.a[] aVarArr = {new u20.a("EcsShareMsgType_EcsShareAppMsg", 0, 1), new u20.a("EcsShareMsgType_ProductCard", 1, 2), new u20.a("EcsShareMsgType_ShopWindow", 2, 3), new u20.a("EcsShareMsgType_Image", 3, 4)};
        f423855d = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
    }

    public static u20.a valueOf(java.lang.String str) {
        return (u20.a) java.lang.Enum.valueOf(u20.a.class, str);
    }

    public static u20.a[] values() {
        return (u20.a[]) f423855d.clone();
    }
}
