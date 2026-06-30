package r45;

/* loaded from: classes8.dex */
public class ub3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ms f387191d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ms f387192e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ms f387193f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f387194g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f387195h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ms f387196i;

    /* renamed from: m, reason: collision with root package name */
    public int f387197m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ls f387198n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ls f387199o;

    /* renamed from: p, reason: collision with root package name */
    public int f387200p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ms f387201q;

    /* renamed from: r, reason: collision with root package name */
    public r45.rb7 f387202r;

    /* renamed from: s, reason: collision with root package name */
    public int f387203s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ub3)) {
            return false;
        }
        r45.ub3 ub3Var = (r45.ub3) fVar;
        return n51.f.a(this.BaseResponse, ub3Var.BaseResponse) && n51.f.a(this.f387191d, ub3Var.f387191d) && n51.f.a(this.f387192e, ub3Var.f387192e) && n51.f.a(this.f387193f, ub3Var.f387193f) && n51.f.a(this.f387194g, ub3Var.f387194g) && n51.f.a(this.f387195h, ub3Var.f387195h) && n51.f.a(this.f387196i, ub3Var.f387196i) && n51.f.a(java.lang.Integer.valueOf(this.f387197m), java.lang.Integer.valueOf(ub3Var.f387197m)) && n51.f.a(this.f387198n, ub3Var.f387198n) && n51.f.a(this.f387199o, ub3Var.f387199o) && n51.f.a(java.lang.Integer.valueOf(this.f387200p), java.lang.Integer.valueOf(ub3Var.f387200p)) && n51.f.a(this.f387201q, ub3Var.f387201q) && n51.f.a(this.f387202r, ub3Var.f387202r) && n51.f.a(java.lang.Integer.valueOf(this.f387203s), java.lang.Integer.valueOf(ub3Var.f387203s));
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
            r45.ms msVar = this.f387191d;
            if (msVar != null) {
                fVar.i(2, msVar.computeSize());
                this.f387191d.writeFields(fVar);
            }
            r45.ms msVar2 = this.f387192e;
            if (msVar2 != null) {
                fVar.i(3, msVar2.computeSize());
                this.f387192e.writeFields(fVar);
            }
            r45.ms msVar3 = this.f387193f;
            if (msVar3 != null) {
                fVar.i(4, msVar3.computeSize());
                this.f387193f.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f387194g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f387194g.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f387195h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f387195h.writeFields(fVar);
            }
            r45.ms msVar4 = this.f387196i;
            if (msVar4 != null) {
                fVar.i(7, msVar4.computeSize());
                this.f387196i.writeFields(fVar);
            }
            fVar.e(8, this.f387197m);
            r45.ls lsVar = this.f387198n;
            if (lsVar != null) {
                fVar.i(9, lsVar.computeSize());
                this.f387198n.writeFields(fVar);
            }
            r45.ls lsVar2 = this.f387199o;
            if (lsVar2 != null) {
                fVar.i(10, lsVar2.computeSize());
                this.f387199o.writeFields(fVar);
            }
            fVar.e(11, this.f387200p);
            r45.ms msVar5 = this.f387201q;
            if (msVar5 != null) {
                fVar.i(12, msVar5.computeSize());
                this.f387201q.writeFields(fVar);
            }
            r45.rb7 rb7Var = this.f387202r;
            if (rb7Var != null) {
                fVar.i(13, rb7Var.computeSize());
                this.f387202r.writeFields(fVar);
            }
            fVar.e(14, this.f387203s);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.ms msVar6 = this.f387191d;
            if (msVar6 != null) {
                i18 += b36.f.i(2, msVar6.computeSize());
            }
            r45.ms msVar7 = this.f387192e;
            if (msVar7 != null) {
                i18 += b36.f.i(3, msVar7.computeSize());
            }
            r45.ms msVar8 = this.f387193f;
            if (msVar8 != null) {
                i18 += b36.f.i(4, msVar8.computeSize());
            }
            r45.cu5 cu5Var3 = this.f387194g;
            if (cu5Var3 != null) {
                i18 += b36.f.i(5, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f387195h;
            if (cu5Var4 != null) {
                i18 += b36.f.i(6, cu5Var4.computeSize());
            }
            r45.ms msVar9 = this.f387196i;
            if (msVar9 != null) {
                i18 += b36.f.i(7, msVar9.computeSize());
            }
            int e17 = i18 + b36.f.e(8, this.f387197m);
            r45.ls lsVar3 = this.f387198n;
            if (lsVar3 != null) {
                e17 += b36.f.i(9, lsVar3.computeSize());
            }
            r45.ls lsVar4 = this.f387199o;
            if (lsVar4 != null) {
                e17 += b36.f.i(10, lsVar4.computeSize());
            }
            int e18 = e17 + b36.f.e(11, this.f387200p);
            r45.ms msVar10 = this.f387201q;
            if (msVar10 != null) {
                e18 += b36.f.i(12, msVar10.computeSize());
            }
            r45.rb7 rb7Var2 = this.f387202r;
            if (rb7Var2 != null) {
                e18 += b36.f.i(13, rb7Var2.computeSize());
            }
            return e18 + b36.f.e(14, this.f387203s);
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
        r45.ub3 ub3Var = (r45.ub3) objArr[1];
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
                    ub3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ms msVar11 = new r45.ms();
                    if (bArr2 != null && bArr2.length > 0) {
                        msVar11.parseFrom(bArr2);
                    }
                    ub3Var.f387191d = msVar11;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ms msVar12 = new r45.ms();
                    if (bArr3 != null && bArr3.length > 0) {
                        msVar12.parseFrom(bArr3);
                    }
                    ub3Var.f387192e = msVar12;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ms msVar13 = new r45.ms();
                    if (bArr4 != null && bArr4.length > 0) {
                        msVar13.parseFrom(bArr4);
                    }
                    ub3Var.f387193f = msVar13;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var5.b(bArr5);
                    }
                    ub3Var.f387194g = cu5Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var6.b(bArr6);
                    }
                    ub3Var.f387195h = cu5Var6;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ms msVar14 = new r45.ms();
                    if (bArr7 != null && bArr7.length > 0) {
                        msVar14.parseFrom(bArr7);
                    }
                    ub3Var.f387196i = msVar14;
                }
                return 0;
            case 8:
                ub3Var.f387197m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.ls lsVar5 = new r45.ls();
                    if (bArr8 != null && bArr8.length > 0) {
                        lsVar5.parseFrom(bArr8);
                    }
                    ub3Var.f387198n = lsVar5;
                }
                return 0;
            case 10:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.ls lsVar6 = new r45.ls();
                    if (bArr9 != null && bArr9.length > 0) {
                        lsVar6.parseFrom(bArr9);
                    }
                    ub3Var.f387199o = lsVar6;
                }
                return 0;
            case 11:
                ub3Var.f387200p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.ms msVar15 = new r45.ms();
                    if (bArr10 != null && bArr10.length > 0) {
                        msVar15.parseFrom(bArr10);
                    }
                    ub3Var.f387201q = msVar15;
                }
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.rb7 rb7Var3 = new r45.rb7();
                    if (bArr11 != null && bArr11.length > 0) {
                        rb7Var3.parseFrom(bArr11);
                    }
                    ub3Var.f387202r = rb7Var3;
                }
                return 0;
            case 14:
                ub3Var.f387203s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
