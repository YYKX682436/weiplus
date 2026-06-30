package r45;

/* loaded from: classes8.dex */
public class iu4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377335d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f377336e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f377337f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377338g;

    /* renamed from: h, reason: collision with root package name */
    public int f377339h;

    /* renamed from: i, reason: collision with root package name */
    public int f377340i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iu4)) {
            return false;
        }
        r45.iu4 iu4Var = (r45.iu4) fVar;
        return n51.f.a(this.BaseRequest, iu4Var.BaseRequest) && n51.f.a(this.f377335d, iu4Var.f377335d) && n51.f.a(this.f377336e, iu4Var.f377336e) && n51.f.a(this.f377337f, iu4Var.f377337f) && n51.f.a(this.f377338g, iu4Var.f377338g) && n51.f.a(java.lang.Integer.valueOf(this.f377339h), java.lang.Integer.valueOf(iu4Var.f377339h)) && n51.f.a(java.lang.Integer.valueOf(this.f377340i), java.lang.Integer.valueOf(iu4Var.f377340i));
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
            java.lang.String str = this.f377335d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f377336e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f377336e.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f377337f;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f377337f.writeFields(fVar);
            }
            java.lang.String str2 = this.f377338g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f377339h);
            fVar.e(7, this.f377340i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377335d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.cu5 cu5Var3 = this.f377336e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f377337f;
            if (cu5Var4 != null) {
                i18 += b36.f.i(4, cu5Var4.computeSize());
            }
            java.lang.String str4 = this.f377338g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.e(6, this.f377339h) + b36.f.e(7, this.f377340i);
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
        r45.iu4 iu4Var = (r45.iu4) objArr[1];
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
                    iu4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                iu4Var.f377335d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    iu4Var.f377336e = cu5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    iu4Var.f377337f = cu5Var6;
                }
                return 0;
            case 5:
                iu4Var.f377338g = aVar2.k(intValue);
                return 0;
            case 6:
                iu4Var.f377339h = aVar2.g(intValue);
                return 0;
            case 7:
                iu4Var.f377340i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
