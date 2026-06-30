package r45;

/* loaded from: classes4.dex */
public class wj extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gi5 f389213d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f389214e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f389215f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wj)) {
            return false;
        }
        r45.wj wjVar = (r45.wj) fVar;
        return n51.f.a(this.BaseResponse, wjVar.BaseResponse) && n51.f.a(this.f389213d, wjVar.f389213d) && n51.f.a(this.f389214e, wjVar.f389214e) && n51.f.a(java.lang.Boolean.valueOf(this.f389215f), java.lang.Boolean.valueOf(wjVar.f389215f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389214e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.gi5 gi5Var = this.f389213d;
            if (gi5Var != null) {
                fVar.i(2, gi5Var.computeSize());
                this.f389213d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.a(4, this.f389215f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.gi5 gi5Var2 = this.f389213d;
            if (gi5Var2 != null) {
                i18 += b36.f.i(2, gi5Var2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList) + b36.f.a(4, this.f389215f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.wj wjVar = (r45.wj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                wjVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.gi5 gi5Var3 = new r45.gi5();
                if (bArr3 != null && bArr3.length > 0) {
                    gi5Var3.parseFrom(bArr3);
                }
                wjVar.f389213d = gi5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            wjVar.f389215f = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.uj ujVar = new r45.uj();
            if (bArr4 != null && bArr4.length > 0) {
                ujVar.parseFrom(bArr4);
            }
            wjVar.f389214e.add(ujVar);
        }
        return 0;
    }
}
