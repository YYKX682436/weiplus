package q33;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f359938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f359939e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f359940f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q33.c)) {
            return false;
        }
        q33.c cVar = (q33.c) fVar;
        return n51.f.a(this.f359938d, cVar.f359938d) && n51.f.a(this.f359939e, cVar.f359939e) && n51.f.a(this.f359940f, cVar.f359940f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f359938d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f359939e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f359940f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f359938d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f359939e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f359940f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        q33.c cVar = (q33.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f359938d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cVar.f359939e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cVar.f359940f = aVar2.k(intValue);
        return 0;
    }
}
