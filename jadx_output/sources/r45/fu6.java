package r45;

/* loaded from: classes8.dex */
public class fu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374605d;

    /* renamed from: e, reason: collision with root package name */
    public int f374606e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374607f;

    /* renamed from: g, reason: collision with root package name */
    public int f374608g;

    /* renamed from: i, reason: collision with root package name */
    public int f374610i;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f374609h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f374611m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fu6)) {
            return false;
        }
        r45.fu6 fu6Var = (r45.fu6) fVar;
        return n51.f.a(this.BaseRequest, fu6Var.BaseRequest) && n51.f.a(this.f374605d, fu6Var.f374605d) && n51.f.a(java.lang.Integer.valueOf(this.f374606e), java.lang.Integer.valueOf(fu6Var.f374606e)) && n51.f.a(this.f374607f, fu6Var.f374607f) && n51.f.a(java.lang.Integer.valueOf(this.f374608g), java.lang.Integer.valueOf(fu6Var.f374608g)) && n51.f.a(this.f374609h, fu6Var.f374609h) && n51.f.a(java.lang.Integer.valueOf(this.f374610i), java.lang.Integer.valueOf(fu6Var.f374610i)) && n51.f.a(this.f374611m, fu6Var.f374611m);
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
            java.lang.String str = this.f374605d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f374606e);
            java.lang.String str2 = this.f374607f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f374608g);
            fVar.g(6, 8, this.f374609h);
            fVar.e(7, this.f374610i);
            fVar.g(8, 8, this.f374611m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f374605d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f374606e);
            java.lang.String str4 = this.f374607f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.e(5, this.f374608g) + b36.f.g(6, 8, this.f374609h) + b36.f.e(7, this.f374610i) + b36.f.g(8, 8, this.f374611m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374609h.clear();
            this.f374611m.clear();
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
        r45.fu6 fu6Var = (r45.fu6) objArr[1];
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
                    fu6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fu6Var.f374605d = aVar2.k(intValue);
                return 0;
            case 3:
                fu6Var.f374606e = aVar2.g(intValue);
                return 0;
            case 4:
                fu6Var.f374607f = aVar2.k(intValue);
                return 0;
            case 5:
                fu6Var.f374608g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.en4 en4Var = new r45.en4();
                    if (bArr3 != null && bArr3.length > 0) {
                        en4Var.parseFrom(bArr3);
                    }
                    fu6Var.f374609h.add(en4Var);
                }
                return 0;
            case 7:
                fu6Var.f374610i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ie4 ie4Var = new r45.ie4();
                    if (bArr4 != null && bArr4.length > 0) {
                        ie4Var.parseFrom(bArr4);
                    }
                    fu6Var.f374611m.add(ie4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
