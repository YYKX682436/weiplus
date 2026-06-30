package r45;

/* loaded from: classes2.dex */
public class pg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383029f;

    /* renamed from: g, reason: collision with root package name */
    public long f383030g;

    /* renamed from: h, reason: collision with root package name */
    public long f383031h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ft5 f383032i;

    /* renamed from: m, reason: collision with root package name */
    public r45.an6 f383033m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383034n;

    /* renamed from: o, reason: collision with root package name */
    public int f383035o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383036p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg5)) {
            return false;
        }
        r45.pg5 pg5Var = (r45.pg5) fVar;
        return n51.f.a(this.BaseResponse, pg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383027d), java.lang.Integer.valueOf(pg5Var.f383027d)) && n51.f.a(this.f383028e, pg5Var.f383028e) && n51.f.a(this.f383029f, pg5Var.f383029f) && n51.f.a(java.lang.Long.valueOf(this.f383030g), java.lang.Long.valueOf(pg5Var.f383030g)) && n51.f.a(java.lang.Long.valueOf(this.f383031h), java.lang.Long.valueOf(pg5Var.f383031h)) && n51.f.a(this.f383032i, pg5Var.f383032i) && n51.f.a(this.f383033m, pg5Var.f383033m) && n51.f.a(this.f383034n, pg5Var.f383034n) && n51.f.a(java.lang.Integer.valueOf(this.f383035o), java.lang.Integer.valueOf(pg5Var.f383035o)) && n51.f.a(this.f383036p, pg5Var.f383036p);
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
            fVar.e(2, this.f383027d);
            java.lang.String str = this.f383028e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383029f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f383030g);
            fVar.h(6, this.f383031h);
            r45.ft5 ft5Var = this.f383032i;
            if (ft5Var != null) {
                fVar.i(7, ft5Var.computeSize());
                this.f383032i.writeFields(fVar);
            }
            r45.an6 an6Var = this.f383033m;
            if (an6Var != null) {
                fVar.i(8, an6Var.computeSize());
                this.f383033m.writeFields(fVar);
            }
            java.lang.String str3 = this.f383034n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f383035o);
            java.lang.String str4 = this.f383036p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383027d);
            java.lang.String str5 = this.f383028e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383029f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int h17 = i18 + b36.f.h(5, this.f383030g) + b36.f.h(6, this.f383031h);
            r45.ft5 ft5Var2 = this.f383032i;
            if (ft5Var2 != null) {
                h17 += b36.f.i(7, ft5Var2.computeSize());
            }
            r45.an6 an6Var2 = this.f383033m;
            if (an6Var2 != null) {
                h17 += b36.f.i(8, an6Var2.computeSize());
            }
            java.lang.String str7 = this.f383034n;
            if (str7 != null) {
                h17 += b36.f.j(9, str7);
            }
            int e17 = h17 + b36.f.e(10, this.f383035o);
            java.lang.String str8 = this.f383036p;
            return str8 != null ? e17 + b36.f.j(11, str8) : e17;
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
        r45.pg5 pg5Var = (r45.pg5) objArr[1];
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
                    pg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                pg5Var.f383027d = aVar2.g(intValue);
                return 0;
            case 3:
                pg5Var.f383028e = aVar2.k(intValue);
                return 0;
            case 4:
                pg5Var.f383029f = aVar2.k(intValue);
                return 0;
            case 5:
                pg5Var.f383030g = aVar2.i(intValue);
                return 0;
            case 6:
                pg5Var.f383031h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ft5 ft5Var3 = new r45.ft5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ft5Var3.parseFrom(bArr2);
                    }
                    pg5Var.f383032i = ft5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr3 != null && bArr3.length > 0) {
                        an6Var3.parseFrom(bArr3);
                    }
                    pg5Var.f383033m = an6Var3;
                }
                return 0;
            case 9:
                pg5Var.f383034n = aVar2.k(intValue);
                return 0;
            case 10:
                pg5Var.f383035o = aVar2.g(intValue);
                return 0;
            case 11:
                pg5Var.f383036p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
