package r45;

/* loaded from: classes4.dex */
public class mq3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380743d;

    /* renamed from: e, reason: collision with root package name */
    public int f380744e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f380745f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f380746g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mq3)) {
            return false;
        }
        r45.mq3 mq3Var = (r45.mq3) fVar;
        return n51.f.a(this.BaseRequest, mq3Var.BaseRequest) && n51.f.a(this.f380743d, mq3Var.f380743d) && n51.f.a(java.lang.Integer.valueOf(this.f380744e), java.lang.Integer.valueOf(mq3Var.f380744e)) && n51.f.a(this.f380745f, mq3Var.f380745f) && n51.f.a(java.lang.Integer.valueOf(this.f380746g), java.lang.Integer.valueOf(mq3Var.f380746g));
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
            java.lang.String str = this.f380743d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380744e);
            fVar.g(4, 8, this.f380745f);
            fVar.e(5, this.f380746g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380743d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f380744e) + b36.f.g(4, 8, this.f380745f) + b36.f.e(5, this.f380746g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f380745f.clear();
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
        r45.mq3 mq3Var = (r45.mq3) objArr[1];
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
                mq3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mq3Var.f380743d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mq3Var.f380744e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            mq3Var.f380746g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.du5 du5Var = new r45.du5();
            if (bArr3 != null && bArr3.length > 0) {
                du5Var.b(bArr3);
            }
            mq3Var.f380745f.add(du5Var);
        }
        return 0;
    }
}
