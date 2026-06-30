package r45;

/* loaded from: classes2.dex */
public class we4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389103d;

    /* renamed from: e, reason: collision with root package name */
    public r45.re4 f389104e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we4)) {
            return false;
        }
        r45.we4 we4Var = (r45.we4) fVar;
        return n51.f.a(this.BaseRequest, we4Var.BaseRequest) && n51.f.a(this.f389103d, we4Var.f389103d) && n51.f.a(this.f389104e, we4Var.f389104e);
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
            java.lang.String str = this.f389103d;
            if (str != null) {
                fVar.j(10, str);
            }
            r45.re4 re4Var = this.f389104e;
            if (re4Var != null) {
                fVar.i(20, re4Var.computeSize());
                this.f389104e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f389103d;
            if (str2 != null) {
                i18 += b36.f.j(10, str2);
            }
            r45.re4 re4Var2 = this.f389104e;
            return re4Var2 != null ? i18 + b36.f.i(20, re4Var2.computeSize()) : i18;
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
        r45.we4 we4Var = (r45.we4) objArr[1];
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
                we4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 10) {
            we4Var.f389103d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 20) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.re4 re4Var3 = new r45.re4();
            if (bArr2 != null && bArr2.length > 0) {
                re4Var3.parseFrom(bArr2);
            }
            we4Var.f389104e = re4Var3;
        }
        return 0;
    }
}
