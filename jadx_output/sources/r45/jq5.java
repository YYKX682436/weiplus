package r45;

/* loaded from: classes9.dex */
public class jq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378056e;

    /* renamed from: f, reason: collision with root package name */
    public int f378057f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378058g;

    /* renamed from: h, reason: collision with root package name */
    public int f378059h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378060i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378061m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jq5)) {
            return false;
        }
        r45.jq5 jq5Var = (r45.jq5) fVar;
        return n51.f.a(this.BaseRequest, jq5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f378055d), java.lang.Integer.valueOf(jq5Var.f378055d)) && n51.f.a(this.f378056e, jq5Var.f378056e) && n51.f.a(java.lang.Integer.valueOf(this.f378057f), java.lang.Integer.valueOf(jq5Var.f378057f)) && n51.f.a(this.f378058g, jq5Var.f378058g) && n51.f.a(java.lang.Integer.valueOf(this.f378059h), java.lang.Integer.valueOf(jq5Var.f378059h)) && n51.f.a(this.f378060i, jq5Var.f378060i) && n51.f.a(this.f378061m, jq5Var.f378061m);
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
            fVar.e(2, this.f378055d);
            java.lang.String str = this.f378056e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f378057f);
            java.lang.String str2 = this.f378058g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f378059h);
            java.lang.String str3 = this.f378060i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f378061m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f378055d);
            java.lang.String str5 = this.f378056e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f378057f);
            java.lang.String str6 = this.f378058g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f378059h);
            java.lang.String str7 = this.f378060i;
            if (str7 != null) {
                e18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f378061m;
            return str8 != null ? e18 + b36.f.j(8, str8) : e18;
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
        r45.jq5 jq5Var = (r45.jq5) objArr[1];
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
                    jq5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                jq5Var.f378055d = aVar2.g(intValue);
                return 0;
            case 3:
                jq5Var.f378056e = aVar2.k(intValue);
                return 0;
            case 4:
                jq5Var.f378057f = aVar2.g(intValue);
                return 0;
            case 5:
                jq5Var.f378058g = aVar2.k(intValue);
                return 0;
            case 6:
                jq5Var.f378059h = aVar2.g(intValue);
                return 0;
            case 7:
                jq5Var.f378060i = aVar2.k(intValue);
                return 0;
            case 8:
                jq5Var.f378061m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
