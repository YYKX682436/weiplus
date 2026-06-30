package r45;

/* loaded from: classes8.dex */
public class gf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375185d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375186e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f375187f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f375188g;

    /* renamed from: h, reason: collision with root package name */
    public long f375189h;

    /* renamed from: i, reason: collision with root package name */
    public int f375190i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f375191m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375192n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375193o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gf3)) {
            return false;
        }
        r45.gf3 gf3Var = (r45.gf3) fVar;
        return n51.f.a(this.BaseResponse, gf3Var.BaseResponse) && n51.f.a(this.f375185d, gf3Var.f375185d) && n51.f.a(this.f375186e, gf3Var.f375186e) && n51.f.a(java.lang.Boolean.valueOf(this.f375187f), java.lang.Boolean.valueOf(gf3Var.f375187f)) && n51.f.a(java.lang.Boolean.valueOf(this.f375188g), java.lang.Boolean.valueOf(gf3Var.f375188g)) && n51.f.a(java.lang.Long.valueOf(this.f375189h), java.lang.Long.valueOf(gf3Var.f375189h)) && n51.f.a(java.lang.Integer.valueOf(this.f375190i), java.lang.Integer.valueOf(gf3Var.f375190i)) && n51.f.a(java.lang.Boolean.valueOf(this.f375191m), java.lang.Boolean.valueOf(gf3Var.f375191m)) && n51.f.a(this.f375192n, gf3Var.f375192n) && n51.f.a(this.f375193o, gf3Var.f375193o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f375185d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375186e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f375187f);
            fVar.a(5, this.f375188g);
            fVar.h(6, this.f375189h);
            fVar.e(7, this.f375190i);
            fVar.a(8, this.f375191m);
            java.lang.String str3 = this.f375192n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f375193o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f375185d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f375186e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int a17 = i18 + b36.f.a(4, this.f375187f) + b36.f.a(5, this.f375188g) + b36.f.h(6, this.f375189h) + b36.f.e(7, this.f375190i) + b36.f.a(8, this.f375191m);
            java.lang.String str7 = this.f375192n;
            if (str7 != null) {
                a17 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f375193o;
            return str8 != null ? a17 + b36.f.j(10, str8) : a17;
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
        r45.gf3 gf3Var = (r45.gf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    gf3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gf3Var.f375185d = aVar2.k(intValue);
                return 0;
            case 3:
                gf3Var.f375186e = aVar2.k(intValue);
                return 0;
            case 4:
                gf3Var.f375187f = aVar2.c(intValue);
                return 0;
            case 5:
                gf3Var.f375188g = aVar2.c(intValue);
                return 0;
            case 6:
                gf3Var.f375189h = aVar2.i(intValue);
                return 0;
            case 7:
                gf3Var.f375190i = aVar2.g(intValue);
                return 0;
            case 8:
                gf3Var.f375191m = aVar2.c(intValue);
                return 0;
            case 9:
                gf3Var.f375192n = aVar2.k(intValue);
                return 0;
            case 10:
                gf3Var.f375193o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
