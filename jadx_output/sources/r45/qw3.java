package r45;

/* loaded from: classes9.dex */
public class qw3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f384311d;

    /* renamed from: e, reason: collision with root package name */
    public long f384312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384313f;

    /* renamed from: g, reason: collision with root package name */
    public int f384314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384315h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384316i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qw3)) {
            return false;
        }
        r45.qw3 qw3Var = (r45.qw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f384311d), java.lang.Long.valueOf(qw3Var.f384311d)) && n51.f.a(java.lang.Long.valueOf(this.f384312e), java.lang.Long.valueOf(qw3Var.f384312e)) && n51.f.a(this.f384313f, qw3Var.f384313f) && n51.f.a(java.lang.Integer.valueOf(this.f384314g), java.lang.Integer.valueOf(qw3Var.f384314g)) && n51.f.a(this.f384315h, qw3Var.f384315h) && n51.f.a(this.f384316i, qw3Var.f384316i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f384311d);
            fVar.h(2, this.f384312e);
            java.lang.String str = this.f384313f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f384314g);
            java.lang.String str2 = this.f384315h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f384316i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f384311d) + 0 + b36.f.h(2, this.f384312e);
            java.lang.String str4 = this.f384313f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int e17 = h17 + b36.f.e(4, this.f384314g);
            java.lang.String str5 = this.f384315h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f384316i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.qw3 qw3Var = (r45.qw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qw3Var.f384311d = aVar2.i(intValue);
                return 0;
            case 2:
                qw3Var.f384312e = aVar2.i(intValue);
                return 0;
            case 3:
                qw3Var.f384313f = aVar2.k(intValue);
                return 0;
            case 4:
                qw3Var.f384314g = aVar2.g(intValue);
                return 0;
            case 5:
                qw3Var.f384315h = aVar2.k(intValue);
                return 0;
            case 6:
                qw3Var.f384316i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
