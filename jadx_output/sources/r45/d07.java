package r45;

/* loaded from: classes2.dex */
public class d07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.t35 f371984d;

    /* renamed from: e, reason: collision with root package name */
    public r45.mi4 f371985e;

    /* renamed from: f, reason: collision with root package name */
    public int f371986f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d07)) {
            return false;
        }
        r45.d07 d07Var = (r45.d07) fVar;
        return n51.f.a(this.f371984d, d07Var.f371984d) && n51.f.a(this.f371985e, d07Var.f371985e) && n51.f.a(java.lang.Integer.valueOf(this.f371986f), java.lang.Integer.valueOf(d07Var.f371986f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.t35 t35Var = this.f371984d;
            if (t35Var != null) {
                fVar.i(1, t35Var.computeSize());
                this.f371984d.writeFields(fVar);
            }
            r45.mi4 mi4Var = this.f371985e;
            if (mi4Var != null) {
                fVar.i(2, mi4Var.computeSize());
                this.f371985e.writeFields(fVar);
            }
            fVar.e(3, this.f371986f);
            return 0;
        }
        if (i17 == 1) {
            r45.t35 t35Var2 = this.f371984d;
            int i18 = t35Var2 != null ? 0 + b36.f.i(1, t35Var2.computeSize()) : 0;
            r45.mi4 mi4Var2 = this.f371985e;
            if (mi4Var2 != null) {
                i18 += b36.f.i(2, mi4Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f371986f);
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
        r45.d07 d07Var = (r45.d07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.t35 t35Var3 = new r45.t35();
                if (bArr != null && bArr.length > 0) {
                    t35Var3.parseFrom(bArr);
                }
                d07Var.f371984d = t35Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            d07Var.f371986f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.mi4 mi4Var3 = new r45.mi4();
            if (bArr2 != null && bArr2.length > 0) {
                mi4Var3.parseFrom(bArr2);
            }
            d07Var.f371985e = mi4Var3;
        }
        return 0;
    }
}
