package r45;

/* loaded from: classes9.dex */
public class pb5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382924d;

    /* renamed from: e, reason: collision with root package name */
    public int f382925e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kd f382926f;

    /* renamed from: g, reason: collision with root package name */
    public int f382927g;

    /* renamed from: h, reason: collision with root package name */
    public int f382928h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382929i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382930m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pb5)) {
            return false;
        }
        r45.pb5 pb5Var = (r45.pb5) fVar;
        return n51.f.a(this.BaseRequest, pb5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382924d), java.lang.Integer.valueOf(pb5Var.f382924d)) && n51.f.a(java.lang.Integer.valueOf(this.f382925e), java.lang.Integer.valueOf(pb5Var.f382925e)) && n51.f.a(this.f382926f, pb5Var.f382926f) && n51.f.a(java.lang.Integer.valueOf(this.f382927g), java.lang.Integer.valueOf(pb5Var.f382927g)) && n51.f.a(java.lang.Integer.valueOf(this.f382928h), java.lang.Integer.valueOf(pb5Var.f382928h)) && n51.f.a(this.f382929i, pb5Var.f382929i) && n51.f.a(this.f382930m, pb5Var.f382930m);
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
            fVar.e(2, this.f382924d);
            fVar.e(3, this.f382925e);
            r45.kd kdVar = this.f382926f;
            if (kdVar != null) {
                fVar.i(4, kdVar.computeSize());
                this.f382926f.writeFields(fVar);
            }
            fVar.e(5, this.f382927g);
            fVar.e(6, this.f382928h);
            java.lang.String str = this.f382929i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f382930m;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382924d) + b36.f.e(3, this.f382925e);
            r45.kd kdVar2 = this.f382926f;
            if (kdVar2 != null) {
                i18 += b36.f.i(4, kdVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f382927g) + b36.f.e(6, this.f382928h);
            java.lang.String str3 = this.f382929i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f382930m;
            return str4 != null ? e17 + b36.f.j(100, str4) : e17;
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
        r45.pb5 pb5Var = (r45.pb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            pb5Var.f382930m = aVar2.k(intValue);
            return 0;
        }
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
                    pb5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pb5Var.f382924d = aVar2.g(intValue);
                return 0;
            case 3:
                pb5Var.f382925e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kd kdVar3 = new r45.kd();
                    if (bArr2 != null && bArr2.length > 0) {
                        kdVar3.parseFrom(bArr2);
                    }
                    pb5Var.f382926f = kdVar3;
                }
                return 0;
            case 5:
                pb5Var.f382927g = aVar2.g(intValue);
                return 0;
            case 6:
                pb5Var.f382928h = aVar2.g(intValue);
                return 0;
            case 7:
                pb5Var.f382929i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
