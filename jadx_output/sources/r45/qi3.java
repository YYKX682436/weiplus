package r45;

/* loaded from: classes8.dex */
public class qi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384014d;

    /* renamed from: e, reason: collision with root package name */
    public int f384015e;

    /* renamed from: f, reason: collision with root package name */
    public double f384016f;

    /* renamed from: g, reason: collision with root package name */
    public double f384017g;

    /* renamed from: h, reason: collision with root package name */
    public int f384018h;

    /* renamed from: i, reason: collision with root package name */
    public int f384019i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi3)) {
            return false;
        }
        r45.qi3 qi3Var = (r45.qi3) fVar;
        return n51.f.a(this.BaseRequest, qi3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384014d), java.lang.Integer.valueOf(qi3Var.f384014d)) && n51.f.a(java.lang.Integer.valueOf(this.f384015e), java.lang.Integer.valueOf(qi3Var.f384015e)) && n51.f.a(java.lang.Double.valueOf(this.f384016f), java.lang.Double.valueOf(qi3Var.f384016f)) && n51.f.a(java.lang.Double.valueOf(this.f384017g), java.lang.Double.valueOf(qi3Var.f384017g)) && n51.f.a(java.lang.Integer.valueOf(this.f384018h), java.lang.Integer.valueOf(qi3Var.f384018h)) && n51.f.a(java.lang.Integer.valueOf(this.f384019i), java.lang.Integer.valueOf(qi3Var.f384019i));
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
            fVar.e(2, this.f384014d);
            fVar.e(3, this.f384015e);
            fVar.c(4, this.f384016f);
            fVar.c(5, this.f384017g);
            fVar.e(6, this.f384018h);
            fVar.e(7, this.f384019i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384014d) + b36.f.e(3, this.f384015e) + b36.f.c(4, this.f384016f) + b36.f.c(5, this.f384017g) + b36.f.e(6, this.f384018h) + b36.f.e(7, this.f384019i);
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
        r45.qi3 qi3Var = (r45.qi3) objArr[1];
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
                    qi3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qi3Var.f384014d = aVar2.g(intValue);
                return 0;
            case 3:
                qi3Var.f384015e = aVar2.g(intValue);
                return 0;
            case 4:
                qi3Var.f384016f = aVar2.e(intValue);
                return 0;
            case 5:
                qi3Var.f384017g = aVar2.e(intValue);
                return 0;
            case 6:
                qi3Var.f384018h = aVar2.g(intValue);
                return 0;
            case 7:
                qi3Var.f384019i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
