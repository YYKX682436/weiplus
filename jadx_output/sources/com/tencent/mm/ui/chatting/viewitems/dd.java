package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class dd extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(int i17, int i18, java.lang.String str, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        super(i17, i18);
        this.f203786d = str;
        this.f203787e = f9Var;
        this.f203788f = dVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.lang.String a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to ringtone setting ui");
        java.lang.String str = this.f203786d;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.storage.f9 f9Var = this.f203787e;
        int i17 = 0;
        int i18 = 1;
        boolean z17 = f9Var.getType() == 85;
        mx3.b0 b0Var = mx3.b0.f332528a;
        if (!z17) {
            str = c01.z1.r();
        }
        mx3.b0 b0Var2 = mx3.b0.f332528a;
        kotlin.jvm.internal.o.d(str);
        java.util.Set<java.lang.String> b17 = mx3.b0.b(b0Var2, str, z17, null, 4, null);
        if (b17 != null && (a17 = b0Var2.a(b17)) != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (java.lang.String str2 : b17) {
                if (!kotlin.jvm.internal.o.b(a17, str2)) {
                    linkedHashSet.add(str2);
                }
            }
            mx3.x f17 = b0Var2.f(a17);
            f17.f332629c = true;
            cl0.g gVar = new cl0.g();
            gVar.h("ringtoneId", f17.f332627a);
            gVar.p("tick", f17.f332628b);
            gVar.r("linkToSetting", f17.f332629c);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            linkedHashSet.add(gVar2);
            b0Var2.h(str, z17, linkedHashSet);
        }
        int type = f9Var.getType();
        if (type == 85) {
            i17 = 2;
        } else if (type == 86) {
            i17 = 3;
            i18 = 2;
        }
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        wx3.a.f(i18, 2, j17, "", "");
        mx3.s sVar = mx3.u.f332620f;
        android.app.Activity g17 = this.f203788f.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        sVar.b(g17, i17);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgRingtone$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
