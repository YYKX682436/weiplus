package r45;

/* loaded from: classes8.dex */
public class th extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386418d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dy6 f386419e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386420f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.th)) {
            return false;
        }
        r45.th thVar = (r45.th) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386418d), java.lang.Integer.valueOf(thVar.f386418d)) && n51.f.a(this.f386419e, thVar.f386419e) && n51.f.a(this.f386420f, thVar.f386420f) && n51.f.a(this.BaseRequest, thVar.BaseRequest);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386418d);
            r45.dy6 dy6Var = this.f386419e;
            if (dy6Var != null) {
                fVar.i(2, dy6Var.computeSize());
                this.f386419e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f386420f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(255, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386418d) + 0;
            r45.dy6 dy6Var2 = this.f386419e;
            if (dy6Var2 != null) {
                e17 += b36.f.i(2, dy6Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f386420f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            r45.he heVar2 = this.BaseRequest;
            return heVar2 != null ? e17 + b36.f.i(255, heVar2.computeSize()) : e17;
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
        r45.th thVar = (r45.th) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            thVar.f386418d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.dy6 dy6Var3 = new r45.dy6();
                if (bArr != null && bArr.length > 0) {
                    dy6Var3.parseFrom(bArr);
                }
                thVar.f386419e = dy6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            thVar.f386420f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 255) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            thVar.BaseRequest = heVar3;
        }
        return 0;
    }
}
