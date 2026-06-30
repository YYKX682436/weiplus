package nj4;

/* loaded from: classes11.dex */
public class e extends nj4.i {

    /* renamed from: d, reason: collision with root package name */
    public final ai4.e f337936d;

    public e(ai4.e info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f337936d = info;
    }

    @Override // nj4.i, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(nj4.i other) {
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // xm3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean X(nj4.i other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof nj4.e)) {
            return false;
        }
        ai4.e eVar = this.f337936d;
        java.lang.String str = eVar.f5134a;
        ai4.e eVar2 = ((nj4.e) other).f337936d;
        if (!kotlin.jvm.internal.o.b(str, eVar2.f5134a) || eVar.f5135b.size() != eVar2.f5135b.size()) {
            return false;
        }
        int size = eVar.f5135b.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!kotlin.jvm.internal.o.b(((mj4.k) ((mj4.h) eVar.f5135b.get(i17))).l(), ((mj4.k) ((mj4.h) eVar2.f5135b.get(i17))).l()) || !nj4.f.a((mj4.h) eVar.f5135b.get(i17), (mj4.h) eVar2.f5135b.get(i17))) {
                return false;
            }
        }
        return true;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f337936d.f5134a;
    }
}
