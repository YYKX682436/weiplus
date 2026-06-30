package r45;

/* loaded from: classes9.dex */
public class ce4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371500d;

    /* renamed from: e, reason: collision with root package name */
    public int f371501e;

    /* renamed from: f, reason: collision with root package name */
    public r45.de4 f371502f;

    /* renamed from: g, reason: collision with root package name */
    public r45.de4 f371503g;

    /* renamed from: h, reason: collision with root package name */
    public r45.de4 f371504h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce4)) {
            return false;
        }
        r45.ce4 ce4Var = (r45.ce4) fVar;
        return n51.f.a(this.f371500d, ce4Var.f371500d) && n51.f.a(java.lang.Integer.valueOf(this.f371501e), java.lang.Integer.valueOf(ce4Var.f371501e)) && n51.f.a(this.f371502f, ce4Var.f371502f) && n51.f.a(this.f371503g, ce4Var.f371503g) && n51.f.a(this.f371504h, ce4Var.f371504h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371500d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371501e);
            r45.de4 de4Var = this.f371502f;
            if (de4Var != null) {
                fVar.i(3, de4Var.computeSize());
                this.f371502f.writeFields(fVar);
            }
            r45.de4 de4Var2 = this.f371503g;
            if (de4Var2 != null) {
                fVar.i(4, de4Var2.computeSize());
                this.f371503g.writeFields(fVar);
            }
            r45.de4 de4Var3 = this.f371504h;
            if (de4Var3 != null) {
                fVar.i(5, de4Var3.computeSize());
                this.f371504h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f371500d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f371501e);
            r45.de4 de4Var4 = this.f371502f;
            if (de4Var4 != null) {
                j17 += b36.f.i(3, de4Var4.computeSize());
            }
            r45.de4 de4Var5 = this.f371503g;
            if (de4Var5 != null) {
                j17 += b36.f.i(4, de4Var5.computeSize());
            }
            r45.de4 de4Var6 = this.f371504h;
            return de4Var6 != null ? j17 + b36.f.i(5, de4Var6.computeSize()) : j17;
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
        r45.ce4 ce4Var = (r45.ce4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ce4Var.f371500d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ce4Var.f371501e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.de4 de4Var7 = new r45.de4();
                if (bArr != null && bArr.length > 0) {
                    de4Var7.parseFrom(bArr);
                }
                ce4Var.f371502f = de4Var7;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.de4 de4Var8 = new r45.de4();
                if (bArr2 != null && bArr2.length > 0) {
                    de4Var8.parseFrom(bArr2);
                }
                ce4Var.f371503g = de4Var8;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.de4 de4Var9 = new r45.de4();
            if (bArr3 != null && bArr3.length > 0) {
                de4Var9.parseFrom(bArr3);
            }
            ce4Var.f371504h = de4Var9;
        }
        return 0;
    }
}
