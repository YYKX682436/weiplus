package r45;

/* loaded from: classes7.dex */
public class ct3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371820d;

    /* renamed from: e, reason: collision with root package name */
    public int f371821e;

    /* renamed from: f, reason: collision with root package name */
    public int f371822f;

    /* renamed from: g, reason: collision with root package name */
    public int f371823g;

    /* renamed from: h, reason: collision with root package name */
    public int f371824h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371825i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fd4 f371826m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ut4 f371827n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f371828o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ct3)) {
            return false;
        }
        r45.ct3 ct3Var = (r45.ct3) fVar;
        return n51.f.a(this.BaseRequest, ct3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371820d), java.lang.Integer.valueOf(ct3Var.f371820d)) && n51.f.a(java.lang.Integer.valueOf(this.f371821e), java.lang.Integer.valueOf(ct3Var.f371821e)) && n51.f.a(java.lang.Integer.valueOf(this.f371822f), java.lang.Integer.valueOf(ct3Var.f371822f)) && n51.f.a(java.lang.Integer.valueOf(this.f371823g), java.lang.Integer.valueOf(ct3Var.f371823g)) && n51.f.a(java.lang.Integer.valueOf(this.f371824h), java.lang.Integer.valueOf(ct3Var.f371824h)) && n51.f.a(this.f371825i, ct3Var.f371825i) && n51.f.a(this.f371826m, ct3Var.f371826m) && n51.f.a(this.f371827n, ct3Var.f371827n) && n51.f.a(this.f371828o, ct3Var.f371828o);
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
            fVar.e(2, this.f371820d);
            fVar.e(3, this.f371821e);
            fVar.e(4, this.f371822f);
            fVar.e(5, this.f371823g);
            fVar.e(6, this.f371824h);
            java.lang.String str = this.f371825i;
            if (str != null) {
                fVar.j(10, str);
            }
            r45.fd4 fd4Var = this.f371826m;
            if (fd4Var != null) {
                fVar.i(11, fd4Var.computeSize());
                this.f371826m.writeFields(fVar);
            }
            r45.ut4 ut4Var = this.f371827n;
            if (ut4Var != null) {
                fVar.i(12, ut4Var.computeSize());
                this.f371827n.writeFields(fVar);
            }
            java.lang.String str2 = this.f371828o;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371820d) + b36.f.e(3, this.f371821e) + b36.f.e(4, this.f371822f) + b36.f.e(5, this.f371823g) + b36.f.e(6, this.f371824h);
            java.lang.String str3 = this.f371825i;
            if (str3 != null) {
                i18 += b36.f.j(10, str3);
            }
            r45.fd4 fd4Var2 = this.f371826m;
            if (fd4Var2 != null) {
                i18 += b36.f.i(11, fd4Var2.computeSize());
            }
            r45.ut4 ut4Var2 = this.f371827n;
            if (ut4Var2 != null) {
                i18 += b36.f.i(12, ut4Var2.computeSize());
            }
            java.lang.String str4 = this.f371828o;
            return str4 != null ? i18 + b36.f.j(13, str4) : i18;
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
        r45.ct3 ct3Var = (r45.ct3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    ct3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ct3Var.f371820d = aVar2.g(intValue);
                return 0;
            case 3:
                ct3Var.f371821e = aVar2.g(intValue);
                return 0;
            case 4:
                ct3Var.f371822f = aVar2.g(intValue);
                return 0;
            case 5:
                ct3Var.f371823g = aVar2.g(intValue);
                return 0;
            case 6:
                ct3Var.f371824h = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            case 9:
            default:
                return -1;
            case 10:
                ct3Var.f371825i = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.fd4 fd4Var3 = new r45.fd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        fd4Var3.parseFrom(bArr2);
                    }
                    ct3Var.f371826m = fd4Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ut4 ut4Var3 = new r45.ut4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ut4Var3.parseFrom(bArr3);
                    }
                    ct3Var.f371827n = ut4Var3;
                }
                return 0;
            case 13:
                ct3Var.f371828o = aVar2.k(intValue);
                return 0;
        }
    }
}
