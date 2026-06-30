package r45;

/* loaded from: classes8.dex */
public class qk extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f384063d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384064e;

    /* renamed from: f, reason: collision with root package name */
    public int f384065f;

    /* renamed from: g, reason: collision with root package name */
    public int f384066g;

    /* renamed from: h, reason: collision with root package name */
    public int f384067h;

    /* renamed from: i, reason: collision with root package name */
    public int f384068i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qk)) {
            return false;
        }
        r45.qk qkVar = (r45.qk) fVar;
        return n51.f.a(this.BaseResponse, qkVar.BaseResponse) && n51.f.a(this.f384063d, qkVar.f384063d) && n51.f.a(this.f384064e, qkVar.f384064e) && n51.f.a(java.lang.Integer.valueOf(this.f384065f), java.lang.Integer.valueOf(qkVar.f384065f)) && n51.f.a(java.lang.Integer.valueOf(this.f384066g), java.lang.Integer.valueOf(qkVar.f384066g)) && n51.f.a(java.lang.Integer.valueOf(this.f384067h), java.lang.Integer.valueOf(qkVar.f384067h)) && n51.f.a(java.lang.Integer.valueOf(this.f384068i), java.lang.Integer.valueOf(qkVar.f384068i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384063d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f384064e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f384065f);
            fVar.e(5, this.f384066g);
            fVar.e(7, this.f384067h);
            fVar.e(8, this.f384068i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f384064e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f384065f) + b36.f.e(5, this.f384066g) + b36.f.e(7, this.f384067h) + b36.f.e(8, this.f384068i);
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
        r45.qk qkVar = (r45.qk) objArr[1];
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
                    qkVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lk lkVar = new r45.lk();
                    if (bArr3 != null && bArr3.length > 0) {
                        lkVar.parseFrom(bArr3);
                    }
                    qkVar.f384063d.add(lkVar);
                }
                return 0;
            case 3:
                qkVar.f384064e = aVar2.d(intValue);
                return 0;
            case 4:
                qkVar.f384065f = aVar2.g(intValue);
                return 0;
            case 5:
                qkVar.f384066g = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                qkVar.f384067h = aVar2.g(intValue);
                return 0;
            case 8:
                qkVar.f384068i = aVar2.g(intValue);
                return 0;
        }
    }
}
