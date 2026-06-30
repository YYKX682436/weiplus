package r45;

/* loaded from: classes2.dex */
public class qg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383968f;

    /* renamed from: g, reason: collision with root package name */
    public long f383969g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rg4 f383970h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383971i;

    /* renamed from: m, reason: collision with root package name */
    public int f383972m;

    /* renamed from: n, reason: collision with root package name */
    public int f383973n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383974o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f383975p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qg4)) {
            return false;
        }
        r45.qg4 qg4Var = (r45.qg4) fVar;
        return n51.f.a(this.f383966d, qg4Var.f383966d) && n51.f.a(this.f383967e, qg4Var.f383967e) && n51.f.a(this.f383968f, qg4Var.f383968f) && n51.f.a(java.lang.Long.valueOf(this.f383969g), java.lang.Long.valueOf(qg4Var.f383969g)) && n51.f.a(this.f383970h, qg4Var.f383970h) && n51.f.a(this.f383971i, qg4Var.f383971i) && n51.f.a(java.lang.Integer.valueOf(this.f383972m), java.lang.Integer.valueOf(qg4Var.f383972m)) && n51.f.a(java.lang.Integer.valueOf(this.f383973n), java.lang.Integer.valueOf(qg4Var.f383973n)) && n51.f.a(this.f383974o, qg4Var.f383974o) && n51.f.a(this.f383975p, qg4Var.f383975p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383966d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383967e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383968f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f383969g);
            r45.rg4 rg4Var = this.f383970h;
            if (rg4Var != null) {
                fVar.i(7, rg4Var.computeSize());
                this.f383970h.writeFields(fVar);
            }
            java.lang.String str4 = this.f383971i;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f383972m);
            fVar.e(12, this.f383973n);
            java.lang.String str5 = this.f383974o;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f383975p;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383966d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f383967e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f383968f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int h17 = j17 + b36.f.h(4, this.f383969g);
            r45.rg4 rg4Var2 = this.f383970h;
            if (rg4Var2 != null) {
                h17 += b36.f.i(7, rg4Var2.computeSize());
            }
            java.lang.String str10 = this.f383971i;
            if (str10 != null) {
                h17 += b36.f.j(10, str10);
            }
            int e17 = h17 + b36.f.e(11, this.f383972m) + b36.f.e(12, this.f383973n);
            java.lang.String str11 = this.f383974o;
            if (str11 != null) {
                e17 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f383975p;
            return str12 != null ? e17 + b36.f.j(15, str12) : e17;
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
        r45.qg4 qg4Var = (r45.qg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qg4Var.f383966d = aVar2.k(intValue);
                return 0;
            case 2:
                qg4Var.f383967e = aVar2.k(intValue);
                return 0;
            case 3:
                qg4Var.f383968f = aVar2.k(intValue);
                return 0;
            case 4:
                qg4Var.f383969g = aVar2.i(intValue);
                return 0;
            case 5:
            case 6:
            case 8:
            case 9:
            case 13:
            default:
                return -1;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.rg4 rg4Var3 = new r45.rg4();
                    if (bArr != null && bArr.length > 0) {
                        rg4Var3.parseFrom(bArr);
                    }
                    qg4Var.f383970h = rg4Var3;
                }
                return 0;
            case 10:
                qg4Var.f383971i = aVar2.k(intValue);
                return 0;
            case 11:
                qg4Var.f383972m = aVar2.g(intValue);
                return 0;
            case 12:
                qg4Var.f383973n = aVar2.g(intValue);
                return 0;
            case 14:
                qg4Var.f383974o = aVar2.k(intValue);
                return 0;
            case 15:
                qg4Var.f383975p = aVar2.k(intValue);
                return 0;
        }
    }
}
