package r45;

/* loaded from: classes4.dex */
public class mi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380539d;

    /* renamed from: e, reason: collision with root package name */
    public int f380540e;

    /* renamed from: f, reason: collision with root package name */
    public double f380541f;

    /* renamed from: g, reason: collision with root package name */
    public double f380542g;

    /* renamed from: h, reason: collision with root package name */
    public int f380543h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mi3)) {
            return false;
        }
        r45.mi3 mi3Var = (r45.mi3) fVar;
        return n51.f.a(this.BaseRequest, mi3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f380539d), java.lang.Integer.valueOf(mi3Var.f380539d)) && n51.f.a(java.lang.Integer.valueOf(this.f380540e), java.lang.Integer.valueOf(mi3Var.f380540e)) && n51.f.a(java.lang.Double.valueOf(this.f380541f), java.lang.Double.valueOf(mi3Var.f380541f)) && n51.f.a(java.lang.Double.valueOf(this.f380542g), java.lang.Double.valueOf(mi3Var.f380542g)) && n51.f.a(java.lang.Integer.valueOf(this.f380543h), java.lang.Integer.valueOf(mi3Var.f380543h));
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
            fVar.e(2, this.f380539d);
            fVar.e(3, this.f380540e);
            fVar.c(4, this.f380541f);
            fVar.c(5, this.f380542g);
            fVar.e(6, this.f380543h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f380539d) + b36.f.e(3, this.f380540e) + b36.f.c(4, this.f380541f) + b36.f.c(5, this.f380542g) + b36.f.e(6, this.f380543h);
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
        r45.mi3 mi3Var = (r45.mi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    mi3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                mi3Var.f380539d = aVar2.g(intValue);
                return 0;
            case 3:
                mi3Var.f380540e = aVar2.g(intValue);
                return 0;
            case 4:
                mi3Var.f380541f = aVar2.e(intValue);
                return 0;
            case 5:
                mi3Var.f380542g = aVar2.e(intValue);
                return 0;
            case 6:
                mi3Var.f380543h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
