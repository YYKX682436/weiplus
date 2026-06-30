package r45;

/* loaded from: classes4.dex */
public class yh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public float f391077d;

    /* renamed from: e, reason: collision with root package name */
    public float f391078e;

    /* renamed from: f, reason: collision with root package name */
    public int f391079f;

    /* renamed from: g, reason: collision with root package name */
    public int f391080g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391081h;

    /* renamed from: i, reason: collision with root package name */
    public int f391082i;

    /* renamed from: m, reason: collision with root package name */
    public int f391083m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yh3)) {
            return false;
        }
        r45.yh3 yh3Var = (r45.yh3) fVar;
        return n51.f.a(this.BaseRequest, yh3Var.BaseRequest) && n51.f.a(java.lang.Float.valueOf(this.f391077d), java.lang.Float.valueOf(yh3Var.f391077d)) && n51.f.a(java.lang.Float.valueOf(this.f391078e), java.lang.Float.valueOf(yh3Var.f391078e)) && n51.f.a(java.lang.Integer.valueOf(this.f391079f), java.lang.Integer.valueOf(yh3Var.f391079f)) && n51.f.a(java.lang.Integer.valueOf(this.f391080g), java.lang.Integer.valueOf(yh3Var.f391080g)) && n51.f.a(this.f391081h, yh3Var.f391081h) && n51.f.a(java.lang.Integer.valueOf(this.f391082i), java.lang.Integer.valueOf(yh3Var.f391082i)) && n51.f.a(java.lang.Integer.valueOf(this.f391083m), java.lang.Integer.valueOf(yh3Var.f391083m));
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
            fVar.d(2, this.f391077d);
            fVar.d(3, this.f391078e);
            fVar.e(4, this.f391079f);
            fVar.e(5, this.f391080g);
            java.lang.String str = this.f391081h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f391082i);
            fVar.e(8, this.f391083m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.d(2, this.f391077d) + b36.f.d(3, this.f391078e) + b36.f.e(4, this.f391079f) + b36.f.e(5, this.f391080g);
            java.lang.String str2 = this.f391081h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f391082i) + b36.f.e(8, this.f391083m);
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
        r45.yh3 yh3Var = (r45.yh3) objArr[1];
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
                    yh3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yh3Var.f391077d = aVar2.f(intValue);
                return 0;
            case 3:
                yh3Var.f391078e = aVar2.f(intValue);
                return 0;
            case 4:
                yh3Var.f391079f = aVar2.g(intValue);
                return 0;
            case 5:
                yh3Var.f391080g = aVar2.g(intValue);
                return 0;
            case 6:
                yh3Var.f391081h = aVar2.k(intValue);
                return 0;
            case 7:
                yh3Var.f391082i = aVar2.g(intValue);
                return 0;
            case 8:
                yh3Var.f391083m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
