package r45;

/* loaded from: classes4.dex */
public class l17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379078d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f379079e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f379080f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379081g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379082h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l17)) {
            return false;
        }
        r45.l17 l17Var = (r45.l17) fVar;
        return n51.f.a(this.f379078d, l17Var.f379078d) && n51.f.a(this.f379079e, l17Var.f379079e) && n51.f.a(java.lang.Boolean.valueOf(this.f379080f), java.lang.Boolean.valueOf(l17Var.f379080f)) && n51.f.a(this.f379081g, l17Var.f379081g) && n51.f.a(this.f379082h, l17Var.f379082h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379079e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379078d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f379080f);
            java.lang.String str2 = this.f379081g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f379082h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f379078d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f379080f);
            java.lang.String str5 = this.f379081g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f379082h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.l17 l17Var = (r45.l17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l17Var.f379078d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l17Var.f379079e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            l17Var.f379080f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            l17Var.f379081g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        l17Var.f379082h = aVar2.k(intValue);
        return 0;
    }
}
