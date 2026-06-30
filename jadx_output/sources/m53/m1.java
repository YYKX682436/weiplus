package m53;

/* loaded from: classes8.dex */
public class m1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f323892d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323894f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323895g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m1)) {
            return false;
        }
        m53.m1 m1Var = (m53.m1) fVar;
        return n51.f.a(this.f323892d, m1Var.f323892d) && n51.f.a(this.f323893e, m1Var.f323893e) && n51.f.a(this.f323894f, m1Var.f323894f) && n51.f.a(this.f323895g, m1Var.f323895g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323892d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f323893e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f323894f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f323895g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f323893e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f323894f;
            if (str5 != null) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f323895g;
            return str6 != null ? g17 + b36.f.j(4, str6) : g17;
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
        m53.m1 m1Var = (m53.m1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                m1Var.f323893e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                m1Var.f323894f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            m1Var.f323895g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            m53.o0 o0Var = new m53.o0();
            if (bArr2 != null && bArr2.length > 0) {
                o0Var.parseFrom(bArr2);
            }
            m1Var.f323892d.add(o0Var);
        }
        return 0;
    }
}
