package rh;

/* loaded from: classes12.dex */
public class e extends rh.o2 {
    public e(rh.f fVar, rh.f fVar2, rh.f fVar3) {
        super(fVar2, fVar3);
    }

    @Override // rh.o2
    public rh.d3 a() {
        int i17;
        int i18;
        rh.f fVar = new rh.f();
        rh.f fVar2 = (rh.f) this.f395485b;
        fVar.f395374d = fVar2.f395374d;
        fVar.f395375e = fVar2.f395375e;
        long j17 = fVar2.f395376f;
        rh.f fVar3 = (rh.f) this.f395484a;
        fVar.f395376f = j17 - fVar3.f395376f;
        fVar.f395377g = rh.p2.a(fVar3.f395377g, fVar2.f395377g);
        fVar.f395381k = fVar2.f395381k;
        int i19 = fVar3.f395378h;
        if (i19 == 1 || (i18 = fVar2.f395378h) == 1) {
            fVar.f395378h = 1;
        } else if (i19 == 3 && i18 == 3) {
            fVar.f395378h = 3;
        } else {
            fVar.f395378h = 2;
        }
        int i27 = fVar3.f395379i;
        if (i27 == 1 || (i17 = fVar2.f395379i) == 1) {
            fVar.f395379i = 1;
        } else if (i27 == 3 && i17 == 3) {
            fVar.f395379i = 3;
        } else if (i27 == 4 && i17 == 4) {
            fVar.f395379i = 3;
        } else {
            fVar.f395379i = 2;
        }
        fVar.f395380j = fVar2.f395380j;
        return fVar;
    }
}
