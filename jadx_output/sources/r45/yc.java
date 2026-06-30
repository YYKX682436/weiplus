package r45;

/* loaded from: classes7.dex */
public class yc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390955d;

    /* renamed from: e, reason: collision with root package name */
    public int f390956e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lb5 f390957f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390958g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390959h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc)) {
            return false;
        }
        r45.yc ycVar = (r45.yc) fVar;
        return n51.f.a(this.f390955d, ycVar.f390955d) && n51.f.a(java.lang.Integer.valueOf(this.f390956e), java.lang.Integer.valueOf(ycVar.f390956e)) && n51.f.a(this.f390957f, ycVar.f390957f) && n51.f.a(this.f390958g, ycVar.f390958g) && n51.f.a(this.f390959h, ycVar.f390959h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390955d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f390956e);
            r45.lb5 lb5Var = this.f390957f;
            if (lb5Var != null) {
                fVar.i(3, lb5Var.computeSize());
                this.f390957f.writeFields(fVar);
            }
            java.lang.String str2 = this.f390958g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390959h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f390955d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f390956e);
            r45.lb5 lb5Var2 = this.f390957f;
            if (lb5Var2 != null) {
                j17 += b36.f.i(3, lb5Var2.computeSize());
            }
            java.lang.String str5 = this.f390958g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f390959h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.yc ycVar = (r45.yc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ycVar.f390955d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ycVar.f390956e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ycVar.f390958g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ycVar.f390959h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.lb5 lb5Var3 = new r45.lb5();
            if (bArr != null && bArr.length > 0) {
                lb5Var3.parseFrom(bArr);
            }
            ycVar.f390957f = lb5Var3;
        }
        return 0;
    }
}
