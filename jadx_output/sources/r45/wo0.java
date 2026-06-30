package r45;

/* loaded from: classes8.dex */
public class wo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389332e;

    /* renamed from: f, reason: collision with root package name */
    public float f389333f;

    /* renamed from: g, reason: collision with root package name */
    public float f389334g;

    /* renamed from: h, reason: collision with root package name */
    public int f389335h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389336i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389337m;

    /* renamed from: n, reason: collision with root package name */
    public int f389338n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389339o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo0)) {
            return false;
        }
        r45.wo0 wo0Var = (r45.wo0) fVar;
        return n51.f.a(this.BaseRequest, wo0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389331d), java.lang.Integer.valueOf(wo0Var.f389331d)) && n51.f.a(this.f389332e, wo0Var.f389332e) && n51.f.a(java.lang.Float.valueOf(this.f389333f), java.lang.Float.valueOf(wo0Var.f389333f)) && n51.f.a(java.lang.Float.valueOf(this.f389334g), java.lang.Float.valueOf(wo0Var.f389334g)) && n51.f.a(java.lang.Integer.valueOf(this.f389335h), java.lang.Integer.valueOf(wo0Var.f389335h)) && n51.f.a(this.f389336i, wo0Var.f389336i) && n51.f.a(this.f389337m, wo0Var.f389337m) && n51.f.a(java.lang.Integer.valueOf(this.f389338n), java.lang.Integer.valueOf(wo0Var.f389338n)) && n51.f.a(this.f389339o, wo0Var.f389339o);
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
            fVar.e(2, this.f389331d);
            java.lang.String str = this.f389332e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.d(4, this.f389333f);
            fVar.d(5, this.f389334g);
            fVar.e(6, this.f389335h);
            java.lang.String str2 = this.f389336i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f389337m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f389338n);
            java.lang.String str4 = this.f389339o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f389331d);
            java.lang.String str5 = this.f389332e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int d17 = i18 + b36.f.d(4, this.f389333f) + b36.f.d(5, this.f389334g) + b36.f.e(6, this.f389335h);
            java.lang.String str6 = this.f389336i;
            if (str6 != null) {
                d17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f389337m;
            if (str7 != null) {
                d17 += b36.f.j(8, str7);
            }
            int e17 = d17 + b36.f.e(9, this.f389338n);
            java.lang.String str8 = this.f389339o;
            return str8 != null ? e17 + b36.f.j(10, str8) : e17;
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
        r45.wo0 wo0Var = (r45.wo0) objArr[1];
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
                    wo0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wo0Var.f389331d = aVar2.g(intValue);
                return 0;
            case 3:
                wo0Var.f389332e = aVar2.k(intValue);
                return 0;
            case 4:
                wo0Var.f389333f = aVar2.f(intValue);
                return 0;
            case 5:
                wo0Var.f389334g = aVar2.f(intValue);
                return 0;
            case 6:
                wo0Var.f389335h = aVar2.g(intValue);
                return 0;
            case 7:
                wo0Var.f389336i = aVar2.k(intValue);
                return 0;
            case 8:
                wo0Var.f389337m = aVar2.k(intValue);
                return 0;
            case 9:
                wo0Var.f389338n = aVar2.g(intValue);
                return 0;
            case 10:
                wo0Var.f389339o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
