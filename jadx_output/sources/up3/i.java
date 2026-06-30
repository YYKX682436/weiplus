package up3;

/* loaded from: classes12.dex */
public class i implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.regex.Pattern f429832a;

    public i(up3.j jVar, java.util.regex.Pattern pattern) {
        this.f429832a = pattern;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return this.f429832a.matcher(r6Var.getName()).matches();
    }
}
