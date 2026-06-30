package zv;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zv.d f475927d = new zv.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj;
        kotlin.jvm.internal.o.g(contact, "contact");
        zv.l lVar = zv.l.f476016a;
        return java.lang.Boolean.valueOf(!contact.w2());
    }
}
