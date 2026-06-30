package r45;

/* loaded from: classes9.dex */
public class cm5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vn f371667d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c14 f371668e;

    /* renamed from: f, reason: collision with root package name */
    public int f371669f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm5)) {
            return false;
        }
        r45.cm5 cm5Var = (r45.cm5) fVar;
        return n51.f.a(this.f371667d, cm5Var.f371667d) && n51.f.a(this.f371668e, cm5Var.f371668e) && n51.f.a(java.lang.Integer.valueOf(this.f371669f), java.lang.Integer.valueOf(cm5Var.f371669f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vn vnVar = this.f371667d;
            if (vnVar != null) {
                fVar.i(1, vnVar.computeSize());
                this.f371667d.writeFields(fVar);
            }
            r45.c14 c14Var = this.f371668e;
            if (c14Var != null) {
                fVar.i(2, c14Var.computeSize());
                this.f371668e.writeFields(fVar);
            }
            fVar.e(3, this.f371669f);
            return 0;
        }
        if (i17 == 1) {
            r45.vn vnVar2 = this.f371667d;
            int i18 = vnVar2 != null ? 0 + b36.f.i(1, vnVar2.computeSize()) : 0;
            r45.c14 c14Var2 = this.f371668e;
            if (c14Var2 != null) {
                i18 += b36.f.i(2, c14Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f371669f);
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
        r45.cm5 cm5Var = (r45.cm5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.vn vnVar3 = new r45.vn();
                if (bArr != null && bArr.length > 0) {
                    vnVar3.parseFrom(bArr);
                }
                cm5Var.f371667d = vnVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            cm5Var.f371669f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.c14 c14Var3 = new r45.c14();
            if (bArr2 != null && bArr2.length > 0) {
                c14Var3.parseFrom(bArr2);
            }
            cm5Var.f371668e = c14Var3;
        }
        return 0;
    }
}
