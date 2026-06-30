package r45;

/* loaded from: classes8.dex */
public class gi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375279e;

    /* renamed from: f, reason: collision with root package name */
    public int f375280f;

    /* renamed from: h, reason: collision with root package name */
    public int f375282h;

    /* renamed from: m, reason: collision with root package name */
    public int f375284m;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f375281g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f375283i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi3)) {
            return false;
        }
        r45.gi3 gi3Var = (r45.gi3) fVar;
        return n51.f.a(this.BaseRequest, gi3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f375278d), java.lang.Integer.valueOf(gi3Var.f375278d)) && n51.f.a(this.f375279e, gi3Var.f375279e) && n51.f.a(java.lang.Integer.valueOf(this.f375280f), java.lang.Integer.valueOf(gi3Var.f375280f)) && n51.f.a(this.f375281g, gi3Var.f375281g) && n51.f.a(java.lang.Integer.valueOf(this.f375282h), java.lang.Integer.valueOf(gi3Var.f375282h)) && n51.f.a(this.f375283i, gi3Var.f375283i) && n51.f.a(java.lang.Integer.valueOf(this.f375284m), java.lang.Integer.valueOf(gi3Var.f375284m));
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
            fVar.e(2, this.f375278d);
            java.lang.String str = this.f375279e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f375280f);
            fVar.g(5, 8, this.f375281g);
            fVar.e(6, this.f375282h);
            fVar.g(7, 8, this.f375283i);
            fVar.e(8, this.f375284m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f375278d);
            java.lang.String str2 = this.f375279e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f375280f) + b36.f.g(5, 8, this.f375281g) + b36.f.e(6, this.f375282h) + b36.f.g(7, 8, this.f375283i) + b36.f.e(8, this.f375284m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f375281g.clear();
            this.f375283i.clear();
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
        r45.gi3 gi3Var = (r45.gi3) objArr[1];
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
                    gi3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gi3Var.f375278d = aVar2.g(intValue);
                return 0;
            case 3:
                gi3Var.f375279e = aVar2.k(intValue);
                return 0;
            case 4:
                gi3Var.f375280f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.en4 en4Var = new r45.en4();
                    if (bArr3 != null && bArr3.length > 0) {
                        en4Var.parseFrom(bArr3);
                    }
                    gi3Var.f375281g.add(en4Var);
                }
                return 0;
            case 6:
                gi3Var.f375282h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ie4 ie4Var = new r45.ie4();
                    if (bArr4 != null && bArr4.length > 0) {
                        ie4Var.parseFrom(bArr4);
                    }
                    gi3Var.f375283i.add(ie4Var);
                }
                return 0;
            case 8:
                gi3Var.f375284m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
