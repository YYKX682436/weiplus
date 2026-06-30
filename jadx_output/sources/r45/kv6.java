package r45;

/* loaded from: classes2.dex */
public class kv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f378985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378986e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378988g;

    /* renamed from: h, reason: collision with root package name */
    public long f378989h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tg4 f378990i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv6)) {
            return false;
        }
        r45.kv6 kv6Var = (r45.kv6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f378985d), java.lang.Long.valueOf(kv6Var.f378985d)) && n51.f.a(this.f378986e, kv6Var.f378986e) && n51.f.a(this.f378987f, kv6Var.f378987f) && n51.f.a(this.f378988g, kv6Var.f378988g) && n51.f.a(java.lang.Long.valueOf(this.f378989h), java.lang.Long.valueOf(kv6Var.f378989h)) && n51.f.a(this.f378990i, kv6Var.f378990i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f378985d);
            java.lang.String str = this.f378986e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378987f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378988g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f378989h);
            r45.tg4 tg4Var = this.f378990i;
            if (tg4Var != null) {
                fVar.i(6, tg4Var.computeSize());
                this.f378990i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f378985d) + 0;
            java.lang.String str4 = this.f378986e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378987f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378988g;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            int h18 = h17 + b36.f.h(5, this.f378989h);
            r45.tg4 tg4Var2 = this.f378990i;
            return tg4Var2 != null ? h18 + b36.f.i(6, tg4Var2.computeSize()) : h18;
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
        r45.kv6 kv6Var = (r45.kv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kv6Var.f378985d = aVar2.i(intValue);
                return 0;
            case 2:
                kv6Var.f378986e = aVar2.k(intValue);
                return 0;
            case 3:
                kv6Var.f378987f = aVar2.k(intValue);
                return 0;
            case 4:
                kv6Var.f378988g = aVar2.k(intValue);
                return 0;
            case 5:
                kv6Var.f378989h = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.parseFrom(bArr);
                    }
                    kv6Var.f378990i = tg4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
