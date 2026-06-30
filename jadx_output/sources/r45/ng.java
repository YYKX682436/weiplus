package r45;

/* loaded from: classes7.dex */
public class ng extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381370d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381371e;

    /* renamed from: f, reason: collision with root package name */
    public int f381372f;

    /* renamed from: g, reason: collision with root package name */
    public long f381373g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f381374h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ng)) {
            return false;
        }
        r45.ng ngVar = (r45.ng) fVar;
        return n51.f.a(this.BaseRequest, ngVar.BaseRequest) && n51.f.a(this.f381370d, ngVar.f381370d) && n51.f.a(this.f381371e, ngVar.f381371e) && n51.f.a(java.lang.Integer.valueOf(this.f381372f), java.lang.Integer.valueOf(ngVar.f381372f)) && n51.f.a(java.lang.Long.valueOf(this.f381373g), java.lang.Long.valueOf(ngVar.f381373g)) && n51.f.a(this.f381374h, ngVar.f381374h);
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
            java.lang.String str = this.f381370d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381371e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f381372f);
            fVar.h(5, this.f381373g);
            fVar.g(6, 8, this.f381374h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381370d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f381371e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f381372f) + b36.f.h(5, this.f381373g) + b36.f.g(6, 8, this.f381374h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381374h.clear();
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
        r45.ng ngVar = (r45.ng) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ngVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ngVar.f381370d = aVar2.k(intValue);
                return 0;
            case 3:
                ngVar.f381371e = aVar2.k(intValue);
                return 0;
            case 4:
                ngVar.f381372f = aVar2.g(intValue);
                return 0;
            case 5:
                ngVar.f381373g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.us5 us5Var = new r45.us5();
                    if (bArr3 != null && bArr3.length > 0) {
                        us5Var.parseFrom(bArr3);
                    }
                    ngVar.f381374h.add(us5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
