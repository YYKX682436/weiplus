package r45;

/* loaded from: classes7.dex */
public class sv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f385984d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f385985e;

    /* renamed from: f, reason: collision with root package name */
    public int f385986f;

    /* renamed from: g, reason: collision with root package name */
    public int f385987g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385988h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385989i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385990m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385991n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sv6)) {
            return false;
        }
        r45.sv6 sv6Var = (r45.sv6) fVar;
        return n51.f.a(this.f385984d, sv6Var.f385984d) && n51.f.a(java.lang.Boolean.valueOf(this.f385985e), java.lang.Boolean.valueOf(sv6Var.f385985e)) && n51.f.a(java.lang.Integer.valueOf(this.f385986f), java.lang.Integer.valueOf(sv6Var.f385986f)) && n51.f.a(java.lang.Integer.valueOf(this.f385987g), java.lang.Integer.valueOf(sv6Var.f385987g)) && n51.f.a(this.f385988h, sv6Var.f385988h) && n51.f.a(this.f385989i, sv6Var.f385989i) && n51.f.a(this.f385990m, sv6Var.f385990m) && n51.f.a(this.f385991n, sv6Var.f385991n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385984d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f385985e);
            fVar.e(3, this.f385986f);
            fVar.e(4, this.f385987g);
            java.lang.String str = this.f385988h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f385989i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f385990m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f385991n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f385985e) + b36.f.e(3, this.f385986f) + b36.f.e(4, this.f385987g);
            java.lang.String str5 = this.f385988h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f385989i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f385990m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f385991n;
            return str8 != null ? g17 + b36.f.j(8, str8) : g17;
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
        r45.sv6 sv6Var = (r45.sv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.tv6 tv6Var = new r45.tv6();
                    if (bArr2 != null && bArr2.length > 0) {
                        tv6Var.parseFrom(bArr2);
                    }
                    sv6Var.f385984d.add(tv6Var);
                }
                return 0;
            case 2:
                sv6Var.f385985e = aVar2.c(intValue);
                return 0;
            case 3:
                sv6Var.f385986f = aVar2.g(intValue);
                return 0;
            case 4:
                sv6Var.f385987g = aVar2.g(intValue);
                return 0;
            case 5:
                sv6Var.f385988h = aVar2.k(intValue);
                return 0;
            case 6:
                sv6Var.f385989i = aVar2.k(intValue);
                return 0;
            case 7:
                sv6Var.f385990m = aVar2.k(intValue);
                return 0;
            case 8:
                sv6Var.f385991n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
