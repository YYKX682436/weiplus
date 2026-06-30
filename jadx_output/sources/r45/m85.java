package r45;

/* loaded from: classes8.dex */
public class m85 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380238d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380239e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f380240f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f380241g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380242h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rd f380243i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380244m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380245n;

    /* renamed from: o, reason: collision with root package name */
    public int f380246o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m85)) {
            return false;
        }
        r45.m85 m85Var = (r45.m85) fVar;
        return n51.f.a(this.BaseResponse, m85Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f380238d), java.lang.Integer.valueOf(m85Var.f380238d)) && n51.f.a(this.f380239e, m85Var.f380239e) && n51.f.a(this.f380240f, m85Var.f380240f) && n51.f.a(java.lang.Long.valueOf(this.f380241g), java.lang.Long.valueOf(m85Var.f380241g)) && n51.f.a(this.f380242h, m85Var.f380242h) && n51.f.a(this.f380243i, m85Var.f380243i) && n51.f.a(this.f380244m, m85Var.f380244m) && n51.f.a(this.f380245n, m85Var.f380245n) && n51.f.a(java.lang.Integer.valueOf(this.f380246o), java.lang.Integer.valueOf(m85Var.f380246o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380240f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f380238d);
            java.lang.String str = this.f380239e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.h(5, this.f380241g);
            java.lang.String str2 = this.f380242h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.rd rdVar = this.f380243i;
            if (rdVar != null) {
                fVar.i(7, rdVar.computeSize());
                this.f380243i.writeFields(fVar);
            }
            java.lang.String str3 = this.f380244m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f380245n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f380246o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f380238d);
            java.lang.String str5 = this.f380239e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList) + b36.f.h(5, this.f380241g);
            java.lang.String str6 = this.f380242h;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            r45.rd rdVar2 = this.f380243i;
            if (rdVar2 != null) {
                g17 += b36.f.i(7, rdVar2.computeSize());
            }
            java.lang.String str7 = this.f380244m;
            if (str7 != null) {
                g17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f380245n;
            if (str8 != null) {
                g17 += b36.f.j(9, str8);
            }
            return g17 + b36.f.e(10, this.f380246o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.m85 m85Var = (r45.m85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    m85Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                m85Var.f380238d = aVar2.g(intValue);
                return 0;
            case 3:
                m85Var.f380239e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.n85 n85Var = new r45.n85();
                    if (bArr3 != null && bArr3.length > 0) {
                        n85Var.parseFrom(bArr3);
                    }
                    m85Var.f380240f.add(n85Var);
                }
                return 0;
            case 5:
                m85Var.f380241g = aVar2.i(intValue);
                return 0;
            case 6:
                m85Var.f380242h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rd rdVar3 = new r45.rd();
                    if (bArr4 != null && bArr4.length > 0) {
                        rdVar3.parseFrom(bArr4);
                    }
                    m85Var.f380243i = rdVar3;
                }
                return 0;
            case 8:
                m85Var.f380244m = aVar2.k(intValue);
                return 0;
            case 9:
                m85Var.f380245n = aVar2.k(intValue);
                return 0;
            case 10:
                m85Var.f380246o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
