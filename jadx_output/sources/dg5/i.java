package dg5;

/* loaded from: classes11.dex */
public class i implements dg5.v {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.BaseConversationUI f232370d;

    /* renamed from: e, reason: collision with root package name */
    public final dg5.h f232371e;

    /* renamed from: f, reason: collision with root package name */
    public long f232372f;

    /* renamed from: g, reason: collision with root package name */
    public final dg5.g f232373g = new dg5.g(this, null);

    public i(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, dg5.h hVar) {
        this.f232370d = baseConversationUI;
        this.f232371e = hVar;
    }

    @Override // dg5.v
    public boolean a(android.view.View view, android.graphics.Point point, int i17, long j17, com.tencent.mm.ui.conversation.p7 p7Var) {
        s01.b bVar = p7Var.f207966d;
        if (bVar == null) {
            return false;
        }
        int i18 = point.x;
        int i19 = point.y;
        dg5.g gVar = this.f232373g;
        if (gVar.f232363e == null) {
            gVar.f232362d = new dg5.d(gVar);
            gVar.f232363e = new rl5.r(gVar.f232369n.f232370d);
        }
        gVar.f232366h = bVar;
        gVar.f232367i = bVar.field_brandUserName;
        gVar.f232368m = bVar.field_bizChatId;
        gVar.f232363e.g(view, i17, j17, gVar, gVar.f232362d, i18, i19);
        return true;
    }

    @Override // dg5.v
    public void b(com.tencent.mm.ui.conversation.p7 p7Var) {
        s01.b bVar = p7Var.f207966d;
        if (bVar == null) {
            return;
        }
        java.lang.String str = bVar.field_brandUserName;
        long j17 = bVar.field_bizChatId;
        if (str == null) {
            return;
        }
        this.f232372f = j17;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("key_biz_chat_id", j17);
        bundle.putBoolean("key_need_send_video", false);
        bundle.putBoolean("key_is_biz_chat", true);
        this.f232370d.startChatting(str, bundle, true);
    }
}
