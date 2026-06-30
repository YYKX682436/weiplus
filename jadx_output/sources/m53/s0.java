package m53;

/* loaded from: classes4.dex */
public class s0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324038d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324039e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f324040f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f324041g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s0)) {
            return false;
        }
        m53.s0 s0Var = (m53.s0) fVar;
        return n51.f.a(this.BaseRequest, s0Var.BaseRequest) && n51.f.a(this.f324038d, s0Var.f324038d) && n51.f.a(this.f324039e, s0Var.f324039e) && n51.f.a(this.f324040f, s0Var.f324040f) && n51.f.a(this.f324041g, s0Var.f324041g);
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
            java.lang.String str = this.f324038d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f324039e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f324040f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f324041g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f324038d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f324039e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f324040f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f324041g;
            return gVar4 != null ? i18 + b36.f.b(5, gVar4) : i18;
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
        m53.s0 s0Var = (m53.s0) objArr[1];
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
                s0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            s0Var.f324038d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s0Var.f324039e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            s0Var.f324040f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        s0Var.f324041g = aVar2.d(intValue);
        return 0;
    }
}
