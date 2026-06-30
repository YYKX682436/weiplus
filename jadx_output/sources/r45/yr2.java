package r45;

/* loaded from: classes2.dex */
public class yr2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.sd1 f391318d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd1 f391319e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qb1 f391320f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr2)) {
            return false;
        }
        r45.yr2 yr2Var = (r45.yr2) fVar;
        return n51.f.a(this.f391318d, yr2Var.f391318d) && n51.f.a(this.f391319e, yr2Var.f391319e) && n51.f.a(this.f391320f, yr2Var.f391320f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.sd1 sd1Var = this.f391318d;
            if (sd1Var != null) {
                fVar.i(1, sd1Var.computeSize());
                this.f391318d.writeFields(fVar);
            }
            r45.sd1 sd1Var2 = this.f391319e;
            if (sd1Var2 != null) {
                fVar.i(2, sd1Var2.computeSize());
                this.f391319e.writeFields(fVar);
            }
            r45.qb1 qb1Var = this.f391320f;
            if (qb1Var != null) {
                fVar.i(3, qb1Var.computeSize());
                this.f391320f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.sd1 sd1Var3 = this.f391318d;
            int i18 = sd1Var3 != null ? 0 + b36.f.i(1, sd1Var3.computeSize()) : 0;
            r45.sd1 sd1Var4 = this.f391319e;
            if (sd1Var4 != null) {
                i18 += b36.f.i(2, sd1Var4.computeSize());
            }
            r45.qb1 qb1Var2 = this.f391320f;
            return qb1Var2 != null ? i18 + b36.f.i(3, qb1Var2.computeSize()) : i18;
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
        r45.yr2 yr2Var = (r45.yr2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.sd1 sd1Var5 = new r45.sd1();
                if (bArr != null && bArr.length > 0) {
                    sd1Var5.parseFrom(bArr);
                }
                yr2Var.f391318d = sd1Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.sd1 sd1Var6 = new r45.sd1();
                if (bArr2 != null && bArr2.length > 0) {
                    sd1Var6.parseFrom(bArr2);
                }
                yr2Var.f391319e = sd1Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr3 != null && bArr3.length > 0) {
                qb1Var3.parseFrom(bArr3);
            }
            yr2Var.f391320f = qb1Var3;
        }
        return 0;
    }
}
