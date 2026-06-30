package r45;

/* loaded from: classes4.dex */
public class ag extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369986e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f369987f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369988g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag)) {
            return false;
        }
        r45.ag agVar = (r45.ag) fVar;
        return n51.f.a(this.BaseRequest, agVar.BaseRequest) && n51.f.a(this.f369985d, agVar.f369985d) && n51.f.a(this.f369986e, agVar.f369986e) && n51.f.a(this.f369987f, agVar.f369987f) && n51.f.a(this.f369988g, agVar.f369988g);
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
            java.lang.String str = this.f369985d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f369986e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f369987f);
            java.lang.String str3 = this.f369988g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f369985d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f369986e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f369987f);
            java.lang.String str6 = this.f369988g;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f369987f.clear();
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
        r45.ag agVar = (r45.ag) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                agVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            agVar.f369985d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            agVar.f369986e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            agVar.f369987f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        agVar.f369988g = aVar2.k(intValue);
        return 0;
    }
}
