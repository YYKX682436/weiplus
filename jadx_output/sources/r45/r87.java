package r45;

/* loaded from: classes4.dex */
public class r87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384645e;

    /* renamed from: f, reason: collision with root package name */
    public float f384646f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384647g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384648h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r87)) {
            return false;
        }
        r45.r87 r87Var = (r45.r87) fVar;
        return n51.f.a(this.f384644d, r87Var.f384644d) && n51.f.a(this.f384645e, r87Var.f384645e) && n51.f.a(java.lang.Float.valueOf(this.f384646f), java.lang.Float.valueOf(r87Var.f384646f)) && n51.f.a(this.f384647g, r87Var.f384647g) && n51.f.a(this.f384648h, r87Var.f384648h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384644d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384645e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f384646f);
            java.lang.String str3 = this.f384647g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f384648h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f384644d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f384645e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int d17 = j17 + b36.f.d(3, this.f384646f);
            java.lang.String str7 = this.f384647g;
            if (str7 != null) {
                d17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f384648h;
            return str8 != null ? d17 + b36.f.j(5, str8) : d17;
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
        r45.r87 r87Var = (r45.r87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r87Var.f384644d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            r87Var.f384645e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            r87Var.f384646f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            r87Var.f384647g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        r87Var.f384648h = aVar2.k(intValue);
        return 0;
    }
}
