package r45;

/* loaded from: classes2.dex */
public class gt5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375524d;

    /* renamed from: e, reason: collision with root package name */
    public int f375525e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f375526f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f375527g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375528h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gt5)) {
            return false;
        }
        r45.gt5 gt5Var = (r45.gt5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375524d), java.lang.Integer.valueOf(gt5Var.f375524d)) && n51.f.a(java.lang.Integer.valueOf(this.f375525e), java.lang.Integer.valueOf(gt5Var.f375525e)) && n51.f.a(this.f375526f, gt5Var.f375526f) && n51.f.a(this.f375527g, gt5Var.f375527g) && n51.f.a(this.f375528h, gt5Var.f375528h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375524d);
            fVar.e(2, this.f375525e);
            r45.yt5 yt5Var = this.f375526f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.computeSize());
                this.f375526f.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f375527g;
            if (rl6Var != null) {
                fVar.i(4, rl6Var.computeSize());
                this.f375527g.writeFields(fVar);
            }
            java.lang.String str = this.f375528h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375524d) + 0 + b36.f.e(2, this.f375525e);
            r45.yt5 yt5Var2 = this.f375526f;
            if (yt5Var2 != null) {
                e17 += b36.f.i(3, yt5Var2.computeSize());
            }
            r45.rl6 rl6Var2 = this.f375527g;
            if (rl6Var2 != null) {
                e17 += b36.f.i(4, rl6Var2.computeSize());
            }
            java.lang.String str2 = this.f375528h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.gt5 gt5Var = (r45.gt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gt5Var.f375524d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gt5Var.f375525e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr != null && bArr.length > 0) {
                    yt5Var3.parseFrom(bArr);
                }
                gt5Var.f375526f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            gt5Var.f375528h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr2 != null && bArr2.length > 0) {
                rl6Var3.parseFrom(bArr2);
            }
            gt5Var.f375527g = rl6Var3;
        }
        return 0;
    }
}
