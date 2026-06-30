package sc5;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.i f406581a = new sc5.i();

    public final boolean a(com.tencent.mm.storage.f9 msg) {
        v05.a aVar;
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = false;
        if (msg.I0() <= 0) {
            return false;
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        if (k17 != null && (aVar = (v05.a) k17.getCustom(k17.f432315e + 8)) != null && aVar.t() == msg.I0()) {
            z17 = true;
        }
        return !z17;
    }
}
