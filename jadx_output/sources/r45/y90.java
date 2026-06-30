package r45;

/* loaded from: classes4.dex */
public class y90 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390877d;

    /* renamed from: e, reason: collision with root package name */
    public long f390878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390879f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390880g;

    /* renamed from: h, reason: collision with root package name */
    public int f390881h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390882i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f390883m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y90)) {
            return false;
        }
        r45.y90 y90Var = (r45.y90) fVar;
        return n51.f.a(this.BaseRequest, y90Var.BaseRequest) && n51.f.a(this.f390877d, y90Var.f390877d) && n51.f.a(java.lang.Long.valueOf(this.f390878e), java.lang.Long.valueOf(y90Var.f390878e)) && n51.f.a(this.f390879f, y90Var.f390879f) && n51.f.a(this.f390880g, y90Var.f390880g) && n51.f.a(java.lang.Integer.valueOf(this.f390881h), java.lang.Integer.valueOf(y90Var.f390881h)) && n51.f.a(this.f390882i, y90Var.f390882i) && n51.f.a(java.lang.Boolean.valueOf(this.f390883m), java.lang.Boolean.valueOf(y90Var.f390883m));
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
            java.lang.String str = this.f390877d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f390878e);
            java.lang.String str2 = this.f390879f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390880g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f390881h);
            java.lang.String str4 = this.f390882i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f390883m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f390877d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f390878e);
            java.lang.String str6 = this.f390879f;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f390880g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            int e17 = h17 + b36.f.e(6, this.f390881h);
            java.lang.String str8 = this.f390882i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.a(8, this.f390883m);
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
        r45.y90 y90Var = (r45.y90) objArr[1];
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
                    y90Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                y90Var.f390877d = aVar2.k(intValue);
                return 0;
            case 3:
                y90Var.f390878e = aVar2.i(intValue);
                return 0;
            case 4:
                y90Var.f390879f = aVar2.k(intValue);
                return 0;
            case 5:
                y90Var.f390880g = aVar2.k(intValue);
                return 0;
            case 6:
                y90Var.f390881h = aVar2.g(intValue);
                return 0;
            case 7:
                y90Var.f390882i = aVar2.k(intValue);
                return 0;
            case 8:
                y90Var.f390883m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
