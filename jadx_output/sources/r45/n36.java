package r45;

/* loaded from: classes4.dex */
public class n36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public float f381062d;

    /* renamed from: e, reason: collision with root package name */
    public float f381063e;

    /* renamed from: f, reason: collision with root package name */
    public int f381064f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381065g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n36)) {
            return false;
        }
        r45.n36 n36Var = (r45.n36) fVar;
        return n51.f.a(this.BaseRequest, n36Var.BaseRequest) && n51.f.a(java.lang.Float.valueOf(this.f381062d), java.lang.Float.valueOf(n36Var.f381062d)) && n51.f.a(java.lang.Float.valueOf(this.f381063e), java.lang.Float.valueOf(n36Var.f381063e)) && n51.f.a(java.lang.Integer.valueOf(this.f381064f), java.lang.Integer.valueOf(n36Var.f381064f)) && n51.f.a(this.f381065g, n36Var.f381065g);
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
            fVar.d(2, this.f381062d);
            fVar.d(3, this.f381063e);
            fVar.e(4, this.f381064f);
            java.lang.String str = this.f381065g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.d(2, this.f381062d) + b36.f.d(3, this.f381063e) + b36.f.e(4, this.f381064f);
            java.lang.String str2 = this.f381065g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.n36 n36Var = (r45.n36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                n36Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            n36Var.f381062d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            n36Var.f381063e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            n36Var.f381064f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        n36Var.f381065g = aVar2.k(intValue);
        return 0;
    }
}
