package r45;

/* loaded from: classes8.dex */
public class um extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387473d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387474e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387475f;

    /* renamed from: g, reason: collision with root package name */
    public long f387476g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.um)) {
            return false;
        }
        r45.um umVar = (r45.um) fVar;
        return n51.f.a(this.f387473d, umVar.f387473d) && n51.f.a(this.f387474e, umVar.f387474e) && n51.f.a(this.f387475f, umVar.f387475f) && n51.f.a(java.lang.Long.valueOf(this.f387476g), java.lang.Long.valueOf(umVar.f387476g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387473d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387474e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387475f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f387476g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f387473d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f387474e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f387475f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f387476g);
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
        r45.um umVar = (r45.um) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            umVar.f387473d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            umVar.f387474e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            umVar.f387475f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        umVar.f387476g = aVar2.i(intValue);
        return 0;
    }
}
