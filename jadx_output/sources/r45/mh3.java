package r45;

/* loaded from: classes4.dex */
public class mh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f380502d;

    /* renamed from: e, reason: collision with root package name */
    public int f380503e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380504f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380505g;

    /* renamed from: h, reason: collision with root package name */
    public int f380506h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380507i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mh3)) {
            return false;
        }
        r45.mh3 mh3Var = (r45.mh3) fVar;
        return n51.f.a(this.BaseRequest, mh3Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f380502d), java.lang.Long.valueOf(mh3Var.f380502d)) && n51.f.a(java.lang.Integer.valueOf(this.f380503e), java.lang.Integer.valueOf(mh3Var.f380503e)) && n51.f.a(this.f380504f, mh3Var.f380504f) && n51.f.a(this.f380505g, mh3Var.f380505g) && n51.f.a(java.lang.Integer.valueOf(this.f380506h), java.lang.Integer.valueOf(mh3Var.f380506h)) && n51.f.a(this.f380507i, mh3Var.f380507i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.h(2, this.f380502d);
            fVar.e(3, this.f380503e);
            java.lang.String str = this.f380504f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f380505g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f380506h);
            java.lang.String str3 = this.f380507i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f380502d) + b36.f.e(3, this.f380503e);
            java.lang.String str4 = this.f380504f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f380505g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f380506h);
            java.lang.String str6 = this.f380507i;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.mh3 mh3Var = (r45.mh3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    mh3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                mh3Var.f380502d = aVar2.i(intValue);
                return 0;
            case 3:
                mh3Var.f380503e = aVar2.g(intValue);
                return 0;
            case 4:
                mh3Var.f380504f = aVar2.k(intValue);
                return 0;
            case 5:
                mh3Var.f380505g = aVar2.k(intValue);
                return 0;
            case 6:
                mh3Var.f380506h = aVar2.g(intValue);
                return 0;
            case 7:
                mh3Var.f380507i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
