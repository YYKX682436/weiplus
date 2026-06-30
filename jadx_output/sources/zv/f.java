package zv;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zv.f f475962d = new zv.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj;
        kotlin.jvm.internal.o.g(contact, "contact");
        zv.l lVar = zv.l.f476016a;
        return java.lang.Boolean.valueOf(contact.w2());
    }
}
