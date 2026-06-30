package m53;

/* loaded from: classes8.dex */
public class v5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324130d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324131e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324133g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.v5)) {
            return false;
        }
        m53.v5 v5Var = (m53.v5) fVar;
        return n51.f.a(this.f324130d, v5Var.f324130d) && n51.f.a(this.f324131e, v5Var.f324131e) && n51.f.a(this.f324132f, v5Var.f324132f) && n51.f.a(this.f324133g, v5Var.f324133g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324130d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324131e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324132f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f324133g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f324130d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f324131e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f324132f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f324133g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        m53.v5 v5Var = (m53.v5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v5Var.f324130d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v5Var.f324131e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v5Var.f324132f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        v5Var.f324133g = aVar2.k(intValue);
        return 0;
    }
}
