package lm2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.pn f319379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.pn pnVar) {
        super(1);
        this.f319379d = pnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pn pnVar = (r45.pn) obj;
        r45.pn pnVar2 = this.f319379d;
        return java.lang.Boolean.valueOf((pnVar != null && (pnVar.f383204d > pnVar2.f383204d ? 1 : (pnVar.f383204d == pnVar2.f383204d ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(pnVar.f383206f, pnVar2.f383206f));
    }
}
