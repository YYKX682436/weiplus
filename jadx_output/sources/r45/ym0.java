package r45;

/* loaded from: classes4.dex */
public class ym0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391211e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391212f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f391213g;

    /* renamed from: h, reason: collision with root package name */
    public int f391214h;

    /* renamed from: i, reason: collision with root package name */
    public r45.u44 f391215i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f391216m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f391217n;

    static {
        new r45.ym0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ym0)) {
            return false;
        }
        r45.ym0 ym0Var = (r45.ym0) fVar;
        return n51.f.a(this.f391210d, ym0Var.f391210d) && n51.f.a(this.f391211e, ym0Var.f391211e) && n51.f.a(this.f391212f, ym0Var.f391212f) && n51.f.a(java.lang.Boolean.valueOf(this.f391213g), java.lang.Boolean.valueOf(ym0Var.f391213g)) && n51.f.a(java.lang.Integer.valueOf(this.f391214h), java.lang.Integer.valueOf(ym0Var.f391214h)) && n51.f.a(this.f391215i, ym0Var.f391215i) && n51.f.a(java.lang.Boolean.valueOf(this.f391216m), java.lang.Boolean.valueOf(ym0Var.f391216m)) && n51.f.a(java.lang.Boolean.valueOf(this.f391217n), java.lang.Boolean.valueOf(ym0Var.f391217n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ym0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391212f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391210d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391211e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            fVar.a(4, this.f391213g);
            fVar.e(5, this.f391214h);
            r45.u44 u44Var = this.f391215i;
            if (u44Var != null) {
                fVar.i(6, u44Var.computeSize());
                this.f391215i.writeFields(fVar);
            }
            fVar.a(7, this.f391216m);
            fVar.a(8, this.f391217n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f391210d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f391211e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList) + b36.f.a(4, this.f391213g) + b36.f.e(5, this.f391214h);
            r45.u44 u44Var2 = this.f391215i;
            if (u44Var2 != null) {
                g17 += b36.f.i(6, u44Var2.computeSize());
            }
            return g17 + b36.f.a(7, this.f391216m) + b36.f.a(8, this.f391217n);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f391210d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f391211e = aVar2.k(intValue);
                return 0;
            case 3:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 4:
                this.f391213g = aVar2.c(intValue);
                return 0;
            case 5:
                this.f391214h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.u44 u44Var3 = new r45.u44();
                    if (bArr != null && bArr.length > 0) {
                        u44Var3.parseFrom(bArr);
                    }
                    this.f391215i = u44Var3;
                }
                return 0;
            case 7:
                this.f391216m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f391217n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ym0) super.parseFrom(bArr);
    }
}
