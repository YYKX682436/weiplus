package r45;

/* loaded from: classes2.dex */
public class o66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f381991d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gt5 f381992e;

    /* renamed from: f, reason: collision with root package name */
    public int f381993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381994g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f381995h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o66)) {
            return false;
        }
        r45.o66 o66Var = (r45.o66) fVar;
        return n51.f.a(this.f381991d, o66Var.f381991d) && n51.f.a(this.f381992e, o66Var.f381992e) && n51.f.a(java.lang.Integer.valueOf(this.f381993f), java.lang.Integer.valueOf(o66Var.f381993f)) && n51.f.a(this.f381994g, o66Var.f381994g) && n51.f.a(this.f381995h, o66Var.f381995h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f381991d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f381991d.writeFields(fVar);
            }
            r45.gt5 gt5Var = this.f381992e;
            if (gt5Var != null) {
                fVar.i(2, gt5Var.computeSize());
                this.f381992e.writeFields(fVar);
            }
            fVar.e(3, this.f381993f);
            java.lang.String str = this.f381994g;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.yt5 yt5Var = this.f381995h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.computeSize());
                this.f381995h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f381991d;
            int i18 = rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.computeSize()) : 0;
            r45.gt5 gt5Var2 = this.f381992e;
            if (gt5Var2 != null) {
                i18 += b36.f.i(2, gt5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f381993f);
            java.lang.String str2 = this.f381994g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            r45.yt5 yt5Var2 = this.f381995h;
            return yt5Var2 != null ? e17 + b36.f.i(5, yt5Var2.computeSize()) : e17;
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
        r45.o66 o66Var = (r45.o66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.parseFrom(bArr);
                }
                o66Var.f381991d = rl6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.gt5 gt5Var3 = new r45.gt5();
                if (bArr2 != null && bArr2.length > 0) {
                    gt5Var3.parseFrom(bArr2);
                }
                o66Var.f381992e = gt5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            o66Var.f381993f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            o66Var.f381994g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.yt5 yt5Var3 = new r45.yt5();
            if (bArr3 != null && bArr3.length > 0) {
                yt5Var3.parseFrom(bArr3);
            }
            o66Var.f381995h = yt5Var3;
        }
        return 0;
    }
}
