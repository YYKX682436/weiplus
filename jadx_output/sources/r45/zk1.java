package r45;

/* loaded from: classes8.dex */
public class zk1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f392159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392160e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392161f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392162g;

    /* renamed from: h, reason: collision with root package name */
    public long f392163h;

    /* renamed from: i, reason: collision with root package name */
    public long f392164i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392165m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk1)) {
            return false;
        }
        r45.zk1 zk1Var = (r45.zk1) fVar;
        return n51.f.a(this.BaseRequest, zk1Var.BaseRequest) && n51.f.a(this.f392159d, zk1Var.f392159d) && n51.f.a(this.f392160e, zk1Var.f392160e) && n51.f.a(this.f392161f, zk1Var.f392161f) && n51.f.a(this.f392162g, zk1Var.f392162g) && n51.f.a(java.lang.Long.valueOf(this.f392163h), java.lang.Long.valueOf(zk1Var.f392163h)) && n51.f.a(java.lang.Long.valueOf(this.f392164i), java.lang.Long.valueOf(zk1Var.f392164i)) && n51.f.a(this.f392165m, zk1Var.f392165m);
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
            r45.kv0 kv0Var = this.f392159d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f392159d.writeFields(fVar);
            }
            java.lang.String str = this.f392160e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f392161f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f392162g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f392163h);
            fVar.h(7, this.f392164i);
            java.lang.String str3 = this.f392165m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f392159d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f392160e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f392161f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str5 = this.f392162g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f392163h) + b36.f.h(7, this.f392164i);
            java.lang.String str6 = this.f392165m;
            return str6 != null ? h17 + b36.f.j(8, str6) : h17;
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
        r45.zk1 zk1Var = (r45.zk1) objArr[1];
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
                    zk1Var.BaseRequest = heVar3;
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
                    zk1Var.f392159d = kv0Var3;
                }
                return 0;
            case 3:
                zk1Var.f392160e = aVar2.k(intValue);
                return 0;
            case 4:
                zk1Var.f392161f = aVar2.d(intValue);
                return 0;
            case 5:
                zk1Var.f392162g = aVar2.k(intValue);
                return 0;
            case 6:
                zk1Var.f392163h = aVar2.i(intValue);
                return 0;
            case 7:
                zk1Var.f392164i = aVar2.i(intValue);
                return 0;
            case 8:
                zk1Var.f392165m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
