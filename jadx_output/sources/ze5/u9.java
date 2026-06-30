package ze5;

/* loaded from: classes9.dex */
public class u9 implements qd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472236b;

    public u9(java.lang.String str, java.lang.String str2) {
        this.f472235a = str;
        this.f472236b = str2;
    }

    @Override // qd5.a
    public qd5.b a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView chattingVideoMvvmView = ((ze5.ia) g0Var).f472009b;
        return new qd5.b(this.f472235a, this.f472236b, new jz5.l(chattingVideoMvvmView, chattingVideoMvvmView.getBitmap()));
    }
}
