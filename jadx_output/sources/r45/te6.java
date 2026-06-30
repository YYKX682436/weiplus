package r45;

/* loaded from: classes4.dex */
public class te6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386359d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386360e;

    /* renamed from: f, reason: collision with root package name */
    public r45.df6 f386361f;

    /* renamed from: g, reason: collision with root package name */
    public int f386362g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f386363h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te6)) {
            return false;
        }
        r45.te6 te6Var = (r45.te6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386359d), java.lang.Long.valueOf(te6Var.f386359d)) && n51.f.a(this.f386360e, te6Var.f386360e) && n51.f.a(this.f386361f, te6Var.f386361f) && n51.f.a(java.lang.Integer.valueOf(this.f386362g), java.lang.Integer.valueOf(te6Var.f386362g)) && n51.f.a(this.f386363h, te6Var.f386363h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386359d);
            java.lang.String str = this.f386360e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.df6 df6Var = this.f386361f;
            if (df6Var != null) {
                fVar.i(3, df6Var.computeSize());
                this.f386361f.writeFields(fVar);
            }
            fVar.e(4, this.f386362g);
            fVar.k(5, 2, this.f386363h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386359d) + 0;
            java.lang.String str2 = this.f386360e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            r45.df6 df6Var2 = this.f386361f;
            if (df6Var2 != null) {
                h17 += b36.f.i(3, df6Var2.computeSize());
            }
            return h17 + b36.f.e(4, this.f386362g) + b36.f.k(5, 2, this.f386363h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386363h.clear();
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
        r45.te6 te6Var = (r45.te6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            te6Var.f386359d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            te6Var.f386360e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.df6 df6Var3 = new r45.df6();
                if (bArr2 != null && bArr2.length > 0) {
                    df6Var3.parseFrom(bArr2);
                }
                te6Var.f386361f = df6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            te6Var.f386362g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        byte[] bArr3 = aVar2.d(intValue).f192156a;
        d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
        kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f247596c < aVar3.f247595b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        te6Var.f386363h = linkedList;
        return 0;
    }
}
