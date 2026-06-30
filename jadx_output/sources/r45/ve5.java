package r45;

/* loaded from: classes8.dex */
public class ve5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388166d;

    /* renamed from: e, reason: collision with root package name */
    public int f388167e;

    /* renamed from: f, reason: collision with root package name */
    public long f388168f;

    /* renamed from: g, reason: collision with root package name */
    public long f388169g;

    /* renamed from: h, reason: collision with root package name */
    public int f388170h;

    /* renamed from: i, reason: collision with root package name */
    public long f388171i;

    /* renamed from: m, reason: collision with root package name */
    public int f388172m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve5)) {
            return false;
        }
        r45.ve5 ve5Var = (r45.ve5) fVar;
        return n51.f.a(this.BaseRequest, ve5Var.BaseRequest) && n51.f.a(this.f388166d, ve5Var.f388166d) && n51.f.a(java.lang.Integer.valueOf(this.f388167e), java.lang.Integer.valueOf(ve5Var.f388167e)) && n51.f.a(java.lang.Long.valueOf(this.f388168f), java.lang.Long.valueOf(ve5Var.f388168f)) && n51.f.a(java.lang.Long.valueOf(this.f388169g), java.lang.Long.valueOf(ve5Var.f388169g)) && n51.f.a(java.lang.Integer.valueOf(this.f388170h), java.lang.Integer.valueOf(ve5Var.f388170h)) && n51.f.a(java.lang.Long.valueOf(this.f388171i), java.lang.Long.valueOf(ve5Var.f388171i)) && n51.f.a(java.lang.Integer.valueOf(this.f388172m), java.lang.Integer.valueOf(ve5Var.f388172m));
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
            java.lang.String str = this.f388166d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388167e);
            fVar.h(4, this.f388168f);
            fVar.h(5, this.f388169g);
            fVar.e(6, this.f388170h);
            fVar.h(7, this.f388171i);
            fVar.e(8, this.f388172m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f388166d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f388167e) + b36.f.h(4, this.f388168f) + b36.f.h(5, this.f388169g) + b36.f.e(6, this.f388170h) + b36.f.h(7, this.f388171i) + b36.f.e(8, this.f388172m);
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
        r45.ve5 ve5Var = (r45.ve5) objArr[1];
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
                    ve5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ve5Var.f388166d = aVar2.k(intValue);
                return 0;
            case 3:
                ve5Var.f388167e = aVar2.g(intValue);
                return 0;
            case 4:
                ve5Var.f388168f = aVar2.i(intValue);
                return 0;
            case 5:
                ve5Var.f388169g = aVar2.i(intValue);
                return 0;
            case 6:
                ve5Var.f388170h = aVar2.g(intValue);
                return 0;
            case 7:
                ve5Var.f388171i = aVar2.i(intValue);
                return 0;
            case 8:
                ve5Var.f388172m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
