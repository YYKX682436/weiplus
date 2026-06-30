package m53;

/* loaded from: classes2.dex */
public class h1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323742d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323743e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f323744f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public m53.h6 f323745g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323746h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h1)) {
            return false;
        }
        m53.h1 h1Var = (m53.h1) fVar;
        return n51.f.a(this.f323742d, h1Var.f323742d) && n51.f.a(this.f323743e, h1Var.f323743e) && n51.f.a(this.f323744f, h1Var.f323744f) && n51.f.a(this.f323745g, h1Var.f323745g) && n51.f.a(this.f323746h, h1Var.f323746h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323744f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323742d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323743e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            m53.h6 h6Var = this.f323745g;
            if (h6Var != null) {
                fVar.i(4, h6Var.computeSize());
                this.f323745g.writeFields(fVar);
            }
            java.lang.String str3 = this.f323746h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f323742d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f323743e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            m53.h6 h6Var2 = this.f323745g;
            if (h6Var2 != null) {
                g17 += b36.f.i(4, h6Var2.computeSize());
            }
            java.lang.String str6 = this.f323746h;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
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
        m53.h1 h1Var = (m53.h1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h1Var.f323742d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h1Var.f323743e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                m53.l4 l4Var = new m53.l4();
                if (bArr2 != null && bArr2.length > 0) {
                    l4Var.parseFrom(bArr2);
                }
                h1Var.f323744f.add(l4Var);
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            h1Var.f323746h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            m53.h6 h6Var3 = new m53.h6();
            if (bArr3 != null && bArr3.length > 0) {
                h6Var3.parseFrom(bArr3);
            }
            h1Var.f323745g = h6Var3;
        }
        return 0;
    }
}
