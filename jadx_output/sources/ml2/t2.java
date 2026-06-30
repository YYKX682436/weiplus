package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ml2.t2[] f328014d;

    static {
        ml2.t2[] t2VarArr = {new ml2.t2("LIVE_ENTER_SHOP", 0, 1), new ml2.t2("LIVE_ADD_GOODS", 1, 2), new ml2.t2("LIVE_CLICK_GOODS", 2, 3), new ml2.t2("LIVE_DELETE_GOODS", 3, 4), new ml2.t2("LIVE_SET_TOP_GOODS", 4, 5), new ml2.t2("LIVE_START_PROMOTE_GOODS", 5, 7), new ml2.t2("LIVE_FINISH_PROMOTE_GOODS", 6, 8), new ml2.t2("LIVE_CLICK_PROMOTE_GOODS", 7, 9), new ml2.t2("LIVE_CLICK_SHOPPING_ADD_PRODUCT", 8, 10), new ml2.t2("LIVE_CLICK_ISSUE_COUPON", 9, 11), new ml2.t2("LIVE_CLICK_UNISSUE_COUPON", 10, 12), new ml2.t2("LIVE_RETENTION_BUBBLE_EXPOSURE", 11, 15), new ml2.t2("LIVE_RETENTION_BUBBLE_CLICK", 12, 16), new ml2.t2("LIVE_RETENTION_ITEM_EXPOSURE", 13, 17), new ml2.t2("LIVE_RETENTION_ITEM_CLICK", 14, 18), new ml2.t2("LIVE_PRODUCT_COMMENT_EXPOSED", 15, 33), new ml2.t2("LIVE_PRODUCT_COMMENT_CLICKED", 16, 34), new ml2.t2("LIVE_PRODUCT_PROMOTE_ACTIONSHEET_EXPOSED", 17, 35), new ml2.t2("LIVE_PRODUCT_PROMOTE_ACTIONSHEET_CLICKED", 18, 36)};
        f328014d = t2VarArr;
        rz5.b.a(t2VarArr);
    }

    public t2(java.lang.String str, int i17, int i18) {
    }

    public static ml2.t2 valueOf(java.lang.String str) {
        return (ml2.t2) java.lang.Enum.valueOf(ml2.t2.class, str);
    }

    public static ml2.t2[] values() {
        return (ml2.t2[]) f328014d.clone();
    }
}
