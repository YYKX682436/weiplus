package r45;

/* loaded from: classes7.dex */
public class lh extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f379466d;

    /* renamed from: e, reason: collision with root package name */
    public long f379467e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379468f;

    /* renamed from: g, reason: collision with root package name */
    public int f379469g;

    /* renamed from: h, reason: collision with root package name */
    public int f379470h;

    /* renamed from: i, reason: collision with root package name */
    public long f379471i;

    /* renamed from: m, reason: collision with root package name */
    public long f379472m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh)) {
            return false;
        }
        r45.lh lhVar = (r45.lh) fVar;
        return n51.f.a(this.BaseRequest, lhVar.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f379466d), java.lang.Long.valueOf(lhVar.f379466d)) && n51.f.a(java.lang.Long.valueOf(this.f379467e), java.lang.Long.valueOf(lhVar.f379467e)) && n51.f.a(this.f379468f, lhVar.f379468f) && n51.f.a(java.lang.Integer.valueOf(this.f379469g), java.lang.Integer.valueOf(lhVar.f379469g)) && n51.f.a(java.lang.Integer.valueOf(this.f379470h), java.lang.Integer.valueOf(lhVar.f379470h)) && n51.f.a(java.lang.Long.valueOf(this.f379471i), java.lang.Long.valueOf(lhVar.f379471i)) && n51.f.a(java.lang.Long.valueOf(this.f379472m), java.lang.Long.valueOf(lhVar.f379472m));
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
            fVar.h(2, this.f379466d);
            fVar.h(3, this.f379467e);
            java.lang.String str = this.f379468f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f379469g);
            fVar.e(6, this.f379470h);
            fVar.h(7, this.f379471i);
            fVar.h(8, this.f379472m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f379466d) + b36.f.h(3, this.f379467e);
            java.lang.String str2 = this.f379468f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f379469g) + b36.f.e(6, this.f379470h) + b36.f.h(7, this.f379471i) + b36.f.h(8, this.f379472m);
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
        r45.lh lhVar = (r45.lh) objArr[1];
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
                    lhVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                lhVar.f379466d = aVar2.i(intValue);
                return 0;
            case 3:
                lhVar.f379467e = aVar2.i(intValue);
                return 0;
            case 4:
                lhVar.f379468f = aVar2.k(intValue);
                return 0;
            case 5:
                lhVar.f379469g = aVar2.g(intValue);
                return 0;
            case 6:
                lhVar.f379470h = aVar2.g(intValue);
                return 0;
            case 7:
                lhVar.f379471i = aVar2.i(intValue);
                return 0;
            case 8:
                lhVar.f379472m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
