package r45;

/* loaded from: classes4.dex */
public class td6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ud6 f386329d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd6 f386330e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rd6 f386331f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.td6)) {
            return false;
        }
        r45.td6 td6Var = (r45.td6) fVar;
        return n51.f.a(this.f386329d, td6Var.f386329d) && n51.f.a(this.f386330e, td6Var.f386330e) && n51.f.a(this.f386331f, td6Var.f386331f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ud6 ud6Var = this.f386329d;
            if (ud6Var != null) {
                fVar.i(1, ud6Var.computeSize());
                this.f386329d.writeFields(fVar);
            }
            r45.sd6 sd6Var = this.f386330e;
            if (sd6Var != null) {
                fVar.i(2, sd6Var.computeSize());
                this.f386330e.writeFields(fVar);
            }
            r45.rd6 rd6Var = this.f386331f;
            if (rd6Var != null) {
                fVar.i(3, rd6Var.computeSize());
                this.f386331f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ud6 ud6Var2 = this.f386329d;
            int i18 = ud6Var2 != null ? 0 + b36.f.i(1, ud6Var2.computeSize()) : 0;
            r45.sd6 sd6Var2 = this.f386330e;
            if (sd6Var2 != null) {
                i18 += b36.f.i(2, sd6Var2.computeSize());
            }
            r45.rd6 rd6Var2 = this.f386331f;
            return rd6Var2 != null ? i18 + b36.f.i(3, rd6Var2.computeSize()) : i18;
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
        r45.td6 td6Var = (r45.td6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ud6 ud6Var3 = new r45.ud6();
                if (bArr != null && bArr.length > 0) {
                    ud6Var3.parseFrom(bArr);
                }
                td6Var.f386329d = ud6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.sd6 sd6Var3 = new r45.sd6();
                if (bArr2 != null && bArr2.length > 0) {
                    sd6Var3.parseFrom(bArr2);
                }
                td6Var.f386330e = sd6Var3;
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
            r45.rd6 rd6Var3 = new r45.rd6();
            if (bArr3 != null && bArr3.length > 0) {
                rd6Var3.parseFrom(bArr3);
            }
            td6Var.f386331f = rd6Var3;
        }
        return 0;
    }
}
