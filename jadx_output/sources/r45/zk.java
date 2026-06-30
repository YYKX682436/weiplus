package r45;

/* loaded from: classes4.dex */
public class zk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392154d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392155e;

    /* renamed from: f, reason: collision with root package name */
    public int f392156f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk)) {
            return false;
        }
        r45.zk zkVar = (r45.zk) fVar;
        return n51.f.a(this.f392154d, zkVar.f392154d) && n51.f.a(this.f392155e, zkVar.f392155e) && n51.f.a(java.lang.Integer.valueOf(this.f392156f), java.lang.Integer.valueOf(zkVar.f392156f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392154d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f392155e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f392156f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f392154d;
            int j17 = str3 != null ? 0 + b36.f.j(2, str3) : 0;
            java.lang.String str4 = this.f392155e;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f392156f);
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
        r45.zk zkVar = (r45.zk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 2) {
            zkVar.f392154d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zkVar.f392155e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zkVar.f392156f = aVar2.g(intValue);
        return 0;
    }
}
