package m53;

/* loaded from: classes2.dex */
public class r4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324008d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f324009e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324010f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324011g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324012h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f324013i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r4)) {
            return false;
        }
        m53.r4 r4Var = (m53.r4) fVar;
        return n51.f.a(this.f324008d, r4Var.f324008d) && n51.f.a(this.f324009e, r4Var.f324009e) && n51.f.a(this.f324010f, r4Var.f324010f) && n51.f.a(this.f324011g, r4Var.f324011g) && n51.f.a(this.f324012h, r4Var.f324012h) && n51.f.a(this.f324013i, r4Var.f324013i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324009e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324008d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f324010f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f324011g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f324012h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f324013i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f324008d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f324010f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f324011g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f324012h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f324013i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        m53.r4 r4Var = (m53.r4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r4Var.f324008d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.s4 s4Var = new m53.s4();
                    if (bArr2 != null && bArr2.length > 0) {
                        s4Var.parseFrom(bArr2);
                    }
                    r4Var.f324009e.add(s4Var);
                }
                return 0;
            case 3:
                r4Var.f324010f = aVar2.k(intValue);
                return 0;
            case 4:
                r4Var.f324011g = aVar2.k(intValue);
                return 0;
            case 5:
                r4Var.f324012h = aVar2.k(intValue);
                return 0;
            case 6:
                r4Var.f324013i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
