package r45;

/* loaded from: classes2.dex */
public class n9 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381179d;

    /* renamed from: e, reason: collision with root package name */
    public int f381180e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n9)) {
            return false;
        }
        r45.n9 n9Var = (r45.n9) fVar;
        return n51.f.a(this.BaseResponse, n9Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381179d), java.lang.Integer.valueOf(n9Var.f381179d)) && n51.f.a(java.lang.Integer.valueOf(this.f381180e), java.lang.Integer.valueOf(n9Var.f381180e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381179d);
            fVar.e(3, this.f381180e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f381179d) + b36.f.e(3, this.f381180e);
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
        r45.n9 n9Var = (r45.n9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                n9Var.f381179d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            n9Var.f381180e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            n9Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
