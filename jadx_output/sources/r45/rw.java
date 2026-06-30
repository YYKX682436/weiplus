package r45;

/* loaded from: classes4.dex */
public class rw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385230d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385231e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385232f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385233g;

    /* renamed from: h, reason: collision with root package name */
    public int f385234h = 4;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw)) {
            return false;
        }
        r45.rw rwVar = (r45.rw) fVar;
        return n51.f.a(this.BaseRequest, rwVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f385230d), java.lang.Integer.valueOf(rwVar.f385230d)) && n51.f.a(this.f385231e, rwVar.f385231e) && n51.f.a(this.f385232f, rwVar.f385232f) && n51.f.a(this.f385233g, rwVar.f385233g) && n51.f.a(java.lang.Integer.valueOf(this.f385234h), java.lang.Integer.valueOf(rwVar.f385234h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f385230d);
            com.tencent.mm.protobuf.g gVar = this.f385231e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385232f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            java.lang.String str = this.f385233g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f385234h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f385230d);
            com.tencent.mm.protobuf.g gVar3 = this.f385231e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f385232f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            java.lang.String str2 = this.f385233g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f385234h);
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
        r45.rw rwVar = (r45.rw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    rwVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                rwVar.f385230d = aVar2.g(intValue);
                return 0;
            case 3:
                rwVar.f385231e = aVar2.d(intValue);
                return 0;
            case 4:
                rwVar.f385232f = aVar2.d(intValue);
                return 0;
            case 5:
                rwVar.f385233g = aVar2.k(intValue);
                return 0;
            case 6:
                rwVar.f385234h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
