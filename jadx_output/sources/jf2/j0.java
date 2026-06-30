package jf2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f299376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i17) {
        super(1);
        this.f299376d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jf2.o it = (jf2.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.type() == this.f299376d);
    }
}
