package r45;

/* loaded from: classes9.dex */
public class wp3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389365e;

    /* renamed from: f, reason: collision with root package name */
    public int f389366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389367g;

    /* renamed from: h, reason: collision with root package name */
    public int f389368h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f389369i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389370m;

    /* renamed from: n, reason: collision with root package name */
    public int f389371n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389372o;

    /* renamed from: p, reason: collision with root package name */
    public int f389373p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f389374q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp3)) {
            return false;
        }
        r45.wp3 wp3Var = (r45.wp3) fVar;
        return n51.f.a(this.BaseResponse, wp3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f389364d), java.lang.Integer.valueOf(wp3Var.f389364d)) && n51.f.a(this.f389365e, wp3Var.f389365e) && n51.f.a(java.lang.Integer.valueOf(this.f389366f), java.lang.Integer.valueOf(wp3Var.f389366f)) && n51.f.a(this.f389367g, wp3Var.f389367g) && n51.f.a(java.lang.Integer.valueOf(this.f389368h), java.lang.Integer.valueOf(wp3Var.f389368h)) && n51.f.a(this.f389369i, wp3Var.f389369i) && n51.f.a(this.f389370m, wp3Var.f389370m) && n51.f.a(java.lang.Integer.valueOf(this.f389371n), java.lang.Integer.valueOf(wp3Var.f389371n)) && n51.f.a(this.f389372o, wp3Var.f389372o) && n51.f.a(java.lang.Integer.valueOf(this.f389373p), java.lang.Integer.valueOf(wp3Var.f389373p)) && n51.f.a(this.f389374q, wp3Var.f389374q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389369i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f389364d);
            java.lang.String str = this.f389365e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f389366f);
            java.lang.String str2 = this.f389367g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f389368h);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f389370m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f389371n);
            java.lang.String str4 = this.f389372o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f389373p);
            r45.cu5 cu5Var = this.f389374q;
            if (cu5Var == null) {
                return 0;
            }
            fVar.i(12, cu5Var.computeSize());
            this.f389374q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f389364d);
            java.lang.String str5 = this.f389365e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f389366f);
            java.lang.String str6 = this.f389367g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            int e18 = e17 + b36.f.e(6, this.f389368h) + b36.f.g(7, 8, linkedList);
            java.lang.String str7 = this.f389370m;
            if (str7 != null) {
                e18 += b36.f.j(8, str7);
            }
            int e19 = e18 + b36.f.e(9, this.f389371n);
            java.lang.String str8 = this.f389372o;
            if (str8 != null) {
                e19 += b36.f.j(10, str8);
            }
            int e27 = e19 + b36.f.e(11, this.f389373p);
            r45.cu5 cu5Var2 = this.f389374q;
            return cu5Var2 != null ? e27 + b36.f.i(12, cu5Var2.computeSize()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.wp3 wp3Var = (r45.wp3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    wp3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                wp3Var.f389364d = aVar2.g(intValue);
                return 0;
            case 3:
                wp3Var.f389365e = aVar2.k(intValue);
                return 0;
            case 4:
                wp3Var.f389366f = aVar2.g(intValue);
                return 0;
            case 5:
                wp3Var.f389367g = aVar2.k(intValue);
                return 0;
            case 6:
                wp3Var.f389368h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    wp3Var.f389369i.add(du5Var);
                }
                return 0;
            case 8:
                wp3Var.f389370m = aVar2.k(intValue);
                return 0;
            case 9:
                wp3Var.f389371n = aVar2.g(intValue);
                return 0;
            case 10:
                wp3Var.f389372o = aVar2.k(intValue);
                return 0;
            case 11:
                wp3Var.f389373p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    wp3Var.f389374q = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
