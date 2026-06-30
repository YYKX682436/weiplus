package r45;

/* loaded from: classes12.dex */
public class i1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376639e;

    /* renamed from: f, reason: collision with root package name */
    public int f376640f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376641g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376642h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376643i;

    /* renamed from: m, reason: collision with root package name */
    public int f376644m;

    /* renamed from: n, reason: collision with root package name */
    public int f376645n;

    /* renamed from: o, reason: collision with root package name */
    public int f376646o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376647p;

    /* renamed from: q, reason: collision with root package name */
    public int f376648q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376649r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f376650s;

    /* renamed from: t, reason: collision with root package name */
    public int f376651t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f376652u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f376653v;

    /* renamed from: w, reason: collision with root package name */
    public int f376654w;

    /* renamed from: x, reason: collision with root package name */
    public r45.mg7 f376655x;

    /* renamed from: y, reason: collision with root package name */
    public r45.jg7 f376656y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i1)) {
            return false;
        }
        r45.i1 i1Var = (r45.i1) fVar;
        return n51.f.a(this.f376638d, i1Var.f376638d) && n51.f.a(this.f376639e, i1Var.f376639e) && n51.f.a(java.lang.Integer.valueOf(this.f376640f), java.lang.Integer.valueOf(i1Var.f376640f)) && n51.f.a(this.f376641g, i1Var.f376641g) && n51.f.a(this.f376642h, i1Var.f376642h) && n51.f.a(this.f376643i, i1Var.f376643i) && n51.f.a(java.lang.Integer.valueOf(this.f376644m), java.lang.Integer.valueOf(i1Var.f376644m)) && n51.f.a(java.lang.Integer.valueOf(this.f376645n), java.lang.Integer.valueOf(i1Var.f376645n)) && n51.f.a(java.lang.Integer.valueOf(this.f376646o), java.lang.Integer.valueOf(i1Var.f376646o)) && n51.f.a(this.f376647p, i1Var.f376647p) && n51.f.a(java.lang.Integer.valueOf(this.f376648q), java.lang.Integer.valueOf(i1Var.f376648q)) && n51.f.a(this.f376649r, i1Var.f376649r) && n51.f.a(this.f376650s, i1Var.f376650s) && n51.f.a(java.lang.Integer.valueOf(this.f376651t), java.lang.Integer.valueOf(i1Var.f376651t)) && n51.f.a(this.f376652u, i1Var.f376652u) && n51.f.a(this.f376653v, i1Var.f376653v) && n51.f.a(java.lang.Integer.valueOf(this.f376654w), java.lang.Integer.valueOf(i1Var.f376654w)) && n51.f.a(this.f376655x, i1Var.f376655x) && n51.f.a(this.f376656y, i1Var.f376656y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376638d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376639e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f376640f);
            java.lang.String str3 = this.f376641g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f376642h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f376643i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(8, this.f376644m);
            fVar.e(9, this.f376645n);
            fVar.e(10, this.f376646o);
            java.lang.String str6 = this.f376647p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f376648q);
            java.lang.String str7 = this.f376649r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f376650s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.e(15, this.f376651t);
            java.lang.String str9 = this.f376652u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f376653v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            fVar.e(18, this.f376654w);
            r45.mg7 mg7Var = this.f376655x;
            if (mg7Var != null) {
                fVar.i(19, mg7Var.computeSize());
                this.f376655x.writeFields(fVar);
            }
            r45.jg7 jg7Var = this.f376656y;
            if (jg7Var != null) {
                fVar.i(20, jg7Var.computeSize());
                this.f376656y.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f376638d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f376639e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            int e17 = j17 + b36.f.e(3, this.f376640f);
            java.lang.String str13 = this.f376641g;
            if (str13 != null) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f376642h;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f376643i;
            if (str15 != null) {
                e17 += b36.f.j(6, str15);
            }
            int e18 = e17 + b36.f.e(8, this.f376644m) + b36.f.e(9, this.f376645n) + b36.f.e(10, this.f376646o);
            java.lang.String str16 = this.f376647p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int e19 = e18 + b36.f.e(12, this.f376648q);
            java.lang.String str17 = this.f376649r;
            if (str17 != null) {
                e19 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f376650s;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            int e27 = e19 + b36.f.e(15, this.f376651t);
            java.lang.String str19 = this.f376652u;
            if (str19 != null) {
                e27 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f376653v;
            if (str20 != null) {
                e27 += b36.f.j(17, str20);
            }
            int e28 = e27 + b36.f.e(18, this.f376654w);
            r45.mg7 mg7Var2 = this.f376655x;
            if (mg7Var2 != null) {
                e28 += b36.f.i(19, mg7Var2.computeSize());
            }
            r45.jg7 jg7Var2 = this.f376656y;
            return jg7Var2 != null ? e28 + b36.f.i(20, jg7Var2.computeSize()) : e28;
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
        r45.i1 i1Var = (r45.i1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i1Var.f376638d = aVar2.k(intValue);
                return 0;
            case 2:
                i1Var.f376639e = aVar2.k(intValue);
                return 0;
            case 3:
                i1Var.f376640f = aVar2.g(intValue);
                return 0;
            case 4:
                i1Var.f376641g = aVar2.k(intValue);
                return 0;
            case 5:
                i1Var.f376642h = aVar2.k(intValue);
                return 0;
            case 6:
                i1Var.f376643i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                i1Var.f376644m = aVar2.g(intValue);
                return 0;
            case 9:
                i1Var.f376645n = aVar2.g(intValue);
                return 0;
            case 10:
                i1Var.f376646o = aVar2.g(intValue);
                return 0;
            case 11:
                i1Var.f376647p = aVar2.k(intValue);
                return 0;
            case 12:
                i1Var.f376648q = aVar2.g(intValue);
                return 0;
            case 13:
                i1Var.f376649r = aVar2.k(intValue);
                return 0;
            case 14:
                i1Var.f376650s = aVar2.k(intValue);
                return 0;
            case 15:
                i1Var.f376651t = aVar2.g(intValue);
                return 0;
            case 16:
                i1Var.f376652u = aVar2.k(intValue);
                return 0;
            case 17:
                i1Var.f376653v = aVar2.k(intValue);
                return 0;
            case 18:
                i1Var.f376654w = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.mg7 mg7Var3 = new r45.mg7();
                    if (bArr != null && bArr.length > 0) {
                        mg7Var3.parseFrom(bArr);
                    }
                    i1Var.f376655x = mg7Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.jg7 jg7Var3 = new r45.jg7();
                    if (bArr2 != null && bArr2.length > 0) {
                        jg7Var3.parseFrom(bArr2);
                    }
                    i1Var.f376656y = jg7Var3;
                }
                return 0;
        }
    }
}
