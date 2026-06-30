package gh4;

/* loaded from: classes8.dex */
public final class p0 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f271948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f271949b;

    public p0(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        this.f271948a = context;
        this.f271949b = multiTaskInfo;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((hh4.j) nVar).m6(this.f271948a, this.f271949b);
        return false;
    }
}
