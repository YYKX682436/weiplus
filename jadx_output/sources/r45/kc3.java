package r45;

/* loaded from: classes4.dex */
public class kc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f378583d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f378584e;

    /* renamed from: f, reason: collision with root package name */
    public int f378585f;

    /* renamed from: g, reason: collision with root package name */
    public int f378586g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kc3)) {
            return false;
        }
        r45.kc3 kc3Var = (r45.kc3) fVar;
        return n51.f.a(this.BaseResponse, kc3Var.BaseResponse) && n51.f.a(this.f378583d, kc3Var.f378583d) && n51.f.a(java.lang.Integer.valueOf(this.f378584e), java.lang.Integer.valueOf(kc3Var.f378584e)) && n51.f.a(java.lang.Integer.valueOf(this.f378585f), java.lang.Integer.valueOf(kc3Var.f378585f)) && n51.f.a(java.lang.Integer.valueOf(this.f378586g), java.lang.Integer.valueOf(kc3Var.f378586g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378583d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f378584e);
            fVar.e(4, this.f378585f);
            fVar.e(5, this.f378586g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f378584e) + b36.f.e(4, this.f378585f) + b36.f.e(5, this.f378586g);
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
        r45.kc3 kc3Var = (r45.kc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                kc3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kc3Var.f378583d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            kc3Var.f378584e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            kc3Var.f378585f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kc3Var.f378586g = aVar2.g(intValue);
        return 0;
    }
}
