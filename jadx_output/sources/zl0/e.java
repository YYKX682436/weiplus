package zl0;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473562a;

    public e(java.lang.String str) {
        this.f473562a = str;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return r6Var.getName().contains(this.f473562a);
    }
}
