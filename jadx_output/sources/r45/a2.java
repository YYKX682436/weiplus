package r45;

/* loaded from: classes9.dex */
public class a2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b2 f369649d;

    /* renamed from: e, reason: collision with root package name */
    public r45.b2 f369650e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b2 f369651f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b2 f369652g;

    /* renamed from: h, reason: collision with root package name */
    public r45.b2 f369653h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a2)) {
            return false;
        }
        r45.a2 a2Var = (r45.a2) fVar;
        return n51.f.a(this.f369649d, a2Var.f369649d) && n51.f.a(this.f369650e, a2Var.f369650e) && n51.f.a(this.f369651f, a2Var.f369651f) && n51.f.a(this.f369652g, a2Var.f369652g) && n51.f.a(this.f369653h, a2Var.f369653h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b2 b2Var = this.f369649d;
            if (b2Var != null) {
                fVar.i(1, b2Var.computeSize());
                this.f369649d.writeFields(fVar);
            }
            r45.b2 b2Var2 = this.f369650e;
            if (b2Var2 != null) {
                fVar.i(2, b2Var2.computeSize());
                this.f369650e.writeFields(fVar);
            }
            r45.b2 b2Var3 = this.f369651f;
            if (b2Var3 != null) {
                fVar.i(3, b2Var3.computeSize());
                this.f369651f.writeFields(fVar);
            }
            r45.b2 b2Var4 = this.f369652g;
            if (b2Var4 != null) {
                fVar.i(4, b2Var4.computeSize());
                this.f369652g.writeFields(fVar);
            }
            r45.b2 b2Var5 = this.f369653h;
            if (b2Var5 != null) {
                fVar.i(5, b2Var5.computeSize());
                this.f369653h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.b2 b2Var6 = this.f369649d;
            int i18 = b2Var6 != null ? 0 + b36.f.i(1, b2Var6.computeSize()) : 0;
            r45.b2 b2Var7 = this.f369650e;
            if (b2Var7 != null) {
                i18 += b36.f.i(2, b2Var7.computeSize());
            }
            r45.b2 b2Var8 = this.f369651f;
            if (b2Var8 != null) {
                i18 += b36.f.i(3, b2Var8.computeSize());
            }
            r45.b2 b2Var9 = this.f369652g;
            if (b2Var9 != null) {
                i18 += b36.f.i(4, b2Var9.computeSize());
            }
            r45.b2 b2Var10 = this.f369653h;
            return b2Var10 != null ? i18 + b36.f.i(5, b2Var10.computeSize()) : i18;
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
        r45.a2 a2Var = (r45.a2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.b2 b2Var11 = new r45.b2();
                if (bArr != null && bArr.length > 0) {
                    b2Var11.parseFrom(bArr);
                }
                a2Var.f369649d = b2Var11;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.b2 b2Var12 = new r45.b2();
                if (bArr2 != null && bArr2.length > 0) {
                    b2Var12.parseFrom(bArr2);
                }
                a2Var.f369650e = b2Var12;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.b2 b2Var13 = new r45.b2();
                if (bArr3 != null && bArr3.length > 0) {
                    b2Var13.parseFrom(bArr3);
                }
                a2Var.f369651f = b2Var13;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.b2 b2Var14 = new r45.b2();
                if (bArr4 != null && bArr4.length > 0) {
                    b2Var14.parseFrom(bArr4);
                }
                a2Var.f369652g = b2Var14;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.b2 b2Var15 = new r45.b2();
            if (bArr5 != null && bArr5.length > 0) {
                b2Var15.parseFrom(bArr5);
            }
            a2Var.f369653h = b2Var15;
        }
        return 0;
    }
}
