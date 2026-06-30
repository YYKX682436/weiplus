package r45;

/* loaded from: classes9.dex */
public class mq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380735d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380737f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380739h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380741m;

    /* renamed from: e, reason: collision with root package name */
    public boolean f380736e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380738g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380740i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f380742n = false;

    public final java.lang.String b() {
        return this.f380737f;
    }

    public final java.lang.String c() {
        return this.f380741m;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mq0)) {
            return false;
        }
        r45.mq0 mq0Var = (r45.mq0) fVar;
        return n51.f.a(this.f380735d, mq0Var.f380735d) && n51.f.a(this.f380737f, mq0Var.f380737f) && n51.f.a(this.f380739h, mq0Var.f380739h) && n51.f.a(this.f380741m, mq0Var.f380741m);
    }

    public final r45.mq0 d(java.lang.String str) {
        this.f380737f = str;
        this.f380738g = true;
        return this;
    }

    public final r45.mq0 e(java.lang.String str) {
        this.f380741m = str;
        this.f380742n = true;
        return this;
    }

    public final r45.mq0 f(java.lang.String str) {
        this.f380739h = str;
        this.f380740i = true;
        return this;
    }

    public final r45.mq0 g(java.lang.String str) {
        this.f380735d = str;
        this.f380736e = true;
        return this;
    }

    public final java.lang.String getThumbUrl() {
        return this.f380739h;
    }

    public final java.lang.String getTitle() {
        return this.f380735d;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380735d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380737f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380739h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380741m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f380735d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f380737f;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f380739h;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f380741m;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        r45.mq0 mq0Var = (r45.mq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mq0Var.f380735d = aVar2.k(intValue);
            mq0Var.f380736e = true;
            return 0;
        }
        if (intValue == 2) {
            mq0Var.f380737f = aVar2.k(intValue);
            mq0Var.f380738g = true;
            return 0;
        }
        if (intValue == 3) {
            mq0Var.f380739h = aVar2.k(intValue);
            mq0Var.f380740i = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mq0Var.f380741m = aVar2.k(intValue);
        mq0Var.f380742n = true;
        return 0;
    }
}
