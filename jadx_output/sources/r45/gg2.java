package r45;

/* loaded from: classes2.dex */
public class gg2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f375208d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375209e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375210f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375211g;

    /* renamed from: h, reason: collision with root package name */
    public int f375212h;

    /* renamed from: i, reason: collision with root package name */
    public long f375213i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg2)) {
            return false;
        }
        r45.gg2 gg2Var = (r45.gg2) fVar;
        return n51.f.a(this.BaseRequest, gg2Var.BaseRequest) && n51.f.a(this.f375208d, gg2Var.f375208d) && n51.f.a(this.f375209e, gg2Var.f375209e) && n51.f.a(this.f375210f, gg2Var.f375210f) && n51.f.a(this.f375211g, gg2Var.f375211g) && n51.f.a(java.lang.Integer.valueOf(this.f375212h), java.lang.Integer.valueOf(gg2Var.f375212h)) && n51.f.a(java.lang.Long.valueOf(this.f375213i), java.lang.Long.valueOf(gg2Var.f375213i));
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
            r45.kv0 kv0Var = this.f375208d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f375208d.writeFields(fVar);
            }
            java.lang.String str = this.f375209e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f375210f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f375211g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f375212h);
            fVar.h(7, this.f375213i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f375208d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f375209e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f375210f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f375211g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f375212h) + b36.f.h(7, this.f375213i);
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
        r45.gg2 gg2Var = (r45.gg2) objArr[1];
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
                    gg2Var.BaseRequest = heVar3;
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
                    gg2Var.f375208d = kv0Var3;
                }
                return 0;
            case 3:
                gg2Var.f375209e = aVar2.k(intValue);
                return 0;
            case 4:
                gg2Var.f375210f = aVar2.k(intValue);
                return 0;
            case 5:
                gg2Var.f375211g = aVar2.k(intValue);
                return 0;
            case 6:
                gg2Var.f375212h = aVar2.g(intValue);
                return 0;
            case 7:
                gg2Var.f375213i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
