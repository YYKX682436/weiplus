package h41;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f278828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h41.o0 o0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278828d = o0Var;
        this.f278829e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.m0(this.f278828d, this.f278829e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.o0 o0Var = this.f278828d;
        boolean z17 = o0Var.f278845k;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "setEditingText: skip after released");
            return f0Var;
        }
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = o0Var.f278838b;
        if (sendMsgCard != null) {
            java.lang.String content = this.f278829e;
            kotlin.jvm.internal.o.g(content, "content");
            java.lang.String str = sendMsgCard.f72257u;
            sendMsgCard.f72257u = content;
            sendMsgCard.m0().setText(content);
            if (content.length() > 0) {
                sendMsgCard.m0().setTextColor(sendMsgCard.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            sendMsgCard.m0().post(new f41.p0(content.length() >= str.length(), sendMsgCard));
        }
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard2 = o0Var.f278838b;
        if (sendMsgCard2 != null) {
            android.view.View view = (android.view.View) ((jz5.n) sendMsgCard2.f72251o).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/SendMsgCard", "showConfirmButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/open_voice_control/card/SendMsgCard", "showConfirmButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.LinearLayout) ((jz5.n) sendMsgCard2.f72252p).getValue()).setVisibility(0);
        }
        return f0Var;
    }
}
