package ds2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f242899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, java.util.LinkedList linkedList) {
        super(1);
        this.f242898d = str;
        this.f242899e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f242898d;
        boolean z17 = str == null || kotlin.jvm.internal.o.b(it.f222092i2, str);
        if (z17) {
            this.f242899e.add(it);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
