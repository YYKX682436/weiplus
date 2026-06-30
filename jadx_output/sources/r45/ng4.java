package r45;

/* loaded from: classes2.dex */
public class ng4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381377d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381378e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381379f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381380g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381381h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381382i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tg4 f381383m;

    /* renamed from: n, reason: collision with root package name */
    public r45.j74 f381384n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ng4)) {
            return false;
        }
        r45.ng4 ng4Var = (r45.ng4) fVar;
        return n51.f.a(this.f381377d, ng4Var.f381377d) && n51.f.a(this.f381378e, ng4Var.f381378e) && n51.f.a(this.f381379f, ng4Var.f381379f) && n51.f.a(this.f381380g, ng4Var.f381380g) && n51.f.a(this.f381381h, ng4Var.f381381h) && n51.f.a(this.f381382i, ng4Var.f381382i) && n51.f.a(this.f381383m, ng4Var.f381383m) && n51.f.a(this.f381384n, ng4Var.f381384n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381377d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381378e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381379f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f381380g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f381381h;
            if (str5 != null) {
                fVar.j(2, str5);
            }
            java.lang.String str6 = this.f381382i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            r45.tg4 tg4Var = this.f381383m;
            if (tg4Var != null) {
                fVar.i(7, tg4Var.computeSize());
                this.f381383m.writeFields(fVar);
            }
            r45.j74 j74Var = this.f381384n;
            if (j74Var != null) {
                fVar.i(8, j74Var.computeSize());
                this.f381384n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f381377d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f381378e;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381379f;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f381380g;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f381381h;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f381382i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            r45.tg4 tg4Var2 = this.f381383m;
            if (tg4Var2 != null) {
                j17 += b36.f.i(7, tg4Var2.computeSize());
            }
            r45.j74 j74Var2 = this.f381384n;
            return j74Var2 != null ? j17 + b36.f.i(8, j74Var2.computeSize()) : j17;
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
        r45.ng4 ng4Var = (r45.ng4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ng4Var.f381377d = aVar2.k(intValue);
                return 0;
            case 2:
                ng4Var.f381381h = aVar2.k(intValue);
                return 0;
            case 3:
                ng4Var.f381378e = aVar2.k(intValue);
                return 0;
            case 4:
                ng4Var.f381379f = aVar2.k(intValue);
                return 0;
            case 5:
                ng4Var.f381380g = aVar2.k(intValue);
                return 0;
            case 6:
                ng4Var.f381382i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.parseFrom(bArr);
                    }
                    ng4Var.f381383m = tg4Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.j74 j74Var3 = new r45.j74();
                    if (bArr2 != null && bArr2.length > 0) {
                        j74Var3.parseFrom(bArr2);
                    }
                    ng4Var.f381384n = j74Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
