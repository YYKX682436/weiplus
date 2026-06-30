package r45;

/* loaded from: classes9.dex */
public class b20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370443e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n34 f370444f;

    /* renamed from: g, reason: collision with root package name */
    public r45.n34 f370445g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370446h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370447i;

    /* renamed from: m, reason: collision with root package name */
    public int f370448m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b20)) {
            return false;
        }
        r45.b20 b20Var = (r45.b20) fVar;
        return n51.f.a(this.f370442d, b20Var.f370442d) && n51.f.a(this.f370443e, b20Var.f370443e) && n51.f.a(this.f370444f, b20Var.f370444f) && n51.f.a(this.f370445g, b20Var.f370445g) && n51.f.a(this.f370446h, b20Var.f370446h) && n51.f.a(this.f370447i, b20Var.f370447i) && n51.f.a(java.lang.Integer.valueOf(this.f370448m), java.lang.Integer.valueOf(b20Var.f370448m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370442d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370443e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.n34 n34Var = this.f370444f;
            if (n34Var != null) {
                fVar.i(3, n34Var.computeSize());
                this.f370444f.writeFields(fVar);
            }
            r45.n34 n34Var2 = this.f370445g;
            if (n34Var2 != null) {
                fVar.i(4, n34Var2.computeSize());
                this.f370445g.writeFields(fVar);
            }
            java.lang.String str3 = this.f370446h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f370447i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f370448m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370442d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f370443e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.n34 n34Var3 = this.f370444f;
            if (n34Var3 != null) {
                j17 += b36.f.i(3, n34Var3.computeSize());
            }
            r45.n34 n34Var4 = this.f370445g;
            if (n34Var4 != null) {
                j17 += b36.f.i(4, n34Var4.computeSize());
            }
            java.lang.String str7 = this.f370446h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f370447i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            return j17 + b36.f.e(7, this.f370448m);
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
        r45.b20 b20Var = (r45.b20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b20Var.f370442d = aVar2.k(intValue);
                return 0;
            case 2:
                b20Var.f370443e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.n34 n34Var5 = new r45.n34();
                    if (bArr != null && bArr.length > 0) {
                        n34Var5.parseFrom(bArr);
                    }
                    b20Var.f370444f = n34Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.n34 n34Var6 = new r45.n34();
                    if (bArr2 != null && bArr2.length > 0) {
                        n34Var6.parseFrom(bArr2);
                    }
                    b20Var.f370445g = n34Var6;
                }
                return 0;
            case 5:
                b20Var.f370446h = aVar2.k(intValue);
                return 0;
            case 6:
                b20Var.f370447i = aVar2.k(intValue);
                return 0;
            case 7:
                b20Var.f370448m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
