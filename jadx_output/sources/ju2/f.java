package ju2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ju2.f f301815d = new ju2.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj).getUsername();
        return username == null ? "" : username;
    }
}
