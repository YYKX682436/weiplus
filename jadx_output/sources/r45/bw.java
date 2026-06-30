package r45;

/* loaded from: classes4.dex */
public class bw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371089e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371090f;

    /* renamed from: g, reason: collision with root package name */
    public int f371091g;

    /* renamed from: h, reason: collision with root package name */
    public int f371092h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bw)) {
            return false;
        }
        r45.bw bwVar = (r45.bw) fVar;
        return n51.f.a(this.BaseResponse, bwVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371088d), java.lang.Integer.valueOf(bwVar.f371088d)) && n51.f.a(this.f371089e, bwVar.f371089e) && n51.f.a(this.f371090f, bwVar.f371090f) && n51.f.a(java.lang.Integer.valueOf(this.f371091g), java.lang.Integer.valueOf(bwVar.f371091g)) && n51.f.a(java.lang.Integer.valueOf(this.f371092h), java.lang.Integer.valueOf(bwVar.f371092h));
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
            fVar.e(2, this.f371088d);
            java.lang.String str = this.f371089e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f371090f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f371091g);
            fVar.e(6, this.f371092h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f371088d);
            java.lang.String str2 = this.f371089e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f371090f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            return i18 + b36.f.e(5, this.f371091g) + b36.f.e(6, this.f371092h);
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
        r45.bw bwVar = (r45.bw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    bwVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                bwVar.f371088d = aVar2.g(intValue);
                return 0;
            case 3:
                bwVar.f371089e = aVar2.k(intValue);
                return 0;
            case 4:
                bwVar.f371090f = aVar2.d(intValue);
                return 0;
            case 5:
                bwVar.f371091g = aVar2.g(intValue);
                return 0;
            case 6:
                bwVar.f371092h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
