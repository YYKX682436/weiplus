package zl0;

/* loaded from: classes13.dex */
public class f implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl0.a f473563a;

    public f(zl0.a aVar) {
        this.f473563a = aVar;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String name = r6Var.getName();
        if (!name.endsWith(".zst")) {
            return false;
        }
        zl0.a aVar = this.f473563a;
        return name.contains(aVar.f473558c) && name.contains(aVar.f473557b) && name.contains(aVar.f473559d);
    }
}
