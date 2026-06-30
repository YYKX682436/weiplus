package r45;

/* loaded from: classes9.dex */
public class k4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f378345d;

    /* renamed from: e, reason: collision with root package name */
    public long f378346e;

    /* renamed from: f, reason: collision with root package name */
    public int f378347f;

    /* renamed from: g, reason: collision with root package name */
    public int f378348g;

    /* renamed from: h, reason: collision with root package name */
    public int f378349h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f378350i;

    /* renamed from: m, reason: collision with root package name */
    public int f378351m;

    /* renamed from: n, reason: collision with root package name */
    public int f378352n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k4)) {
            return false;
        }
        r45.k4 k4Var = (r45.k4) fVar;
        return n51.f.a(this.f378345d, k4Var.f378345d) && n51.f.a(java.lang.Long.valueOf(this.f378346e), java.lang.Long.valueOf(k4Var.f378346e)) && n51.f.a(java.lang.Integer.valueOf(this.f378347f), java.lang.Integer.valueOf(k4Var.f378347f)) && n51.f.a(java.lang.Integer.valueOf(this.f378348g), java.lang.Integer.valueOf(k4Var.f378348g)) && n51.f.a(java.lang.Integer.valueOf(this.f378349h), java.lang.Integer.valueOf(k4Var.f378349h)) && n51.f.a(this.f378350i, k4Var.f378350i) && n51.f.a(java.lang.Integer.valueOf(this.f378351m), java.lang.Integer.valueOf(k4Var.f378351m)) && n51.f.a(java.lang.Integer.valueOf(this.f378352n), java.lang.Integer.valueOf(k4Var.f378352n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f378345d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f378345d.writeFields(fVar);
            }
            fVar.h(2, this.f378346e);
            fVar.e(3, this.f378347f);
            fVar.e(4, this.f378348g);
            fVar.e(5, this.f378349h);
            r45.du5 du5Var2 = this.f378350i;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.computeSize());
                this.f378350i.writeFields(fVar);
            }
            fVar.e(7, this.f378351m);
            fVar.e(8, this.f378352n);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f378345d;
            int i18 = (du5Var3 != null ? 0 + b36.f.i(1, du5Var3.computeSize()) : 0) + b36.f.h(2, this.f378346e) + b36.f.e(3, this.f378347f) + b36.f.e(4, this.f378348g) + b36.f.e(5, this.f378349h);
            r45.du5 du5Var4 = this.f378350i;
            if (du5Var4 != null) {
                i18 += b36.f.i(6, du5Var4.computeSize());
            }
            return i18 + b36.f.e(7, this.f378351m) + b36.f.e(8, this.f378352n);
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
        r45.k4 k4Var = (r45.k4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    k4Var.f378345d = du5Var5;
                }
                return 0;
            case 2:
                k4Var.f378346e = aVar2.i(intValue);
                return 0;
            case 3:
                k4Var.f378347f = aVar2.g(intValue);
                return 0;
            case 4:
                k4Var.f378348g = aVar2.g(intValue);
                return 0;
            case 5:
                k4Var.f378349h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    k4Var.f378350i = du5Var6;
                }
                return 0;
            case 7:
                k4Var.f378351m = aVar2.g(intValue);
                return 0;
            case 8:
                k4Var.f378352n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
