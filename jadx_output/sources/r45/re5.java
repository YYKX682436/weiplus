package r45;

/* loaded from: classes8.dex */
public class re5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f384768d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f384769e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f384770f;

    /* renamed from: g, reason: collision with root package name */
    public int f384771g;

    /* renamed from: h, reason: collision with root package name */
    public long f384772h;

    /* renamed from: i, reason: collision with root package name */
    public int f384773i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.re5)) {
            return false;
        }
        r45.re5 re5Var = (r45.re5) fVar;
        return n51.f.a(this.BaseRequest, re5Var.BaseRequest) && n51.f.a(this.f384768d, re5Var.f384768d) && n51.f.a(this.f384769e, re5Var.f384769e) && n51.f.a(this.f384770f, re5Var.f384770f) && n51.f.a(java.lang.Integer.valueOf(this.f384771g), java.lang.Integer.valueOf(re5Var.f384771g)) && n51.f.a(java.lang.Long.valueOf(this.f384772h), java.lang.Long.valueOf(re5Var.f384772h)) && n51.f.a(java.lang.Integer.valueOf(this.f384773i), java.lang.Integer.valueOf(re5Var.f384773i));
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
            r45.du5 du5Var = this.f384768d;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f384768d.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f384769e;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f384769e.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f384770f;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.computeSize());
                this.f384770f.writeFields(fVar);
            }
            fVar.e(5, this.f384771g);
            fVar.h(6, this.f384772h);
            fVar.e(7, this.f384773i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.du5 du5Var4 = this.f384768d;
            if (du5Var4 != null) {
                i18 += b36.f.i(2, du5Var4.computeSize());
            }
            r45.du5 du5Var5 = this.f384769e;
            if (du5Var5 != null) {
                i18 += b36.f.i(3, du5Var5.computeSize());
            }
            r45.du5 du5Var6 = this.f384770f;
            if (du5Var6 != null) {
                i18 += b36.f.i(4, du5Var6.computeSize());
            }
            return i18 + b36.f.e(5, this.f384771g) + b36.f.h(6, this.f384772h) + b36.f.e(7, this.f384773i);
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
        r45.re5 re5Var = (r45.re5) objArr[1];
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
                    re5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    re5Var.f384768d = du5Var7;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    re5Var.f384769e = du5Var8;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    re5Var.f384770f = du5Var9;
                }
                return 0;
            case 5:
                re5Var.f384771g = aVar2.g(intValue);
                return 0;
            case 6:
                re5Var.f384772h = aVar2.i(intValue);
                return 0;
            case 7:
                re5Var.f384773i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
