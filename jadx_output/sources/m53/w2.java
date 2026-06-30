package m53;

/* loaded from: classes2.dex */
public class w2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324151d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324152e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f324153f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324154g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324155h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w2)) {
            return false;
        }
        m53.w2 w2Var = (m53.w2) fVar;
        return n51.f.a(this.f324151d, w2Var.f324151d) && n51.f.a(this.f324152e, w2Var.f324152e) && n51.f.a(this.f324153f, w2Var.f324153f) && n51.f.a(this.f324154g, w2Var.f324154g) && n51.f.a(this.f324155h, w2Var.f324155h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324153f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324151d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324152e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f324154g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f324155h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f324151d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f324152e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f324154g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f324155h;
            return str8 != null ? g17 + b36.f.j(5, str8) : g17;
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
        m53.w2 w2Var = (m53.w2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w2Var.f324151d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w2Var.f324152e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                w2Var.f324154g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            w2Var.f324155h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.l3 l3Var = new m53.l3();
            if (bArr2 != null && bArr2.length > 0) {
                l3Var.parseFrom(bArr2);
            }
            w2Var.f324153f.add(l3Var);
        }
        return 0;
    }
}
