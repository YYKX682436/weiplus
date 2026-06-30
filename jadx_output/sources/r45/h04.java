package r45;

/* loaded from: classes8.dex */
public class h04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375709d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375710e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375711f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f375712g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f375713h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h04)) {
            return false;
        }
        r45.h04 h04Var = (r45.h04) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375709d), java.lang.Integer.valueOf(h04Var.f375709d)) && n51.f.a(this.f375710e, h04Var.f375710e) && n51.f.a(this.f375711f, h04Var.f375711f) && n51.f.a(this.f375712g, h04Var.f375712g) && n51.f.a(this.f375713h, h04Var.f375713h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375713h;
        java.util.LinkedList linkedList2 = this.f375712g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375709d);
            java.lang.String str = this.f375710e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375711f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375709d) + 0;
            java.lang.String str3 = this.f375710e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f375711f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
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
        r45.h04 h04Var = (r45.h04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h04Var.f375709d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h04Var.f375710e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            h04Var.f375711f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.b14 b14Var = new r45.b14();
                if (bArr2 != null && bArr2.length > 0) {
                    b14Var.parseFrom(bArr2);
                }
                h04Var.f375712g.add(b14Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.f14 f14Var = new r45.f14();
            if (bArr3 != null && bArr3.length > 0) {
                f14Var.parseFrom(bArr3);
            }
            h04Var.f375713h.add(f14Var);
        }
        return 0;
    }
}
