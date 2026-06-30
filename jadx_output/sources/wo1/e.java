package wo1;

/* loaded from: classes5.dex */
public final class e extends wo1.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f447919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.AllConversationAdapter f447920f;

    public e(android.content.Context context, com.tencent.mm.plugin.backup.roambackup.ui.component.AllConversationAdapter allConversationAdapter) {
        this.f447920f = allConversationAdapter;
        java.lang.String[] stringArray = context.getResources().getStringArray(com.tencent.mm.R.array.f478019b0);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        this.f447919e = allConversationAdapter.getShowSize() ? stringArray : (java.lang.String[]) kz5.z.p0(stringArray, new e06.k(0, 1));
    }

    @Override // wo1.m
    public java.lang.String[] a() {
        return this.f447919e;
    }

    @Override // wo1.m
    public void c(int i17, java.util.List convList) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(convList, "convList");
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        str = this.f447920f.TAG;
                        com.tencent.mars.xlog.Log.e(str, "Invalid position=" + i17);
                        return;
                    }
                    if (convList.size() > 1) {
                        kz5.g0.t(convList, new wo1.b());
                    }
                } else if (convList.size() > 1) {
                    kz5.g0.t(convList, new wo1.d());
                }
            } else if (convList.size() > 1) {
                kz5.g0.t(convList, new wo1.a());
            }
        } else if (convList.size() > 1) {
            kz5.g0.t(convList, new wo1.c());
        }
        this.f447988d = i17;
    }
}
