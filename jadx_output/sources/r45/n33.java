package r45;

/* loaded from: classes9.dex */
public class n33 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.jw3 f381043e;

    /* renamed from: d, reason: collision with root package name */
    public int f381042d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f381044f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f381045g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f381046h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f381047i = -1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n33)) {
            return false;
        }
        r45.n33 n33Var = (r45.n33) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381042d), java.lang.Integer.valueOf(n33Var.f381042d)) && n51.f.a(this.f381043e, n33Var.f381043e) && n51.f.a(java.lang.Integer.valueOf(this.f381044f), java.lang.Integer.valueOf(n33Var.f381044f)) && n51.f.a(java.lang.Integer.valueOf(this.f381045g), java.lang.Integer.valueOf(n33Var.f381045g)) && n51.f.a(java.lang.Boolean.valueOf(this.f381046h), java.lang.Boolean.valueOf(n33Var.f381046h)) && n51.f.a(java.lang.Integer.valueOf(this.f381047i), java.lang.Integer.valueOf(n33Var.f381047i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381042d);
            r45.jw3 jw3Var = this.f381043e;
            if (jw3Var != null) {
                fVar.i(2, jw3Var.computeSize());
                this.f381043e.writeFields(fVar);
            }
            fVar.e(3, this.f381044f);
            fVar.e(4, this.f381045g);
            fVar.a(5, this.f381046h);
            fVar.e(6, this.f381047i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381042d) + 0;
            r45.jw3 jw3Var2 = this.f381043e;
            if (jw3Var2 != null) {
                e17 += b36.f.i(2, jw3Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f381044f) + b36.f.e(4, this.f381045g) + b36.f.a(5, this.f381046h) + b36.f.e(6, this.f381047i);
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
        r45.n33 n33Var = (r45.n33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n33Var.f381042d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.jw3 jw3Var3 = new r45.jw3();
                    if (bArr != null && bArr.length > 0) {
                        jw3Var3.parseFrom(bArr);
                    }
                    n33Var.f381043e = jw3Var3;
                }
                return 0;
            case 3:
                n33Var.f381044f = aVar2.g(intValue);
                return 0;
            case 4:
                n33Var.f381045g = aVar2.g(intValue);
                return 0;
            case 5:
                n33Var.f381046h = aVar2.c(intValue);
                return 0;
            case 6:
                n33Var.f381047i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
