package r45;

/* loaded from: classes2.dex */
public class xi2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390129d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f390130e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ts4 f390131f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d7 f390132g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fc6 f390133h;

    /* renamed from: i, reason: collision with root package name */
    public long f390134i;

    /* renamed from: m, reason: collision with root package name */
    public r45.sd1 f390135m;

    /* renamed from: n, reason: collision with root package name */
    public r45.sd1 f390136n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi2)) {
            return false;
        }
        r45.xi2 xi2Var = (r45.xi2) fVar;
        return n51.f.a(this.BaseResponse, xi2Var.BaseResponse) && n51.f.a(this.f390129d, xi2Var.f390129d) && n51.f.a(this.f390130e, xi2Var.f390130e) && n51.f.a(this.f390131f, xi2Var.f390131f) && n51.f.a(this.f390132g, xi2Var.f390132g) && n51.f.a(this.f390133h, xi2Var.f390133h) && n51.f.a(java.lang.Long.valueOf(this.f390134i), java.lang.Long.valueOf(xi2Var.f390134i)) && n51.f.a(this.f390135m, xi2Var.f390135m) && n51.f.a(this.f390136n, xi2Var.f390136n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390129d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f390130e;
            if (finderContact != null) {
                fVar.i(3, finderContact.computeSize());
                this.f390130e.writeFields(fVar);
            }
            r45.ts4 ts4Var = this.f390131f;
            if (ts4Var != null) {
                fVar.i(21, ts4Var.computeSize());
                this.f390131f.writeFields(fVar);
            }
            r45.d7 d7Var = this.f390132g;
            if (d7Var != null) {
                fVar.i(22, d7Var.computeSize());
                this.f390132g.writeFields(fVar);
            }
            r45.fc6 fc6Var = this.f390133h;
            if (fc6Var != null) {
                fVar.i(23, fc6Var.computeSize());
                this.f390133h.writeFields(fVar);
            }
            fVar.h(27, this.f390134i);
            r45.sd1 sd1Var = this.f390135m;
            if (sd1Var != null) {
                fVar.i(28, sd1Var.computeSize());
                this.f390135m.writeFields(fVar);
            }
            r45.sd1 sd1Var2 = this.f390136n;
            if (sd1Var2 != null) {
                fVar.i(29, sd1Var2.computeSize());
                this.f390136n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f390130e;
            if (finderContact2 != null) {
                i18 += b36.f.i(3, finderContact2.computeSize());
            }
            r45.ts4 ts4Var2 = this.f390131f;
            if (ts4Var2 != null) {
                i18 += b36.f.i(21, ts4Var2.computeSize());
            }
            r45.d7 d7Var2 = this.f390132g;
            if (d7Var2 != null) {
                i18 += b36.f.i(22, d7Var2.computeSize());
            }
            r45.fc6 fc6Var2 = this.f390133h;
            if (fc6Var2 != null) {
                i18 += b36.f.i(23, fc6Var2.computeSize());
            }
            int h17 = i18 + b36.f.h(27, this.f390134i);
            r45.sd1 sd1Var3 = this.f390135m;
            if (sd1Var3 != null) {
                h17 += b36.f.i(28, sd1Var3.computeSize());
            }
            r45.sd1 sd1Var4 = this.f390136n;
            return sd1Var4 != null ? h17 + b36.f.i(29, sd1Var4.computeSize()) : h17;
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
        r45.xi2 xi2Var = (r45.xi2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                xi2Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                if (bArr3 != null && bArr3.length > 0) {
                    finderObject.parseFrom(bArr3);
                }
                xi2Var.f390129d.add(finderObject);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                if (bArr4 != null && bArr4.length > 0) {
                    finderContact3.parseFrom(bArr4);
                }
                xi2Var.f390130e = finderContact3;
            }
            return 0;
        }
        switch (intValue) {
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ts4 ts4Var3 = new r45.ts4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ts4Var3.parseFrom(bArr5);
                    }
                    xi2Var.f390131f = ts4Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d7 d7Var3 = new r45.d7();
                    if (bArr6 != null && bArr6.length > 0) {
                        d7Var3.parseFrom(bArr6);
                    }
                    xi2Var.f390132g = d7Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.fc6 fc6Var3 = new r45.fc6();
                    if (bArr7 != null && bArr7.length > 0) {
                        fc6Var3.parseFrom(bArr7);
                    }
                    xi2Var.f390133h = fc6Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 27:
                        xi2Var.f390134i = aVar2.i(intValue);
                        return 0;
                    case 28:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.sd1 sd1Var5 = new r45.sd1();
                            if (bArr8 != null && bArr8.length > 0) {
                                sd1Var5.parseFrom(bArr8);
                            }
                            xi2Var.f390135m = sd1Var5;
                        }
                        return 0;
                    case 29:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.sd1 sd1Var6 = new r45.sd1();
                            if (bArr9 != null && bArr9.length > 0) {
                                sd1Var6.parseFrom(bArr9);
                            }
                            xi2Var.f390136n = sd1Var6;
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
