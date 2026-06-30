package r45;

/* loaded from: classes9.dex */
public class xt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390384d;

    /* renamed from: e, reason: collision with root package name */
    public int f390385e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390386f;

    /* renamed from: g, reason: collision with root package name */
    public r45.iu f390387g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390388h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt)) {
            return false;
        }
        r45.xt xtVar = (r45.xt) fVar;
        return n51.f.a(this.f390384d, xtVar.f390384d) && n51.f.a(java.lang.Integer.valueOf(this.f390385e), java.lang.Integer.valueOf(xtVar.f390385e)) && n51.f.a(this.f390386f, xtVar.f390386f) && n51.f.a(this.f390387g, xtVar.f390387g) && n51.f.a(this.f390388h, xtVar.f390388h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390384d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f390385e);
            java.lang.String str2 = this.f390386f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.iu iuVar = this.f390387g;
            if (iuVar != null) {
                fVar.i(4, iuVar.computeSize());
                this.f390387g.writeFields(fVar);
            }
            java.lang.String str3 = this.f390388h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390384d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f390385e);
            java.lang.String str5 = this.f390386f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            r45.iu iuVar2 = this.f390387g;
            if (iuVar2 != null) {
                j17 += b36.f.i(4, iuVar2.computeSize());
            }
            java.lang.String str6 = this.f390388h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.xt xtVar = (r45.xt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xtVar.f390384d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xtVar.f390385e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            xtVar.f390386f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            xtVar.f390388h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.iu iuVar3 = new r45.iu();
            if (bArr != null && bArr.length > 0) {
                iuVar3.parseFrom(bArr);
            }
            xtVar.f390387g = iuVar3;
        }
        return 0;
    }
}
