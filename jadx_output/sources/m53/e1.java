package m53;

/* loaded from: classes8.dex */
public class e1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323643e;

    /* renamed from: f, reason: collision with root package name */
    public int f323644f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323645g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323646h;

    /* renamed from: i, reason: collision with root package name */
    public m53.f1 f323647i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e1)) {
            return false;
        }
        m53.e1 e1Var = (m53.e1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323642d), java.lang.Integer.valueOf(e1Var.f323642d)) && n51.f.a(this.f323643e, e1Var.f323643e) && n51.f.a(java.lang.Integer.valueOf(this.f323644f), java.lang.Integer.valueOf(e1Var.f323644f)) && n51.f.a(this.f323645g, e1Var.f323645g) && n51.f.a(java.lang.Boolean.valueOf(this.f323646h), java.lang.Boolean.valueOf(e1Var.f323646h)) && n51.f.a(this.f323647i, e1Var.f323647i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323642d);
            java.lang.String str = this.f323643e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f323644f);
            java.lang.String str2 = this.f323645g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f323646h);
            m53.f1 f1Var = this.f323647i;
            if (f1Var != null) {
                fVar.i(6, f1Var.computeSize());
                this.f323647i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323642d) + 0;
            java.lang.String str3 = this.f323643e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f323644f);
            java.lang.String str4 = this.f323645g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            int a17 = e18 + b36.f.a(5, this.f323646h);
            m53.f1 f1Var2 = this.f323647i;
            return f1Var2 != null ? a17 + b36.f.i(6, f1Var2.computeSize()) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        m53.e1 e1Var = (m53.e1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e1Var.f323642d = aVar2.g(intValue);
                return 0;
            case 2:
                e1Var.f323643e = aVar2.k(intValue);
                return 0;
            case 3:
                e1Var.f323644f = aVar2.g(intValue);
                return 0;
            case 4:
                e1Var.f323645g = aVar2.k(intValue);
                return 0;
            case 5:
                e1Var.f323646h = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    m53.f1 f1Var3 = new m53.f1();
                    if (bArr != null && bArr.length > 0) {
                        f1Var3.parseFrom(bArr);
                    }
                    e1Var.f323647i = f1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
