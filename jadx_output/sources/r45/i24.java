package r45;

/* loaded from: classes7.dex */
public class i24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376680d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f376681e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f376682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376683g;

    /* renamed from: h, reason: collision with root package name */
    public int f376684h;

    /* renamed from: i, reason: collision with root package name */
    public int f376685i;

    /* renamed from: m, reason: collision with root package name */
    public r45.nd7 f376686m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i24)) {
            return false;
        }
        r45.i24 i24Var = (r45.i24) fVar;
        return n51.f.a(this.BaseRequest, i24Var.BaseRequest) && n51.f.a(this.f376680d, i24Var.f376680d) && n51.f.a(this.f376681e, i24Var.f376681e) && n51.f.a(java.lang.Integer.valueOf(this.f376682f), java.lang.Integer.valueOf(i24Var.f376682f)) && n51.f.a(this.f376683g, i24Var.f376683g) && n51.f.a(java.lang.Integer.valueOf(this.f376684h), java.lang.Integer.valueOf(i24Var.f376684h)) && n51.f.a(java.lang.Integer.valueOf(this.f376685i), java.lang.Integer.valueOf(i24Var.f376685i)) && n51.f.a(this.f376686m, i24Var.f376686m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f376680d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f376681e);
            fVar.e(4, this.f376682f);
            java.lang.String str2 = this.f376683g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f376684h);
            fVar.e(8, this.f376685i);
            r45.nd7 nd7Var = this.f376686m;
            if (nd7Var != null) {
                fVar.i(9, nd7Var.computeSize());
                this.f376686m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f376680d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f376681e) + b36.f.e(4, this.f376682f);
            java.lang.String str4 = this.f376683g;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            int e17 = g17 + b36.f.e(7, this.f376684h) + b36.f.e(8, this.f376685i);
            r45.nd7 nd7Var2 = this.f376686m;
            return nd7Var2 != null ? e17 + b36.f.i(9, nd7Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376681e.clear();
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
        r45.i24 i24Var = (r45.i24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    i24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                i24Var.f376680d = aVar2.k(intValue);
                return 0;
            case 3:
                i24Var.f376681e.add(aVar2.k(intValue));
                return 0;
            case 4:
                i24Var.f376682f = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                i24Var.f376683g = aVar2.k(intValue);
                return 0;
            case 7:
                i24Var.f376684h = aVar2.g(intValue);
                return 0;
            case 8:
                i24Var.f376685i = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.parseFrom(bArr3);
                    }
                    i24Var.f376686m = nd7Var3;
                }
                return 0;
        }
    }
}
