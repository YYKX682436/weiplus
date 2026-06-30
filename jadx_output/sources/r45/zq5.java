package r45;

/* loaded from: classes4.dex */
public class zq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392306d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f392307e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f392308f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f392309g;

    /* renamed from: h, reason: collision with root package name */
    public int f392310h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zq5)) {
            return false;
        }
        r45.zq5 zq5Var = (r45.zq5) fVar;
        return n51.f.a(this.BaseRequest, zq5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f392306d), java.lang.Integer.valueOf(zq5Var.f392306d)) && n51.f.a(this.f392307e, zq5Var.f392307e) && n51.f.a(this.f392308f, zq5Var.f392308f) && n51.f.a(this.f392309g, zq5Var.f392309g) && n51.f.a(java.lang.Integer.valueOf(this.f392310h), java.lang.Integer.valueOf(zq5Var.f392310h));
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
            fVar.e(2, this.f392306d);
            fVar.g(3, 8, this.f392307e);
            r45.du5 du5Var = this.f392308f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f392308f.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f392309g;
            if (du5Var2 != null) {
                fVar.i(5, du5Var2.computeSize());
                this.f392309g.writeFields(fVar);
            }
            fVar.e(6, this.f392310h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f392306d) + b36.f.g(3, 8, this.f392307e);
            r45.du5 du5Var3 = this.f392308f;
            if (du5Var3 != null) {
                i18 += b36.f.i(4, du5Var3.computeSize());
            }
            r45.du5 du5Var4 = this.f392309g;
            if (du5Var4 != null) {
                i18 += b36.f.i(5, du5Var4.computeSize());
            }
            return i18 + b36.f.e(6, this.f392310h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f392307e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.zq5 zq5Var = (r45.zq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    zq5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                zq5Var.f392306d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var5.b(bArr3);
                    }
                    zq5Var.f392307e.add(du5Var5);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    zq5Var.f392308f = du5Var6;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var7.b(bArr5);
                    }
                    zq5Var.f392309g = du5Var7;
                }
                return 0;
            case 6:
                zq5Var.f392310h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
