package r45;

/* loaded from: classes11.dex */
public class tg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386388d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386389e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tn4 f386390f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386391g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386392h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nv3 f386393i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg)) {
            return false;
        }
        r45.tg tgVar = (r45.tg) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386388d), java.lang.Integer.valueOf(tgVar.f386388d)) && n51.f.a(this.f386389e, tgVar.f386389e) && n51.f.a(this.f386390f, tgVar.f386390f) && n51.f.a(this.f386391g, tgVar.f386391g) && n51.f.a(this.f386392h, tgVar.f386392h) && n51.f.a(this.f386393i, tgVar.f386393i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386388d);
            java.lang.String str = this.f386389e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.tn4 tn4Var = this.f386390f;
            if (tn4Var != null) {
                fVar.i(3, tn4Var.computeSize());
                this.f386390f.writeFields(fVar);
            }
            java.lang.String str2 = this.f386391g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386392h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.nv3 nv3Var = this.f386393i;
            if (nv3Var != null) {
                fVar.i(6, nv3Var.computeSize());
                this.f386393i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386388d) + 0;
            java.lang.String str4 = this.f386389e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            r45.tn4 tn4Var2 = this.f386390f;
            if (tn4Var2 != null) {
                e17 += b36.f.i(3, tn4Var2.computeSize());
            }
            java.lang.String str5 = this.f386391g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f386392h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            r45.nv3 nv3Var2 = this.f386393i;
            return nv3Var2 != null ? e17 + b36.f.i(6, nv3Var2.computeSize()) : e17;
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
        r45.tg tgVar = (r45.tg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tgVar.f386388d = aVar2.g(intValue);
                return 0;
            case 2:
                tgVar.f386389e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.tn4 tn4Var3 = new r45.tn4();
                    if (bArr != null && bArr.length > 0) {
                        tn4Var3.parseFrom(bArr);
                    }
                    tgVar.f386390f = tn4Var3;
                }
                return 0;
            case 4:
                tgVar.f386391g = aVar2.k(intValue);
                return 0;
            case 5:
                tgVar.f386392h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.nv3 nv3Var3 = new r45.nv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        nv3Var3.parseFrom(bArr2);
                    }
                    tgVar.f386393i = nv3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
