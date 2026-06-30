package r45;

/* loaded from: classes9.dex */
public class f20 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373934d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373935e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f373936f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f373937g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f373938h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f373939i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f373940m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f20)) {
            return false;
        }
        r45.f20 f20Var = (r45.f20) fVar;
        return n51.f.a(this.BaseRequest, f20Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f373934d), java.lang.Integer.valueOf(f20Var.f373934d)) && n51.f.a(this.f373935e, f20Var.f373935e) && n51.f.a(this.f373936f, f20Var.f373936f) && n51.f.a(this.f373937g, f20Var.f373937g) && n51.f.a(this.f373938h, f20Var.f373938h) && n51.f.a(this.f373939i, f20Var.f373939i) && n51.f.a(this.f373940m, f20Var.f373940m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373940m;
        java.util.LinkedList linkedList2 = this.f373939i;
        java.util.LinkedList linkedList3 = this.f373938h;
        java.util.LinkedList linkedList4 = this.f373937g;
        java.util.LinkedList linkedList5 = this.f373936f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f373934d);
            java.lang.String str = this.f373935e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList5);
            fVar.g(5, 8, linkedList4);
            fVar.g(6, 8, linkedList3);
            fVar.g(7, 8, linkedList2);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f373934d);
            java.lang.String str2 = this.f373935e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 8, linkedList5) + b36.f.g(5, 8, linkedList4) + b36.f.g(6, 8, linkedList3) + b36.f.g(7, 8, linkedList2) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.f20 f20Var = (r45.f20) objArr[1];
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
                    f20Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f20Var.f373934d = aVar2.g(intValue);
                return 0;
            case 3:
                f20Var.f373935e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d46 d46Var = new r45.d46();
                    if (bArr3 != null && bArr3.length > 0) {
                        d46Var.parseFrom(bArr3);
                    }
                    f20Var.f373936f.add(d46Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.f46 f46Var = new r45.f46();
                    if (bArr4 != null && bArr4.length > 0) {
                        f46Var.parseFrom(bArr4);
                    }
                    f20Var.f373937g.add(f46Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.c46 c46Var = new r45.c46();
                    if (bArr5 != null && bArr5.length > 0) {
                        c46Var.parseFrom(bArr5);
                    }
                    f20Var.f373938h.add(c46Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.b46 b46Var = new r45.b46();
                    if (bArr6 != null && bArr6.length > 0) {
                        b46Var.parseFrom(bArr6);
                    }
                    f20Var.f373939i.add(b46Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.e46 e46Var = new r45.e46();
                    if (bArr7 != null && bArr7.length > 0) {
                        e46Var.parseFrom(bArr7);
                    }
                    f20Var.f373940m.add(e46Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
