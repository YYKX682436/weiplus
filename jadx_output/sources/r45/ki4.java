package r45;

/* loaded from: classes12.dex */
public class ki4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f378716d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f378717e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378718f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378719g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378720h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378721i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378722m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ki4)) {
            return false;
        }
        r45.ki4 ki4Var = (r45.ki4) fVar;
        return n51.f.a(this.f378716d, ki4Var.f378716d) && n51.f.a(this.f378717e, ki4Var.f378717e) && n51.f.a(this.f378718f, ki4Var.f378718f) && n51.f.a(this.f378719g, ki4Var.f378719g) && n51.f.a(this.f378720h, ki4Var.f378720h) && n51.f.a(this.f378721i, ki4Var.f378721i) && n51.f.a(this.f378722m, ki4Var.f378722m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f378716d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.computeSize());
                this.f378716d.writeFields(fVar);
            }
            r45.ig0 ig0Var = this.f378717e;
            if (ig0Var != null) {
                fVar.i(2, ig0Var.computeSize());
                this.f378717e.writeFields(fVar);
            }
            java.lang.String str = this.f378718f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f378719g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378720h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378721i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f378722m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f378716d;
            int i18 = cu5Var2 != null ? 0 + b36.f.i(1, cu5Var2.computeSize()) : 0;
            r45.ig0 ig0Var2 = this.f378717e;
            if (ig0Var2 != null) {
                i18 += b36.f.i(2, ig0Var2.computeSize());
            }
            java.lang.String str6 = this.f378718f;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f378719g;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f378720h;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f378721i;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f378722m;
            return str10 != null ? i18 + b36.f.j(7, str10) : i18;
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
        r45.ki4 ki4Var = (r45.ki4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    ki4Var.f378716d = cu5Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ig0 ig0Var3 = new r45.ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig0Var3.parseFrom(bArr2);
                    }
                    ki4Var.f378717e = ig0Var3;
                }
                return 0;
            case 3:
                ki4Var.f378718f = aVar2.k(intValue);
                return 0;
            case 4:
                ki4Var.f378719g = aVar2.k(intValue);
                return 0;
            case 5:
                ki4Var.f378720h = aVar2.k(intValue);
                return 0;
            case 6:
                ki4Var.f378721i = aVar2.k(intValue);
                return 0;
            case 7:
                ki4Var.f378722m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
