package lm2;

/* loaded from: classes3.dex */
public abstract class c implements so2.j5, lm2.i0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f319371d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ch1 f319372e;

    /* renamed from: f, reason: collision with root package name */
    public int f319373f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f319374g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f319375h;

    public c(boolean z17, r45.ch1 source) {
        kotlin.jvm.internal.o.g(source, "source");
        this.f319371d = z17;
        this.f319372e = source;
    }

    public java.lang.String a() {
        r45.qm1 qm1Var = (r45.qm1) this.f319372e.getCustom(8);
        java.lang.String string = qm1Var != null ? qm1Var.getString(1) : null;
        return string == null ? "" : string;
    }

    public java.lang.String b() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f319372e.getCustom(13);
        java.lang.String nickname = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname();
        return nickname == null ? "" : nickname;
    }

    public java.lang.String c() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f319372e.getCustom(13);
        java.lang.String username = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        return username == null ? "" : username;
    }

    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof lm2.c) {
            lm2.c cVar = (lm2.c) obj;
            if (cVar.f319371d == this.f319371d && kotlin.jvm.internal.o.b(cVar.f319372e.getString(2), this.f319372e.getString(2)) && kotlin.jvm.internal.o.b(cVar.f319372e.getString(14), this.f319372e.getString(14))) {
                return 0;
            }
        }
        return -1;
    }

    public long e() {
        return this.f319372e.getLong(12);
    }

    public java.lang.String f() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f319372e.getCustom(0);
        java.lang.String username = (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        return username == null ? "" : username;
    }

    public java.lang.String g() {
        return "msgType:" + this.f319372e.getInteger(1) + ", seq:" + this.f319372e.getLong(12) + ", likeCount:" + this.f319373f + ", selfLike:" + this.f319374g + ", fromUsername:" + c() + ", toUsername:" + f();
    }

    @Override // in5.c
    public long getItemId() {
        return this.f319372e.getLong(12);
    }

    @Override // in5.c
    public int h() {
        return this.f319372e.getInteger(1);
    }
}
