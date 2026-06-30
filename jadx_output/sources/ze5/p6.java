package ze5;

/* loaded from: classes9.dex */
public class p6 implements qd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472149b;

    public p6(java.lang.String str, java.lang.String str2) {
        this.f472148a = str;
        this.f472149b = str2;
    }

    @Override // qd5.a
    public qd5.b a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView = ((ze5.w6) g0Var).f472284c;
        return new qd5.b(this.f472148a, this.f472149b, new jz5.l(chattingImgMvvmView, chattingImgMvvmView.getBitmap()));
    }
}
