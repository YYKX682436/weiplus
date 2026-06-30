package r45;

/* loaded from: classes2.dex */
public class us4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f387613d;

    /* renamed from: e, reason: collision with root package name */
    public long f387614e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387615f;

    /* renamed from: g, reason: collision with root package name */
    public long f387616g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387617h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387618i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f387619m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387620n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.us4)) {
            return false;
        }
        r45.us4 us4Var = (r45.us4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f387613d), java.lang.Long.valueOf(us4Var.f387613d)) && n51.f.a(java.lang.Long.valueOf(this.f387614e), java.lang.Long.valueOf(us4Var.f387614e)) && n51.f.a(this.f387615f, us4Var.f387615f) && n51.f.a(java.lang.Long.valueOf(this.f387616g), java.lang.Long.valueOf(us4Var.f387616g)) && n51.f.a(this.f387617h, us4Var.f387617h) && n51.f.a(this.f387618i, us4Var.f387618i) && n51.f.a(this.f387619m, us4Var.f387619m) && n51.f.a(this.f387620n, us4Var.f387620n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387619m;
        java.util.LinkedList linkedList2 = this.f387618i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f387613d);
            fVar.h(2, this.f387614e);
            java.lang.String str = this.f387615f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f387616g);
            java.lang.String str2 = this.f387617h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList2);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f387620n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f387613d) + 0 + b36.f.h(2, this.f387614e);
            java.lang.String str4 = this.f387615f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int h18 = h17 + b36.f.h(4, this.f387616g);
            java.lang.String str5 = this.f387617h;
            if (str5 != null) {
                h18 += b36.f.j(5, str5);
            }
            int g17 = h18 + b36.f.g(6, 1, linkedList2) + b36.f.g(7, 8, linkedList);
            java.lang.String str6 = this.f387620n;
            return str6 != null ? g17 + b36.f.j(8, str6) : g17;
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
        r45.us4 us4Var = (r45.us4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                us4Var.f387613d = aVar2.i(intValue);
                return 0;
            case 2:
                us4Var.f387614e = aVar2.i(intValue);
                return 0;
            case 3:
                us4Var.f387615f = aVar2.k(intValue);
                return 0;
            case 4:
                us4Var.f387616g = aVar2.i(intValue);
                return 0;
            case 5:
                us4Var.f387617h = aVar2.k(intValue);
                return 0;
            case 6:
                us4Var.f387618i.add(aVar2.k(intValue));
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nh4 nh4Var = new r45.nh4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nh4Var.parseFrom(bArr2);
                    }
                    us4Var.f387619m.add(nh4Var);
                }
                return 0;
            case 8:
                us4Var.f387620n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
