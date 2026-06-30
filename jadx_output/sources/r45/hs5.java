package r45;

/* loaded from: classes11.dex */
public class hs5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376429d;

    /* renamed from: e, reason: collision with root package name */
    public int f376430e;

    /* renamed from: f, reason: collision with root package name */
    public int f376431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376432g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376433h;

    /* renamed from: i, reason: collision with root package name */
    public int f376434i;

    /* renamed from: m, reason: collision with root package name */
    public r45.kk0 f376435m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fn0 f376436n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hs5)) {
            return false;
        }
        r45.hs5 hs5Var = (r45.hs5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376429d), java.lang.Integer.valueOf(hs5Var.f376429d)) && n51.f.a(java.lang.Integer.valueOf(this.f376430e), java.lang.Integer.valueOf(hs5Var.f376430e)) && n51.f.a(java.lang.Integer.valueOf(this.f376431f), java.lang.Integer.valueOf(hs5Var.f376431f)) && n51.f.a(this.f376432g, hs5Var.f376432g) && n51.f.a(this.f376433h, hs5Var.f376433h) && n51.f.a(java.lang.Integer.valueOf(this.f376434i), java.lang.Integer.valueOf(hs5Var.f376434i)) && n51.f.a(this.f376435m, hs5Var.f376435m) && n51.f.a(this.f376436n, hs5Var.f376436n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376429d);
            fVar.e(2, this.f376430e);
            fVar.e(3, this.f376431f);
            java.lang.String str = this.f376432g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f376433h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f376434i);
            r45.kk0 kk0Var = this.f376435m;
            if (kk0Var != null) {
                fVar.i(7, kk0Var.computeSize());
                this.f376435m.writeFields(fVar);
            }
            r45.fn0 fn0Var = this.f376436n;
            if (fn0Var != null) {
                fVar.i(8, fn0Var.computeSize());
                this.f376436n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376429d) + 0 + b36.f.e(2, this.f376430e) + b36.f.e(3, this.f376431f);
            java.lang.String str3 = this.f376432g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f376433h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            int e18 = e17 + b36.f.e(6, this.f376434i);
            r45.kk0 kk0Var2 = this.f376435m;
            if (kk0Var2 != null) {
                e18 += b36.f.i(7, kk0Var2.computeSize());
            }
            r45.fn0 fn0Var2 = this.f376436n;
            return fn0Var2 != null ? e18 + b36.f.i(8, fn0Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.hs5 hs5Var = (r45.hs5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hs5Var.f376429d = aVar2.g(intValue);
                return 0;
            case 2:
                hs5Var.f376430e = aVar2.g(intValue);
                return 0;
            case 3:
                hs5Var.f376431f = aVar2.g(intValue);
                return 0;
            case 4:
                hs5Var.f376432g = aVar2.k(intValue);
                return 0;
            case 5:
                hs5Var.f376433h = aVar2.k(intValue);
                return 0;
            case 6:
                hs5Var.f376434i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.kk0 kk0Var3 = new r45.kk0();
                    if (bArr != null && bArr.length > 0) {
                        kk0Var3.parseFrom(bArr);
                    }
                    hs5Var.f376435m = kk0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.fn0 fn0Var3 = new r45.fn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fn0Var3.parseFrom(bArr2);
                    }
                    hs5Var.f376436n = fn0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
