package vr4;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f439673d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public vr4.v0 f439674e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.a)) {
            return false;
        }
        vr4.a aVar = (vr4.a) fVar;
        return n51.f.a(this.f439673d, aVar.f439673d) && n51.f.a(this.f439674e, aVar.f439674e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f439673d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            vr4.v0 v0Var = this.f439674e;
            if (v0Var != null) {
                fVar.i(2, v0Var.computeSize());
                this.f439674e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            vr4.v0 v0Var2 = this.f439674e;
            return v0Var2 != null ? g17 + b36.f.i(2, v0Var2.computeSize()) : g17;
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
        vr4.a aVar3 = (vr4.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                vr4.c cVar = new vr4.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar.parseFrom(bArr2);
                }
                aVar3.f439673d.add(cVar);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            vr4.v0 v0Var3 = new vr4.v0();
            if (bArr3 != null && bArr3.length > 0) {
                v0Var3.parseFrom(bArr3);
            }
            aVar3.f439674e = v0Var3;
        }
        return 0;
    }
}
