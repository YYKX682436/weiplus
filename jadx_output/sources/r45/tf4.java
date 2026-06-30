package r45;

/* loaded from: classes9.dex */
public class tf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f386373d;

    /* renamed from: e, reason: collision with root package name */
    public float f386374e;

    /* renamed from: f, reason: collision with root package name */
    public float f386375f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386376g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386377h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tf4)) {
            return false;
        }
        r45.tf4 tf4Var = (r45.tf4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f386373d), java.lang.Float.valueOf(tf4Var.f386373d)) && n51.f.a(java.lang.Float.valueOf(this.f386374e), java.lang.Float.valueOf(tf4Var.f386374e)) && n51.f.a(java.lang.Float.valueOf(this.f386375f), java.lang.Float.valueOf(tf4Var.f386375f)) && n51.f.a(this.f386376g, tf4Var.f386376g) && n51.f.a(this.f386377h, tf4Var.f386377h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f386373d);
            fVar.d(2, this.f386374e);
            fVar.d(3, this.f386375f);
            java.lang.String str = this.f386376g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f386377h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f386373d) + 0 + b36.f.d(2, this.f386374e) + b36.f.d(3, this.f386375f);
            java.lang.String str3 = this.f386376g;
            if (str3 != null) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f386377h;
            return str4 != null ? d17 + b36.f.j(5, str4) : d17;
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
        r45.tf4 tf4Var = (r45.tf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tf4Var.f386373d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            tf4Var.f386374e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            tf4Var.f386375f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            tf4Var.f386376g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tf4Var.f386377h = aVar2.k(intValue);
        return 0;
    }
}
