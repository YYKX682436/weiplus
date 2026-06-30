package r45;

/* loaded from: classes2.dex */
public class da5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372269d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372270e;

    /* renamed from: f, reason: collision with root package name */
    public int f372271f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372272g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372273h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da5)) {
            return false;
        }
        r45.da5 da5Var = (r45.da5) fVar;
        return n51.f.a(this.f372269d, da5Var.f372269d) && n51.f.a(this.f372270e, da5Var.f372270e) && n51.f.a(java.lang.Integer.valueOf(this.f372271f), java.lang.Integer.valueOf(da5Var.f372271f)) && n51.f.a(this.f372272g, da5Var.f372272g) && n51.f.a(this.f372273h, da5Var.f372273h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372269d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372270e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372271f);
            java.lang.String str3 = this.f372272g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f372273h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f372269d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f372270e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f372271f);
            java.lang.String str7 = this.f372272g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f372273h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.da5 da5Var = (r45.da5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            da5Var.f372269d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            da5Var.f372270e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            da5Var.f372271f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            da5Var.f372272g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        da5Var.f372273h = aVar2.k(intValue);
        return 0;
    }
}
