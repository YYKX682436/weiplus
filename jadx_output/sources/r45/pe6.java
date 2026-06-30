package r45;

/* loaded from: classes4.dex */
public class pe6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382986d;

    /* renamed from: e, reason: collision with root package name */
    public int f382987e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382988f;

    /* renamed from: g, reason: collision with root package name */
    public long f382989g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pe6)) {
            return false;
        }
        r45.pe6 pe6Var = (r45.pe6) fVar;
        return n51.f.a(this.BaseRequest, pe6Var.BaseRequest) && n51.f.a(this.f382986d, pe6Var.f382986d) && n51.f.a(java.lang.Integer.valueOf(this.f382987e), java.lang.Integer.valueOf(pe6Var.f382987e)) && n51.f.a(this.f382988f, pe6Var.f382988f) && n51.f.a(java.lang.Long.valueOf(this.f382989g), java.lang.Long.valueOf(pe6Var.f382989g));
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
            java.lang.String str = this.f382986d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f382987e);
            java.lang.String str2 = this.f382988f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f382989g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382986d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f382987e);
            java.lang.String str4 = this.f382988f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.h(5, this.f382989g);
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
        r45.pe6 pe6Var = (r45.pe6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                pe6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            pe6Var.f382986d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pe6Var.f382987e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            pe6Var.f382988f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        pe6Var.f382989g = aVar2.i(intValue);
        return 0;
    }
}
