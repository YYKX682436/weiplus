package gg1;

/* loaded from: classes7.dex */
public final class h1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gg1.k1 f271567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.lang.Object obj, gg1.k1 k1Var) {
        super(obj);
        this.f271567b = k1Var;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        x91.h hVar = (x91.h) obj2;
        if (kotlin.jvm.internal.o.b((x91.h) obj, hVar) || hVar.f452647a == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new gg1.l1(com.tencent.mm.sdk.platformtools.o4.L(), hVar, 2));
        java.util.Iterator it = this.f271567b.f271591d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            gg1.i iVar = (gg1.i) it.next();
            iVar.f271569b = false;
            iVar.f271571d = false;
            x91.c cVar = iVar.f271568a.f452647a;
            java.lang.String str = cVar != null ? cVar.f452641i : null;
            x91.c cVar2 = this.f271567b.b().f452647a;
            if (kotlin.jvm.internal.o.b(str, cVar2 != null ? cVar2.f452641i : null)) {
                iVar.f271571d = true;
                iVar.f271570c = false;
                iVar.f271569b = true;
            }
        }
        for (gg1.i iVar2 : this.f271567b.f271592e) {
            iVar2.f271569b = false;
            iVar2.f271571d = false;
            x91.c cVar3 = iVar2.f271568a.f452647a;
            java.lang.String str2 = cVar3 != null ? cVar3.f452641i : null;
            x91.c cVar4 = this.f271567b.b().f452647a;
            if (kotlin.jvm.internal.o.b(str2, cVar4 != null ? cVar4.f452641i : null)) {
                iVar2.f271571d = true;
                iVar2.f271570c = false;
                iVar2.f271569b = true;
            }
        }
        yz5.a aVar = this.f271567b.f271593f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
