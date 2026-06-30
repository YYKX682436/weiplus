package r45;

/* loaded from: classes4.dex */
public class q27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383610d;

    /* renamed from: e, reason: collision with root package name */
    public long f383611e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383612f;

    /* renamed from: g, reason: collision with root package name */
    public int f383613g;

    /* renamed from: h, reason: collision with root package name */
    public long f383614h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q27)) {
            return false;
        }
        r45.q27 q27Var = (r45.q27) fVar;
        return n51.f.a(this.BaseRequest, q27Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f383610d), java.lang.Integer.valueOf(q27Var.f383610d)) && n51.f.a(java.lang.Long.valueOf(this.f383611e), java.lang.Long.valueOf(q27Var.f383611e)) && n51.f.a(this.f383612f, q27Var.f383612f) && n51.f.a(java.lang.Integer.valueOf(this.f383613g), java.lang.Integer.valueOf(q27Var.f383613g)) && n51.f.a(java.lang.Long.valueOf(this.f383614h), java.lang.Long.valueOf(q27Var.f383614h));
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
            fVar.e(2, this.f383610d);
            fVar.h(3, this.f383611e);
            java.lang.String str = this.f383612f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f383613g);
            fVar.h(6, this.f383614h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f383610d) + b36.f.h(3, this.f383611e);
            java.lang.String str2 = this.f383612f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f383613g) + b36.f.h(6, this.f383614h);
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
        r45.q27 q27Var = (r45.q27) objArr[1];
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
                    q27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                q27Var.f383610d = aVar2.g(intValue);
                return 0;
            case 3:
                q27Var.f383611e = aVar2.i(intValue);
                return 0;
            case 4:
                q27Var.f383612f = aVar2.k(intValue);
                return 0;
            case 5:
                q27Var.f383613g = aVar2.g(intValue);
                return 0;
            case 6:
                q27Var.f383614h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
