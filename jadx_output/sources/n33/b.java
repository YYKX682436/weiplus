package n33;

/* loaded from: classes2.dex */
public class b extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f334481d;

    /* renamed from: e, reason: collision with root package name */
    public long f334482e;

    /* renamed from: f, reason: collision with root package name */
    public d02.g f334483f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.b)) {
            return false;
        }
        n33.b bVar = (n33.b) fVar;
        return n51.f.a(this.BaseResponse, bVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f334481d), java.lang.Integer.valueOf(bVar.f334481d)) && n51.f.a(java.lang.Long.valueOf(this.f334482e), java.lang.Long.valueOf(bVar.f334482e)) && n51.f.a(this.f334483f, bVar.f334483f);
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
            fVar.e(2, this.f334481d);
            fVar.h(3, this.f334482e);
            d02.g gVar = this.f334483f;
            if (gVar != null) {
                fVar.i(4, gVar.computeSize());
                this.f334483f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f334481d) + b36.f.h(3, this.f334482e);
            d02.g gVar2 = this.f334483f;
            return gVar2 != null ? i18 + b36.f.i(4, gVar2.computeSize()) : i18;
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
        n33.b bVar = (n33.b) objArr[1];
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
                bVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            bVar.f334481d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f334482e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.g gVar3 = new d02.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar3.parseFrom(bArr2);
            }
            bVar.f334483f = gVar3;
        }
        return 0;
    }
}
