package r45;

/* loaded from: classes2.dex */
public class qj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384057d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384058e;

    /* renamed from: f, reason: collision with root package name */
    public int f384059f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384060g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384061h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384062i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qj6)) {
            return false;
        }
        r45.qj6 qj6Var = (r45.qj6) fVar;
        return n51.f.a(this.f384057d, qj6Var.f384057d) && n51.f.a(this.f384058e, qj6Var.f384058e) && n51.f.a(java.lang.Integer.valueOf(this.f384059f), java.lang.Integer.valueOf(qj6Var.f384059f)) && n51.f.a(this.f384060g, qj6Var.f384060g) && n51.f.a(this.f384061h, qj6Var.f384061h) && n51.f.a(this.f384062i, qj6Var.f384062i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384057d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384058e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f384059f);
            java.lang.String str3 = this.f384060g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f384061h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f384062i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f384057d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f384058e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f384059f);
            java.lang.String str8 = this.f384060g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f384061h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f384062i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.qj6 qj6Var = (r45.qj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qj6Var.f384057d = aVar2.k(intValue);
                return 0;
            case 2:
                qj6Var.f384058e = aVar2.k(intValue);
                return 0;
            case 3:
                qj6Var.f384059f = aVar2.g(intValue);
                return 0;
            case 4:
                qj6Var.f384060g = aVar2.k(intValue);
                return 0;
            case 5:
                qj6Var.f384061h = aVar2.k(intValue);
                return 0;
            case 6:
                qj6Var.f384062i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
