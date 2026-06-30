package t45;

/* loaded from: classes9.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.e0 f415551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f415552e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f415553f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f415554g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f415555h;

    /* renamed from: i, reason: collision with root package name */
    public long f415556i;

    /* renamed from: m, reason: collision with root package name */
    public t45.g0 f415557m;

    /* renamed from: n, reason: collision with root package name */
    public int f415558n;

    /* renamed from: o, reason: collision with root package name */
    public long f415559o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.f0)) {
            return false;
        }
        t45.f0 f0Var = (t45.f0) fVar;
        return n51.f.a(this.f415551d, f0Var.f415551d) && n51.f.a(this.f415552e, f0Var.f415552e) && n51.f.a(this.f415553f, f0Var.f415553f) && n51.f.a(this.f415554g, f0Var.f415554g) && n51.f.a(this.f415555h, f0Var.f415555h) && n51.f.a(java.lang.Long.valueOf(this.f415556i), java.lang.Long.valueOf(f0Var.f415556i)) && n51.f.a(this.f415557m, f0Var.f415557m) && n51.f.a(java.lang.Integer.valueOf(this.f415558n), java.lang.Integer.valueOf(f0Var.f415558n)) && n51.f.a(java.lang.Long.valueOf(this.f415559o), java.lang.Long.valueOf(f0Var.f415559o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f415553f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.e0 e0Var = this.f415551d;
            if (e0Var != null) {
                fVar.i(1, e0Var.computeSize());
                this.f415551d.writeFields(fVar);
            }
            java.lang.String str = this.f415552e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f415554g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f415555h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f415556i);
            t45.g0 g0Var = this.f415557m;
            if (g0Var != null) {
                fVar.i(7, g0Var.computeSize());
                this.f415557m.writeFields(fVar);
            }
            fVar.e(8, this.f415558n);
            fVar.h(9, this.f415559o);
            return 0;
        }
        if (i17 == 1) {
            t45.e0 e0Var2 = this.f415551d;
            int i18 = e0Var2 != null ? 0 + b36.f.i(1, e0Var2.computeSize()) : 0;
            java.lang.String str4 = this.f415552e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList);
            java.lang.String str5 = this.f415554g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f415555h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            int h17 = g17 + b36.f.h(6, this.f415556i);
            t45.g0 g0Var2 = this.f415557m;
            if (g0Var2 != null) {
                h17 += b36.f.i(7, g0Var2.computeSize());
            }
            return h17 + b36.f.e(8, this.f415558n) + b36.f.h(9, this.f415559o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        t45.f0 f0Var = (t45.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    t45.e0 e0Var3 = new t45.e0();
                    if (bArr2 != null && bArr2.length > 0) {
                        e0Var3.parseFrom(bArr2);
                    }
                    f0Var.f415551d = e0Var3;
                }
                return 0;
            case 2:
                f0Var.f415552e = aVar2.k(intValue);
                return 0;
            case 3:
                f0Var.f415553f.add(aVar2.k(intValue));
                return 0;
            case 4:
                f0Var.f415554g = aVar2.k(intValue);
                return 0;
            case 5:
                f0Var.f415555h = aVar2.k(intValue);
                return 0;
            case 6:
                f0Var.f415556i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    t45.g0 g0Var3 = new t45.g0();
                    if (bArr3 != null && bArr3.length > 0) {
                        g0Var3.parseFrom(bArr3);
                    }
                    f0Var.f415557m = g0Var3;
                }
                return 0;
            case 8:
                f0Var.f415558n = aVar2.g(intValue);
                return 0;
            case 9:
                f0Var.f415559o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
