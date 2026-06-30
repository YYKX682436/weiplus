package m53;

/* loaded from: classes8.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323950d;

    /* renamed from: e, reason: collision with root package name */
    public int f323951e;

    /* renamed from: f, reason: collision with root package name */
    public m53.c f323952f;

    /* renamed from: g, reason: collision with root package name */
    public m53.f5 f323953g;

    /* renamed from: h, reason: collision with root package name */
    public int f323954h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323955i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p)) {
            return false;
        }
        m53.p pVar = (m53.p) fVar;
        return n51.f.a(this.f323950d, pVar.f323950d) && n51.f.a(java.lang.Integer.valueOf(this.f323951e), java.lang.Integer.valueOf(pVar.f323951e)) && n51.f.a(this.f323952f, pVar.f323952f) && n51.f.a(this.f323953g, pVar.f323953g) && n51.f.a(java.lang.Integer.valueOf(this.f323954h), java.lang.Integer.valueOf(pVar.f323954h)) && n51.f.a(this.f323955i, pVar.f323955i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323950d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f323951e);
            m53.c cVar = this.f323952f;
            if (cVar != null) {
                fVar.i(3, cVar.computeSize());
                this.f323952f.writeFields(fVar);
            }
            m53.f5 f5Var = this.f323953g;
            if (f5Var != null) {
                fVar.i(4, f5Var.computeSize());
                this.f323953g.writeFields(fVar);
            }
            fVar.e(5, this.f323954h);
            java.lang.String str2 = this.f323955i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f323950d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f323951e);
            m53.c cVar2 = this.f323952f;
            if (cVar2 != null) {
                j17 += b36.f.i(3, cVar2.computeSize());
            }
            m53.f5 f5Var2 = this.f323953g;
            if (f5Var2 != null) {
                j17 += b36.f.i(4, f5Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(5, this.f323954h);
            java.lang.String str4 = this.f323955i;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        m53.p pVar = (m53.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pVar.f323950d = aVar2.k(intValue);
                return 0;
            case 2:
                pVar.f323951e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.c cVar3 = new m53.c();
                    if (bArr != null && bArr.length > 0) {
                        cVar3.parseFrom(bArr);
                    }
                    pVar.f323952f = cVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    m53.f5 f5Var3 = new m53.f5();
                    if (bArr2 != null && bArr2.length > 0) {
                        f5Var3.parseFrom(bArr2);
                    }
                    pVar.f323953g = f5Var3;
                }
                return 0;
            case 5:
                pVar.f323954h = aVar2.g(intValue);
                return 0;
            case 6:
                pVar.f323955i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
