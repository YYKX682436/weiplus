package t45;

/* loaded from: classes4.dex */
public class y extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f415657d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f415658e;

    /* renamed from: f, reason: collision with root package name */
    public int f415659f;

    /* renamed from: g, reason: collision with root package name */
    public int f415660g;

    /* renamed from: h, reason: collision with root package name */
    public t45.k0 f415661h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f415662i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.y)) {
            return false;
        }
        t45.y yVar = (t45.y) fVar;
        return n51.f.a(this.BaseRequest, yVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f415657d), java.lang.Integer.valueOf(yVar.f415657d)) && n51.f.a(this.f415658e, yVar.f415658e) && n51.f.a(java.lang.Integer.valueOf(this.f415659f), java.lang.Integer.valueOf(yVar.f415659f)) && n51.f.a(java.lang.Integer.valueOf(this.f415660g), java.lang.Integer.valueOf(yVar.f415660g)) && n51.f.a(this.f415661h, yVar.f415661h) && n51.f.a(this.f415662i, yVar.f415662i);
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
            fVar.e(2, this.f415657d);
            java.lang.String str = this.f415658e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f415659f);
            fVar.e(5, this.f415660g);
            t45.k0 k0Var = this.f415661h;
            if (k0Var != null) {
                fVar.i(6, k0Var.computeSize());
                this.f415661h.writeFields(fVar);
            }
            java.lang.String str2 = this.f415662i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f415657d);
            java.lang.String str3 = this.f415658e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f415659f) + b36.f.e(5, this.f415660g);
            t45.k0 k0Var2 = this.f415661h;
            if (k0Var2 != null) {
                e17 += b36.f.i(6, k0Var2.computeSize());
            }
            java.lang.String str4 = this.f415662i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        t45.y yVar = (t45.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    yVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yVar.f415657d = aVar2.g(intValue);
                return 0;
            case 3:
                yVar.f415658e = aVar2.k(intValue);
                return 0;
            case 4:
                yVar.f415659f = aVar2.g(intValue);
                return 0;
            case 5:
                yVar.f415660g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.k0 k0Var3 = new t45.k0();
                    if (bArr2 != null && bArr2.length > 0) {
                        k0Var3.parseFrom(bArr2);
                    }
                    yVar.f415661h = k0Var3;
                }
                return 0;
            case 7:
                yVar.f415662i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
