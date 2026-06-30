package rv4;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv4.f f400457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mv4.f fVar, java.util.List list) {
        super(1);
        this.f400457d = fVar;
        this.f400458e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        rv4.k it = (rv4.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (kotlin.jvm.internal.o.b(it.f400507e, ((rv4.k) this.f400457d).f400507e)) {
            this.f400458e.add(it);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
