package r45;

/* loaded from: classes14.dex */
public class th3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f386425d;

    /* renamed from: e, reason: collision with root package name */
    public int f386426e;

    /* renamed from: g, reason: collision with root package name */
    public int f386428g;

    /* renamed from: i, reason: collision with root package name */
    public int f386430i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386431m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386432n;

    /* renamed from: o, reason: collision with root package name */
    public int f386433o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386434p;

    /* renamed from: q, reason: collision with root package name */
    public int f386435q;

    /* renamed from: r, reason: collision with root package name */
    public r45.d64 f386436r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f386437s;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f386427f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f386429h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.th3)) {
            return false;
        }
        r45.th3 th3Var = (r45.th3) fVar;
        return n51.f.a(this.BaseResponse, th3Var.BaseResponse) && n51.f.a(this.f386425d, th3Var.f386425d) && n51.f.a(java.lang.Integer.valueOf(this.f386426e), java.lang.Integer.valueOf(th3Var.f386426e)) && n51.f.a(this.f386427f, th3Var.f386427f) && n51.f.a(java.lang.Integer.valueOf(this.f386428g), java.lang.Integer.valueOf(th3Var.f386428g)) && n51.f.a(this.f386429h, th3Var.f386429h) && n51.f.a(java.lang.Integer.valueOf(this.f386430i), java.lang.Integer.valueOf(th3Var.f386430i)) && n51.f.a(this.f386431m, th3Var.f386431m) && n51.f.a(this.f386432n, th3Var.f386432n) && n51.f.a(java.lang.Integer.valueOf(this.f386433o), java.lang.Integer.valueOf(th3Var.f386433o)) && n51.f.a(this.f386434p, th3Var.f386434p) && n51.f.a(java.lang.Integer.valueOf(this.f386435q), java.lang.Integer.valueOf(th3Var.f386435q)) && n51.f.a(this.f386436r, th3Var.f386436r) && n51.f.a(this.f386437s, th3Var.f386437s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386429h;
        java.util.LinkedList linkedList2 = this.f386427f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f386425d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f386425d.writeFields(fVar);
            }
            fVar.e(3, this.f386426e);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f386428g);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f386430i);
            java.lang.String str = this.f386431m;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f386432n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f386433o);
            java.lang.String str3 = this.f386434p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            fVar.e(12, this.f386435q);
            r45.d64 d64Var = this.f386436r;
            if (d64Var != null) {
                fVar.i(13, d64Var.computeSize());
                this.f386436r.writeFields(fVar);
            }
            java.lang.String str4 = this.f386437s;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.cu5 cu5Var2 = this.f386425d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f386426e) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f386428g) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f386430i);
            java.lang.String str5 = this.f386431m;
            if (str5 != null) {
                e17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f386432n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            int e18 = e17 + b36.f.e(10, this.f386433o);
            java.lang.String str7 = this.f386434p;
            if (str7 != null) {
                e18 += b36.f.j(11, str7);
            }
            int e19 = e18 + b36.f.e(12, this.f386435q);
            r45.d64 d64Var2 = this.f386436r;
            if (d64Var2 != null) {
                e19 += b36.f.i(13, d64Var2.computeSize());
            }
            java.lang.String str8 = this.f386437s;
            return str8 != null ? e19 + b36.f.j(14, str8) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.th3 th3Var = (r45.th3) objArr[1];
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
                    th3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    th3Var.f386425d = cu5Var3;
                }
                return 0;
            case 3:
                th3Var.f386426e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    th3Var.f386427f.add(du5Var);
                }
                return 0;
            case 5:
                th3Var.f386428g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.c64 c64Var = new r45.c64();
                    if (bArr5 != null && bArr5.length > 0) {
                        c64Var.parseFrom(bArr5);
                    }
                    th3Var.f386429h.add(c64Var);
                }
                return 0;
            case 7:
                th3Var.f386430i = aVar2.g(intValue);
                return 0;
            case 8:
                th3Var.f386431m = aVar2.k(intValue);
                return 0;
            case 9:
                th3Var.f386432n = aVar2.k(intValue);
                return 0;
            case 10:
                th3Var.f386433o = aVar2.g(intValue);
                return 0;
            case 11:
                th3Var.f386434p = aVar2.k(intValue);
                return 0;
            case 12:
                th3Var.f386435q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d64 d64Var3 = new r45.d64();
                    if (bArr6 != null && bArr6.length > 0) {
                        d64Var3.parseFrom(bArr6);
                    }
                    th3Var.f386436r = d64Var3;
                }
                return 0;
            case 14:
                th3Var.f386437s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
