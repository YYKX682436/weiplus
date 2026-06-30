package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.ChattingAvatarImageView f202907d;

    public e(com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView) {
        this.f202907d = chattingAvatarImageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAvatarImageView", "revokeTv onClick!!");
        int i17 = com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.f202819p;
        com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView = this.f202907d;
        pp3.b bVar = chattingAvatarImageView.f152894h;
        if (bVar != null) {
            pp3.j jVar = (pp3.j) bVar;
            op3.c cVar = jVar.f357484c;
            if (cVar == null || cVar.f347258e == null) {
                z17 = false;
            } else {
                mp3.j jVar2 = (mp3.j) i95.n0.c(mp3.j.class);
                op3.c cVar2 = jVar.f357484c;
                ((lp3.l) jVar2).Di(cVar2.f347258e, 3, cVar2.f347256c);
                android.content.Context context = ((android.view.View) jVar.f357482a).getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bre);
                e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
                e4Var.c();
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAvatarImageView", "onClick RevokePat succeed!!");
                chattingAvatarImageView.f152895i.dismiss();
                ((pp3.j) chattingAvatarImageView.f152894h).a();
                ((pp3.j) chattingAvatarImageView.f152894h).b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/ChattingAvatarImageView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
