package r45;

/* loaded from: classes15.dex */
public class h16 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.c45 f375763d;

    /* renamed from: e, reason: collision with root package name */
    public r45.w35 f375764e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c45 f375765f;

    /* renamed from: g, reason: collision with root package name */
    public r45.w35 f375766g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f375767h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f375768i = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h16)) {
            return false;
        }
        r45.h16 h16Var = (r45.h16) fVar;
        return n51.f.a(this.f375763d, h16Var.f375763d) && n51.f.a(this.f375764e, h16Var.f375764e) && n51.f.a(this.f375765f, h16Var.f375765f) && n51.f.a(this.f375766g, h16Var.f375766g) && n51.f.a(java.lang.Boolean.valueOf(this.f375767h), java.lang.Boolean.valueOf(h16Var.f375767h)) && n51.f.a(java.lang.Boolean.valueOf(this.f375768i), java.lang.Boolean.valueOf(h16Var.f375768i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.c45 c45Var = this.f375763d;
            if (c45Var != null) {
                fVar.i(1, c45Var.computeSize());
                this.f375763d.writeFields(fVar);
            }
            r45.w35 w35Var = this.f375764e;
            if (w35Var != null) {
                fVar.i(2, w35Var.computeSize());
                this.f375764e.writeFields(fVar);
            }
            r45.c45 c45Var2 = this.f375765f;
            if (c45Var2 != null) {
                fVar.i(3, c45Var2.computeSize());
                this.f375765f.writeFields(fVar);
            }
            r45.w35 w35Var2 = this.f375766g;
            if (w35Var2 != null) {
                fVar.i(4, w35Var2.computeSize());
                this.f375766g.writeFields(fVar);
            }
            fVar.a(5, this.f375767h);
            fVar.a(6, this.f375768i);
            return 0;
        }
        if (i17 == 1) {
            r45.c45 c45Var3 = this.f375763d;
            int i18 = c45Var3 != null ? 0 + b36.f.i(1, c45Var3.computeSize()) : 0;
            r45.w35 w35Var3 = this.f375764e;
            if (w35Var3 != null) {
                i18 += b36.f.i(2, w35Var3.computeSize());
            }
            r45.c45 c45Var4 = this.f375765f;
            if (c45Var4 != null) {
                i18 += b36.f.i(3, c45Var4.computeSize());
            }
            r45.w35 w35Var4 = this.f375766g;
            if (w35Var4 != null) {
                i18 += b36.f.i(4, w35Var4.computeSize());
            }
            return i18 + b36.f.a(5, this.f375767h) + b36.f.a(6, this.f375768i);
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
        r45.h16 h16Var = (r45.h16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.c45 c45Var5 = new r45.c45();
                    if (bArr != null && bArr.length > 0) {
                        c45Var5.parseFrom(bArr);
                    }
                    h16Var.f375763d = c45Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.w35 w35Var5 = new r45.w35();
                    if (bArr2 != null && bArr2.length > 0) {
                        w35Var5.parseFrom(bArr2);
                    }
                    h16Var.f375764e = w35Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.c45 c45Var6 = new r45.c45();
                    if (bArr3 != null && bArr3.length > 0) {
                        c45Var6.parseFrom(bArr3);
                    }
                    h16Var.f375765f = c45Var6;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.w35 w35Var6 = new r45.w35();
                    if (bArr4 != null && bArr4.length > 0) {
                        w35Var6.parseFrom(bArr4);
                    }
                    h16Var.f375766g = w35Var6;
                }
                return 0;
            case 5:
                h16Var.f375767h = aVar2.c(intValue);
                return 0;
            case 6:
                h16Var.f375768i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
