package m53;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324137g;

    /* renamed from: h, reason: collision with root package name */
    public int f324138h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w)) {
            return false;
        }
        m53.w wVar = (m53.w) fVar;
        return n51.f.a(this.f324134d, wVar.f324134d) && n51.f.a(this.f324135e, wVar.f324135e) && n51.f.a(this.f324136f, wVar.f324136f) && n51.f.a(this.f324137g, wVar.f324137g) && n51.f.a(java.lang.Integer.valueOf(this.f324138h), java.lang.Integer.valueOf(wVar.f324138h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324134d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324135e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324136f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f324137g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f324138h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f324134d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f324135e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f324136f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f324137g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f324138h);
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
        m53.w wVar = (m53.w) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wVar.f324134d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wVar.f324135e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wVar.f324136f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            wVar.f324137g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wVar.f324138h = aVar2.g(intValue);
        return 0;
    }
}
