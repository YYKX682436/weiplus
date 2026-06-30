package hb5;

/* loaded from: classes11.dex */
public class z0 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280270b;

    public z0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI, java.lang.String str) {
        this.f280270b = bizChatroomInfoUI;
        this.f280269a = str;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        int i17 = com.tencent.mm.ui.bizchat.BizChatroomInfoUI.H;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280270b;
        bizChatroomInfoUI.getClass();
        java.lang.String trim = charSequence == null ? "" : charSequence.toString().trim();
        if (!trim.equals(this.f280269a)) {
            if (trim.length() == 0) {
                db5.e1.T(bizChatroomInfoUI.getContext(), bizChatroomInfoUI.getString(com.tencent.mm.R.string.f492882i42));
                return false;
            }
            new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
            s01.h hVar = bizChatroomInfoUI.f197954y;
            bizChatroomInfoUI.f197946q = hVar.field_chatName;
            bizChatroomInfoUI.f197953x = hVar.field_bitFlag;
            hVar.field_chatName = trim;
            r01.q3.Ui().P0(bizChatroomInfoUI.f197954y);
            r45.pj pjVar = new r45.pj();
            pjVar.f383085d = bizChatroomInfoUI.f197954y.field_bizChatServId;
            pjVar.f383088g = trim;
            pjVar.f383090i = bizChatroomInfoUI.f197953x;
            r01.q3.Ni().n(bizChatroomInfoUI.f197954y.field_brandUserName, pjVar, bizChatroomInfoUI);
            bizChatroomInfoUI.a7();
            ((com.tencent.mm.ui.base.preference.h0) bizChatroomInfoUI.f197937e).notifyDataSetChanged();
        }
        return true;
    }
}
