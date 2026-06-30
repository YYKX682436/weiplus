package r45;

/* loaded from: classes8.dex */
public class qz5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384374d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f384375e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384377g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384378h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384379i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384380m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz5)) {
            return false;
        }
        r45.qz5 qz5Var = (r45.qz5) fVar;
        return n51.f.a(this.BaseRequest, qz5Var.BaseRequest) && n51.f.a(this.f384374d, qz5Var.f384374d) && n51.f.a(this.f384375e, qz5Var.f384375e) && n51.f.a(this.f384376f, qz5Var.f384376f) && n51.f.a(this.f384377g, qz5Var.f384377g) && n51.f.a(this.f384378h, qz5Var.f384378h) && n51.f.a(this.f384379i, qz5Var.f384379i) && n51.f.a(this.f384380m, qz5Var.f384380m);
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
            java.lang.String str = this.f384374d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, this.f384375e);
            java.lang.String str2 = this.f384376f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384377g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f384378h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f384379i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f384380m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f384374d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int g17 = i18 + b36.f.g(3, 2, this.f384375e);
            java.lang.String str8 = this.f384376f;
            if (str8 != null) {
                g17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f384377g;
            if (str9 != null) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f384378h;
            if (str10 != null) {
                g17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f384379i;
            if (str11 != null) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f384380m;
            return str12 != null ? g17 + b36.f.j(8, str12) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384375e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.qz5 qz5Var = (r45.qz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    qz5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qz5Var.f384374d = aVar2.k(intValue);
                return 0;
            case 3:
                qz5Var.f384375e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                qz5Var.f384376f = aVar2.k(intValue);
                return 0;
            case 5:
                qz5Var.f384377g = aVar2.k(intValue);
                return 0;
            case 6:
                qz5Var.f384378h = aVar2.k(intValue);
                return 0;
            case 7:
                qz5Var.f384379i = aVar2.k(intValue);
                return 0;
            case 8:
                qz5Var.f384380m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
