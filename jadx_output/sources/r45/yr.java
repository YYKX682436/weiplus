package r45;

/* loaded from: classes9.dex */
public class yr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391311e;

    /* renamed from: f, reason: collision with root package name */
    public long f391312f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391313g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr)) {
            return false;
        }
        r45.yr yrVar = (r45.yr) fVar;
        return n51.f.a(this.f391310d, yrVar.f391310d) && n51.f.a(this.f391311e, yrVar.f391311e) && n51.f.a(java.lang.Long.valueOf(this.f391312f), java.lang.Long.valueOf(yrVar.f391312f)) && n51.f.a(this.f391313g, yrVar.f391313g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391310d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391311e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f391312f);
            java.lang.String str3 = this.f391313g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f391310d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f391311e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f391312f);
            java.lang.String str6 = this.f391313g;
            return str6 != null ? h17 + b36.f.j(4, str6) : h17;
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
        r45.yr yrVar = (r45.yr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yrVar.f391310d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yrVar.f391311e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yrVar.f391312f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        yrVar.f391313g = aVar2.k(intValue);
        return 0;
    }
}
