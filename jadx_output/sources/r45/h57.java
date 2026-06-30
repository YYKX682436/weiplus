package r45;

/* loaded from: classes7.dex */
public class h57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f375865d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.h57) && n51.f.a(this.f375865d, ((r45.h57) fVar).f375865d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f375865d;
            if (a47Var != null) {
                fVar.i(1, a47Var.computeSize());
                this.f375865d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f375865d;
            if (a47Var2 != null) {
                return 0 + b36.f.i(1, a47Var2.computeSize());
            }
            return 0;
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
        r45.h57 h57Var = (r45.h57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.a47 a47Var3 = new r45.a47();
            if (bArr != null && bArr.length > 0) {
                a47Var3.parseFrom(bArr);
            }
            h57Var.f375865d = a47Var3;
        }
        return 0;
    }
}
