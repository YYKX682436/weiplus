package r45;

/* loaded from: classes2.dex */
public class a21 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369657e;

    /* renamed from: f, reason: collision with root package name */
    public int f369658f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sq2 f369659g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jt2 f369660h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369661i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f369656d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f369662m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a21)) {
            return false;
        }
        r45.a21 a21Var = (r45.a21) fVar;
        return n51.f.a(this.BaseResponse, a21Var.BaseResponse) && n51.f.a(this.f369656d, a21Var.f369656d) && n51.f.a(this.f369657e, a21Var.f369657e) && n51.f.a(java.lang.Integer.valueOf(this.f369658f), java.lang.Integer.valueOf(a21Var.f369658f)) && n51.f.a(this.f369659g, a21Var.f369659g) && n51.f.a(this.f369660h, a21Var.f369660h) && n51.f.a(this.f369661i, a21Var.f369661i) && n51.f.a(this.f369662m, a21Var.f369662m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369662m;
        java.util.LinkedList linkedList2 = this.f369656d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f369657e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f369658f);
            r45.sq2 sq2Var = this.f369659g;
            if (sq2Var != null) {
                fVar.i(5, sq2Var.computeSize());
                this.f369659g.writeFields(fVar);
            }
            r45.jt2 jt2Var = this.f369660h;
            if (jt2Var != null) {
                fVar.i(6, jt2Var.computeSize());
                this.f369660h.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f369661i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar3 = this.f369657e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f369658f);
            r45.sq2 sq2Var2 = this.f369659g;
            if (sq2Var2 != null) {
                e17 += b36.f.i(5, sq2Var2.computeSize());
            }
            r45.jt2 jt2Var2 = this.f369660h;
            if (jt2Var2 != null) {
                e17 += b36.f.i(6, jt2Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f369661i;
            if (gVar4 != null) {
                e17 += b36.f.b(7, gVar4);
            }
            return e17 + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.a21 a21Var = (r45.a21) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    a21Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObject.parseFrom(bArr3);
                    }
                    a21Var.f369656d.add(finderObject);
                }
                return 0;
            case 3:
                a21Var.f369657e = aVar2.d(intValue);
                return 0;
            case 4:
                a21Var.f369658f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.sq2 sq2Var3 = new r45.sq2();
                    if (bArr4 != null && bArr4.length > 0) {
                        sq2Var3.parseFrom(bArr4);
                    }
                    a21Var.f369659g = sq2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.jt2 jt2Var3 = new r45.jt2();
                    if (bArr5 != null && bArr5.length > 0) {
                        jt2Var3.parseFrom(bArr5);
                    }
                    a21Var.f369660h = jt2Var3;
                }
                return 0;
            case 7:
                a21Var.f369661i = aVar2.d(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tk0 tk0Var = new r45.tk0();
                    if (bArr6 != null && bArr6.length > 0) {
                        tk0Var.parseFrom(bArr6);
                    }
                    a21Var.f369662m.add(tk0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
