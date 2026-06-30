package r45;

/* loaded from: classes8.dex */
public class e4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372993d;

    /* renamed from: e, reason: collision with root package name */
    public int f372994e;

    /* renamed from: f, reason: collision with root package name */
    public int f372995f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372996g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372997h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372998i;

    /* renamed from: m, reason: collision with root package name */
    public int f372999m;

    /* renamed from: n, reason: collision with root package name */
    public long f373000n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e4)) {
            return false;
        }
        r45.e4 e4Var = (r45.e4) fVar;
        return n51.f.a(this.BaseRequest, e4Var.BaseRequest) && n51.f.a(this.f372993d, e4Var.f372993d) && n51.f.a(java.lang.Integer.valueOf(this.f372994e), java.lang.Integer.valueOf(e4Var.f372994e)) && n51.f.a(java.lang.Integer.valueOf(this.f372995f), java.lang.Integer.valueOf(e4Var.f372995f)) && n51.f.a(this.f372996g, e4Var.f372996g) && n51.f.a(this.f372997h, e4Var.f372997h) && n51.f.a(this.f372998i, e4Var.f372998i) && n51.f.a(java.lang.Integer.valueOf(this.f372999m), java.lang.Integer.valueOf(e4Var.f372999m)) && n51.f.a(java.lang.Long.valueOf(this.f373000n), java.lang.Long.valueOf(e4Var.f373000n));
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
            java.lang.String str = this.f372993d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372994e);
            fVar.e(4, this.f372995f);
            java.lang.String str2 = this.f372996g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f372997h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f372998i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f372999m);
            fVar.h(9, this.f373000n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f372993d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f372994e) + b36.f.e(4, this.f372995f);
            java.lang.String str6 = this.f372996g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f372997h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f372998i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.e(8, this.f372999m) + b36.f.h(9, this.f373000n);
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
        r45.e4 e4Var = (r45.e4) objArr[1];
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
                    e4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                e4Var.f372993d = aVar2.k(intValue);
                return 0;
            case 3:
                e4Var.f372994e = aVar2.g(intValue);
                return 0;
            case 4:
                e4Var.f372995f = aVar2.g(intValue);
                return 0;
            case 5:
                e4Var.f372996g = aVar2.k(intValue);
                return 0;
            case 6:
                e4Var.f372997h = aVar2.k(intValue);
                return 0;
            case 7:
                e4Var.f372998i = aVar2.k(intValue);
                return 0;
            case 8:
                e4Var.f372999m = aVar2.g(intValue);
                return 0;
            case 9:
                e4Var.f373000n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
