package r45;

/* loaded from: classes11.dex */
public class g16 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374822d;

    /* renamed from: e, reason: collision with root package name */
    public long f374823e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374825g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374824f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f374826h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f374827i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f374828m = -1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g16)) {
            return false;
        }
        r45.g16 g16Var = (r45.g16) fVar;
        return n51.f.a(this.f374822d, g16Var.f374822d) && n51.f.a(java.lang.Long.valueOf(this.f374823e), java.lang.Long.valueOf(g16Var.f374823e)) && n51.f.a(this.f374824f, g16Var.f374824f) && n51.f.a(this.f374825g, g16Var.f374825g) && n51.f.a(java.lang.Boolean.valueOf(this.f374826h), java.lang.Boolean.valueOf(g16Var.f374826h)) && n51.f.a(java.lang.Integer.valueOf(this.f374827i), java.lang.Integer.valueOf(g16Var.f374827i)) && n51.f.a(java.lang.Integer.valueOf(this.f374828m), java.lang.Integer.valueOf(g16Var.f374828m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374824f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374822d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f374823e);
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f374825g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f374826h);
            fVar.e(6, this.f374827i);
            fVar.e(7, this.f374828m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f374822d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f374823e) + b36.f.g(3, 8, linkedList);
            java.lang.String str4 = this.f374825g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.a(5, this.f374826h) + b36.f.e(6, this.f374827i) + b36.f.e(7, this.f374828m);
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
        r45.g16 g16Var = (r45.g16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g16Var.f374822d = aVar2.k(intValue);
                return 0;
            case 2:
                g16Var.f374823e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c16 c16Var = new r45.c16();
                    if (bArr2 != null && bArr2.length > 0) {
                        c16Var.parseFrom(bArr2);
                    }
                    g16Var.f374824f.add(c16Var);
                }
                return 0;
            case 4:
                g16Var.f374825g = aVar2.k(intValue);
                return 0;
            case 5:
                g16Var.f374826h = aVar2.c(intValue);
                return 0;
            case 6:
                g16Var.f374827i = aVar2.g(intValue);
                return 0;
            case 7:
                g16Var.f374828m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
