package r45;

/* loaded from: classes2.dex */
public class db7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.fa5 f372296d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fa5 f372297e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.db7)) {
            return false;
        }
        r45.db7 db7Var = (r45.db7) fVar;
        return n51.f.a(this.f372296d, db7Var.f372296d) && n51.f.a(this.f372297e, db7Var.f372297e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.fa5 fa5Var = this.f372296d;
            if (fa5Var != null) {
                fVar.i(1, fa5Var.computeSize());
                this.f372296d.writeFields(fVar);
            }
            r45.fa5 fa5Var2 = this.f372297e;
            if (fa5Var2 != null) {
                fVar.i(2, fa5Var2.computeSize());
                this.f372297e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.fa5 fa5Var3 = this.f372296d;
            int i18 = fa5Var3 != null ? 0 + b36.f.i(1, fa5Var3.computeSize()) : 0;
            r45.fa5 fa5Var4 = this.f372297e;
            return fa5Var4 != null ? i18 + b36.f.i(2, fa5Var4.computeSize()) : i18;
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
        r45.db7 db7Var = (r45.db7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.fa5 fa5Var5 = new r45.fa5();
                if (bArr != null && bArr.length > 0) {
                    fa5Var5.parseFrom(bArr);
                }
                db7Var.f372296d = fa5Var5;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.fa5 fa5Var6 = new r45.fa5();
            if (bArr2 != null && bArr2.length > 0) {
                fa5Var6.parseFrom(bArr2);
            }
            db7Var.f372297e = fa5Var6;
        }
        return 0;
    }
}
