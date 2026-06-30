package r45;

/* loaded from: classes8.dex */
public class fg5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374317d;

    /* renamed from: e, reason: collision with root package name */
    public int f374318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f374319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374320g;

    /* renamed from: h, reason: collision with root package name */
    public int f374321h;

    /* renamed from: i, reason: collision with root package name */
    public int f374322i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f374323m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg5)) {
            return false;
        }
        r45.fg5 fg5Var = (r45.fg5) fVar;
        return n51.f.a(this.f374317d, fg5Var.f374317d) && n51.f.a(java.lang.Integer.valueOf(this.f374318e), java.lang.Integer.valueOf(fg5Var.f374318e)) && n51.f.a(java.lang.Boolean.valueOf(this.f374319f), java.lang.Boolean.valueOf(fg5Var.f374319f)) && n51.f.a(this.f374320g, fg5Var.f374320g) && n51.f.a(java.lang.Integer.valueOf(this.f374321h), java.lang.Integer.valueOf(fg5Var.f374321h)) && n51.f.a(java.lang.Integer.valueOf(this.f374322i), java.lang.Integer.valueOf(fg5Var.f374322i)) && n51.f.a(this.f374323m, fg5Var.f374323m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374323m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374317d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f374318e);
            fVar.a(3, this.f374319f);
            java.lang.String str2 = this.f374320g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f374321h);
            fVar.e(6, this.f374322i);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f374317d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f374318e) + b36.f.a(3, this.f374319f);
            java.lang.String str4 = this.f374320g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.e(5, this.f374321h) + b36.f.e(6, this.f374322i) + b36.f.g(7, 8, linkedList);
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
        r45.fg5 fg5Var = (r45.fg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fg5Var.f374317d = aVar2.k(intValue);
                return 0;
            case 2:
                fg5Var.f374318e = aVar2.g(intValue);
                return 0;
            case 3:
                fg5Var.f374319f = aVar2.c(intValue);
                return 0;
            case 4:
                fg5Var.f374320g = aVar2.k(intValue);
                return 0;
            case 5:
                fg5Var.f374321h = aVar2.g(intValue);
                return 0;
            case 6:
                fg5Var.f374322i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.eg5 eg5Var = new r45.eg5();
                    if (bArr2 != null && bArr2.length > 0) {
                        eg5Var.parseFrom(bArr2);
                    }
                    fg5Var.f374323m.add(eg5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
