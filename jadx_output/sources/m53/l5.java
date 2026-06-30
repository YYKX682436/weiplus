package m53;

/* loaded from: classes8.dex */
public class l5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f323883d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public m53.n5 f323884e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323885f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323886g;

    /* renamed from: h, reason: collision with root package name */
    public m53.i3 f323887h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l5)) {
            return false;
        }
        m53.l5 l5Var = (m53.l5) fVar;
        return n51.f.a(this.f323883d, l5Var.f323883d) && n51.f.a(this.f323884e, l5Var.f323884e) && n51.f.a(this.f323885f, l5Var.f323885f) && n51.f.a(this.f323886g, l5Var.f323886g) && n51.f.a(this.f323887h, l5Var.f323887h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323883d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            m53.n5 n5Var = this.f323884e;
            if (n5Var != null) {
                fVar.i(2, n5Var.computeSize());
                this.f323884e.writeFields(fVar);
            }
            java.lang.String str = this.f323885f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f323886g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.i3 i3Var = this.f323887h;
            if (i3Var != null) {
                fVar.i(5, i3Var.computeSize());
                this.f323887h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            m53.n5 n5Var2 = this.f323884e;
            if (n5Var2 != null) {
                g17 += b36.f.i(2, n5Var2.computeSize());
            }
            java.lang.String str3 = this.f323885f;
            if (str3 != null) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f323886g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            m53.i3 i3Var2 = this.f323887h;
            return i3Var2 != null ? g17 + b36.f.i(5, i3Var2.computeSize()) : g17;
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
        m53.l5 l5Var = (m53.l5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.r5 r5Var = new m53.r5();
                if (bArr2 != null && bArr2.length > 0) {
                    r5Var.parseFrom(bArr2);
                }
                l5Var.f323883d.add(r5Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                m53.n5 n5Var3 = new m53.n5();
                if (bArr3 != null && bArr3.length > 0) {
                    n5Var3.parseFrom(bArr3);
                }
                l5Var.f323884e = n5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            l5Var.f323885f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            l5Var.f323886g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            m53.i3 i3Var3 = new m53.i3();
            if (bArr4 != null && bArr4.length > 0) {
                i3Var3.parseFrom(bArr4);
            }
            l5Var.f323887h = i3Var3;
        }
        return 0;
    }
}
