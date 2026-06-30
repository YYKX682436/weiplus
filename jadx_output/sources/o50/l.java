package o50;

/* loaded from: classes.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o50.n f343073a;

    public l(o50.n nVar) {
        this.f343073a = nVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String string;
        vg5.a aVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b);
        o50.n nVar = this.f343073a;
        hashMap.put("forward_obj_list", nVar.f343077f);
        j75.f Q6 = nVar.Q6();
        co.a aVar2 = (Q6 == null || (aVar = (vg5.a) Q6.getState()) == null) ? null : aVar.f436776g;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
        hashMap.put("selected_msg_list", eVar.h(aVar2));
        hashMap.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(eVar.g(aVar2)));
        hashMap.put("forward_version", 20250731);
        hashMap.put("forw_confirm_screen_from", java.lang.Integer.valueOf(nVar.f343078g));
        hashMap.put("forwarding_lists_state", java.lang.Integer.valueOf(eVar.e()));
        hashMap.put("forward_from_scene", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.k(nVar.f343079h)));
        if (aVar2 != null) {
            hashMap.put("forward_msgtype", java.lang.Integer.valueOf(eVar.c(aVar2, nVar.f343080i)));
            hashMap.put("forward_source_scene", java.lang.Integer.valueOf(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.d(nVar.f343079h, aVar2.getString(aVar2.f43702d + 1))));
        }
        if (kotlin.jvm.internal.o.b(str, "page_out")) {
            hashMap.put("forward_close_type", java.lang.Integer.valueOf(nVar.f343075d));
        }
        if (aVar2 != null && (string = aVar2.getString(aVar2.f43702d + 1)) != null) {
            hashMap.put("chat_username", string);
        }
        return hashMap;
    }
}
