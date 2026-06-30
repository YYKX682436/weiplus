package r45;

/* loaded from: classes9.dex */
public class ow extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382570d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382571e;

    /* renamed from: f, reason: collision with root package name */
    public int f382572f;

    /* renamed from: g, reason: collision with root package name */
    public int f382573g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382574h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ow)) {
            return false;
        }
        r45.ow owVar = (r45.ow) fVar;
        return n51.f.a(this.f382570d, owVar.f382570d) && n51.f.a(this.f382571e, owVar.f382571e) && n51.f.a(java.lang.Integer.valueOf(this.f382572f), java.lang.Integer.valueOf(owVar.f382572f)) && n51.f.a(java.lang.Integer.valueOf(this.f382573g), java.lang.Integer.valueOf(owVar.f382573g)) && n51.f.a(this.f382574h, owVar.f382574h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382570d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382571e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f382572f);
            fVar.e(4, this.f382573g);
            java.lang.String str3 = this.f382574h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382570d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f382571e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f382572f) + b36.f.e(4, this.f382573g);
            java.lang.String str6 = this.f382574h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.ow owVar = (r45.ow) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            owVar.f382570d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            owVar.f382571e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            owVar.f382572f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            owVar.f382573g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        owVar.f382574h = aVar2.k(intValue);
        return 0;
    }
}
