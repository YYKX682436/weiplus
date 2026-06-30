package r45;

/* loaded from: classes8.dex */
public class tc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386296d;

    /* renamed from: e, reason: collision with root package name */
    public int f386297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386298f;

    /* renamed from: g, reason: collision with root package name */
    public int f386299g;

    /* renamed from: h, reason: collision with root package name */
    public int f386300h;

    /* renamed from: i, reason: collision with root package name */
    public long f386301i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ot5 f386302m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386303n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kt5 f386304o;

    /* renamed from: p, reason: collision with root package name */
    public int f386305p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386306q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f386307r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f386308s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tc3)) {
            return false;
        }
        r45.tc3 tc3Var = (r45.tc3) fVar;
        return n51.f.a(this.BaseResponse, tc3Var.BaseResponse) && n51.f.a(this.f386296d, tc3Var.f386296d) && n51.f.a(java.lang.Integer.valueOf(this.f386297e), java.lang.Integer.valueOf(tc3Var.f386297e)) && n51.f.a(this.f386298f, tc3Var.f386298f) && n51.f.a(java.lang.Integer.valueOf(this.f386299g), java.lang.Integer.valueOf(tc3Var.f386299g)) && n51.f.a(java.lang.Integer.valueOf(this.f386300h), java.lang.Integer.valueOf(tc3Var.f386300h)) && n51.f.a(java.lang.Long.valueOf(this.f386301i), java.lang.Long.valueOf(tc3Var.f386301i)) && n51.f.a(this.f386302m, tc3Var.f386302m) && n51.f.a(this.f386303n, tc3Var.f386303n) && n51.f.a(this.f386304o, tc3Var.f386304o) && n51.f.a(java.lang.Integer.valueOf(this.f386305p), java.lang.Integer.valueOf(tc3Var.f386305p)) && n51.f.a(this.f386306q, tc3Var.f386306q) && n51.f.a(this.f386307r, tc3Var.f386307r) && n51.f.a(this.f386308s, tc3Var.f386308s);
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
            java.lang.String str = this.f386296d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f386297e);
            java.lang.String str2 = this.f386298f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f386299g);
            fVar.e(6, this.f386300h);
            fVar.h(7, this.f386301i);
            r45.ot5 ot5Var = this.f386302m;
            if (ot5Var != null) {
                fVar.i(8, ot5Var.computeSize());
                this.f386302m.writeFields(fVar);
            }
            java.lang.String str3 = this.f386303n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            r45.kt5 kt5Var = this.f386304o;
            if (kt5Var != null) {
                fVar.i(10, kt5Var.computeSize());
                this.f386304o.writeFields(fVar);
            }
            fVar.e(11, this.f386305p);
            java.lang.String str4 = this.f386306q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            r45.cu5 cu5Var = this.f386307r;
            if (cu5Var != null) {
                fVar.i(13, cu5Var.computeSize());
                this.f386307r.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f386308s;
            if (cu5Var2 != null) {
                fVar.i(14, cu5Var2.computeSize());
                this.f386308s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str5 = this.f386296d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f386297e);
            java.lang.String str6 = this.f386298f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f386299g) + b36.f.e(6, this.f386300h) + b36.f.h(7, this.f386301i);
            r45.ot5 ot5Var2 = this.f386302m;
            if (ot5Var2 != null) {
                e18 += b36.f.i(8, ot5Var2.computeSize());
            }
            java.lang.String str7 = this.f386303n;
            if (str7 != null) {
                e18 += b36.f.j(9, str7);
            }
            r45.kt5 kt5Var2 = this.f386304o;
            if (kt5Var2 != null) {
                e18 += b36.f.i(10, kt5Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(11, this.f386305p);
            java.lang.String str8 = this.f386306q;
            if (str8 != null) {
                e19 += b36.f.j(12, str8);
            }
            r45.cu5 cu5Var3 = this.f386307r;
            if (cu5Var3 != null) {
                e19 += b36.f.i(13, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f386308s;
            return cu5Var4 != null ? e19 + b36.f.i(14, cu5Var4.computeSize()) : e19;
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
        r45.tc3 tc3Var = (r45.tc3) objArr[1];
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
                    tc3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                tc3Var.f386296d = aVar2.k(intValue);
                return 0;
            case 3:
                tc3Var.f386297e = aVar2.g(intValue);
                return 0;
            case 4:
                tc3Var.f386298f = aVar2.k(intValue);
                return 0;
            case 5:
                tc3Var.f386299g = aVar2.g(intValue);
                return 0;
            case 6:
                tc3Var.f386300h = aVar2.g(intValue);
                return 0;
            case 7:
                tc3Var.f386301i = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ot5 ot5Var3 = new r45.ot5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ot5Var3.parseFrom(bArr2);
                    }
                    tc3Var.f386302m = ot5Var3;
                }
                return 0;
            case 9:
                tc3Var.f386303n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.kt5 kt5Var3 = new r45.kt5();
                    if (bArr3 != null && bArr3.length > 0) {
                        kt5Var3.parseFrom(bArr3);
                    }
                    tc3Var.f386304o = kt5Var3;
                }
                return 0;
            case 11:
                tc3Var.f386305p = aVar2.g(intValue);
                return 0;
            case 12:
                tc3Var.f386306q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var5.b(bArr4);
                    }
                    tc3Var.f386307r = cu5Var5;
                }
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    tc3Var.f386308s = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
