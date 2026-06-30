package r45;

/* loaded from: classes9.dex */
public class t56 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386161e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bx6 f386162f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386163g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386164h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t56)) {
            return false;
        }
        r45.t56 t56Var = (r45.t56) fVar;
        return n51.f.a(this.f386160d, t56Var.f386160d) && n51.f.a(this.f386161e, t56Var.f386161e) && n51.f.a(this.f386162f, t56Var.f386162f) && n51.f.a(this.f386163g, t56Var.f386163g) && n51.f.a(this.f386164h, t56Var.f386164h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386160d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386161e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.bx6 bx6Var = this.f386162f;
            if (bx6Var != null) {
                fVar.i(3, bx6Var.computeSize());
                this.f386162f.writeFields(fVar);
            }
            java.lang.String str3 = this.f386163g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386164h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f386160d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f386161e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.bx6 bx6Var2 = this.f386162f;
            if (bx6Var2 != null) {
                j17 += b36.f.i(3, bx6Var2.computeSize());
            }
            java.lang.String str7 = this.f386163g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386164h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.t56 t56Var = (r45.t56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t56Var.f386160d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            t56Var.f386161e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                t56Var.f386163g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            t56Var.f386164h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.bx6 bx6Var3 = new r45.bx6();
            if (bArr != null && bArr.length > 0) {
                bx6Var3.parseFrom(bArr);
            }
            t56Var.f386162f = bx6Var3;
        }
        return 0;
    }
}
