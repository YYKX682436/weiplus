package g12;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final g12.a f267568a = new g12.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f267569b;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        f267569b = linkedList;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_EASTER_EGG_BLOCK_LIST_STRING, null);
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str != null) {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
            synchronized (linkedList) {
                linkedList.addAll(f07);
            }
        }
    }

    public final void a() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_EASTER_EGG_BLOCK_LIST_STRING, kz5.n0.g0(f267569b, "#", null, null, 0, null, null, 62, null));
    }
}
