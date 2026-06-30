package r45;

/* loaded from: classes10.dex */
public class ey1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f373800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373801e;

    /* renamed from: f, reason: collision with root package name */
    public long f373802f;

    /* renamed from: g, reason: collision with root package name */
    public long f373803g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373804h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373805i;

    /* renamed from: m, reason: collision with root package name */
    public r45.z34 f373806m;

    /* renamed from: n, reason: collision with root package name */
    public int f373807n;

    /* renamed from: o, reason: collision with root package name */
    public r45.in0 f373808o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ey1)) {
            return false;
        }
        r45.ey1 ey1Var = (r45.ey1) fVar;
        return n51.f.a(this.BaseRequest, ey1Var.BaseRequest) && n51.f.a(this.f373800d, ey1Var.f373800d) && n51.f.a(this.f373801e, ey1Var.f373801e) && n51.f.a(java.lang.Long.valueOf(this.f373802f), java.lang.Long.valueOf(ey1Var.f373802f)) && n51.f.a(java.lang.Long.valueOf(this.f373803g), java.lang.Long.valueOf(ey1Var.f373803g)) && n51.f.a(this.f373804h, ey1Var.f373804h) && n51.f.a(this.f373805i, ey1Var.f373805i) && n51.f.a(this.f373806m, ey1Var.f373806m) && n51.f.a(java.lang.Integer.valueOf(this.f373807n), java.lang.Integer.valueOf(ey1Var.f373807n)) && n51.f.a(this.f373808o, ey1Var.f373808o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f373800d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f373800d.writeFields(fVar);
            }
            java.lang.String str = this.f373801e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f373802f);
            fVar.h(5, this.f373803g);
            java.lang.String str2 = this.f373804h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f373805i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.z34 z34Var = this.f373806m;
            if (z34Var != null) {
                fVar.i(8, z34Var.computeSize());
                this.f373806m.writeFields(fVar);
            }
            fVar.e(9, this.f373807n);
            r45.in0 in0Var = this.f373808o;
            if (in0Var != null) {
                fVar.i(10, in0Var.computeSize());
                this.f373808o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f373800d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str4 = this.f373801e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f373802f) + b36.f.h(5, this.f373803g);
            java.lang.String str5 = this.f373804h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f373805i;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            r45.z34 z34Var2 = this.f373806m;
            if (z34Var2 != null) {
                h17 += b36.f.i(8, z34Var2.computeSize());
            }
            int e17 = h17 + b36.f.e(9, this.f373807n);
            r45.in0 in0Var2 = this.f373808o;
            return in0Var2 != null ? e17 + b36.f.i(10, in0Var2.computeSize()) : e17;
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
        r45.ey1 ey1Var = (r45.ey1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ey1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    ey1Var.f373800d = kv0Var3;
                }
                return 0;
            case 3:
                ey1Var.f373801e = aVar2.k(intValue);
                return 0;
            case 4:
                ey1Var.f373802f = aVar2.i(intValue);
                return 0;
            case 5:
                ey1Var.f373803g = aVar2.i(intValue);
                return 0;
            case 6:
                ey1Var.f373804h = aVar2.k(intValue);
                return 0;
            case 7:
                ey1Var.f373805i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.z34 z34Var3 = new r45.z34();
                    if (bArr3 != null && bArr3.length > 0) {
                        z34Var3.parseFrom(bArr3);
                    }
                    ey1Var.f373806m = z34Var3;
                }
                return 0;
            case 9:
                ey1Var.f373807n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.in0 in0Var3 = new r45.in0();
                    if (bArr4 != null && bArr4.length > 0) {
                        in0Var3.parseFrom(bArr4);
                    }
                    ey1Var.f373808o = in0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
