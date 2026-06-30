package g43;

/* loaded from: classes5.dex */
public final class b0 implements kq.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f268743a;

    public b0(androidx.lifecycle.j0 j0Var) {
        this.f268743a = j0Var;
    }

    @Override // kq.p
    public void a(java.lang.String url, java.lang.String save_path, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(save_path, "save_path");
        com.tencent.mars.xlog.Log.i("GameChatRoom.ChatroomViewModel", "onTaskFinished url:%s, save_path:%s", url, save_path);
        this.f268743a.postValue(new jz5.l(java.lang.Boolean.TRUE, save_path));
    }

    @Override // kq.p
    public void b(java.lang.String url, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.e("GameChatRoom.ChatroomViewModel", "onTaskFinished Failed url:%s, err_code:%s", url, java.lang.Integer.valueOf(i17));
        this.f268743a.postValue(new jz5.l(java.lang.Boolean.FALSE, null));
    }

    @Override // kq.p
    public void c(java.lang.String url, long j17, long j18) {
        kotlin.jvm.internal.o.g(url, "url");
    }
}
