package es2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.util.LinkedList linkedList) {
        super(1);
        this.f256412d = str;
        this.f256413e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = this.f256412d;
        boolean z17 = str == null || kotlin.jvm.internal.o.b(it.f222092i2, str);
        if (z17) {
            this.f256413e.add(it);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
