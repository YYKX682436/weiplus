package m53;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323637d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323639f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323640g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e)) {
            return false;
        }
        m53.e eVar = (m53.e) fVar;
        return n51.f.a(this.f323637d, eVar.f323637d) && n51.f.a(this.f323638e, eVar.f323638e) && n51.f.a(this.f323639f, eVar.f323639f) && n51.f.a(this.f323640g, eVar.f323640g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323637d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323638e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323639f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323640g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f323637d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f323638e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f323639f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f323640g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        m53.e eVar = (m53.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f323637d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eVar.f323638e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            eVar.f323639f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        eVar.f323640g = aVar2.k(intValue);
        return 0;
    }
}
