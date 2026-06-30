package r45;

/* loaded from: classes8.dex */
public class m37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380126d;

    /* renamed from: e, reason: collision with root package name */
    public int f380127e;

    /* renamed from: f, reason: collision with root package name */
    public long f380128f;

    /* renamed from: g, reason: collision with root package name */
    public r45.s37 f380129g;

    /* renamed from: h, reason: collision with root package name */
    public long f380130h;

    /* renamed from: i, reason: collision with root package name */
    public int f380131i;

    /* renamed from: m, reason: collision with root package name */
    public int f380132m;

    /* renamed from: n, reason: collision with root package name */
    public int f380133n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m37)) {
            return false;
        }
        r45.m37 m37Var = (r45.m37) fVar;
        return n51.f.a(this.BaseRequest, m37Var.BaseRequest) && n51.f.a(this.f380126d, m37Var.f380126d) && n51.f.a(java.lang.Integer.valueOf(this.f380127e), java.lang.Integer.valueOf(m37Var.f380127e)) && n51.f.a(java.lang.Long.valueOf(this.f380128f), java.lang.Long.valueOf(m37Var.f380128f)) && n51.f.a(this.f380129g, m37Var.f380129g) && n51.f.a(java.lang.Long.valueOf(this.f380130h), java.lang.Long.valueOf(m37Var.f380130h)) && n51.f.a(java.lang.Integer.valueOf(this.f380131i), java.lang.Integer.valueOf(m37Var.f380131i)) && n51.f.a(java.lang.Integer.valueOf(this.f380132m), java.lang.Integer.valueOf(m37Var.f380132m)) && n51.f.a(java.lang.Integer.valueOf(this.f380133n), java.lang.Integer.valueOf(m37Var.f380133n));
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
            java.lang.String str = this.f380126d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380127e);
            fVar.h(4, this.f380128f);
            r45.s37 s37Var = this.f380129g;
            if (s37Var != null) {
                fVar.i(5, s37Var.computeSize());
                this.f380129g.writeFields(fVar);
            }
            fVar.h(6, this.f380130h);
            fVar.e(7, this.f380131i);
            fVar.e(8, this.f380132m);
            fVar.e(9, this.f380133n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380126d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f380127e) + b36.f.h(4, this.f380128f);
            r45.s37 s37Var2 = this.f380129g;
            if (s37Var2 != null) {
                e17 += b36.f.i(5, s37Var2.computeSize());
            }
            return e17 + b36.f.h(6, this.f380130h) + b36.f.e(7, this.f380131i) + b36.f.e(8, this.f380132m) + b36.f.e(9, this.f380133n);
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
        r45.m37 m37Var = (r45.m37) objArr[1];
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
                    m37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m37Var.f380126d = aVar2.k(intValue);
                return 0;
            case 3:
                m37Var.f380127e = aVar2.g(intValue);
                return 0;
            case 4:
                m37Var.f380128f = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.s37 s37Var3 = new r45.s37();
                    if (bArr2 != null && bArr2.length > 0) {
                        s37Var3.parseFrom(bArr2);
                    }
                    m37Var.f380129g = s37Var3;
                }
                return 0;
            case 6:
                m37Var.f380130h = aVar2.i(intValue);
                return 0;
            case 7:
                m37Var.f380131i = aVar2.g(intValue);
                return 0;
            case 8:
                m37Var.f380132m = aVar2.g(intValue);
                return 0;
            case 9:
                m37Var.f380133n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
