package r45;

/* loaded from: classes9.dex */
public class e16 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372909d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372910e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372911f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f372912g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372913h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f372914i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f372915m = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e16)) {
            return false;
        }
        r45.e16 e16Var = (r45.e16) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372909d), java.lang.Integer.valueOf(e16Var.f372909d)) && n51.f.a(java.lang.Boolean.valueOf(this.f372910e), java.lang.Boolean.valueOf(e16Var.f372910e)) && n51.f.a(this.f372911f, e16Var.f372911f) && n51.f.a(java.lang.Long.valueOf(this.f372912g), java.lang.Long.valueOf(e16Var.f372912g)) && n51.f.a(this.f372913h, e16Var.f372913h) && n51.f.a(this.f372914i, e16Var.f372914i) && n51.f.a(java.lang.Boolean.valueOf(this.f372915m), java.lang.Boolean.valueOf(e16Var.f372915m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372914i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372909d);
            fVar.a(2, this.f372910e);
            java.lang.String str = this.f372911f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f372912g);
            java.lang.String str2 = this.f372913h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            fVar.a(7, this.f372915m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372909d) + 0 + b36.f.a(2, this.f372910e);
            java.lang.String str3 = this.f372911f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            int h17 = e17 + b36.f.h(4, this.f372912g);
            java.lang.String str4 = this.f372913h;
            if (str4 != null) {
                h17 += b36.f.j(5, str4);
            }
            return h17 + b36.f.g(6, 8, linkedList) + b36.f.a(7, this.f372915m);
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
        r45.e16 e16Var = (r45.e16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e16Var.f372909d = aVar2.g(intValue);
                return 0;
            case 2:
                e16Var.f372910e = aVar2.c(intValue);
                return 0;
            case 3:
                e16Var.f372911f = aVar2.k(intValue);
                return 0;
            case 4:
                e16Var.f372912g = aVar2.i(intValue);
                return 0;
            case 5:
                e16Var.f372913h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.jw3 jw3Var = new r45.jw3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jw3Var.parseFrom(bArr2);
                    }
                    e16Var.f372914i.add(jw3Var);
                }
                return 0;
            case 7:
                e16Var.f372915m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
