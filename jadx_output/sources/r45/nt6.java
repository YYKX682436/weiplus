package r45;

/* loaded from: classes2.dex */
public class nt6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381666e;

    /* renamed from: f, reason: collision with root package name */
    public int f381667f;

    /* renamed from: g, reason: collision with root package name */
    public int f381668g;

    /* renamed from: h, reason: collision with root package name */
    public int f381669h;

    /* renamed from: i, reason: collision with root package name */
    public int f381670i;

    /* renamed from: m, reason: collision with root package name */
    public int f381671m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nt6)) {
            return false;
        }
        r45.nt6 nt6Var = (r45.nt6) fVar;
        return n51.f.a(this.BaseResponse, nt6Var.BaseResponse) && n51.f.a(this.f381665d, nt6Var.f381665d) && n51.f.a(this.f381666e, nt6Var.f381666e) && n51.f.a(java.lang.Integer.valueOf(this.f381667f), java.lang.Integer.valueOf(nt6Var.f381667f)) && n51.f.a(java.lang.Integer.valueOf(this.f381668g), java.lang.Integer.valueOf(nt6Var.f381668g)) && n51.f.a(java.lang.Integer.valueOf(this.f381669h), java.lang.Integer.valueOf(nt6Var.f381669h)) && n51.f.a(java.lang.Integer.valueOf(this.f381670i), java.lang.Integer.valueOf(nt6Var.f381670i)) && n51.f.a(java.lang.Integer.valueOf(this.f381671m), java.lang.Integer.valueOf(nt6Var.f381671m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f381665d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381666e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f381667f);
            fVar.e(5, this.f381668g);
            fVar.e(6, this.f381669h);
            fVar.e(7, this.f381670i);
            fVar.e(8, this.f381671m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381665d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f381666e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f381667f) + b36.f.e(5, this.f381668g) + b36.f.e(6, this.f381669h) + b36.f.e(7, this.f381670i) + b36.f.e(8, this.f381671m);
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
        r45.nt6 nt6Var = (r45.nt6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    nt6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                nt6Var.f381665d = aVar2.k(intValue);
                return 0;
            case 3:
                nt6Var.f381666e = aVar2.k(intValue);
                return 0;
            case 4:
                nt6Var.f381667f = aVar2.g(intValue);
                return 0;
            case 5:
                nt6Var.f381668g = aVar2.g(intValue);
                return 0;
            case 6:
                nt6Var.f381669h = aVar2.g(intValue);
                return 0;
            case 7:
                nt6Var.f381670i = aVar2.g(intValue);
                return 0;
            case 8:
                nt6Var.f381671m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
