package r45;

/* loaded from: classes7.dex */
public class px4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383459e;

    /* renamed from: f, reason: collision with root package name */
    public int f383460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383461g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383462h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px4)) {
            return false;
        }
        r45.px4 px4Var = (r45.px4) fVar;
        return n51.f.a(this.f383458d, px4Var.f383458d) && n51.f.a(this.f383459e, px4Var.f383459e) && n51.f.a(java.lang.Integer.valueOf(this.f383460f), java.lang.Integer.valueOf(px4Var.f383460f)) && n51.f.a(this.f383461g, px4Var.f383461g) && n51.f.a(this.f383462h, px4Var.f383462h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383458d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383459e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f383460f);
            java.lang.String str3 = this.f383461g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383462h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f383458d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f383459e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f383460f);
            java.lang.String str7 = this.f383461g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f383462h;
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
        r45.px4 px4Var = (r45.px4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            px4Var.f383458d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            px4Var.f383459e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            px4Var.f383460f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            px4Var.f383461g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        px4Var.f383462h = aVar2.k(intValue);
        return 0;
    }
}
