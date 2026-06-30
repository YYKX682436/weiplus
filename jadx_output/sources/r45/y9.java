package r45;

/* loaded from: classes2.dex */
public class y9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390873d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.fk6 f390874e;

    /* renamed from: f, reason: collision with root package name */
    public long f390875f;

    /* renamed from: g, reason: collision with root package name */
    public r45.v9 f390876g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y9)) {
            return false;
        }
        r45.y9 y9Var = (r45.y9) fVar;
        return n51.f.a(this.f390873d, y9Var.f390873d) && n51.f.a(this.f390874e, y9Var.f390874e) && n51.f.a(java.lang.Long.valueOf(this.f390875f), java.lang.Long.valueOf(y9Var.f390875f)) && n51.f.a(this.f390876g, y9Var.f390876g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390873d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.fk6 fk6Var = this.f390874e;
            if (fk6Var != null) {
                fVar.i(2, fk6Var.computeSize());
                this.f390874e.writeFields(fVar);
            }
            fVar.h(3, this.f390875f);
            r45.v9 v9Var = this.f390876g;
            if (v9Var != null) {
                fVar.i(4, v9Var.computeSize());
                this.f390876g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.fk6 fk6Var2 = this.f390874e;
            if (fk6Var2 != null) {
                g17 += b36.f.i(2, fk6Var2.computeSize());
            }
            int h17 = g17 + b36.f.h(3, this.f390875f);
            r45.v9 v9Var2 = this.f390876g;
            return v9Var2 != null ? h17 + b36.f.i(4, v9Var2.computeSize()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.y9 y9Var = (r45.y9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.x9 x9Var = new r45.x9();
                if (bArr2 != null && bArr2.length > 0) {
                    x9Var.parseFrom(bArr2);
                }
                y9Var.f390873d.add(x9Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.fk6 fk6Var3 = new r45.fk6();
                if (bArr3 != null && bArr3.length > 0) {
                    fk6Var3.parseFrom(bArr3);
                }
                y9Var.f390874e = fk6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            y9Var.f390875f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.v9 v9Var3 = new r45.v9();
            if (bArr4 != null && bArr4.length > 0) {
                v9Var3.parseFrom(bArr4);
            }
            y9Var.f390876g = v9Var3;
        }
        return 0;
    }
}
