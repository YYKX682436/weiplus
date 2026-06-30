package lm2;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final lm2.a f319365d = new lm2.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xn1 it = (r45.xn1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) it.getCustom(0);
        sb6.append(finderContact != null ? finderContact.getUsername() : null);
        sb6.append(",nickname:");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) it.getCustom(0);
        sb6.append(finderContact2 != null ? finderContact2.getNickname() : null);
        sb6.append("; ");
        return sb6.toString();
    }
}
