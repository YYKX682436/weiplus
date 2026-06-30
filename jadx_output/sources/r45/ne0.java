package r45;

/* loaded from: classes2.dex */
public class ne0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381302e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f381303f;

    /* renamed from: g, reason: collision with root package name */
    public r45.a50 f381304g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381305h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ne0)) {
            return false;
        }
        r45.ne0 ne0Var = (r45.ne0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381301d), java.lang.Integer.valueOf(ne0Var.f381301d)) && n51.f.a(this.f381302e, ne0Var.f381302e) && n51.f.a(this.f381303f, ne0Var.f381303f) && n51.f.a(this.f381304g, ne0Var.f381304g) && n51.f.a(this.f381305h, ne0Var.f381305h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381301d);
            java.lang.String str = this.f381302e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.yt5 yt5Var = this.f381303f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.computeSize());
                this.f381303f.writeFields(fVar);
            }
            r45.a50 a50Var = this.f381304g;
            if (a50Var != null) {
                fVar.i(4, a50Var.computeSize());
                this.f381304g.writeFields(fVar);
            }
            java.lang.String str2 = this.f381305h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381301d) + 0;
            java.lang.String str3 = this.f381302e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.yt5 yt5Var2 = this.f381303f;
            if (yt5Var2 != null) {
                e17 += b36.f.i(3, yt5Var2.computeSize());
            }
            r45.a50 a50Var2 = this.f381304g;
            if (a50Var2 != null) {
                e17 += b36.f.i(4, a50Var2.computeSize());
            }
            java.lang.String str4 = this.f381305h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.ne0 ne0Var = (r45.ne0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ne0Var.f381301d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ne0Var.f381302e = aVar2.k(intValue);
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
                ne0Var.f381303f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ne0Var.f381305h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.a50 a50Var3 = new r45.a50();
            if (bArr2 != null && bArr2.length > 0) {
                a50Var3.parseFrom(bArr2);
            }
            ne0Var.f381304g = a50Var3;
        }
        return 0;
    }
}
