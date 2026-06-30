package r45;

/* loaded from: classes4.dex */
public class bg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370751e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f370752f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370753g;

    /* renamed from: h, reason: collision with root package name */
    public int f370754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370755i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bg7)) {
            return false;
        }
        r45.bg7 bg7Var = (r45.bg7) fVar;
        return n51.f.a(this.f370750d, bg7Var.f370750d) && n51.f.a(this.f370751e, bg7Var.f370751e) && n51.f.a(this.f370752f, bg7Var.f370752f) && n51.f.a(this.f370753g, bg7Var.f370753g) && n51.f.a(java.lang.Integer.valueOf(this.f370754h), java.lang.Integer.valueOf(bg7Var.f370754h)) && n51.f.a(this.f370755i, bg7Var.f370755i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370752f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370750d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370751e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f370753g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f370754h);
            java.lang.String str4 = this.f370755i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370750d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f370751e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f370753g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            int e17 = g17 + b36.f.e(5, this.f370754h);
            java.lang.String str8 = this.f370755i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.bg7 bg7Var = (r45.bg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bg7Var.f370750d = aVar2.k(intValue);
                return 0;
            case 2:
                bg7Var.f370751e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l25 l25Var = new r45.l25();
                    if (bArr2 != null && bArr2.length > 0) {
                        l25Var.parseFrom(bArr2);
                    }
                    bg7Var.f370752f.add(l25Var);
                }
                return 0;
            case 4:
                bg7Var.f370753g = aVar2.k(intValue);
                return 0;
            case 5:
                bg7Var.f370754h = aVar2.g(intValue);
                return 0;
            case 6:
                bg7Var.f370755i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
