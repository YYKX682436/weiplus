package r45;

/* loaded from: classes4.dex */
public class mv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380839d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380840e;

    /* renamed from: f, reason: collision with root package name */
    public int f380841f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380842g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mv)) {
            return false;
        }
        r45.mv mvVar = (r45.mv) fVar;
        return n51.f.a(this.f380839d, mvVar.f380839d) && n51.f.a(this.f380840e, mvVar.f380840e) && n51.f.a(java.lang.Integer.valueOf(this.f380841f), java.lang.Integer.valueOf(mvVar.f380841f)) && n51.f.a(this.f380842g, mvVar.f380842g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380839d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380840e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380841f);
            java.lang.String str3 = this.f380842g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f380839d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f380840e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f380841f);
            java.lang.String str6 = this.f380842g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.mv mvVar = (r45.mv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mvVar.f380839d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mvVar.f380840e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mvVar.f380841f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mvVar.f380842g = aVar2.k(intValue);
        return 0;
    }
}
