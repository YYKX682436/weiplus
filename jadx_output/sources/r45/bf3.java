package r45;

/* loaded from: classes9.dex */
public class bf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370721d;

    /* renamed from: e, reason: collision with root package name */
    public int f370722e;

    /* renamed from: f, reason: collision with root package name */
    public r45.je0 f370723f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f370724g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f370725h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370726i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bf3)) {
            return false;
        }
        r45.bf3 bf3Var = (r45.bf3) fVar;
        return n51.f.a(this.BaseRequest, bf3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f370721d), java.lang.Integer.valueOf(bf3Var.f370721d)) && n51.f.a(java.lang.Integer.valueOf(this.f370722e), java.lang.Integer.valueOf(bf3Var.f370722e)) && n51.f.a(this.f370723f, bf3Var.f370723f) && n51.f.a(this.f370724g, bf3Var.f370724g) && n51.f.a(java.lang.Integer.valueOf(this.f370725h), java.lang.Integer.valueOf(bf3Var.f370725h)) && n51.f.a(this.f370726i, bf3Var.f370726i);
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
            fVar.e(2, this.f370721d);
            fVar.e(3, this.f370722e);
            r45.je0 je0Var = this.f370723f;
            if (je0Var != null) {
                fVar.i(4, je0Var.computeSize());
                this.f370723f.writeFields(fVar);
            }
            fVar.g(5, 8, this.f370724g);
            fVar.e(6, this.f370725h);
            java.lang.String str = this.f370726i;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f370721d) + b36.f.e(3, this.f370722e);
            r45.je0 je0Var2 = this.f370723f;
            if (je0Var2 != null) {
                i18 += b36.f.i(4, je0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, this.f370724g) + b36.f.e(6, this.f370725h);
            java.lang.String str2 = this.f370726i;
            return str2 != null ? g17 + b36.f.j(7, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f370724g.clear();
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
        r45.bf3 bf3Var = (r45.bf3) objArr[1];
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
                    bf3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bf3Var.f370721d = aVar2.g(intValue);
                return 0;
            case 3:
                bf3Var.f370722e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.je0 je0Var3 = new r45.je0();
                    if (bArr3 != null && bArr3.length > 0) {
                        je0Var3.parseFrom(bArr3);
                    }
                    bf3Var.f370723f = je0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.hm0 hm0Var = new r45.hm0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hm0Var.parseFrom(bArr4);
                    }
                    bf3Var.f370724g.add(hm0Var);
                }
                return 0;
            case 6:
                bf3Var.f370725h = aVar2.g(intValue);
                return 0;
            case 7:
                bf3Var.f370726i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
