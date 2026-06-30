package zo1;

/* loaded from: classes5.dex */
public final class s3 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474767a;

    public s3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474767a = selectContactUI;
    }

    @Override // rd0.b1
    public final void a(java.util.List list) {
        wo1.v vVar = this.f474767a.f92861u;
        if (vVar == null) {
            list.clear();
        } else {
            kotlin.jvm.internal.o.d(list);
            fo1.f.b(list, new zo1.r3(vVar));
        }
    }
}
