package r45;

/* loaded from: classes2.dex */
public class r75 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f384589d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f384590e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f384591f;

    /* renamed from: h, reason: collision with root package name */
    public r45.au4 f384593h;

    /* renamed from: m, reason: collision with root package name */
    public r45.o75 f384595m;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384592g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f384594i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r75)) {
            return false;
        }
        r45.r75 r75Var = (r45.r75) fVar;
        return n51.f.a(this.f384589d, r75Var.f384589d) && n51.f.a(this.f384590e, r75Var.f384590e) && n51.f.a(this.f384591f, r75Var.f384591f) && n51.f.a(this.f384592g, r75Var.f384592g) && n51.f.a(this.f384593h, r75Var.f384593h) && n51.f.a(this.f384594i, r75Var.f384594i) && n51.f.a(this.f384595m, r75Var.f384595m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384594i;
        java.util.LinkedList linkedList2 = this.f384592g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f384589d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.computeSize());
                this.f384589d.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f384590e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f384590e.writeFields(fVar);
            }
            r45.rl6 rl6Var2 = this.f384591f;
            if (rl6Var2 != null) {
                fVar.i(3, rl6Var2.computeSize());
                this.f384591f.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList2);
            r45.au4 au4Var = this.f384593h;
            if (au4Var != null) {
                fVar.i(5, au4Var.computeSize());
                this.f384593h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            r45.o75 o75Var = this.f384595m;
            if (o75Var != null) {
                fVar.i(7, o75Var.computeSize());
                this.f384595m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var2 = this.f384589d;
            int i18 = bz3Var2 != null ? 0 + b36.f.i(1, bz3Var2.computeSize()) : 0;
            r45.rl6 rl6Var3 = this.f384590e;
            if (rl6Var3 != null) {
                i18 += b36.f.i(2, rl6Var3.computeSize());
            }
            r45.rl6 rl6Var4 = this.f384591f;
            if (rl6Var4 != null) {
                i18 += b36.f.i(3, rl6Var4.computeSize());
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            r45.au4 au4Var2 = this.f384593h;
            if (au4Var2 != null) {
                g17 += b36.f.i(5, au4Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            r45.o75 o75Var2 = this.f384595m;
            return o75Var2 != null ? g18 + b36.f.i(7, o75Var2.computeSize()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.r75 r75Var = (r45.r75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.parseFrom(bArr2);
                    }
                    r75Var.f384589d = bz3Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var5.parseFrom(bArr3);
                    }
                    r75Var.f384590e = rl6Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var6 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var6.parseFrom(bArr4);
                    }
                    r75Var.f384591f = rl6Var6;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lu luVar = new r45.lu();
                    if (bArr5 != null && bArr5.length > 0) {
                        luVar.parseFrom(bArr5);
                    }
                    r75Var.f384592g.add(luVar);
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.au4 au4Var3 = new r45.au4();
                    if (bArr6 != null && bArr6.length > 0) {
                        au4Var3.parseFrom(bArr6);
                    }
                    r75Var.f384593h = au4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.au4 au4Var4 = new r45.au4();
                    if (bArr7 != null && bArr7.length > 0) {
                        au4Var4.parseFrom(bArr7);
                    }
                    r75Var.f384594i.add(au4Var4);
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.o75 o75Var3 = new r45.o75();
                    if (bArr8 != null && bArr8.length > 0) {
                        o75Var3.parseFrom(bArr8);
                    }
                    r75Var.f384595m = o75Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
