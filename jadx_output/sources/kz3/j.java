package kz3;

/* loaded from: classes15.dex */
public final class j implements db5.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f313880a;

    public j(kz3.l lVar) {
        this.f313880a = lVar;
    }

    public void a(float f17, float f18) {
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(f18);
        if (valueOf == null || valueOf2 == null) {
            return;
        }
        kz3.w wVar = this.f313880a.f313894l;
        valueOf.floatValue();
        float floatValue = valueOf2.floatValue();
        if (wVar.f313932b == null) {
            return;
        }
        wVar.d();
        kz3.s sVar = wVar.f313940j;
        float f19 = sVar.f313927b;
        sy3.a aVar = wVar.f313932b;
        if (aVar != null) {
            aVar.c();
        }
        wVar.a();
        wVar.a();
        float f27 = wVar.f313936f;
        float f28 = floatValue - f27;
        float f29 = wVar.f313938h;
        if (f28 > f29) {
            wVar.f313936f = floatValue;
            if (wVar.f313937g != 1) {
                wVar.f313937g = 1;
                kz3.m mVar = wVar.f313933c;
                if (mVar != null) {
                    ((kz3.n) mVar).a(wVar.a() ? 1 : 2);
                }
            }
        } else if (f27 - floatValue > f29) {
            wVar.f313936f = floatValue;
            if (wVar.f313937g != 2) {
                wVar.f313937g = 2;
                kz3.m mVar2 = wVar.f313933c;
                if (mVar2 != null) {
                    ((kz3.n) mVar2).b(wVar.a() ? 1 : 2);
                }
            }
        }
        if (sVar.f313926a && java.lang.Math.abs(sVar.f313927b - floatValue) <= 0.001d) {
            sVar.f313926a = false;
            wVar.f313937g = 0;
        }
        sy3.a aVar2 = wVar.f313932b;
        float c17 = aVar2 != null ? aVar2.c() : 1.0f;
        kz3.u uVar = new kz3.u(wVar);
        kz3.v vVar = new kz3.v(wVar);
        kz3.q qVar = wVar.f313934d;
        kotlin.jvm.internal.o.d(qVar);
        if (!qVar.f313923a) {
            if (floatValue - c17 > wVar.f313939i) {
                uVar.invoke();
                return;
            } else {
                vVar.invoke();
                return;
            }
        }
        kz3.q qVar2 = wVar.f313934d;
        kotlin.jvm.internal.o.d(qVar2);
        if (floatValue - qVar2.f313925c > wVar.f313939i) {
            uVar.invoke();
            return;
        }
        kz3.q qVar3 = wVar.f313934d;
        kotlin.jvm.internal.o.d(qVar3);
        if (floatValue - qVar3.f313924b > wVar.f313939i) {
            uVar.invoke();
        } else {
            vVar.invoke();
        }
    }
}
