package r45;

/* loaded from: classes9.dex */
public class dp extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.k6 f372629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372630e;

    /* renamed from: f, reason: collision with root package name */
    public int f372631f;

    /* renamed from: g, reason: collision with root package name */
    public int f372632g;

    /* renamed from: h, reason: collision with root package name */
    public long f372633h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dp)) {
            return false;
        }
        r45.dp dpVar = (r45.dp) fVar;
        return n51.f.a(this.BaseRequest, dpVar.BaseRequest) && n51.f.a(this.f372629d, dpVar.f372629d) && n51.f.a(this.f372630e, dpVar.f372630e) && n51.f.a(java.lang.Integer.valueOf(this.f372631f), java.lang.Integer.valueOf(dpVar.f372631f)) && n51.f.a(java.lang.Integer.valueOf(this.f372632g), java.lang.Integer.valueOf(dpVar.f372632g)) && n51.f.a(java.lang.Long.valueOf(this.f372633h), java.lang.Long.valueOf(dpVar.f372633h));
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
            r45.k6 k6Var = this.f372629d;
            if (k6Var != null) {
                fVar.i(2, k6Var.computeSize());
                this.f372629d.writeFields(fVar);
            }
            java.lang.String str = this.f372630e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f372631f);
            fVar.e(5, this.f372632g);
            fVar.h(6, this.f372633h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.k6 k6Var2 = this.f372629d;
            if (k6Var2 != null) {
                i18 += b36.f.i(2, k6Var2.computeSize());
            }
            java.lang.String str2 = this.f372630e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f372631f) + b36.f.e(5, this.f372632g) + b36.f.h(6, this.f372633h);
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
        r45.dp dpVar = (r45.dp) objArr[1];
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
                    dpVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.k6 k6Var3 = new r45.k6();
                    if (bArr2 != null && bArr2.length > 0) {
                        k6Var3.parseFrom(bArr2);
                    }
                    dpVar.f372629d = k6Var3;
                }
                return 0;
            case 3:
                dpVar.f372630e = aVar2.k(intValue);
                return 0;
            case 4:
                dpVar.f372631f = aVar2.g(intValue);
                return 0;
            case 5:
                dpVar.f372632g = aVar2.g(intValue);
                return 0;
            case 6:
                dpVar.f372633h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
