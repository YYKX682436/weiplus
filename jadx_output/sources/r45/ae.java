package r45;

/* loaded from: classes2.dex */
public class ae extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369953d;

    /* renamed from: e, reason: collision with root package name */
    public int f369954e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369955f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369956g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ms5 f369957h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369958i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369959m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369960n;

    /* renamed from: o, reason: collision with root package name */
    public int f369961o;

    /* renamed from: p, reason: collision with root package name */
    public int f369962p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ae)) {
            return false;
        }
        r45.ae aeVar = (r45.ae) fVar;
        return n51.f.a(this.f369953d, aeVar.f369953d) && n51.f.a(java.lang.Integer.valueOf(this.f369954e), java.lang.Integer.valueOf(aeVar.f369954e)) && n51.f.a(this.f369955f, aeVar.f369955f) && n51.f.a(this.f369956g, aeVar.f369956g) && n51.f.a(this.f369957h, aeVar.f369957h) && n51.f.a(this.f369958i, aeVar.f369958i) && n51.f.a(this.f369959m, aeVar.f369959m) && n51.f.a(this.f369960n, aeVar.f369960n) && n51.f.a(java.lang.Integer.valueOf(this.f369961o), java.lang.Integer.valueOf(aeVar.f369961o)) && n51.f.a(java.lang.Integer.valueOf(this.f369962p), java.lang.Integer.valueOf(aeVar.f369962p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369953d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f369954e);
            java.lang.String str2 = this.f369955f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f369956g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.ms5 ms5Var = this.f369957h;
            if (ms5Var != null) {
                fVar.i(5, ms5Var.computeSize());
                this.f369957h.writeFields(fVar);
            }
            java.lang.String str4 = this.f369958i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f369959m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f369960n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f369961o);
            fVar.e(10, this.f369962p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f369953d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f369954e);
            java.lang.String str8 = this.f369955f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f369956g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            r45.ms5 ms5Var2 = this.f369957h;
            if (ms5Var2 != null) {
                j17 += b36.f.i(5, ms5Var2.computeSize());
            }
            java.lang.String str10 = this.f369958i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f369959m;
            if (str11 != null) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f369960n;
            if (str12 != null) {
                j17 += b36.f.j(8, str12);
            }
            return j17 + b36.f.e(9, this.f369961o) + b36.f.e(10, this.f369962p);
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
        r45.ae aeVar = (r45.ae) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aeVar.f369953d = aVar2.k(intValue);
                return 0;
            case 2:
                aeVar.f369954e = aVar2.g(intValue);
                return 0;
            case 3:
                aeVar.f369955f = aVar2.k(intValue);
                return 0;
            case 4:
                aeVar.f369956g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ms5 ms5Var3 = new r45.ms5();
                    if (bArr != null && bArr.length > 0) {
                        ms5Var3.parseFrom(bArr);
                    }
                    aeVar.f369957h = ms5Var3;
                }
                return 0;
            case 6:
                aeVar.f369958i = aVar2.k(intValue);
                return 0;
            case 7:
                aeVar.f369959m = aVar2.k(intValue);
                return 0;
            case 8:
                aeVar.f369960n = aVar2.k(intValue);
                return 0;
            case 9:
                aeVar.f369961o = aVar2.g(intValue);
                return 0;
            case 10:
                aeVar.f369962p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
