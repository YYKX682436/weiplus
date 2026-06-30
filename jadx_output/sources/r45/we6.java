package r45;

/* loaded from: classes2.dex */
public class we6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f389115d;

    /* renamed from: e, reason: collision with root package name */
    public int f389116e;

    /* renamed from: f, reason: collision with root package name */
    public int f389117f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389118g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f389119h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f389120i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389121m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.we6)) {
            return false;
        }
        r45.we6 we6Var = (r45.we6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f389115d), java.lang.Long.valueOf(we6Var.f389115d)) && n51.f.a(java.lang.Integer.valueOf(this.f389116e), java.lang.Integer.valueOf(we6Var.f389116e)) && n51.f.a(java.lang.Integer.valueOf(this.f389117f), java.lang.Integer.valueOf(we6Var.f389117f)) && n51.f.a(java.lang.Boolean.valueOf(this.f389118g), java.lang.Boolean.valueOf(we6Var.f389118g)) && n51.f.a(this.f389119h, we6Var.f389119h) && n51.f.a(this.f389120i, we6Var.f389120i) && n51.f.a(this.f389121m, we6Var.f389121m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389120i;
        java.util.LinkedList linkedList2 = this.f389119h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f389115d);
            fVar.e(2, this.f389116e);
            fVar.e(3, this.f389117f);
            fVar.a(4, this.f389118g);
            fVar.g(5, 1, linkedList2);
            fVar.g(6, 1, linkedList);
            java.lang.String str = this.f389121m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f389115d) + 0 + b36.f.e(2, this.f389116e) + b36.f.e(3, this.f389117f) + b36.f.a(4, this.f389118g) + b36.f.g(5, 1, linkedList2) + b36.f.g(6, 1, linkedList);
            java.lang.String str2 = this.f389121m;
            return str2 != null ? h17 + b36.f.j(7, str2) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.we6 we6Var = (r45.we6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                we6Var.f389115d = aVar2.i(intValue);
                return 0;
            case 2:
                we6Var.f389116e = aVar2.g(intValue);
                return 0;
            case 3:
                we6Var.f389117f = aVar2.g(intValue);
                return 0;
            case 4:
                we6Var.f389118g = aVar2.c(intValue);
                return 0;
            case 5:
                we6Var.f389119h.add(aVar2.k(intValue));
                return 0;
            case 6:
                we6Var.f389120i.add(aVar2.k(intValue));
                return 0;
            case 7:
                we6Var.f389121m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
