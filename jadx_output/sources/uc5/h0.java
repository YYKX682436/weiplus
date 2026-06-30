package uc5;

/* loaded from: classes10.dex */
public final class h0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final uc5.d f426494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(uc5.d item) {
        super(null);
        kotlin.jvm.internal.o.g(item, "item");
        this.f426494d = item;
    }

    @Override // uc5.l0, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof uc5.k0) {
            return -((uc5.k0) other).n(this);
        }
        if (other instanceof uc5.h0) {
            com.tencent.mm.storage.f9 p17 = this.f426494d.p();
            com.tencent.mm.storage.f9 p18 = ((uc5.h0) other).f426494d.p();
            int j17 = kotlin.jvm.internal.o.j(p18.T1(), p17.T1());
            return j17 != 0 ? j17 : kotlin.jvm.internal.o.j(p18.getMsgId(), p17.getMsgId());
        }
        if ((other instanceof uc5.i0) || (other instanceof uc5.j0)) {
            return 1;
        }
        throw new jz5.j();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f426494d.h();
    }

    @Override // xm3.a
    /* renamed from: k */
    public xm3.d y0() {
        return new uc5.h0(this.f426494d.y0());
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f426494d.v();
    }

    @Override // xm3.a, xm3.d
    public java.lang.Object y0() {
        return new uc5.h0(this.f426494d.y0());
    }
}
