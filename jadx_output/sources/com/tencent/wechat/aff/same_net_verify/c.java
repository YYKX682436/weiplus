package com.tencent.wechat.aff.same_net_verify;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wechat.aff.same_net_verify.c f217488n = new com.tencent.wechat.aff.same_net_verify.c();

    /* renamed from: d, reason: collision with root package name */
    public boolean f217489d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217490e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217491f;

    /* renamed from: g, reason: collision with root package name */
    public int f217492g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217493h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217494i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f217495m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.same_net_verify.c)) {
            return false;
        }
        com.tencent.wechat.aff.same_net_verify.c cVar = (com.tencent.wechat.aff.same_net_verify.c) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f217489d), java.lang.Boolean.valueOf(cVar.f217489d)) && n51.f.a(this.f217490e, cVar.f217490e) && n51.f.a(this.f217491f, cVar.f217491f) && n51.f.a(java.lang.Integer.valueOf(this.f217492g), java.lang.Integer.valueOf(cVar.f217492g)) && n51.f.a(this.f217493h, cVar.f217493h) && n51.f.a(this.f217494i, cVar.f217494i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.same_net_verify.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217495m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f217489d);
            }
            java.lang.String str = this.f217490e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217491f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f217492g);
            }
            java.lang.String str3 = this.f217493h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f217494i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f217489d) : 0;
            java.lang.String str5 = this.f217490e;
            if (str5 != null && zArr[2]) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f217491f;
            if (str6 != null && zArr[3]) {
                a17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f217492g);
            }
            java.lang.String str7 = this.f217493h;
            if (str7 != null && zArr[5]) {
                a17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f217494i;
            return (str8 == null || !zArr[6]) ? a17 : a17 + b36.f.j(6, str8);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f217489d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217490e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217491f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217492g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217493h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217494i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.same_net_verify.c) super.parseFrom(bArr);
    }
}
