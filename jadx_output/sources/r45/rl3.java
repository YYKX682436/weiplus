package r45;

/* loaded from: classes7.dex */
public class rl3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384973d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384974e;

    /* renamed from: f, reason: collision with root package name */
    public int f384975f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384976g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384977h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384978i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rl3)) {
            return false;
        }
        r45.rl3 rl3Var = (r45.rl3) fVar;
        return n51.f.a(this.BaseRequest, rl3Var.BaseRequest) && n51.f.a(this.f384973d, rl3Var.f384973d) && n51.f.a(this.f384974e, rl3Var.f384974e) && n51.f.a(java.lang.Integer.valueOf(this.f384975f), java.lang.Integer.valueOf(rl3Var.f384975f)) && n51.f.a(this.f384976g, rl3Var.f384976g) && n51.f.a(this.f384977h, rl3Var.f384977h) && n51.f.a(this.f384978i, rl3Var.f384978i);
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
            java.lang.String str = this.f384973d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384974e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f384975f);
            java.lang.String str3 = this.f384976g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f384977h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f384978i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f384973d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f384974e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f384975f);
            java.lang.String str8 = this.f384976g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f384977h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f384978i;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.rl3 rl3Var = (r45.rl3) objArr[1];
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
                    rl3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                rl3Var.f384973d = aVar2.k(intValue);
                return 0;
            case 3:
                rl3Var.f384974e = aVar2.k(intValue);
                return 0;
            case 4:
                rl3Var.f384975f = aVar2.g(intValue);
                return 0;
            case 5:
                rl3Var.f384976g = aVar2.k(intValue);
                return 0;
            case 6:
                rl3Var.f384977h = aVar2.k(intValue);
                return 0;
            case 7:
                rl3Var.f384978i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
