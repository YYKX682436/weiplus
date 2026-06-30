package nj4;

/* loaded from: classes11.dex */
public final class c extends nj4.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f337930e;

    /* renamed from: f, reason: collision with root package name */
    public final nj4.d f337931f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f337932g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f337933h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ai4.e info, int i17, nj4.d headerData) {
        super(info);
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(headerData, "headerData");
        this.f337930e = i17;
        this.f337931f = headerData;
        this.f337932g = "";
        java.util.Iterator it = info.f5135b.iterator();
        while (it.hasNext()) {
            this.f337932g += ((mj4.k) ((mj4.h) it.next())).o() + ',';
        }
        this.f337933h = info.f5134a + '_' + this.f337930e + '_' + this.f337932g;
    }

    @Override // nj4.e, nj4.i, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // nj4.e, xm3.a, in5.c
    public int h() {
        return 6;
    }

    @Override // nj4.e, xm3.d
    /* renamed from: o */
    public boolean X(nj4.i other) {
        kotlin.jvm.internal.o.g(other, "other");
        boolean z17 = other instanceof nj4.c;
        if (z17) {
            ai4.e eVar = this.f337936d;
            int size = eVar.f5135b.size();
            ai4.e eVar2 = ((nj4.c) other).f337936d;
            if (size != eVar2.f5135b.size()) {
                return false;
            }
            int size2 = eVar.f5135b.size();
            for (int i17 = 0; i17 < size2; i17++) {
                if (!kotlin.jvm.internal.o.b(((mj4.k) ((mj4.h) eVar.f5135b.get(i17))).l(), ((mj4.k) ((mj4.h) eVar2.f5135b.get(i17))).l()) || !nj4.f.a((mj4.h) eVar.f5135b.get(i17), (mj4.h) eVar2.f5135b.get(i17))) {
                    return false;
                }
            }
        }
        return z17 && kotlin.jvm.internal.o.b(other.v(), this.f337933h);
    }

    @Override // nj4.e, xm3.d
    public java.lang.String v() {
        return this.f337933h;
    }
}
