package m53;

/* loaded from: classes8.dex */
public class m5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323906d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323907e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323908f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323909g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323910h;

    /* renamed from: i, reason: collision with root package name */
    public m53.p3 f323911i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323912m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m5)) {
            return false;
        }
        m53.m5 m5Var = (m53.m5) fVar;
        return n51.f.a(this.f323906d, m5Var.f323906d) && n51.f.a(this.f323907e, m5Var.f323907e) && n51.f.a(this.f323908f, m5Var.f323908f) && n51.f.a(this.f323909g, m5Var.f323909g) && n51.f.a(this.f323910h, m5Var.f323910h) && n51.f.a(this.f323911i, m5Var.f323911i) && n51.f.a(this.f323912m, m5Var.f323912m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323906d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323907e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323908f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323909g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323910h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            m53.p3 p3Var = this.f323911i;
            if (p3Var != null) {
                fVar.i(6, p3Var.computeSize());
                this.f323911i.writeFields(fVar);
            }
            java.lang.String str6 = this.f323912m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f323906d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f323907e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f323908f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f323909g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f323910h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            m53.p3 p3Var2 = this.f323911i;
            if (p3Var2 != null) {
                j17 += b36.f.i(6, p3Var2.computeSize());
            }
            java.lang.String str12 = this.f323912m;
            return str12 != null ? j17 + b36.f.j(7, str12) : j17;
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
        m53.m5 m5Var = (m53.m5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m5Var.f323906d = aVar2.k(intValue);
                return 0;
            case 2:
                m5Var.f323907e = aVar2.k(intValue);
                return 0;
            case 3:
                m5Var.f323908f = aVar2.k(intValue);
                return 0;
            case 4:
                m5Var.f323909g = aVar2.k(intValue);
                return 0;
            case 5:
                m5Var.f323910h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.p3 p3Var3 = new m53.p3();
                    if (bArr != null && bArr.length > 0) {
                        p3Var3.parseFrom(bArr);
                    }
                    m5Var.f323911i = p3Var3;
                }
                return 0;
            case 7:
                m5Var.f323912m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
