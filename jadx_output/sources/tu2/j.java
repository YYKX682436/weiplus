package tu2;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.j f422143d = new tu2.j();

    public j() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity == null) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "退出页面再重试下", 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("TITLE", "通用选择器");
            intent.putExtra("BIZ_SCENE", 1);
            byte[] bytes = "{\"status_id\":\"1000\",\"status_tags\":[\"1888\"],\"status_word\":\"美滋滋\",\"status_description\":\"#1888\"}".getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            intent.putExtra("EXT_BUFF", bytes);
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).yj(activity, intent, 0);
        }
        return jz5.f0.f302826a;
    }
}
