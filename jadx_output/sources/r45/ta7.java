package r45;

/* loaded from: classes8.dex */
public class ta7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386260e;

    /* renamed from: f, reason: collision with root package name */
    public int f386261f;

    /* renamed from: g, reason: collision with root package name */
    public int f386262g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wa7 f386263h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta7)) {
            return false;
        }
        r45.ta7 ta7Var = (r45.ta7) fVar;
        return n51.f.a(this.f386259d, ta7Var.f386259d) && n51.f.a(this.f386260e, ta7Var.f386260e) && n51.f.a(java.lang.Integer.valueOf(this.f386261f), java.lang.Integer.valueOf(ta7Var.f386261f)) && n51.f.a(java.lang.Integer.valueOf(this.f386262g), java.lang.Integer.valueOf(ta7Var.f386262g)) && n51.f.a(this.f386263h, ta7Var.f386263h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386259d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386260e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f386261f);
            fVar.e(4, this.f386262g);
            r45.wa7 wa7Var = this.f386263h;
            if (wa7Var != null) {
                fVar.i(5, wa7Var.computeSize());
                this.f386263h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386259d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386260e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f386261f) + b36.f.e(4, this.f386262g);
            r45.wa7 wa7Var2 = this.f386263h;
            return wa7Var2 != null ? e17 + b36.f.i(5, wa7Var2.computeSize()) : e17;
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
        r45.ta7 ta7Var = (r45.ta7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ta7Var.f386259d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ta7Var.f386260e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ta7Var.f386261f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ta7Var.f386262g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.wa7 wa7Var3 = new r45.wa7();
            if (bArr != null && bArr.length > 0) {
                wa7Var3.parseFrom(bArr);
            }
            ta7Var.f386263h = wa7Var3;
        }
        return 0;
    }
}
