package r45;

/* loaded from: classes9.dex */
public class vh5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f388244d;

    /* renamed from: e, reason: collision with root package name */
    public int f388245e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388246f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388247g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388248h;

    /* renamed from: i, reason: collision with root package name */
    public int f388249i;

    /* renamed from: m, reason: collision with root package name */
    public int f388250m;

    /* renamed from: n, reason: collision with root package name */
    public int f388251n;

    /* renamed from: o, reason: collision with root package name */
    public long f388252o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wh5 f388253p;

    /* renamed from: q, reason: collision with root package name */
    public r45.u67 f388254q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f388255r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh5)) {
            return false;
        }
        r45.vh5 vh5Var = (r45.vh5) fVar;
        return n51.f.a(this.BaseRequest, vh5Var.BaseRequest) && n51.f.a(this.f388244d, vh5Var.f388244d) && n51.f.a(java.lang.Integer.valueOf(this.f388245e), java.lang.Integer.valueOf(vh5Var.f388245e)) && n51.f.a(this.f388246f, vh5Var.f388246f) && n51.f.a(this.f388247g, vh5Var.f388247g) && n51.f.a(this.f388248h, vh5Var.f388248h) && n51.f.a(java.lang.Integer.valueOf(this.f388249i), java.lang.Integer.valueOf(vh5Var.f388249i)) && n51.f.a(java.lang.Integer.valueOf(this.f388250m), java.lang.Integer.valueOf(vh5Var.f388250m)) && n51.f.a(java.lang.Integer.valueOf(this.f388251n), java.lang.Integer.valueOf(vh5Var.f388251n)) && n51.f.a(java.lang.Long.valueOf(this.f388252o), java.lang.Long.valueOf(vh5Var.f388252o)) && n51.f.a(this.f388253p, vh5Var.f388253p) && n51.f.a(this.f388254q, vh5Var.f388254q) && n51.f.a(this.f388255r, vh5Var.f388255r);
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
            r45.ae aeVar = this.f388244d;
            if (aeVar != null) {
                fVar.i(2, aeVar.computeSize());
                this.f388244d.writeFields(fVar);
            }
            fVar.e(3, this.f388245e);
            com.tencent.mm.protobuf.g gVar = this.f388246f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388247g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f388248h;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            fVar.e(7, this.f388249i);
            fVar.e(8, this.f388250m);
            fVar.e(9, this.f388251n);
            fVar.h(10, this.f388252o);
            r45.wh5 wh5Var = this.f388253p;
            if (wh5Var != null) {
                fVar.i(11, wh5Var.computeSize());
                this.f388253p.writeFields(fVar);
            }
            r45.u67 u67Var = this.f388254q;
            if (u67Var != null) {
                fVar.i(12, u67Var.computeSize());
                this.f388254q.writeFields(fVar);
            }
            fVar.g(13, 2, this.f388255r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.ae aeVar2 = this.f388244d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f388245e);
            com.tencent.mm.protobuf.g gVar4 = this.f388246f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f388247g;
            if (gVar5 != null) {
                e17 += b36.f.b(5, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f388248h;
            if (gVar6 != null) {
                e17 += b36.f.b(6, gVar6);
            }
            int e18 = e17 + b36.f.e(7, this.f388249i) + b36.f.e(8, this.f388250m) + b36.f.e(9, this.f388251n) + b36.f.h(10, this.f388252o);
            r45.wh5 wh5Var2 = this.f388253p;
            if (wh5Var2 != null) {
                e18 += b36.f.i(11, wh5Var2.computeSize());
            }
            r45.u67 u67Var2 = this.f388254q;
            if (u67Var2 != null) {
                e18 += b36.f.i(12, u67Var2.computeSize());
            }
            return e18 + b36.f.g(13, 2, this.f388255r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388255r.clear();
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
        r45.vh5 vh5Var = (r45.vh5) objArr[1];
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
                    vh5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr3 != null && bArr3.length > 0) {
                        aeVar3.parseFrom(bArr3);
                    }
                    vh5Var.f388244d = aeVar3;
                }
                return 0;
            case 3:
                vh5Var.f388245e = aVar2.g(intValue);
                return 0;
            case 4:
                vh5Var.f388246f = aVar2.d(intValue);
                return 0;
            case 5:
                vh5Var.f388247g = aVar2.d(intValue);
                return 0;
            case 6:
                vh5Var.f388248h = aVar2.d(intValue);
                return 0;
            case 7:
                vh5Var.f388249i = aVar2.g(intValue);
                return 0;
            case 8:
                vh5Var.f388250m = aVar2.g(intValue);
                return 0;
            case 9:
                vh5Var.f388251n = aVar2.g(intValue);
                return 0;
            case 10:
                vh5Var.f388252o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wh5 wh5Var3 = new r45.wh5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wh5Var3.parseFrom(bArr4);
                    }
                    vh5Var.f388253p = wh5Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.u67 u67Var3 = new r45.u67();
                    if (bArr5 != null && bArr5.length > 0) {
                        u67Var3.parseFrom(bArr5);
                    }
                    vh5Var.f388254q = u67Var3;
                }
                return 0;
            case 13:
                vh5Var.f388255r.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
