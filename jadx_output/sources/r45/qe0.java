package r45;

/* loaded from: classes2.dex */
public class qe0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383880e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f383881f;

    /* renamed from: g, reason: collision with root package name */
    public r45.i74 f383882g;

    /* renamed from: h, reason: collision with root package name */
    public r45.t35 f383883h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe0)) {
            return false;
        }
        r45.qe0 qe0Var = (r45.qe0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383879d), java.lang.Integer.valueOf(qe0Var.f383879d)) && n51.f.a(this.f383880e, qe0Var.f383880e) && n51.f.a(this.f383881f, qe0Var.f383881f) && n51.f.a(this.f383882g, qe0Var.f383882g) && n51.f.a(this.f383883h, qe0Var.f383883h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383879d);
            java.lang.String str = this.f383880e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.rl6 rl6Var = this.f383881f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.computeSize());
                this.f383881f.writeFields(fVar);
            }
            r45.i74 i74Var = this.f383882g;
            if (i74Var != null) {
                fVar.i(4, i74Var.computeSize());
                this.f383882g.writeFields(fVar);
            }
            r45.t35 t35Var = this.f383883h;
            if (t35Var != null) {
                fVar.i(5, t35Var.computeSize());
                this.f383883h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383879d) + 0;
            java.lang.String str2 = this.f383880e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.rl6 rl6Var2 = this.f383881f;
            if (rl6Var2 != null) {
                e17 += b36.f.i(3, rl6Var2.computeSize());
            }
            r45.i74 i74Var2 = this.f383882g;
            if (i74Var2 != null) {
                e17 += b36.f.i(4, i74Var2.computeSize());
            }
            r45.t35 t35Var2 = this.f383883h;
            return t35Var2 != null ? e17 + b36.f.i(5, t35Var2.computeSize()) : e17;
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
        r45.qe0 qe0Var = (r45.qe0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qe0Var.f383879d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            qe0Var.f383880e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.parseFrom(bArr);
                }
                qe0Var.f383881f = rl6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.i74 i74Var3 = new r45.i74();
                if (bArr2 != null && bArr2.length > 0) {
                    i74Var3.parseFrom(bArr2);
                }
                qe0Var.f383882g = i74Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.t35 t35Var3 = new r45.t35();
            if (bArr3 != null && bArr3.length > 0) {
                t35Var3.parseFrom(bArr3);
            }
            qe0Var.f383883h = t35Var3;
        }
        return 0;
    }
}
