package r45;

/* loaded from: classes4.dex */
public class tc5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386311e;

    /* renamed from: f, reason: collision with root package name */
    public int f386312f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386313g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386314h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tc5)) {
            return false;
        }
        r45.tc5 tc5Var = (r45.tc5) fVar;
        return n51.f.a(this.f386310d, tc5Var.f386310d) && n51.f.a(this.f386311e, tc5Var.f386311e) && n51.f.a(java.lang.Integer.valueOf(this.f386312f), java.lang.Integer.valueOf(tc5Var.f386312f)) && n51.f.a(this.f386313g, tc5Var.f386313g) && n51.f.a(this.f386314h, tc5Var.f386314h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386310d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386311e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f386312f);
            java.lang.String str3 = this.f386313g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386314h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f386310d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f386311e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f386312f);
            java.lang.String str7 = this.f386313g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f386314h;
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
        r45.tc5 tc5Var = (r45.tc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tc5Var.f386310d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tc5Var.f386311e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tc5Var.f386312f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            tc5Var.f386313g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tc5Var.f386314h = aVar2.k(intValue);
        return 0;
    }
}
