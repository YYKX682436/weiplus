package r45;

/* loaded from: classes9.dex */
public class t36 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386098d;

    /* renamed from: e, reason: collision with root package name */
    public int f386099e;

    /* renamed from: f, reason: collision with root package name */
    public float f386100f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f386101g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f386102h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f386103i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f386104m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f386105n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f386106o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f386107p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f386108q;

    /* renamed from: r, reason: collision with root package name */
    public int f386109r;

    /* renamed from: s, reason: collision with root package name */
    public int f386110s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f386111t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t36)) {
            return false;
        }
        r45.t36 t36Var = (r45.t36) fVar;
        return n51.f.a(this.BaseResponse, t36Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386098d), java.lang.Integer.valueOf(t36Var.f386098d)) && n51.f.a(java.lang.Integer.valueOf(this.f386099e), java.lang.Integer.valueOf(t36Var.f386099e)) && n51.f.a(java.lang.Float.valueOf(this.f386100f), java.lang.Float.valueOf(t36Var.f386100f)) && n51.f.a(this.f386101g, t36Var.f386101g) && n51.f.a(this.f386102h, t36Var.f386102h) && n51.f.a(this.f386103i, t36Var.f386103i) && n51.f.a(this.f386104m, t36Var.f386104m) && n51.f.a(this.f386105n, t36Var.f386105n) && n51.f.a(this.f386106o, t36Var.f386106o) && n51.f.a(this.f386107p, t36Var.f386107p) && n51.f.a(this.f386108q, t36Var.f386108q) && n51.f.a(java.lang.Integer.valueOf(this.f386109r), java.lang.Integer.valueOf(t36Var.f386109r)) && n51.f.a(java.lang.Integer.valueOf(this.f386110s), java.lang.Integer.valueOf(t36Var.f386110s)) && n51.f.a(this.f386111t, t36Var.f386111t);
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
            fVar.e(2, this.f386098d);
            fVar.e(3, this.f386099e);
            fVar.d(4, this.f386100f);
            r45.cu5 cu5Var = this.f386101g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f386101g.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f386102h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f386102h.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f386103i;
            if (cu5Var3 != null) {
                fVar.i(7, cu5Var3.computeSize());
                this.f386103i.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f386104m;
            if (cu5Var4 != null) {
                fVar.i(8, cu5Var4.computeSize());
                this.f386104m.writeFields(fVar);
            }
            r45.cu5 cu5Var5 = this.f386105n;
            if (cu5Var5 != null) {
                fVar.i(9, cu5Var5.computeSize());
                this.f386105n.writeFields(fVar);
            }
            r45.cu5 cu5Var6 = this.f386106o;
            if (cu5Var6 != null) {
                fVar.i(10, cu5Var6.computeSize());
                this.f386106o.writeFields(fVar);
            }
            r45.cu5 cu5Var7 = this.f386107p;
            if (cu5Var7 != null) {
                fVar.i(11, cu5Var7.computeSize());
                this.f386107p.writeFields(fVar);
            }
            r45.cu5 cu5Var8 = this.f386108q;
            if (cu5Var8 != null) {
                fVar.i(12, cu5Var8.computeSize());
                this.f386108q.writeFields(fVar);
            }
            fVar.e(13, this.f386109r);
            fVar.e(14, this.f386110s);
            java.lang.String str = this.f386111t;
            if (str != null) {
                fVar.j(15, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f386098d) + b36.f.e(3, this.f386099e) + b36.f.d(4, this.f386100f);
            r45.cu5 cu5Var9 = this.f386101g;
            if (cu5Var9 != null) {
                i18 += b36.f.i(5, cu5Var9.computeSize());
            }
            r45.cu5 cu5Var10 = this.f386102h;
            if (cu5Var10 != null) {
                i18 += b36.f.i(6, cu5Var10.computeSize());
            }
            r45.cu5 cu5Var11 = this.f386103i;
            if (cu5Var11 != null) {
                i18 += b36.f.i(7, cu5Var11.computeSize());
            }
            r45.cu5 cu5Var12 = this.f386104m;
            if (cu5Var12 != null) {
                i18 += b36.f.i(8, cu5Var12.computeSize());
            }
            r45.cu5 cu5Var13 = this.f386105n;
            if (cu5Var13 != null) {
                i18 += b36.f.i(9, cu5Var13.computeSize());
            }
            r45.cu5 cu5Var14 = this.f386106o;
            if (cu5Var14 != null) {
                i18 += b36.f.i(10, cu5Var14.computeSize());
            }
            r45.cu5 cu5Var15 = this.f386107p;
            if (cu5Var15 != null) {
                i18 += b36.f.i(11, cu5Var15.computeSize());
            }
            r45.cu5 cu5Var16 = this.f386108q;
            if (cu5Var16 != null) {
                i18 += b36.f.i(12, cu5Var16.computeSize());
            }
            int e17 = i18 + b36.f.e(13, this.f386109r) + b36.f.e(14, this.f386110s);
            java.lang.String str2 = this.f386111t;
            return str2 != null ? e17 + b36.f.j(15, str2) : e17;
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
        r45.t36 t36Var = (r45.t36) objArr[1];
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
                    t36Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                t36Var.f386098d = aVar2.g(intValue);
                return 0;
            case 3:
                t36Var.f386099e = aVar2.g(intValue);
                return 0;
            case 4:
                t36Var.f386100f = aVar2.f(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var17 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var17.b(bArr2);
                    }
                    t36Var.f386101g = cu5Var17;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var18 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var18.b(bArr3);
                    }
                    t36Var.f386102h = cu5Var18;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var19 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var19.b(bArr4);
                    }
                    t36Var.f386103i = cu5Var19;
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var20 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var20.b(bArr5);
                    }
                    t36Var.f386104m = cu5Var20;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var21 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var21.b(bArr6);
                    }
                    t36Var.f386105n = cu5Var21;
                }
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var22 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var22.b(bArr7);
                    }
                    t36Var.f386106o = cu5Var22;
                }
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var23 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var23.b(bArr8);
                    }
                    t36Var.f386107p = cu5Var23;
                }
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var24 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var24.b(bArr9);
                    }
                    t36Var.f386108q = cu5Var24;
                }
                return 0;
            case 13:
                t36Var.f386109r = aVar2.g(intValue);
                return 0;
            case 14:
                t36Var.f386110s = aVar2.g(intValue);
                return 0;
            case 15:
                t36Var.f386111t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
