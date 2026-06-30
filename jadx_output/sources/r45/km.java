package r45;

/* loaded from: classes8.dex */
public class km extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.lm f378815d;

    /* renamed from: e, reason: collision with root package name */
    public int f378816e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378817f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km)) {
            return false;
        }
        r45.km kmVar = (r45.km) fVar;
        return n51.f.a(this.f378815d, kmVar.f378815d) && n51.f.a(java.lang.Integer.valueOf(this.f378816e), java.lang.Integer.valueOf(kmVar.f378816e)) && n51.f.a(this.f378817f, kmVar.f378817f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.lm lmVar = this.f378815d;
            if (lmVar != null) {
                fVar.i(1, lmVar.computeSize());
                this.f378815d.writeFields(fVar);
            }
            fVar.e(2, this.f378816e);
            java.lang.String str = this.f378817f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.lm lmVar2 = this.f378815d;
            int i18 = (lmVar2 != null ? 0 + b36.f.i(1, lmVar2.computeSize()) : 0) + b36.f.e(2, this.f378816e);
            java.lang.String str2 = this.f378817f;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.km kmVar = (r45.km) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kmVar.f378816e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            kmVar.f378817f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.lm lmVar3 = new r45.lm();
            if (bArr != null && bArr.length > 0) {
                lmVar3.parseFrom(bArr);
            }
            kmVar.f378815d = lmVar3;
        }
        return 0;
    }
}
