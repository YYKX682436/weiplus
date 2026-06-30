package pj4;

/* loaded from: classes8.dex */
public class c extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355001d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.q0 f355002e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.c)) {
            return false;
        }
        pj4.c cVar = (pj4.c) fVar;
        return n51.f.a(this.BaseRequest, cVar.BaseRequest) && n51.f.a(this.f355001d, cVar.f355001d) && n51.f.a(this.f355002e, cVar.f355002e);
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
            java.lang.String str = this.f355001d;
            if (str != null) {
                fVar.j(2, str);
            }
            pj4.q0 q0Var = this.f355002e;
            if (q0Var != null) {
                fVar.i(3, q0Var.computeSize());
                this.f355002e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f355001d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            pj4.q0 q0Var2 = this.f355002e;
            return q0Var2 != null ? i18 + b36.f.i(3, q0Var2.computeSize()) : i18;
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
        pj4.c cVar = (pj4.c) objArr[1];
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
                cVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cVar.f355001d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            pj4.q0 q0Var3 = new pj4.q0();
            if (bArr2 != null && bArr2.length > 0) {
                q0Var3.parseFrom(bArr2);
            }
            cVar.f355002e = q0Var3;
        }
        return 0;
    }
}
