package r45;

/* loaded from: classes2.dex */
public class au4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f370262d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f370263e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370264f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370265g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f370266h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bz3 f370267i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.au4)) {
            return false;
        }
        r45.au4 au4Var = (r45.au4) fVar;
        return n51.f.a(this.f370262d, au4Var.f370262d) && n51.f.a(this.f370263e, au4Var.f370263e) && n51.f.a(this.f370264f, au4Var.f370264f) && n51.f.a(this.f370265g, au4Var.f370265g) && n51.f.a(this.f370266h, au4Var.f370266h) && n51.f.a(this.f370267i, au4Var.f370267i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370263e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f370262d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f370262d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f370264f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f370265g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.yt5 yt5Var = this.f370266h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.computeSize());
                this.f370266h.writeFields(fVar);
            }
            r45.bz3 bz3Var = this.f370267i;
            if (bz3Var != null) {
                fVar.i(6, bz3Var.computeSize());
                this.f370267i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f370262d;
            int i18 = (rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f370264f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f370265g;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.yt5 yt5Var2 = this.f370266h;
            if (yt5Var2 != null) {
                i18 += b36.f.i(5, yt5Var2.computeSize());
            }
            r45.bz3 bz3Var2 = this.f370267i;
            return bz3Var2 != null ? i18 + b36.f.i(6, bz3Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.au4 au4Var = (r45.au4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.rl6 rl6Var3 = new r45.rl6();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl6Var3.parseFrom(bArr2);
                    }
                    au4Var.f370262d = rl6Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var4 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var4.parseFrom(bArr3);
                    }
                    au4Var.f370263e.add(rl6Var4);
                }
                return 0;
            case 3:
                au4Var.f370264f = aVar2.k(intValue);
                return 0;
            case 4:
                au4Var.f370265g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr4 != null && bArr4.length > 0) {
                        yt5Var3.parseFrom(bArr4);
                    }
                    au4Var.f370266h = yt5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr5 != null && bArr5.length > 0) {
                        bz3Var3.parseFrom(bArr5);
                    }
                    au4Var.f370267i = bz3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
