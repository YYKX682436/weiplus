package r45;

/* loaded from: classes8.dex */
public class px5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.qv6 f383463d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383464e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383465f;

    /* renamed from: g, reason: collision with root package name */
    public int f383466g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px5)) {
            return false;
        }
        r45.px5 px5Var = (r45.px5) fVar;
        return n51.f.a(this.BaseResponse, px5Var.BaseResponse) && n51.f.a(this.f383463d, px5Var.f383463d) && n51.f.a(this.f383464e, px5Var.f383464e) && n51.f.a(this.f383465f, px5Var.f383465f) && n51.f.a(java.lang.Integer.valueOf(this.f383466g), java.lang.Integer.valueOf(px5Var.f383466g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383464e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.qv6 qv6Var = this.f383463d;
            if (qv6Var != null) {
                fVar.i(2, qv6Var.computeSize());
                this.f383463d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f383465f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f383466g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.qv6 qv6Var2 = this.f383463d;
            if (qv6Var2 != null) {
                i18 += b36.f.i(2, qv6Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f383465f;
            if (gVar2 != null) {
                g17 += b36.f.b(4, gVar2);
            }
            return g17 + b36.f.e(5, this.f383466g);
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
        r45.px5 px5Var = (r45.px5) objArr[1];
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
                px5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.qv6 qv6Var3 = new r45.qv6();
                if (bArr3 != null && bArr3.length > 0) {
                    qv6Var3.parseFrom(bArr3);
                }
                px5Var.f383463d = qv6Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                px5Var.f383465f = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            px5Var.f383466g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.ov6 ov6Var = new r45.ov6();
            if (bArr4 != null && bArr4.length > 0) {
                ov6Var.parseFrom(bArr4);
            }
            px5Var.f383464e.add(ov6Var);
        }
        return 0;
    }
}
