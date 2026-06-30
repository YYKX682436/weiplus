package r45;

/* loaded from: classes8.dex */
public class i63 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376752d;

    /* renamed from: e, reason: collision with root package name */
    public int f376753e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376756h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376757i;

    /* renamed from: n, reason: collision with root package name */
    public int f376759n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f376760o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f376754f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f376755g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f376758m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i63)) {
            return false;
        }
        r45.i63 i63Var = (r45.i63) fVar;
        return n51.f.a(this.f376752d, i63Var.f376752d) && n51.f.a(java.lang.Integer.valueOf(this.f376753e), java.lang.Integer.valueOf(i63Var.f376753e)) && n51.f.a(this.f376754f, i63Var.f376754f) && n51.f.a(this.f376755g, i63Var.f376755g) && n51.f.a(this.f376756h, i63Var.f376756h) && n51.f.a(this.f376757i, i63Var.f376757i) && n51.f.a(this.f376758m, i63Var.f376758m) && n51.f.a(java.lang.Integer.valueOf(this.f376759n), java.lang.Integer.valueOf(i63Var.f376759n)) && n51.f.a(java.lang.Boolean.valueOf(this.f376760o), java.lang.Boolean.valueOf(i63Var.f376760o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376758m;
        java.util.LinkedList linkedList2 = this.f376755g;
        java.util.LinkedList linkedList3 = this.f376754f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376752d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f376753e);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f376756h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f376757i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f376759n);
            fVar.a(9, this.f376760o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f376752d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f376753e) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 8, linkedList2);
            java.lang.String str5 = this.f376756h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f376757i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            return j17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f376759n) + b36.f.a(9, this.f376760o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.i63 i63Var = (r45.i63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i63Var.f376752d = aVar2.k(intValue);
                return 0;
            case 2:
                i63Var.f376753e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c63 c63Var = new r45.c63();
                    if (bArr2 != null && bArr2.length > 0) {
                        c63Var.parseFrom(bArr2);
                    }
                    i63Var.f376754f.add(c63Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.k63 k63Var = new r45.k63();
                    if (bArr3 != null && bArr3.length > 0) {
                        k63Var.parseFrom(bArr3);
                    }
                    i63Var.f376755g.add(k63Var);
                }
                return 0;
            case 5:
                i63Var.f376756h = aVar2.k(intValue);
                return 0;
            case 6:
                i63Var.f376757i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.j63 j63Var = new r45.j63();
                    if (bArr4 != null && bArr4.length > 0) {
                        j63Var.parseFrom(bArr4);
                    }
                    i63Var.f376758m.add(j63Var);
                }
                return 0;
            case 8:
                i63Var.f376759n = aVar2.g(intValue);
                return 0;
            case 9:
                i63Var.f376760o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
