package r45;

/* loaded from: classes12.dex */
public class co4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371714d;

    /* renamed from: e, reason: collision with root package name */
    public int f371715e;

    /* renamed from: g, reason: collision with root package name */
    public int f371717g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371719i;

    /* renamed from: m, reason: collision with root package name */
    public int f371720m;

    /* renamed from: n, reason: collision with root package name */
    public int f371721n;

    /* renamed from: o, reason: collision with root package name */
    public int f371722o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371723p;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f371716f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f371718h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co4)) {
            return false;
        }
        r45.co4 co4Var = (r45.co4) fVar;
        return n51.f.a(this.BaseRequest, co4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371714d), java.lang.Integer.valueOf(co4Var.f371714d)) && n51.f.a(java.lang.Integer.valueOf(this.f371715e), java.lang.Integer.valueOf(co4Var.f371715e)) && n51.f.a(this.f371716f, co4Var.f371716f) && n51.f.a(java.lang.Integer.valueOf(this.f371717g), java.lang.Integer.valueOf(co4Var.f371717g)) && n51.f.a(this.f371718h, co4Var.f371718h) && n51.f.a(this.f371719i, co4Var.f371719i) && n51.f.a(java.lang.Integer.valueOf(this.f371720m), java.lang.Integer.valueOf(co4Var.f371720m)) && n51.f.a(java.lang.Integer.valueOf(this.f371721n), java.lang.Integer.valueOf(co4Var.f371721n)) && n51.f.a(java.lang.Integer.valueOf(this.f371722o), java.lang.Integer.valueOf(co4Var.f371722o)) && n51.f.a(this.f371723p, co4Var.f371723p);
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
            fVar.e(2, this.f371714d);
            fVar.e(3, this.f371715e);
            fVar.g(4, 8, this.f371716f);
            fVar.e(5, this.f371717g);
            fVar.g(6, 8, this.f371718h);
            java.lang.String str = this.f371719i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f371720m);
            fVar.e(9, this.f371721n);
            fVar.e(10, this.f371722o);
            java.lang.String str2 = this.f371723p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371714d) + b36.f.e(3, this.f371715e) + b36.f.g(4, 8, this.f371716f) + b36.f.e(5, this.f371717g) + b36.f.g(6, 8, this.f371718h);
            java.lang.String str3 = this.f371719i;
            if (str3 != null) {
                i18 += b36.f.j(7, str3);
            }
            int e17 = i18 + b36.f.e(8, this.f371720m) + b36.f.e(9, this.f371721n) + b36.f.e(10, this.f371722o);
            java.lang.String str4 = this.f371723p;
            return str4 != null ? e17 + b36.f.j(11, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371716f.clear();
            this.f371718h.clear();
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
        r45.co4 co4Var = (r45.co4) objArr[1];
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
                    co4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                co4Var.f371714d = aVar2.g(intValue);
                return 0;
            case 3:
                co4Var.f371715e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bo4 bo4Var = new r45.bo4();
                    if (bArr3 != null && bArr3.length > 0) {
                        bo4Var.parseFrom(bArr3);
                    }
                    co4Var.f371716f.add(bo4Var);
                }
                return 0;
            case 5:
                co4Var.f371717g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.eo4 eo4Var = new r45.eo4();
                    if (bArr4 != null && bArr4.length > 0) {
                        eo4Var.parseFrom(bArr4);
                    }
                    co4Var.f371718h.add(eo4Var);
                }
                return 0;
            case 7:
                co4Var.f371719i = aVar2.k(intValue);
                return 0;
            case 8:
                co4Var.f371720m = aVar2.g(intValue);
                return 0;
            case 9:
                co4Var.f371721n = aVar2.g(intValue);
                return 0;
            case 10:
                co4Var.f371722o = aVar2.g(intValue);
                return 0;
            case 11:
                co4Var.f371723p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
