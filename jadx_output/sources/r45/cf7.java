package r45;

/* loaded from: classes4.dex */
public class cf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371529d;

    /* renamed from: e, reason: collision with root package name */
    public int f371530e;

    /* renamed from: f, reason: collision with root package name */
    public int f371531f;

    /* renamed from: g, reason: collision with root package name */
    public int f371532g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371533h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cf7)) {
            return false;
        }
        r45.cf7 cf7Var = (r45.cf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371529d), java.lang.Integer.valueOf(cf7Var.f371529d)) && n51.f.a(java.lang.Integer.valueOf(this.f371530e), java.lang.Integer.valueOf(cf7Var.f371530e)) && n51.f.a(java.lang.Integer.valueOf(this.f371531f), java.lang.Integer.valueOf(cf7Var.f371531f)) && n51.f.a(java.lang.Integer.valueOf(this.f371532g), java.lang.Integer.valueOf(cf7Var.f371532g)) && n51.f.a(this.f371533h, cf7Var.f371533h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371529d);
            fVar.e(2, this.f371530e);
            fVar.e(3, this.f371531f);
            fVar.e(4, this.f371532g);
            java.lang.String str = this.f371533h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371529d) + 0 + b36.f.e(2, this.f371530e) + b36.f.e(3, this.f371531f) + b36.f.e(4, this.f371532g);
            java.lang.String str2 = this.f371533h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.cf7 cf7Var = (r45.cf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cf7Var.f371529d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cf7Var.f371530e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cf7Var.f371531f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cf7Var.f371532g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cf7Var.f371533h = aVar2.k(intValue);
        return 0;
    }
}
