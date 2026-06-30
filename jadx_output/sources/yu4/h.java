package yu4;

/* loaded from: classes8.dex */
public final class h implements o25.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.rn3 f465875b;

    public h(yu4.k kVar, r45.rn3 rn3Var) {
        this.f465874a = kVar;
        this.f465875b = rn3Var;
    }

    @Override // o25.p1
    public final void a(java.lang.String str, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17, long j17) {
        yu4.k kVar = this.f465874a;
        com.tencent.mars.xlog.Log.i(kVar.f465883h, "share: " + iEmojiInfo.getMd5() + ", " + z17 + ", shareId:" + j17 + ", currentShareId:" + kVar.f465889q);
        if (j17 == kVar.f465889q) {
            if (z17) {
                java.lang.String md52 = iEmojiInfo.getMd5();
                java.lang.String str2 = this.f465875b.f385027i;
                if (str2 == null) {
                    str2 = "";
                }
                iEmojiInfo.K0(md52, str2);
                ((com.tencent.mm.view.manager.e) kVar.f465882g).a(str, iEmojiInfo);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = kVar.f465890r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            kVar.dismiss();
        }
    }
}
