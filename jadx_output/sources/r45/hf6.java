package r45;

/* loaded from: classes4.dex */
public class hf6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f376120d;

    /* renamed from: e, reason: collision with root package name */
    public int f376121e;

    /* renamed from: f, reason: collision with root package name */
    public r45.if6 f376122f;

    /* renamed from: g, reason: collision with root package name */
    public r45.if6 f376123g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hf6)) {
            return false;
        }
        r45.hf6 hf6Var = (r45.hf6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f376120d), java.lang.Long.valueOf(hf6Var.f376120d)) && n51.f.a(java.lang.Integer.valueOf(this.f376121e), java.lang.Integer.valueOf(hf6Var.f376121e)) && n51.f.a(this.f376122f, hf6Var.f376122f) && n51.f.a(this.f376123g, hf6Var.f376123g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f376120d);
            fVar.e(2, this.f376121e);
            r45.if6 if6Var = this.f376122f;
            if (if6Var != null) {
                fVar.i(3, if6Var.computeSize());
                this.f376122f.writeFields(fVar);
            }
            r45.if6 if6Var2 = this.f376123g;
            if (if6Var2 != null) {
                fVar.i(4, if6Var2.computeSize());
                this.f376123g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f376120d) + 0 + b36.f.e(2, this.f376121e);
            r45.if6 if6Var3 = this.f376122f;
            if (if6Var3 != null) {
                h17 += b36.f.i(3, if6Var3.computeSize());
            }
            r45.if6 if6Var4 = this.f376123g;
            return if6Var4 != null ? h17 + b36.f.i(4, if6Var4.computeSize()) : h17;
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
        r45.hf6 hf6Var = (r45.hf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hf6Var.f376120d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            hf6Var.f376121e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.if6 if6Var5 = new r45.if6();
                if (bArr != null && bArr.length > 0) {
                    if6Var5.parseFrom(bArr);
                }
                hf6Var.f376122f = if6Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.if6 if6Var6 = new r45.if6();
            if (bArr2 != null && bArr2.length > 0) {
                if6Var6.parseFrom(bArr2);
            }
            hf6Var.f376123g = if6Var6;
        }
        return 0;
    }
}
