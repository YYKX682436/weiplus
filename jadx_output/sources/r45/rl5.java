package r45;

/* loaded from: classes9.dex */
public class rl5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f384980d;

    /* renamed from: e, reason: collision with root package name */
    public int f384981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384982f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384983g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384984h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384985i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384986m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rl5)) {
            return false;
        }
        r45.rl5 rl5Var = (r45.rl5) fVar;
        return n51.f.a(this.BaseRequest, rl5Var.BaseRequest) && n51.f.a(this.f384980d, rl5Var.f384980d) && n51.f.a(java.lang.Integer.valueOf(this.f384981e), java.lang.Integer.valueOf(rl5Var.f384981e)) && n51.f.a(this.f384982f, rl5Var.f384982f) && n51.f.a(this.f384983g, rl5Var.f384983g) && n51.f.a(this.f384984h, rl5Var.f384984h) && n51.f.a(this.f384985i, rl5Var.f384985i) && n51.f.a(this.f384986m, rl5Var.f384986m);
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
            r45.ae aeVar = this.f384980d;
            if (aeVar != null) {
                fVar.i(2, aeVar.computeSize());
                this.f384980d.writeFields(fVar);
            }
            fVar.e(3, this.f384981e);
            java.lang.String str = this.f384982f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f384983g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f384984h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f384985i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f384986m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.ae aeVar2 = this.f384980d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f384981e);
            java.lang.String str6 = this.f384982f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f384983g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f384984h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f384985i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f384986m;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.rl5 rl5Var = (r45.rl5) objArr[1];
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
                    rl5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.parseFrom(bArr2);
                    }
                    rl5Var.f384980d = aeVar3;
                }
                return 0;
            case 3:
                rl5Var.f384981e = aVar2.g(intValue);
                return 0;
            case 4:
                rl5Var.f384982f = aVar2.k(intValue);
                return 0;
            case 5:
                rl5Var.f384983g = aVar2.k(intValue);
                return 0;
            case 6:
                rl5Var.f384984h = aVar2.k(intValue);
                return 0;
            case 7:
                rl5Var.f384985i = aVar2.k(intValue);
                return 0;
            case 8:
                rl5Var.f384986m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
