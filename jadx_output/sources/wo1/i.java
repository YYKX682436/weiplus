package wo1;

/* loaded from: classes5.dex */
public final class i extends wo1.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f447946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter f447947f;

    public i(android.content.Context context, com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter backedUpConversationAdapter) {
        this.f447947f = backedUpConversationAdapter;
        java.lang.String[] stringArray = context.getResources().getStringArray(com.tencent.mm.R.array.f478019b0);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        this.f447946e = (java.lang.String[]) kz5.z.n0(stringArray, new e06.k(2, 3)).toArray(new java.lang.String[0]);
    }

    @Override // wo1.m
    public java.lang.String[] a() {
        return this.f447946e;
    }

    @Override // wo1.m
    public void c(int i17, java.util.List convList) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(convList, "convList");
        if (i17 != 0) {
            if (i17 != 1) {
                str = this.f447947f.TAG;
                com.tencent.mars.xlog.Log.e(str, "Invalid position=" + i17);
                return;
            }
            if (convList.size() > 1) {
                kz5.g0.t(convList, new wo1.g());
            }
        } else if (convList.size() > 1) {
            kz5.g0.t(convList, new wo1.h());
        }
        this.f447988d = i17;
    }
}
