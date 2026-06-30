package r45;

/* loaded from: classes15.dex */
public class de0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372340d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372342f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f372343g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372344h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372345i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de0)) {
            return false;
        }
        r45.de0 de0Var = (r45.de0) fVar;
        return n51.f.a(this.f372340d, de0Var.f372340d) && n51.f.a(this.f372341e, de0Var.f372341e) && n51.f.a(this.f372342f, de0Var.f372342f) && n51.f.a(this.f372343g, de0Var.f372343g) && n51.f.a(this.f372344h, de0Var.f372344h) && n51.f.a(this.f372345i, de0Var.f372345i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372340d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372341e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372342f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, this.f372343g);
            java.lang.String str4 = this.f372344h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f372345i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f372340d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f372341e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f372342f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int g17 = j17 + b36.f.g(4, 1, this.f372343g);
            java.lang.String str9 = this.f372344h;
            if (str9 != null) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f372345i;
            return str10 != null ? g17 + b36.f.j(6, str10) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372343g.clear();
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
        r45.de0 de0Var = (r45.de0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                de0Var.f372340d = aVar2.k(intValue);
                return 0;
            case 2:
                de0Var.f372341e = aVar2.k(intValue);
                return 0;
            case 3:
                de0Var.f372342f = aVar2.k(intValue);
                return 0;
            case 4:
                de0Var.f372343g.add(aVar2.k(intValue));
                return 0;
            case 5:
                de0Var.f372344h = aVar2.k(intValue);
                return 0;
            case 6:
                de0Var.f372345i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
