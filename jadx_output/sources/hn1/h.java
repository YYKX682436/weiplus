package hn1;

/* loaded from: classes11.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.z f282453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hn1.s sVar, hn1.z zVar) {
        super(0);
        this.f282452d = sVar;
        this.f282453e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((java.util.LinkedList) ((jz5.n) this.f282452d.f282486h).getValue()).addFirst(new d75.c(this.f282453e));
        return jz5.f0.f302826a;
    }
}
