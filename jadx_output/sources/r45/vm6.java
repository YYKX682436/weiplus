package r45;

/* loaded from: classes7.dex */
public class vm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388372d;

    /* renamed from: e, reason: collision with root package name */
    public int f388373e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388374f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388375g;

    /* renamed from: h, reason: collision with root package name */
    public int f388376h;

    /* renamed from: i, reason: collision with root package name */
    public int f388377i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f388379n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388380o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388382q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f388378m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f388381p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vm6)) {
            return false;
        }
        r45.vm6 vm6Var = (r45.vm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388372d), java.lang.Integer.valueOf(vm6Var.f388372d)) && n51.f.a(java.lang.Integer.valueOf(this.f388373e), java.lang.Integer.valueOf(vm6Var.f388373e)) && n51.f.a(this.f388374f, vm6Var.f388374f) && n51.f.a(this.f388375g, vm6Var.f388375g) && n51.f.a(java.lang.Integer.valueOf(this.f388376h), java.lang.Integer.valueOf(vm6Var.f388376h)) && n51.f.a(java.lang.Integer.valueOf(this.f388377i), java.lang.Integer.valueOf(vm6Var.f388377i)) && n51.f.a(this.f388378m, vm6Var.f388378m) && n51.f.a(java.lang.Boolean.valueOf(this.f388379n), java.lang.Boolean.valueOf(vm6Var.f388379n)) && n51.f.a(this.f388380o, vm6Var.f388380o) && n51.f.a(this.f388381p, vm6Var.f388381p) && n51.f.a(this.f388382q, vm6Var.f388382q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388381p;
        java.util.LinkedList linkedList2 = this.f388378m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388372d);
            fVar.e(2, this.f388373e);
            java.lang.String str = this.f388374f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388375g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f388376h);
            fVar.e(6, this.f388377i);
            fVar.g(7, 8, linkedList2);
            fVar.a(8, this.f388379n);
            java.lang.String str3 = this.f388380o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f388382q;
            if (str4 == null) {
                return 0;
            }
            fVar.j(11, str4);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388372d) + 0 + b36.f.e(2, this.f388373e);
            java.lang.String str5 = this.f388374f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388375g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f388376h) + b36.f.e(6, this.f388377i) + b36.f.g(7, 8, linkedList2) + b36.f.a(8, this.f388379n);
            java.lang.String str7 = this.f388380o;
            if (str7 != null) {
                e18 += b36.f.j(9, str7);
            }
            int g17 = e18 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f388382q;
            return str8 != null ? g17 + b36.f.j(11, str8) : g17;
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
        r45.vm6 vm6Var = (r45.vm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vm6Var.f388372d = aVar2.g(intValue);
                return 0;
            case 2:
                vm6Var.f388373e = aVar2.g(intValue);
                return 0;
            case 3:
                vm6Var.f388374f = aVar2.k(intValue);
                return 0;
            case 4:
                vm6Var.f388375g = aVar2.k(intValue);
                return 0;
            case 5:
                vm6Var.f388376h = aVar2.g(intValue);
                return 0;
            case 6:
                vm6Var.f388377i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.um6 um6Var = new r45.um6();
                    if (bArr2 != null && bArr2.length > 0) {
                        um6Var.parseFrom(bArr2);
                    }
                    vm6Var.f388378m.add(um6Var);
                }
                return 0;
            case 8:
                vm6Var.f388379n = aVar2.c(intValue);
                return 0;
            case 9:
                vm6Var.f388380o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.xm6 xm6Var = new r45.xm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        xm6Var.parseFrom(bArr3);
                    }
                    vm6Var.f388381p.add(xm6Var);
                }
                return 0;
            case 11:
                vm6Var.f388382q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
