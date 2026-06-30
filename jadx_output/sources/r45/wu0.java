package r45;

/* loaded from: classes2.dex */
public class wu0 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f389464e;

    /* renamed from: f, reason: collision with root package name */
    public int f389465f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389466g;

    /* renamed from: h, reason: collision with root package name */
    public int f389467h;

    /* renamed from: m, reason: collision with root package name */
    public r45.dg4 f389469m;

    /* renamed from: n, reason: collision with root package name */
    public r45.wx0 f389470n;

    /* renamed from: o, reason: collision with root package name */
    public long f389471o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sd1 f389472p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sd1 f389473q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389463d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f389468i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wu0)) {
            return false;
        }
        r45.wu0 wu0Var = (r45.wu0) fVar;
        return n51.f.a(this.BaseResponse, wu0Var.BaseResponse) && n51.f.a(this.f389463d, wu0Var.f389463d) && n51.f.a(this.f389464e, wu0Var.f389464e) && n51.f.a(java.lang.Integer.valueOf(this.f389465f), java.lang.Integer.valueOf(wu0Var.f389465f)) && n51.f.a(this.f389466g, wu0Var.f389466g) && n51.f.a(java.lang.Integer.valueOf(this.f389467h), java.lang.Integer.valueOf(wu0Var.f389467h)) && n51.f.a(this.f389468i, wu0Var.f389468i) && n51.f.a(this.f389469m, wu0Var.f389469m) && n51.f.a(this.f389470n, wu0Var.f389470n) && n51.f.a(java.lang.Long.valueOf(this.f389471o), java.lang.Long.valueOf(wu0Var.f389471o)) && n51.f.a(this.f389472p, wu0Var.f389472p) && n51.f.a(this.f389473q, wu0Var.f389473q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389468i;
        java.util.LinkedList linkedList2 = this.f389463d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f389464e;
            if (finderContact != null) {
                fVar.i(3, finderContact.computeSize());
                this.f389464e.writeFields(fVar);
            }
            fVar.e(4, this.f389465f);
            com.tencent.mm.protobuf.g gVar = this.f389466g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f389467h);
            fVar.g(7, 8, linkedList);
            r45.dg4 dg4Var = this.f389469m;
            if (dg4Var != null) {
                fVar.i(8, dg4Var.computeSize());
                this.f389469m.writeFields(fVar);
            }
            r45.wx0 wx0Var = this.f389470n;
            if (wx0Var != null) {
                fVar.i(9, wx0Var.computeSize());
                this.f389470n.writeFields(fVar);
            }
            fVar.h(10, this.f389471o);
            r45.sd1 sd1Var = this.f389472p;
            if (sd1Var != null) {
                fVar.i(11, sd1Var.computeSize());
                this.f389472p.writeFields(fVar);
            }
            r45.sd1 sd1Var2 = this.f389473q;
            if (sd1Var2 != null) {
                fVar.i(12, sd1Var2.computeSize());
                this.f389473q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f389464e;
            if (finderContact2 != null) {
                i18 += b36.f.i(3, finderContact2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f389465f);
            com.tencent.mm.protobuf.g gVar2 = this.f389466g;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            int e18 = e17 + b36.f.e(6, this.f389467h) + b36.f.g(7, 8, linkedList);
            r45.dg4 dg4Var2 = this.f389469m;
            if (dg4Var2 != null) {
                e18 += b36.f.i(8, dg4Var2.computeSize());
            }
            r45.wx0 wx0Var2 = this.f389470n;
            if (wx0Var2 != null) {
                e18 += b36.f.i(9, wx0Var2.computeSize());
            }
            int h17 = e18 + b36.f.h(10, this.f389471o);
            r45.sd1 sd1Var3 = this.f389472p;
            if (sd1Var3 != null) {
                h17 += b36.f.i(11, sd1Var3.computeSize());
            }
            r45.sd1 sd1Var4 = this.f389473q;
            return sd1Var4 != null ? h17 + b36.f.i(12, sd1Var4.computeSize()) : h17;
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
        r45.wu0 wu0Var = (r45.wu0) objArr[1];
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
                    wu0Var.BaseResponse = ieVar3;
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
                    wu0Var.f389463d.add(finderObject);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr4 != null && bArr4.length > 0) {
                        finderContact3.parseFrom(bArr4);
                    }
                    wu0Var.f389464e = finderContact3;
                }
                return 0;
            case 4:
                wu0Var.f389465f = aVar2.g(intValue);
                return 0;
            case 5:
                wu0Var.f389466g = aVar2.d(intValue);
                return 0;
            case 6:
                wu0Var.f389467h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ig4 ig4Var = new r45.ig4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ig4Var.parseFrom(bArr5);
                    }
                    wu0Var.f389468i.add(ig4Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dg4 dg4Var3 = new r45.dg4();
                    if (bArr6 != null && bArr6.length > 0) {
                        dg4Var3.parseFrom(bArr6);
                    }
                    wu0Var.f389469m = dg4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.wx0 wx0Var3 = new r45.wx0();
                    if (bArr7 != null && bArr7.length > 0) {
                        wx0Var3.parseFrom(bArr7);
                    }
                    wu0Var.f389470n = wx0Var3;
                }
                return 0;
            case 10:
                wu0Var.f389471o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.sd1 sd1Var5 = new r45.sd1();
                    if (bArr8 != null && bArr8.length > 0) {
                        sd1Var5.parseFrom(bArr8);
                    }
                    wu0Var.f389472p = sd1Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.sd1 sd1Var6 = new r45.sd1();
                    if (bArr9 != null && bArr9.length > 0) {
                        sd1Var6.parseFrom(bArr9);
                    }
                    wu0Var.f389473q = sd1Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
