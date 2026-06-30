package r45;

/* loaded from: classes2.dex */
public class fg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374312d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374313e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f374314f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374315g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374316h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg4)) {
            return false;
        }
        r45.fg4 fg4Var = (r45.fg4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374312d), java.lang.Integer.valueOf(fg4Var.f374312d)) && n51.f.a(this.f374313e, fg4Var.f374313e) && n51.f.a(java.lang.Integer.valueOf(this.f374314f), java.lang.Integer.valueOf(fg4Var.f374314f)) && n51.f.a(this.f374315g, fg4Var.f374315g) && n51.f.a(this.f374316h, fg4Var.f374316h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374313e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374312d);
            fVar.g(2, 1, linkedList);
            fVar.e(3, this.f374314f);
            java.lang.String str = this.f374315g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374316h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374312d) + 0 + b36.f.g(2, 1, linkedList) + b36.f.e(3, this.f374314f);
            java.lang.String str3 = this.f374315g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f374316h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.fg4 fg4Var = (r45.fg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fg4Var.f374312d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fg4Var.f374313e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            fg4Var.f374314f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            fg4Var.f374315g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fg4Var.f374316h = aVar2.k(intValue);
        return 0;
    }
}
