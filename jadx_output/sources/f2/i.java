package f2;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.k f258804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f2.k kVar) {
        super(1);
        this.f258804d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f2.c0 it = (f2.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.f258794c;
        int i18 = it.f258795d;
        java.lang.Object obj2 = it.f258796e;
        f2.r fontWeight = it.f258793b;
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        return this.f258804d.a(new f2.c0(null, fontWeight, i17, i18, obj2, null)).getValue();
    }
}
