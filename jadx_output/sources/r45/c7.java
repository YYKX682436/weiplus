package r45;

/* loaded from: classes4.dex */
public class c7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.za f371340d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f371341e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371342f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c7)) {
            return false;
        }
        r45.c7 c7Var = (r45.c7) fVar;
        return n51.f.a(this.f371340d, c7Var.f371340d) && n51.f.a(this.f371341e, c7Var.f371341e) && n51.f.a(this.f371342f, c7Var.f371342f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371341e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.za zaVar = this.f371340d;
            if (zaVar != null) {
                fVar.i(1, zaVar.computeSize());
                this.f371340d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f371342f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.za zaVar2 = this.f371340d;
            int i18 = (zaVar2 != null ? 0 + b36.f.i(1, zaVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f371342f;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.c7 c7Var = (r45.c7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.za zaVar3 = new r45.za();
                if (bArr2 != null && bArr2.length > 0) {
                    zaVar3.parseFrom(bArr2);
                }
                c7Var.f371340d = zaVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            c7Var.f371342f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.zt3 zt3Var = new r45.zt3();
            if (bArr3 != null && bArr3.length > 0) {
                zt3Var.parseFrom(bArr3);
            }
            c7Var.f371341e.add(zt3Var);
        }
        return 0;
    }
}
