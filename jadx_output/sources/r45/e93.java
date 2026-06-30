package r45;

/* loaded from: classes4.dex */
public class e93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f373152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373153e;

    /* renamed from: f, reason: collision with root package name */
    public int f373154f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373155g;

    /* renamed from: h, reason: collision with root package name */
    public int f373156h;

    /* renamed from: i, reason: collision with root package name */
    public int f373157i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373158m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373159n;

    /* renamed from: o, reason: collision with root package name */
    public int f373160o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373161p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e93)) {
            return false;
        }
        r45.e93 e93Var = (r45.e93) fVar;
        return n51.f.a(this.BaseRequest, e93Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f373152d), java.lang.Long.valueOf(e93Var.f373152d)) && n51.f.a(this.f373153e, e93Var.f373153e) && n51.f.a(java.lang.Integer.valueOf(this.f373154f), java.lang.Integer.valueOf(e93Var.f373154f)) && n51.f.a(this.f373155g, e93Var.f373155g) && n51.f.a(java.lang.Integer.valueOf(this.f373156h), java.lang.Integer.valueOf(e93Var.f373156h)) && n51.f.a(java.lang.Integer.valueOf(this.f373157i), java.lang.Integer.valueOf(e93Var.f373157i)) && n51.f.a(this.f373158m, e93Var.f373158m) && n51.f.a(this.f373159n, e93Var.f373159n) && n51.f.a(java.lang.Integer.valueOf(this.f373160o), java.lang.Integer.valueOf(e93Var.f373160o)) && n51.f.a(this.f373161p, e93Var.f373161p);
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
            fVar.h(2, this.f373152d);
            java.lang.String str = this.f373153e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f373154f);
            java.lang.String str2 = this.f373155g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f373156h);
            fVar.e(7, this.f373157i);
            java.lang.String str3 = this.f373158m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f373159n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f373160o);
            java.lang.String str5 = this.f373161p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f373152d);
            java.lang.String str6 = this.f373153e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f373154f);
            java.lang.String str7 = this.f373155g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f373156h) + b36.f.e(7, this.f373157i);
            java.lang.String str8 = this.f373158m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f373159n;
            if (str9 != null) {
                e18 += b36.f.j(9, str9);
            }
            int e19 = e18 + b36.f.e(10, this.f373160o);
            java.lang.String str10 = this.f373161p;
            return str10 != null ? e19 + b36.f.j(11, str10) : e19;
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
        r45.e93 e93Var = (r45.e93) objArr[1];
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
                    e93Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                e93Var.f373152d = aVar2.i(intValue);
                return 0;
            case 3:
                e93Var.f373153e = aVar2.k(intValue);
                return 0;
            case 4:
                e93Var.f373154f = aVar2.g(intValue);
                return 0;
            case 5:
                e93Var.f373155g = aVar2.k(intValue);
                return 0;
            case 6:
                e93Var.f373156h = aVar2.g(intValue);
                return 0;
            case 7:
                e93Var.f373157i = aVar2.g(intValue);
                return 0;
            case 8:
                e93Var.f373158m = aVar2.k(intValue);
                return 0;
            case 9:
                e93Var.f373159n = aVar2.k(intValue);
                return 0;
            case 10:
                e93Var.f373160o = aVar2.g(intValue);
                return 0;
            case 11:
                e93Var.f373161p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
