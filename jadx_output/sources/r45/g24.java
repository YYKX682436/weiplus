package r45;

/* loaded from: classes7.dex */
public class g24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374834d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f374835e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f374836f;

    /* renamed from: g, reason: collision with root package name */
    public r45.nd7 f374837g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374838h;

    /* renamed from: i, reason: collision with root package name */
    public r45.me7 f374839i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f374840m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g24)) {
            return false;
        }
        r45.g24 g24Var = (r45.g24) fVar;
        return n51.f.a(this.BaseRequest, g24Var.BaseRequest) && n51.f.a(this.f374834d, g24Var.f374834d) && n51.f.a(this.f374835e, g24Var.f374835e) && n51.f.a(java.lang.Integer.valueOf(this.f374836f), java.lang.Integer.valueOf(g24Var.f374836f)) && n51.f.a(this.f374837g, g24Var.f374837g) && n51.f.a(this.f374838h, g24Var.f374838h) && n51.f.a(this.f374839i, g24Var.f374839i) && n51.f.a(java.lang.Boolean.valueOf(this.f374840m), java.lang.Boolean.valueOf(g24Var.f374840m));
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
            java.lang.String str = this.f374834d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f374835e);
            fVar.e(4, this.f374836f);
            r45.nd7 nd7Var = this.f374837g;
            if (nd7Var != null) {
                fVar.i(5, nd7Var.computeSize());
                this.f374837g.writeFields(fVar);
            }
            java.lang.String str2 = this.f374838h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.me7 me7Var = this.f374839i;
            if (me7Var != null) {
                fVar.i(7, me7Var.computeSize());
                this.f374839i.writeFields(fVar);
            }
            fVar.a(8, this.f374840m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f374834d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f374835e) + b36.f.e(4, this.f374836f);
            r45.nd7 nd7Var2 = this.f374837g;
            if (nd7Var2 != null) {
                g17 += b36.f.i(5, nd7Var2.computeSize());
            }
            java.lang.String str4 = this.f374838h;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            r45.me7 me7Var2 = this.f374839i;
            if (me7Var2 != null) {
                g17 += b36.f.i(7, me7Var2.computeSize());
            }
            return g17 + b36.f.a(8, this.f374840m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f374835e.clear();
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
        r45.g24 g24Var = (r45.g24) objArr[1];
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
                    g24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                g24Var.f374834d = aVar2.k(intValue);
                return 0;
            case 3:
                g24Var.f374835e.add(aVar2.k(intValue));
                return 0;
            case 4:
                g24Var.f374836f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.parseFrom(bArr3);
                    }
                    g24Var.f374837g = nd7Var3;
                }
                return 0;
            case 6:
                g24Var.f374838h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.me7 me7Var3 = new r45.me7();
                    if (bArr4 != null && bArr4.length > 0) {
                        me7Var3.parseFrom(bArr4);
                    }
                    g24Var.f374839i = me7Var3;
                }
                return 0;
            case 8:
                g24Var.f374840m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
