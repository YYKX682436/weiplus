package p53;

/* loaded from: classes5.dex */
public class s implements kq.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f352074a;

    public s(p53.t tVar, com.tencent.mm.ipcinvoker.r rVar) {
        this.f352074a = rVar;
    }

    @Override // kq.p
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("RichGameTabWidget", "onTaskFinished url:%s, save_path:%s", str, str2);
        this.f352074a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }

    @Override // kq.p
    public void b(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.e("RichGameTabWidget", "onTaskFinished Failed url:%s, err_code:%s", str, java.lang.Integer.valueOf(i17));
        this.f352074a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
    }

    @Override // kq.p
    public void c(java.lang.String str, long j17, long j18) {
    }
}
