package or;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final or.b f347422d = new or.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        or.a it = (or.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("\"pic_index\":" + it.f347418a);
        arrayList.add("\"edit_sticker_source\":" + it.f347419b);
        arrayList.add("\"edit_sticker_type\":" + it.f347420c);
        java.lang.Integer num = it.f347421d;
        if (num != null) {
            arrayList.add("\"upload_succ\":" + num.intValue());
        }
        return "{" + kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null) + '}';
    }
}
