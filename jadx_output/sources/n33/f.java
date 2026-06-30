package n33;

/* loaded from: classes8.dex */
public class f extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334505d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f334506e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f334507f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f334508g;

    /* renamed from: h, reason: collision with root package name */
    public int f334509h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334510i;

    /* renamed from: m, reason: collision with root package name */
    public int f334511m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.f)) {
            return false;
        }
        n33.f fVar2 = (n33.f) fVar;
        return n51.f.a(this.BaseResponse, fVar2.BaseResponse) && n51.f.a(this.f334505d, fVar2.f334505d) && n51.f.a(this.f334506e, fVar2.f334506e) && n51.f.a(this.f334507f, fVar2.f334507f) && n51.f.a(java.lang.Integer.valueOf(this.f334508g), java.lang.Integer.valueOf(fVar2.f334508g)) && n51.f.a(java.lang.Integer.valueOf(this.f334509h), java.lang.Integer.valueOf(fVar2.f334509h)) && n51.f.a(this.f334510i, fVar2.f334510i) && n51.f.a(java.lang.Integer.valueOf(this.f334511m), java.lang.Integer.valueOf(fVar2.f334511m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f334507f;
        java.util.LinkedList linkedList2 = this.f334506e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f334505d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList2);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f334508g);
            fVar.e(6, this.f334509h);
            java.lang.String str2 = this.f334510i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f334511m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f334505d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList2) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f334508g) + b36.f.e(6, this.f334509h);
            java.lang.String str4 = this.f334510i;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.e(8, this.f334511m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        n33.f fVar2 = (n33.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    fVar2.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fVar2.f334505d = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f334506e.add(aVar2.k(intValue));
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    n33.g gVar = new n33.g();
                    if (bArr3 != null && bArr3.length > 0) {
                        gVar.parseFrom(bArr3);
                    }
                    fVar2.f334507f.add(gVar);
                }
                return 0;
            case 5:
                fVar2.f334508g = aVar2.g(intValue);
                return 0;
            case 6:
                fVar2.f334509h = aVar2.g(intValue);
                return 0;
            case 7:
                fVar2.f334510i = aVar2.k(intValue);
                return 0;
            case 8:
                fVar2.f334511m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
