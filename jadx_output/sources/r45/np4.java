package r45;

/* loaded from: classes2.dex */
public class np4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f381573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381574e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381575f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381576g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.np4)) {
            return false;
        }
        r45.np4 np4Var = (r45.np4) fVar;
        return n51.f.a(this.BaseRequest, np4Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f381573d), java.lang.Long.valueOf(np4Var.f381573d)) && n51.f.a(this.f381574e, np4Var.f381574e) && n51.f.a(this.f381575f, np4Var.f381575f) && n51.f.a(this.f381576g, np4Var.f381576g);
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
            fVar.h(2, this.f381573d);
            java.lang.String str = this.f381574e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381575f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381576g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f381573d);
            java.lang.String str4 = this.f381574e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f381575f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f381576g;
            return str6 != null ? i18 + b36.f.j(5, str6) : i18;
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
        r45.np4 np4Var = (r45.np4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                np4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            np4Var.f381573d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            np4Var.f381574e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            np4Var.f381575f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        np4Var.f381576g = aVar2.k(intValue);
        return 0;
    }
}
