package in;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292714d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f292715e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f292716f;

    /* renamed from: g, reason: collision with root package name */
    public long f292717g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof in.a)) {
            return false;
        }
        in.a aVar = (in.a) fVar;
        return n51.f.a(this.f292714d, aVar.f292714d) && n51.f.a(this.f292715e, aVar.f292715e) && n51.f.a(this.f292716f, aVar.f292716f) && n51.f.a(java.lang.Long.valueOf(this.f292717g), java.lang.Long.valueOf(aVar.f292717g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f292714d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f292715e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f292716f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f292717g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f292714d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f292715e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f292716f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f292717g);
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
        in.a aVar3 = (in.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f292714d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f292715e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f292716f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        aVar3.f292717g = aVar2.i(intValue);
        return 0;
    }
}
