package m53;

/* loaded from: classes8.dex */
public class d2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323615d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f323616e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323617f;

    /* renamed from: g, reason: collision with root package name */
    public m53.h0 f323618g;

    /* renamed from: h, reason: collision with root package name */
    public int f323619h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323620i;

    /* renamed from: m, reason: collision with root package name */
    public int f323621m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.d2)) {
            return false;
        }
        m53.d2 d2Var = (m53.d2) fVar;
        return n51.f.a(this.BaseRequest, d2Var.BaseRequest) && n51.f.a(this.f323615d, d2Var.f323615d) && n51.f.a(this.f323616e, d2Var.f323616e) && n51.f.a(this.f323617f, d2Var.f323617f) && n51.f.a(this.f323618g, d2Var.f323618g) && n51.f.a(java.lang.Integer.valueOf(this.f323619h), java.lang.Integer.valueOf(d2Var.f323619h)) && n51.f.a(java.lang.Boolean.valueOf(this.f323620i), java.lang.Boolean.valueOf(d2Var.f323620i)) && n51.f.a(java.lang.Integer.valueOf(this.f323621m), java.lang.Integer.valueOf(d2Var.f323621m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f323615d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f323616e);
            java.lang.String str2 = this.f323617f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.h0 h0Var = this.f323618g;
            if (h0Var != null) {
                fVar.i(5, h0Var.computeSize());
                this.f323618g.writeFields(fVar);
            }
            fVar.e(6, this.f323619h);
            fVar.a(7, this.f323620i);
            fVar.e(8, this.f323621m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f323615d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f323616e);
            java.lang.String str4 = this.f323617f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            m53.h0 h0Var2 = this.f323618g;
            if (h0Var2 != null) {
                g17 += b36.f.i(5, h0Var2.computeSize());
            }
            return g17 + b36.f.e(6, this.f323619h) + b36.f.a(7, this.f323620i) + b36.f.e(8, this.f323621m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f323616e.clear();
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
        m53.d2 d2Var = (m53.d2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    d2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                d2Var.f323615d = aVar2.k(intValue);
                return 0;
            case 3:
                d2Var.f323616e.add(aVar2.k(intValue));
                return 0;
            case 4:
                d2Var.f323617f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    m53.h0 h0Var3 = new m53.h0();
                    if (bArr3 != null && bArr3.length > 0) {
                        h0Var3.parseFrom(bArr3);
                    }
                    d2Var.f323618g = h0Var3;
                }
                return 0;
            case 6:
                d2Var.f323619h = aVar2.g(intValue);
                return 0;
            case 7:
                d2Var.f323620i = aVar2.c(intValue);
                return 0;
            case 8:
                d2Var.f323621m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
