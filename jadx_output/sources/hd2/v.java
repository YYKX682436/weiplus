package hd2;

/* loaded from: classes8.dex */
public final class v implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280540e;

    public v(android.content.Context context, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment) {
        this.f280539d = context;
        this.f280540e = finderCommentShareDialogFragment;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 1014) {
            java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            com.tencent.mm.plugin.finder.report.d2.g(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f280539d, "share_comment", false, this.f280540e.o0(i18 == -1 ? 0 : 1, str, com.tencent.mm.storage.z3.R4(str) ? 3 : 2), 4, null);
        }
    }
}
