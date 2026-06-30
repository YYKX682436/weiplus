package sr2;

/* loaded from: classes8.dex */
public final class r4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411705d;

    public r4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411705d = postMainUIC;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        bw5.cr crVar = bw5.cr.FinderModifyFeedRetExit;
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411705d;
        com.tencent.mm.plugin.finder.post.PostMainUIC.U6(postMainUIC, crVar);
        postMainUIC.getActivity().finish();
    }
}
