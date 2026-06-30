package r45;

/* loaded from: classes8.dex */
public class kt1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f378931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378932e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378933f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378934g;

    /* renamed from: h, reason: collision with root package name */
    public long f378935h;

    /* renamed from: i, reason: collision with root package name */
    public long f378936i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378937m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kt1)) {
            return false;
        }
        r45.kt1 kt1Var = (r45.kt1) fVar;
        return n51.f.a(this.BaseRequest, kt1Var.BaseRequest) && n51.f.a(this.f378931d, kt1Var.f378931d) && n51.f.a(this.f378932e, kt1Var.f378932e) && n51.f.a(this.f378933f, kt1Var.f378933f) && n51.f.a(this.f378934g, kt1Var.f378934g) && n51.f.a(java.lang.Long.valueOf(this.f378935h), java.lang.Long.valueOf(kt1Var.f378935h)) && n51.f.a(java.lang.Long.valueOf(this.f378936i), java.lang.Long.valueOf(kt1Var.f378936i)) && n51.f.a(this.f378937m, kt1Var.f378937m);
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
            r45.kv0 kv0Var = this.f378931d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f378931d.writeFields(fVar);
            }
            java.lang.String str = this.f378932e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f378933f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f378934g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f378935h);
            fVar.h(7, this.f378936i);
            java.lang.String str3 = this.f378937m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f378931d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f378932e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378933f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str5 = this.f378934g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f378935h) + b36.f.h(7, this.f378936i);
            java.lang.String str6 = this.f378937m;
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
        r45.kt1 kt1Var = (r45.kt1) objArr[1];
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
                    kt1Var.BaseRequest = heVar3;
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
                    kt1Var.f378931d = kv0Var3;
                }
                return 0;
            case 3:
                kt1Var.f378932e = aVar2.k(intValue);
                return 0;
            case 4:
                kt1Var.f378933f = aVar2.d(intValue);
                return 0;
            case 5:
                kt1Var.f378934g = aVar2.k(intValue);
                return 0;
            case 6:
                kt1Var.f378935h = aVar2.i(intValue);
                return 0;
            case 7:
                kt1Var.f378936i = aVar2.i(intValue);
                return 0;
            case 8:
                kt1Var.f378937m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
