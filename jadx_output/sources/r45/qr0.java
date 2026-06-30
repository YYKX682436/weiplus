package r45;

/* loaded from: classes2.dex */
public class qr0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f384218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384219e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384220f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384221g;

    /* renamed from: h, reason: collision with root package name */
    public int f384222h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qr0)) {
            return false;
        }
        r45.qr0 qr0Var = (r45.qr0) fVar;
        return n51.f.a(this.BaseRequest, qr0Var.BaseRequest) && n51.f.a(this.f384218d, qr0Var.f384218d) && n51.f.a(this.f384219e, qr0Var.f384219e) && n51.f.a(this.f384220f, qr0Var.f384220f) && n51.f.a(this.f384221g, qr0Var.f384221g) && n51.f.a(java.lang.Integer.valueOf(this.f384222h), java.lang.Integer.valueOf(qr0Var.f384222h));
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
            r45.kv0 kv0Var = this.f384218d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f384218d.writeFields(fVar);
            }
            java.lang.String str = this.f384219e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384220f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f384221g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f384222h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f384218d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f384219e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f384220f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f384221g;
            if (gVar2 != null) {
                i18 += b36.f.b(5, gVar2);
            }
            return i18 + b36.f.e(6, this.f384222h);
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
        r45.qr0 qr0Var = (r45.qr0) objArr[1];
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
                    qr0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    qr0Var.f384218d = kv0Var3;
                }
                return 0;
            case 3:
                qr0Var.f384219e = aVar2.k(intValue);
                return 0;
            case 4:
                qr0Var.f384220f = aVar2.k(intValue);
                return 0;
            case 5:
                qr0Var.f384221g = aVar2.d(intValue);
                return 0;
            case 6:
                qr0Var.f384222h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
