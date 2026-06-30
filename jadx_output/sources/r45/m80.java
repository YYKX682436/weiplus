package r45;

/* loaded from: classes8.dex */
public class m80 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f380228d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ns5 f380229e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m80)) {
            return false;
        }
        r45.m80 m80Var = (r45.m80) fVar;
        return n51.f.a(this.BaseResponse, m80Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f380228d), java.lang.Long.valueOf(m80Var.f380228d)) && n51.f.a(this.f380229e, m80Var.f380229e);
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
            fVar.h(2, this.f380228d);
            r45.ns5 ns5Var = this.f380229e;
            if (ns5Var != null) {
                fVar.i(100, ns5Var.computeSize());
                this.f380229e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f380228d);
            r45.ns5 ns5Var2 = this.f380229e;
            return ns5Var2 != null ? i18 + b36.f.i(100, ns5Var2.computeSize()) : i18;
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
        r45.m80 m80Var = (r45.m80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                m80Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            m80Var.f380228d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ns5 ns5Var3 = new r45.ns5();
            if (bArr2 != null && bArr2.length > 0) {
                ns5Var3.parseFrom(bArr2);
            }
            m80Var.f380229e = ns5Var3;
        }
        return 0;
    }
}
