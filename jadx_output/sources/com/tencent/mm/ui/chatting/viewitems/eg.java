package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.s0 f203873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f203874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f203875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f203877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zf f203878i;

    public eg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, ot0.s0 s0Var, int i17, long j17, java.lang.String str, long j18) {
        this.f203878i = zfVar;
        this.f203873d = s0Var;
        this.f203874e = i17;
        this.f203875f = j17;
        this.f203876g = str;
        this.f203877h = j18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Map x17 = ot0.q.x(this.f203873d.M);
        com.tencent.mm.ui.chatting.viewitems.zf zfVar = this.f203878i;
        if (x17 != null) {
            java.lang.String str = "";
            int i17 = this.f203874e;
            if (i17 != 0) {
                str = i17 + "";
            }
            if (((com.tencent.mm.plugin.finder.service.q4) ((zy2.ib) i95.n0.c(zy2.ib.class))).wi(zfVar.f206134s.g(), ".msg.appmsg.mmreader.category.item" + str, x17, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(27, 2, 25, null))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemBizFrom", "biz enter finder logic");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int intExtra = zfVar.f206134s.f460717l.getIntExtra("KOpenArticleSceneFromScene", 10000);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("biz_video_scene", 0);
        bundle.putInt(com.tencent.mm.ui.j2.f208990a, intExtra);
        bundle.putInt("geta8key_scene", 7);
        bundle.putString("geta8key_username", zfVar.f206134s.x());
        os1.a.a(zfVar.f206134s.g(), this.f203875f, this.f203876g, this.f203877h, this.f203874e, bundle);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
