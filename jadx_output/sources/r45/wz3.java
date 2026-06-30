package r45;

/* loaded from: classes9.dex */
public class wz3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389596e;

    /* renamed from: f, reason: collision with root package name */
    public r45.td0 f389597f;

    /* renamed from: g, reason: collision with root package name */
    public r45.td0 f389598g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389599h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389600i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz3)) {
            return false;
        }
        r45.wz3 wz3Var = (r45.wz3) fVar;
        return n51.f.a(this.f389595d, wz3Var.f389595d) && n51.f.a(this.f389596e, wz3Var.f389596e) && n51.f.a(this.f389597f, wz3Var.f389597f) && n51.f.a(this.f389598g, wz3Var.f389598g) && n51.f.a(this.f389599h, wz3Var.f389599h) && n51.f.a(this.f389600i, wz3Var.f389600i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389595d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389596e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.td0 td0Var = this.f389597f;
            if (td0Var != null) {
                fVar.i(3, td0Var.computeSize());
                this.f389597f.writeFields(fVar);
            }
            r45.td0 td0Var2 = this.f389598g;
            if (td0Var2 != null) {
                fVar.i(4, td0Var2.computeSize());
                this.f389598g.writeFields(fVar);
            }
            java.lang.String str3 = this.f389599h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389600i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f389595d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f389596e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.td0 td0Var3 = this.f389597f;
            if (td0Var3 != null) {
                j17 += b36.f.i(3, td0Var3.computeSize());
            }
            r45.td0 td0Var4 = this.f389598g;
            if (td0Var4 != null) {
                j17 += b36.f.i(4, td0Var4.computeSize());
            }
            java.lang.String str7 = this.f389599h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f389600i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.wz3 wz3Var = (r45.wz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wz3Var.f389595d = aVar2.k(intValue);
                return 0;
            case 2:
                wz3Var.f389596e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.td0 td0Var5 = new r45.td0();
                    if (bArr != null && bArr.length > 0) {
                        td0Var5.parseFrom(bArr);
                    }
                    wz3Var.f389597f = td0Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.td0 td0Var6 = new r45.td0();
                    if (bArr2 != null && bArr2.length > 0) {
                        td0Var6.parseFrom(bArr2);
                    }
                    wz3Var.f389598g = td0Var6;
                }
                return 0;
            case 5:
                wz3Var.f389599h = aVar2.k(intValue);
                return 0;
            case 6:
                wz3Var.f389600i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
