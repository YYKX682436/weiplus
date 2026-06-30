package o20;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o20.i f342379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o20.i iVar) {
        super(2);
        this.f342379d = iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        o20.i iVar = this.f342379d;
        if (intValue == 5) {
            iVar.f(o20.o.f342395a);
            ((q20.j) iVar.f342383b).onResume();
        }
        if (intValue == 6) {
            iVar.f(o20.n.f342394a);
            ((q20.j) iVar.f342383b).onPause();
        }
        if (intValue == 9) {
            iVar.f(o20.s.f342399a);
            ((q20.j) iVar.f342383b).onStop();
        }
        return jz5.f0.f302826a;
    }
}
