package r45;

/* loaded from: classes8.dex */
public class jc6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377702d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377703e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377704f;

    /* renamed from: g, reason: collision with root package name */
    public int f377705g;

    /* renamed from: h, reason: collision with root package name */
    public int f377706h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jc6)) {
            return false;
        }
        r45.jc6 jc6Var = (r45.jc6) fVar;
        return n51.f.a(this.BaseRequest, jc6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377702d), java.lang.Integer.valueOf(jc6Var.f377702d)) && n51.f.a(this.f377703e, jc6Var.f377703e) && n51.f.a(this.f377704f, jc6Var.f377704f) && n51.f.a(java.lang.Integer.valueOf(this.f377705g), java.lang.Integer.valueOf(jc6Var.f377705g)) && n51.f.a(java.lang.Integer.valueOf(this.f377706h), java.lang.Integer.valueOf(jc6Var.f377706h));
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
            fVar.e(2, this.f377702d);
            java.lang.String str = this.f377703e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377704f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f377705g);
            fVar.e(6, this.f377706h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377702d);
            java.lang.String str3 = this.f377703e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f377704f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f377705g) + b36.f.e(6, this.f377706h);
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
        r45.jc6 jc6Var = (r45.jc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    jc6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                jc6Var.f377702d = aVar2.g(intValue);
                return 0;
            case 3:
                jc6Var.f377703e = aVar2.k(intValue);
                return 0;
            case 4:
                jc6Var.f377704f = aVar2.k(intValue);
                return 0;
            case 5:
                jc6Var.f377705g = aVar2.g(intValue);
                return 0;
            case 6:
                jc6Var.f377706h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
