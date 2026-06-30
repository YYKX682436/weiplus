package ic2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f290352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic2.p0 f290353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r45.hx0 hx0Var, ic2.p0 p0Var) {
        super(0);
        this.f290352d = hx0Var;
        this.f290353e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.w31 w31Var = new r45.w31();
        com.tencent.mm.protobuf.g byteString = this.f290352d.getByteString(1);
        if (byteString != null) {
            w31Var.parseFrom(byteString.g());
            this.f290353e.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetFollower: follow contact size = ");
            int i17 = 0;
            sb6.append(w31Var.getList(0).size());
            com.tencent.mars.xlog.Log.i("Finder.SyncHandler", sb6.toString());
            java.util.LinkedList list = w31Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getFollowers(...)");
            for (java.lang.Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) obj;
                ya2.g gVar = ya2.h.f460484a;
                ya2.b2 b17 = gVar.b(finderContact.getUsername());
                com.tencent.mars.xlog.Log.i("Finder.SyncHandler", "sync follow contact index=" + i17 + " username=" + finderContact.getUsername() + " nickname=" + finderContact.getNickname() + " followFlag=" + finderContact.getFollowFlag() + " user_flag=" + finderContact.getUser_flag() + " avatarUrl=" + finderContact.getHeadUrl());
                if (b17 != null) {
                    b17.field_nickname = finderContact.getNickname();
                    b17.field_user_flag = finderContact.getUser_flag();
                    b17.field_follow_Flag = finderContact.getFollowFlag();
                    b17.field_authInfo = finderContact.getAuthInfo();
                    b17.field_avatarUrl = finderContact.getHeadUrl();
                    gVar.k(b17);
                } else {
                    gVar.j(finderContact);
                }
                i17 = i18;
            }
        }
        return jz5.f0.f302826a;
    }
}
