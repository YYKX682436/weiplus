package ju2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ju2.b f301808d = new ju2.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj).getUsername();
        return username == null ? "" : username;
    }
}
