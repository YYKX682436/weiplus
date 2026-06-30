package r45;

/* loaded from: classes9.dex */
public class q43 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383669e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383670f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383671g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383672h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383673i;

    /* renamed from: m, reason: collision with root package name */
    public int f383674m;

    /* renamed from: n, reason: collision with root package name */
    public int f383675n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q43)) {
            return false;
        }
        r45.q43 q43Var = (r45.q43) fVar;
        return n51.f.a(this.BaseRequest, q43Var.BaseRequest) && n51.f.a(this.f383668d, q43Var.f383668d) && n51.f.a(this.f383669e, q43Var.f383669e) && n51.f.a(this.f383670f, q43Var.f383670f) && n51.f.a(this.f383671g, q43Var.f383671g) && n51.f.a(this.f383672h, q43Var.f383672h) && n51.f.a(this.f383673i, q43Var.f383673i) && n51.f.a(java.lang.Integer.valueOf(this.f383674m), java.lang.Integer.valueOf(q43Var.f383674m)) && n51.f.a(java.lang.Integer.valueOf(this.f383675n), java.lang.Integer.valueOf(q43Var.f383675n));
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
            java.lang.String str = this.f383668d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383669e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383670f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383671g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383672h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f383673i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f383674m);
            fVar.e(9, this.f383675n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f383668d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f383669e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f383670f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f383671g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f383672h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f383673i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            return i18 + b36.f.e(8, this.f383674m) + b36.f.e(9, this.f383675n);
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
        r45.q43 q43Var = (r45.q43) objArr[1];
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
                    q43Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                q43Var.f383668d = aVar2.k(intValue);
                return 0;
            case 3:
                q43Var.f383669e = aVar2.k(intValue);
                return 0;
            case 4:
                q43Var.f383670f = aVar2.k(intValue);
                return 0;
            case 5:
                q43Var.f383671g = aVar2.k(intValue);
                return 0;
            case 6:
                q43Var.f383672h = aVar2.k(intValue);
                return 0;
            case 7:
                q43Var.f383673i = aVar2.k(intValue);
                return 0;
            case 8:
                q43Var.f383674m = aVar2.g(intValue);
                return 0;
            case 9:
                q43Var.f383675n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
