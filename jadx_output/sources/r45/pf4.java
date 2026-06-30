package r45;

/* loaded from: classes8.dex */
public class pf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383004e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383006g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f383007h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public r45.of4 f383008i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pf4)) {
            return false;
        }
        r45.pf4 pf4Var = (r45.pf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383003d), java.lang.Integer.valueOf(pf4Var.f383003d)) && n51.f.a(this.f383004e, pf4Var.f383004e) && n51.f.a(this.f383005f, pf4Var.f383005f) && n51.f.a(this.f383006g, pf4Var.f383006g) && n51.f.a(this.f383007h, pf4Var.f383007h) && n51.f.a(this.f383008i, pf4Var.f383008i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383003d);
            java.lang.String str = this.f383004e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383005f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383006g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 2, this.f383007h);
            r45.of4 of4Var = this.f383008i;
            if (of4Var != null) {
                fVar.i(6, of4Var.computeSize());
                this.f383008i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383003d) + 0;
            java.lang.String str4 = this.f383004e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f383005f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383006g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int g17 = e17 + b36.f.g(5, 2, this.f383007h);
            r45.of4 of4Var2 = this.f383008i;
            return of4Var2 != null ? g17 + b36.f.i(6, of4Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383007h.clear();
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
        r45.pf4 pf4Var = (r45.pf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pf4Var.f383003d = aVar2.g(intValue);
                return 0;
            case 2:
                pf4Var.f383004e = aVar2.k(intValue);
                return 0;
            case 3:
                pf4Var.f383005f = aVar2.k(intValue);
                return 0;
            case 4:
                pf4Var.f383006g = aVar2.k(intValue);
                return 0;
            case 5:
                pf4Var.f383007h.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.of4 of4Var3 = new r45.of4();
                    if (bArr2 != null && bArr2.length > 0) {
                        of4Var3.parseFrom(bArr2);
                    }
                    pf4Var.f383008i = of4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
