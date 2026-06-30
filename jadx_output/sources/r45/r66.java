package r45;

/* loaded from: classes4.dex */
public class r66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384578f;

    /* renamed from: g, reason: collision with root package name */
    public int f384579g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ap0 f384580h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r66)) {
            return false;
        }
        r45.r66 r66Var = (r45.r66) fVar;
        return n51.f.a(this.f384576d, r66Var.f384576d) && n51.f.a(this.f384577e, r66Var.f384577e) && n51.f.a(this.f384578f, r66Var.f384578f) && n51.f.a(java.lang.Integer.valueOf(this.f384579g), java.lang.Integer.valueOf(r66Var.f384579g)) && n51.f.a(this.f384580h, r66Var.f384580h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384576d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384577e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384578f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f384579g);
            r45.ap0 ap0Var = this.f384580h;
            if (ap0Var != null) {
                fVar.i(5, ap0Var.computeSize());
                this.f384580h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f384576d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f384577e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f384578f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f384579g);
            r45.ap0 ap0Var2 = this.f384580h;
            return ap0Var2 != null ? e17 + b36.f.i(5, ap0Var2.computeSize()) : e17;
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
        r45.r66 r66Var = (r45.r66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r66Var.f384576d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r66Var.f384577e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            r66Var.f384578f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            r66Var.f384579g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ap0 ap0Var3 = new r45.ap0();
            if (bArr != null && bArr.length > 0) {
                ap0Var3.parseFrom(bArr);
            }
            r66Var.f384580h = ap0Var3;
        }
        return 0;
    }
}
