package r45;

/* loaded from: classes4.dex */
public class t74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386195d;

    /* renamed from: e, reason: collision with root package name */
    public long f386196e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o63 f386197f;

    /* renamed from: g, reason: collision with root package name */
    public r45.il4 f386198g;

    /* renamed from: h, reason: collision with root package name */
    public r45.a94 f386199h;

    /* renamed from: i, reason: collision with root package name */
    public long f386200i;

    /* renamed from: m, reason: collision with root package name */
    public r45.v94 f386201m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t74)) {
            return false;
        }
        r45.t74 t74Var = (r45.t74) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386195d), java.lang.Long.valueOf(t74Var.f386195d)) && n51.f.a(java.lang.Long.valueOf(this.f386196e), java.lang.Long.valueOf(t74Var.f386196e)) && n51.f.a(this.f386197f, t74Var.f386197f) && n51.f.a(this.f386198g, t74Var.f386198g) && n51.f.a(this.f386199h, t74Var.f386199h) && n51.f.a(java.lang.Long.valueOf(this.f386200i), java.lang.Long.valueOf(t74Var.f386200i)) && n51.f.a(this.f386201m, t74Var.f386201m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386195d);
            fVar.h(2, this.f386196e);
            r45.o63 o63Var = this.f386197f;
            if (o63Var != null) {
                fVar.i(3, o63Var.computeSize());
                this.f386197f.writeFields(fVar);
            }
            r45.il4 il4Var = this.f386198g;
            if (il4Var != null) {
                fVar.i(4, il4Var.computeSize());
                this.f386198g.writeFields(fVar);
            }
            r45.a94 a94Var = this.f386199h;
            if (a94Var != null) {
                fVar.i(5, a94Var.computeSize());
                this.f386199h.writeFields(fVar);
            }
            fVar.h(6, this.f386200i);
            r45.v94 v94Var = this.f386201m;
            if (v94Var != null) {
                fVar.i(8, v94Var.computeSize());
                this.f386201m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386195d) + 0 + b36.f.h(2, this.f386196e);
            r45.o63 o63Var2 = this.f386197f;
            if (o63Var2 != null) {
                h17 += b36.f.i(3, o63Var2.computeSize());
            }
            r45.il4 il4Var2 = this.f386198g;
            if (il4Var2 != null) {
                h17 += b36.f.i(4, il4Var2.computeSize());
            }
            r45.a94 a94Var2 = this.f386199h;
            if (a94Var2 != null) {
                h17 += b36.f.i(5, a94Var2.computeSize());
            }
            int h18 = h17 + b36.f.h(6, this.f386200i);
            r45.v94 v94Var2 = this.f386201m;
            return v94Var2 != null ? h18 + b36.f.i(8, v94Var2.computeSize()) : h18;
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
        r45.t74 t74Var = (r45.t74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                t74Var.f386195d = aVar2.i(intValue);
                return 0;
            case 2:
                t74Var.f386196e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.o63 o63Var3 = new r45.o63();
                    if (bArr != null && bArr.length > 0) {
                        o63Var3.parseFrom(bArr);
                    }
                    t74Var.f386197f = o63Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.il4 il4Var3 = new r45.il4();
                    if (bArr2 != null && bArr2.length > 0) {
                        il4Var3.parseFrom(bArr2);
                    }
                    t74Var.f386198g = il4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a94 a94Var3 = new r45.a94();
                    if (bArr3 != null && bArr3.length > 0) {
                        a94Var3.parseFrom(bArr3);
                    }
                    t74Var.f386199h = a94Var3;
                }
                return 0;
            case 6:
                t74Var.f386200i = aVar2.i(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.v94 v94Var3 = new r45.v94();
                    if (bArr4 != null && bArr4.length > 0) {
                        v94Var3.parseFrom(bArr4);
                    }
                    t74Var.f386201m = v94Var3;
                }
                return 0;
        }
    }
}
