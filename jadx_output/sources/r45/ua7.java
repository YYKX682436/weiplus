package r45;

/* loaded from: classes8.dex */
public class ua7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387189e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ta7 f387190f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ua7)) {
            return false;
        }
        r45.ua7 ua7Var = (r45.ua7) fVar;
        return n51.f.a(this.f387188d, ua7Var.f387188d) && n51.f.a(this.f387189e, ua7Var.f387189e) && n51.f.a(this.f387190f, ua7Var.f387190f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387188d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387189e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.ta7 ta7Var = this.f387190f;
            if (ta7Var != null) {
                fVar.i(3, ta7Var.computeSize());
                this.f387190f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387188d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f387189e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.ta7 ta7Var2 = this.f387190f;
            return ta7Var2 != null ? j17 + b36.f.i(3, ta7Var2.computeSize()) : j17;
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
        r45.ua7 ua7Var = (r45.ua7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ua7Var.f387188d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ua7Var.f387189e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ta7 ta7Var3 = new r45.ta7();
            if (bArr != null && bArr.length > 0) {
                ta7Var3.parseFrom(bArr);
            }
            ua7Var.f387190f = ta7Var3;
        }
        return 0;
    }
}
