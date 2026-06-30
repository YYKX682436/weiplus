package r45;

/* loaded from: classes8.dex */
public class qh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383992f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383993g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383994h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qh3)) {
            return false;
        }
        r45.qh3 qh3Var = (r45.qh3) fVar;
        return n51.f.a(this.BaseRequest, qh3Var.BaseRequest) && n51.f.a(this.f383990d, qh3Var.f383990d) && n51.f.a(this.f383991e, qh3Var.f383991e) && n51.f.a(this.f383992f, qh3Var.f383992f) && n51.f.a(this.f383993g, qh3Var.f383993g) && n51.f.a(this.f383994h, qh3Var.f383994h);
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
            java.lang.String str = this.f383990d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383991e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383992f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383993g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383994h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f383990d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f383991e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f383992f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f383993g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f383994h;
            return str10 != null ? i18 + b36.f.j(6, str10) : i18;
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
        r45.qh3 qh3Var = (r45.qh3) objArr[1];
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
                    qh3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qh3Var.f383990d = aVar2.k(intValue);
                return 0;
            case 3:
                qh3Var.f383991e = aVar2.k(intValue);
                return 0;
            case 4:
                qh3Var.f383992f = aVar2.k(intValue);
                return 0;
            case 5:
                qh3Var.f383993g = aVar2.k(intValue);
                return 0;
            case 6:
                qh3Var.f383994h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
