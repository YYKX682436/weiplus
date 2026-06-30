package r45;

/* loaded from: classes9.dex */
public class go extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j40 f375387d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l40 f375388e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c40 f375389f;

    /* renamed from: g, reason: collision with root package name */
    public int f375390g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.go)) {
            return false;
        }
        r45.go goVar = (r45.go) fVar;
        return n51.f.a(this.BaseRequest, goVar.BaseRequest) && n51.f.a(this.f375387d, goVar.f375387d) && n51.f.a(this.f375388e, goVar.f375388e) && n51.f.a(this.f375389f, goVar.f375389f) && n51.f.a(java.lang.Integer.valueOf(this.f375390g), java.lang.Integer.valueOf(goVar.f375390g));
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
            r45.j40 j40Var = this.f375387d;
            if (j40Var != null) {
                fVar.i(2, j40Var.computeSize());
                this.f375387d.writeFields(fVar);
            }
            r45.l40 l40Var = this.f375388e;
            if (l40Var != null) {
                fVar.i(3, l40Var.computeSize());
                this.f375388e.writeFields(fVar);
            }
            r45.c40 c40Var = this.f375389f;
            if (c40Var != null) {
                fVar.i(4, c40Var.computeSize());
                this.f375389f.writeFields(fVar);
            }
            fVar.e(5, this.f375390g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.j40 j40Var2 = this.f375387d;
            if (j40Var2 != null) {
                i18 += b36.f.i(2, j40Var2.computeSize());
            }
            r45.l40 l40Var2 = this.f375388e;
            if (l40Var2 != null) {
                i18 += b36.f.i(3, l40Var2.computeSize());
            }
            r45.c40 c40Var2 = this.f375389f;
            if (c40Var2 != null) {
                i18 += b36.f.i(4, c40Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f375390g);
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
        r45.go goVar = (r45.go) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                goVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.j40 j40Var3 = new r45.j40();
                if (bArr2 != null && bArr2.length > 0) {
                    j40Var3.parseFrom(bArr2);
                }
                goVar.f375387d = j40Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.l40 l40Var3 = new r45.l40();
                if (bArr3 != null && bArr3.length > 0) {
                    l40Var3.parseFrom(bArr3);
                }
                goVar.f375388e = l40Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            goVar.f375390g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.c40 c40Var3 = new r45.c40();
            if (bArr4 != null && bArr4.length > 0) {
                c40Var3.parseFrom(bArr4);
            }
            goVar.f375389f = c40Var3;
        }
        return 0;
    }
}
