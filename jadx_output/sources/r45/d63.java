package r45;

/* loaded from: classes4.dex */
public class d63 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372171d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f372172e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372173f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d63)) {
            return false;
        }
        r45.d63 d63Var = (r45.d63) fVar;
        return n51.f.a(this.BaseRequest, d63Var.BaseRequest) && n51.f.a(this.f372171d, d63Var.f372171d) && n51.f.a(this.f372172e, d63Var.f372172e) && n51.f.a(this.f372173f, d63Var.f372173f);
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
            java.lang.String str = this.f372171d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f372172e);
            java.lang.String str2 = this.f372173f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f372171d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f372172e);
            java.lang.String str4 = this.f372173f;
            return str4 != null ? g17 + b36.f.j(4, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372172e.clear();
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
        r45.d63 d63Var = (r45.d63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                d63Var.f372171d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                d63Var.f372172e.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            d63Var.f372173f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            d63Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
