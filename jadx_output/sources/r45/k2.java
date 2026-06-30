package r45;

/* loaded from: classes4.dex */
public class k2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378316d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378317e;

    /* renamed from: f, reason: collision with root package name */
    public int f378318f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378319g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378320h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378321i;

    /* renamed from: m, reason: collision with root package name */
    public long f378322m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k2)) {
            return false;
        }
        r45.k2 k2Var = (r45.k2) fVar;
        return n51.f.a(this.BaseRequest, k2Var.BaseRequest) && n51.f.a(this.f378316d, k2Var.f378316d) && n51.f.a(this.f378317e, k2Var.f378317e) && n51.f.a(java.lang.Integer.valueOf(this.f378318f), java.lang.Integer.valueOf(k2Var.f378318f)) && n51.f.a(this.f378319g, k2Var.f378319g) && n51.f.a(this.f378320h, k2Var.f378320h) && n51.f.a(this.f378321i, k2Var.f378321i) && n51.f.a(java.lang.Long.valueOf(this.f378322m), java.lang.Long.valueOf(k2Var.f378322m));
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
            java.lang.String str = this.f378316d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378317e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378318f);
            java.lang.String str3 = this.f378319g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378320h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f378321i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f378322m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f378316d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f378317e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f378318f);
            java.lang.String str8 = this.f378319g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f378320h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f378321i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.h(8, this.f378322m);
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
        r45.k2 k2Var = (r45.k2) objArr[1];
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
                    k2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                k2Var.f378316d = aVar2.k(intValue);
                return 0;
            case 3:
                k2Var.f378317e = aVar2.k(intValue);
                return 0;
            case 4:
                k2Var.f378318f = aVar2.g(intValue);
                return 0;
            case 5:
                k2Var.f378319g = aVar2.k(intValue);
                return 0;
            case 6:
                k2Var.f378320h = aVar2.k(intValue);
                return 0;
            case 7:
                k2Var.f378321i = aVar2.k(intValue);
                return 0;
            case 8:
                k2Var.f378322m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
