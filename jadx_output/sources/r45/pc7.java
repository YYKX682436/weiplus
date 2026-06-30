package r45;

/* loaded from: classes7.dex */
public class pc7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382944d;

    /* renamed from: e, reason: collision with root package name */
    public int f382945e;

    /* renamed from: f, reason: collision with root package name */
    public int f382946f;

    /* renamed from: g, reason: collision with root package name */
    public long f382947g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f382948h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382949i;

    /* renamed from: m, reason: collision with root package name */
    public r45.hd7 f382950m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382951n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pc7)) {
            return false;
        }
        r45.pc7 pc7Var = (r45.pc7) fVar;
        return n51.f.a(this.f382944d, pc7Var.f382944d) && n51.f.a(java.lang.Integer.valueOf(this.f382945e), java.lang.Integer.valueOf(pc7Var.f382945e)) && n51.f.a(java.lang.Integer.valueOf(this.f382946f), java.lang.Integer.valueOf(pc7Var.f382946f)) && n51.f.a(java.lang.Long.valueOf(this.f382947g), java.lang.Long.valueOf(pc7Var.f382947g)) && n51.f.a(java.lang.Boolean.valueOf(this.f382948h), java.lang.Boolean.valueOf(pc7Var.f382948h)) && n51.f.a(this.f382949i, pc7Var.f382949i) && n51.f.a(this.f382950m, pc7Var.f382950m) && n51.f.a(this.f382951n, pc7Var.f382951n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382944d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382945e);
            fVar.e(3, this.f382946f);
            fVar.h(4, this.f382947g);
            fVar.a(5, this.f382948h);
            java.lang.String str2 = this.f382949i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.hd7 hd7Var = this.f382950m;
            if (hd7Var != null) {
                fVar.i(10, hd7Var.computeSize());
                this.f382950m.writeFields(fVar);
            }
            java.lang.String str3 = this.f382951n;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382944d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f382945e) + b36.f.e(3, this.f382946f) + b36.f.h(4, this.f382947g) + b36.f.a(5, this.f382948h);
            java.lang.String str5 = this.f382949i;
            if (str5 != null) {
                j17 += b36.f.j(6, str5);
            }
            r45.hd7 hd7Var2 = this.f382950m;
            if (hd7Var2 != null) {
                j17 += b36.f.i(10, hd7Var2.computeSize());
            }
            java.lang.String str6 = this.f382951n;
            return str6 != null ? j17 + b36.f.j(11, str6) : j17;
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
        r45.pc7 pc7Var = (r45.pc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 10) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.hd7 hd7Var3 = new r45.hd7();
                if (bArr != null && bArr.length > 0) {
                    hd7Var3.parseFrom(bArr);
                }
                pc7Var.f382950m = hd7Var3;
            }
            return 0;
        }
        if (intValue == 11) {
            pc7Var.f382951n = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                pc7Var.f382944d = aVar2.k(intValue);
                return 0;
            case 2:
                pc7Var.f382945e = aVar2.g(intValue);
                return 0;
            case 3:
                pc7Var.f382946f = aVar2.g(intValue);
                return 0;
            case 4:
                pc7Var.f382947g = aVar2.i(intValue);
                return 0;
            case 5:
                pc7Var.f382948h = aVar2.c(intValue);
                return 0;
            case 6:
                pc7Var.f382949i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
