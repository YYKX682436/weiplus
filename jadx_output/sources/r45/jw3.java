package r45;

/* loaded from: classes15.dex */
public class jw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378159d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f378160e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f378161f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378162g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f378163h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f378164i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f378165m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f378166n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f378167o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw3)) {
            return false;
        }
        r45.jw3 jw3Var = (r45.jw3) fVar;
        return n51.f.a(this.f378159d, jw3Var.f378159d) && n51.f.a(java.lang.Long.valueOf(this.f378160e), java.lang.Long.valueOf(jw3Var.f378160e)) && n51.f.a(java.lang.Long.valueOf(this.f378161f), java.lang.Long.valueOf(jw3Var.f378161f)) && n51.f.a(this.f378162g, jw3Var.f378162g) && n51.f.a(this.f378163h, jw3Var.f378163h) && n51.f.a(java.lang.Integer.valueOf(this.f378164i), java.lang.Integer.valueOf(jw3Var.f378164i)) && n51.f.a(this.f378165m, jw3Var.f378165m) && n51.f.a(this.f378166n, jw3Var.f378166n) && n51.f.a(java.lang.Integer.valueOf(this.f378167o), java.lang.Integer.valueOf(jw3Var.f378167o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378166n;
        java.util.LinkedList linkedList2 = this.f378165m;
        java.util.LinkedList linkedList3 = this.f378163h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378159d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f378160e);
            fVar.h(3, this.f378161f);
            java.lang.String str2 = this.f378162g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList3);
            fVar.e(6, this.f378164i);
            fVar.g(7, 8, linkedList2);
            fVar.g(8, 8, linkedList);
            fVar.e(9, this.f378167o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f378159d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f378160e) + b36.f.h(3, this.f378161f);
            java.lang.String str4 = this.f378162g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.g(5, 8, linkedList3) + b36.f.e(6, this.f378164i) + b36.f.g(7, 8, linkedList2) + b36.f.g(8, 8, linkedList) + b36.f.e(9, this.f378167o);
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
        r45.jw3 jw3Var = (r45.jw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jw3Var.f378159d = aVar2.k(intValue);
                return 0;
            case 2:
                jw3Var.f378160e = aVar2.i(intValue);
                return 0;
            case 3:
                jw3Var.f378161f = aVar2.i(intValue);
                return 0;
            case 4:
                jw3Var.f378162g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.kw3 kw3Var = new r45.kw3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kw3Var.parseFrom(bArr2);
                    }
                    jw3Var.f378163h.add(kw3Var);
                }
                return 0;
            case 6:
                jw3Var.f378164i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.kw3 kw3Var2 = new r45.kw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        kw3Var2.parseFrom(bArr3);
                    }
                    jw3Var.f378165m.add(kw3Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.a07 a07Var = new r45.a07();
                    if (bArr4 != null && bArr4.length > 0) {
                        a07Var.parseFrom(bArr4);
                    }
                    jw3Var.f378166n.add(a07Var);
                }
                return 0;
            case 9:
                jw3Var.f378167o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
