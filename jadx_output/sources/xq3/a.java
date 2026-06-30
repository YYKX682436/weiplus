package xq3;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456053e;

    /* renamed from: f, reason: collision with root package name */
    public int f456054f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456055g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456056h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.a)) {
            return false;
        }
        xq3.a aVar = (xq3.a) fVar;
        return n51.f.a(this.f456052d, aVar.f456052d) && n51.f.a(this.f456053e, aVar.f456053e) && n51.f.a(java.lang.Integer.valueOf(this.f456054f), java.lang.Integer.valueOf(aVar.f456054f)) && n51.f.a(this.f456055g, aVar.f456055g) && n51.f.a(this.f456056h, aVar.f456056h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456052d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456053e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f456054f);
            java.lang.String str3 = this.f456055g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f456056h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f456052d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f456053e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f456054f);
            java.lang.String str7 = this.f456055g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f456056h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        xq3.a aVar3 = (xq3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f456052d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f456053e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f456054f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f456055g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f456056h = aVar2.k(intValue);
        return 0;
    }
}
