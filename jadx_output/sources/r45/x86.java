package r45;

/* loaded from: classes4.dex */
public class x86 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389876d;

    /* renamed from: e, reason: collision with root package name */
    public int f389877e;

    /* renamed from: f, reason: collision with root package name */
    public int f389878f;

    /* renamed from: g, reason: collision with root package name */
    public int f389879g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x86)) {
            return false;
        }
        r45.x86 x86Var = (r45.x86) fVar;
        return n51.f.a(this.BaseResponse, x86Var.BaseResponse) && n51.f.a(this.f389876d, x86Var.f389876d) && n51.f.a(java.lang.Integer.valueOf(this.f389877e), java.lang.Integer.valueOf(x86Var.f389877e)) && n51.f.a(java.lang.Integer.valueOf(this.f389878f), java.lang.Integer.valueOf(x86Var.f389878f)) && n51.f.a(java.lang.Integer.valueOf(this.f389879g), java.lang.Integer.valueOf(x86Var.f389879g));
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
            com.tencent.mm.protobuf.g gVar = this.f389876d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f389877e);
            fVar.e(4, this.f389878f);
            fVar.e(5, this.f389879g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f389876d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f389877e) + b36.f.e(4, this.f389878f) + b36.f.e(5, this.f389879g);
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
        r45.x86 x86Var = (r45.x86) objArr[1];
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
                x86Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            x86Var.f389876d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            x86Var.f389877e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            x86Var.f389878f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        x86Var.f389879g = aVar2.g(intValue);
        return 0;
    }
}
