package r45;

/* loaded from: classes11.dex */
public class gc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375095d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375096e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375097f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375098g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gc6)) {
            return false;
        }
        r45.gc6 gc6Var = (r45.gc6) fVar;
        return n51.f.a(this.f375095d, gc6Var.f375095d) && n51.f.a(this.f375096e, gc6Var.f375096e) && n51.f.a(this.f375097f, gc6Var.f375097f) && n51.f.a(this.f375098g, gc6Var.f375098g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375095d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375096e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375097f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f375098g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f375095d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f375096e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f375097f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f375098g;
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
        r45.gc6 gc6Var = (r45.gc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gc6Var.f375095d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gc6Var.f375096e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gc6Var.f375097f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gc6Var.f375098g = aVar2.k(intValue);
        return 0;
    }
}
