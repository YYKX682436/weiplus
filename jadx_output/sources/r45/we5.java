package r45;

/* loaded from: classes8.dex */
public class we5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389105d;

    /* renamed from: e, reason: collision with root package name */
    public long f389106e;

    /* renamed from: f, reason: collision with root package name */
    public int f389107f;

    /* renamed from: g, reason: collision with root package name */
    public int f389108g;

    /* renamed from: h, reason: collision with root package name */
    public int f389109h;

    /* renamed from: i, reason: collision with root package name */
    public int f389110i;

    /* renamed from: m, reason: collision with root package name */
    public int f389111m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389112n;

    /* renamed from: o, reason: collision with root package name */
    public int f389113o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389114p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we5)) {
            return false;
        }
        r45.we5 we5Var = (r45.we5) fVar;
        return n51.f.a(this.BaseResponse, we5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389105d), java.lang.Integer.valueOf(we5Var.f389105d)) && n51.f.a(java.lang.Long.valueOf(this.f389106e), java.lang.Long.valueOf(we5Var.f389106e)) && n51.f.a(java.lang.Integer.valueOf(this.f389107f), java.lang.Integer.valueOf(we5Var.f389107f)) && n51.f.a(java.lang.Integer.valueOf(this.f389108g), java.lang.Integer.valueOf(we5Var.f389108g)) && n51.f.a(java.lang.Integer.valueOf(this.f389109h), java.lang.Integer.valueOf(we5Var.f389109h)) && n51.f.a(java.lang.Integer.valueOf(this.f389110i), java.lang.Integer.valueOf(we5Var.f389110i)) && n51.f.a(java.lang.Integer.valueOf(this.f389111m), java.lang.Integer.valueOf(we5Var.f389111m)) && n51.f.a(this.f389112n, we5Var.f389112n) && n51.f.a(java.lang.Integer.valueOf(this.f389113o), java.lang.Integer.valueOf(we5Var.f389113o)) && n51.f.a(this.f389114p, we5Var.f389114p);
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
            fVar.e(3, this.f389105d);
            fVar.h(4, this.f389106e);
            fVar.e(5, this.f389107f);
            fVar.e(6, this.f389108g);
            fVar.e(7, this.f389109h);
            fVar.e(8, this.f389110i);
            fVar.e(9, this.f389111m);
            java.lang.String str = this.f389112n;
            if (str != null) {
                fVar.j(10, str);
            }
            fVar.e(11, this.f389113o);
            java.lang.String str2 = this.f389114p;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(3, this.f389105d) + b36.f.h(4, this.f389106e) + b36.f.e(5, this.f389107f) + b36.f.e(6, this.f389108g) + b36.f.e(7, this.f389109h) + b36.f.e(8, this.f389110i) + b36.f.e(9, this.f389111m);
            java.lang.String str3 = this.f389112n;
            if (str3 != null) {
                i18 += b36.f.j(10, str3);
            }
            int e17 = i18 + b36.f.e(11, this.f389113o);
            java.lang.String str4 = this.f389114p;
            return str4 != null ? e17 + b36.f.j(12, str4) : e17;
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
        r45.we5 we5Var = (r45.we5) objArr[1];
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
                    we5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                we5Var.f389105d = aVar2.g(intValue);
                return 0;
            case 4:
                we5Var.f389106e = aVar2.i(intValue);
                return 0;
            case 5:
                we5Var.f389107f = aVar2.g(intValue);
                return 0;
            case 6:
                we5Var.f389108g = aVar2.g(intValue);
                return 0;
            case 7:
                we5Var.f389109h = aVar2.g(intValue);
                return 0;
            case 8:
                we5Var.f389110i = aVar2.g(intValue);
                return 0;
            case 9:
                we5Var.f389111m = aVar2.g(intValue);
                return 0;
            case 10:
                we5Var.f389112n = aVar2.k(intValue);
                return 0;
            case 11:
                we5Var.f389113o = aVar2.g(intValue);
                return 0;
            case 12:
                we5Var.f389114p = aVar2.k(intValue);
                return 0;
        }
    }
}
